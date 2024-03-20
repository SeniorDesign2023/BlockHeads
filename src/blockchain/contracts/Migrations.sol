// CredHub - Credentials and Identity Manager
// @team Tamara Linse, Megan Steeves, Selma Samet, and Kellen Mentock
// @version 1.0
// @date 3.15.2024

// SPDX-License-Identifier: MIT
pragma solidity >=0.4.22 <0.8.0;

contract Migrations {
  address public owner = msg.sender;
  uint public last_completed_migration;

  modifier restricted() {
    require(
      msg.sender == owner,
      "This function is restricted to the contract's owner"
    );
    _;
  }

  function setCompleted(uint completed) public restricted {
    last_completed_migration = completed;
  }
}
