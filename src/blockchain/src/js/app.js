App = {
  web3Provider: null,
  contracts: {},

  init: async function() {
    // Load events.
    $.getJSON('../events.json', function(data) {
      var eventsRow = $('#eventsRow');
      var eventTemplate = $('#eventTemplate');

      for (i = 0; i < data.length; i ++) {
        eventTemplate.find('.panel-title').text(data[i].name);
        eventTemplate.find('img').attr('src', data[i].picture);
        eventTemplate.find('.event-var1').text(data[i].var2);
        eventTemplate.find('.event-var2').text(data[i].var1);
        eventTemplate.find('.event-var3').text(data[i].var3);
        eventTemplate.find('.btn-validate').attr('data-id', data[i].id);

        eventsRow.append(eventTemplate.html());
      }
    });

    return await App.initWeb3();
  },

  initWeb3: async function() {
    // Modern dapp browsers...
    if (window.ethereum) {
      App.web3Provider = window.ethereum;
      try {
        // Request account access
        await window.ethereum.enable();
      } catch (error) {
        // User denied account access...
        console.error("User denied account access")
      }
    }
    // Legacy dapp browsers...
    else if (window.web3) {
      App.web3Provider = window.web3.currentProvider;
    }
    // If no injected web3 instance is detected, fall back to Ganache
    else {
      App.web3Provider = new Web3.providers.HttpProvider('http://localhost:7545');
    }
    web3 = new Web3(App.web3Provider);

    return App.initContract();
  },

  initContract: function() {
    $.getJSON('Validation.json', function(data) {
      // Get the necessary contract artifact file and instantiate it with @truffle/contract
      var ValidationArtifact = data;
      App.contracts.Validation = TruffleContract(ValidationArtifact);

      // Set the provider for our contract
      App.contracts.Validation.setProvider(App.web3Provider);

      // Use our contract to retrieve and mark the validated events
      return App.markValidated();
    });


    return App.bindEvents();
  },

  bindEvents: function() {
    $(document).on('click', '.btn-validate', App.handleValidate);
  },

  markValidated: function() {
    var validationInstance;

    App.contracts.Validation.deployed().then(function(instance) {
      validationInstance = instance;

      return validationInstance.getHolders.call();
    }).then(function(holders) {
      for (i = 0; i < holders.length; i++) {
        if (holders[i] !== '0x0000000000000000000000000000000000000000') {
          $('.panel-event').eq(i).find('button').text('Success').attr('disabled', true);
        }
      }
    }).catch(function(err) {
      console.log(err.message);
    });

  },

  handleValidate: function(event) {
    event.preventDefault();

    var thisId = parseInt($(event.target).data('id'));
    var validationInstance;

    web3.eth.getAccounts(function(error, accounts) {
      if (error) {
        console.log(validation);
      }

      var account = accounts[0];

      App.contracts.Validation.deployed().then(function(instance) {
        validationInstance = instance;

        // Execute validation as a transaction by sending account
        return validationInstance.validate(thisId, {from: account});
      }).then(function(result) {
        return App.markValidated();
      }).catch(function(err) {
        console.log(err.message);
      });
    });

  }

};

$(function() {
  $(window).load(function() {
    App.init();
  });
});
