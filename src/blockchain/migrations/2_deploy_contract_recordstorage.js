// CredHub - Credentials and Identity Manager
// @team Tamara Linse, Megan Steeves, Selma Samet, and Kellen Mentock
// @version 1.0
// @date 3.15.2024

var RecordStorage = artifacts.require("RecordStorage");
  module.exports = function(deployer) {
  deployer.deploy(RecordStorage);
};