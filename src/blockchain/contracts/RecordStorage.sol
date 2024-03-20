// CredHub - Credentials and Identity Manager
// @team Tamara Linse, Megan Steeves, Selma Samet, and Kellen Mentock
// @version 1.0
// @date 3.15.2024

pragma solidity ^0.5.0;

contract RecordStorage {
  string public name = 'RecordStorage';
  uint storedData;
  uint public recordCount = 0;
  
  mapping(uint => Record) public records;

  struct Record {
    uint bcid;
    uint uid;
    string email;
    string id_num;
    bool validated;
    uint uploadTime;
    address payable account;
  }

  // Event

  event RecordToBlockchain (
    uint bcid,
    uint uid,
    string email,
    string id_num,
    bool validated,
    uint uploadTime,
    address payable account
  );

  constructor() public {
  }

  function toBlockchainRecord(     
    uint _uid, 
    string memory _email, 
    string memory _id_num, 
    bool _validated ) public {

    // Make sure elements exist

    require(bytes32(_uid).length > 0);              
    require(bytes(_email).length > 0);            
    require(bytes(_id_num).length > 0);           
    require(_validated);        
    require(msg.sender!=address(0));         

    recordCount++;

    records[recordCount] = Record(
      recordCount,
      _uid, 
      _email, 
      _id_num,
      _validated, 
      now, 
      msg.sender);

    emit RecordToBlockchain(
      recordCount,
      _uid,
      _email, 
      _id_num,
      _validated, 
      now, 
      msg.sender);
  }

  function set(uint x) public {
      storedData = x;
  }

  function get() public view returns (uint) {
      return storedData;
  }


}