// CredHub - Credentials and Identity Manager
// @team Tamara Linse, Megan Steeves, Selma Samet, and Kellen Mentock
// @version 1.0
// @date 3.15.2024


const RecordStorage = artifacts.require("RecordStorage")

contract("RecordStorage", ([deployer, account]) => {
  let recordStorage;

  before(async () => {
    recordStorage = await RecordStorage.deployed();
  });


  describe('deployment', async () => {
    it('deploys successfully', async () => {
      const address = await recordStorage.address
      assert.notEqual(address, 0x0)
      assert.notEqual(address, '')
      assert.notEqual(address, null)
      assert.notEqual(address, undefined)
    })

    it('has a name', async () => {
      const name = await recordStorage.name()
      assert.equal(name, 'RecordStorage')
    })
  })


  describe('record', async () => {
    let result, recordCount
    const uid = 1
    const email = 'someone@uwyo.edu'
    const id_num = '1234-567'
    const validated = true

    before(async () => {
      result = await recordStorage.toBlockchainRecord(uid, email, id_num, validated, { from: account })
      recordCount = await recordStorage.recordCount()
    })


    //check event

    it('upload record', async () => {

      // SUCCESS
      assert.equal(recordCount, 1)
      const event = result.logs[0].args
      assert.equal(event.bcid.toNumber(), recordCount.toNumber(), 'Id is correct')
      assert.equal(event.uid, uid, 'uid is correct')
      assert.equal(event.email, email, 'Email is correct')
      assert.equal(event.id_num, id_num, 'ID number is correct')
      assert.equal(event.validated, validated, 'Validated is correct')
      assert.equal(event.account, account, 'Account is correct')

      // FAILURE: File must have hash
      //await fileStorage.uploadFile('', fileSize, fileType, fileName, fileDescription, { from: account }); //.should.be.rejected;

      // FAILURE: File must have size
      //await fileStorage.uploadFile(fileHash, '', fileType, fileName, fileDescription, { from: account }); //.should.be.rejected;
      
      // FAILURE: File must have type
      //await fileStorage.uploadFile(fileHash, fileSize, '', fileName, fileDescription, { from: account }); //.should.be.rejected;

      // FAILURE: File must have name
      //await fileStorage.uploadFile(fileHash, fileSize, fileType, '', fileDescription, { from: account }); //.should.be.rejected;

      // FAILURE: File must have description
      //await fileStorage.uploadFile(fileHash, fileSize, fileType, fileName, '', { from: account }); //.should.be.rejected;
    })

    //check from Struct
    it('lists record', async () => {
      const record = await recordStorage.records(recordCount)
      assert.equal(record.bcid.toNumber(), recordCount.toNumber(), 'Id is correct')
      assert.equal(record.uid, uid, 'Id is correct')
      assert.equal(record.email, email, 'Email is correct')
      assert.equal(record.id_num, id_num, 'Type is correct')
      assert.equal(record.validated, validated, 'Validated is correct')
      assert.equal(record.account, account, 'Account is correct')

    })

  })

  //  describe('value', async () => {
  //    it('should store the value 89', async () => {
  //      await recordStorage.set(89, { from: account });
  //      const storedData = await recordStorage.get.call();
  //      assert.equal(storedData, 89, 'The value 89 was not stored.');
  //    });
  //  })


})

