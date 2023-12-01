Status Update #1 
Name: BlockHeads
CredHub: Protecting Your Credentials


1. Recap: 
Over the past few weeks, we've dedicated time to conducting research on the core concepts we want to focus on for our website's functionality and features. Later, we gathered to discuss and develop these ideas and address any questions or challenges that arose during our pitch day.

During our meeting, we thoroughly explored how the website will operate from the user's perspective. We ensured that our verification and security measures are robust while maintaining a user-friendly approach. We also talked about reaching out to potential partners to establish collaborations for our service.

Since blockchain technology plays a critical role in our project as it facilitates trust between users and hosts, we had a detailed discussion on how and where we plan to implement blockchain within our website.

Please see the attached meeting notes for details.

2. Tasks completed: 
* Megan reached out to Steven Lupien, director of Center of Blockchain and Innovation, to help answer some of our questions related to integration of blockchain into our project.
* Tamara took charge of keeping notes of our progress and updating our meeting records.
* Kellen looked into Truffle boxes and how we can implement them in our project.
* Selma looked into the UI/UX portion of the project for ideas to create a user-friendly website. 

3. Successes:
i. Group accomplishments:
* Pitching ideas and finding solutions to some of verification and authentication issues.
* Development of robust security measure ideas.
i. Other things tried: 
*    n/a
4. Challenges:
i. Describe the challenges:
* Since we are just starting our project, we’re developing our ideas, so there are plenty of challenges. What functionality do we want? We need really good security, so how will we implement that? Who will be in charge of what? What resources do we have? Details on how big of a part will Blockchain play and in what areas?
ii. Did you overcome them or are there challenges left?
* We are talking through these challenges as we develop our ideas and trying to find solutions for them as the project progresses. 
iii. Do you need help? Can mentor help or external help is needed?
* We have you and Steve Lupien as our mentors at the moment. We may need other mentors as we get further in our project.

5. Changes/deviations:                                                                                                                                We don’t really have any changes from the pitch document. We are just adding more details and authentication/verification measures to ensure security. 
6. Confidence:   
We are confident that we will be able to develop and implement this project.
7. Group dynamics:  
Our group is working great together. Each member is actively contributing during meetings, sharing ideas, conducting appropriate research, and fulfilling their roles/tasks. We are very excited about this project.




Senior Design
COSC 4950

Group: BlockHeads

Megan Steeves
Selma Samet
Kellen Mentock
Tamara Linse

Project: CredHub – Protecting Your Credentials


Meeting: 10.3.2023, Coe 264 - Selma, Megan, Kellen, and Tamara

Summary
* We addressed the great questions that came up in class from other members of the class
* We talked a lot about processes for security
o Megan came up with idea to solve our initial login problem – When someone initially logs in, they take a photo of themselves and their id.  Facial recognition plus validating their ID (e.g., quick API validation with driver’s license through DMV) will allow them to create an account
o Not sure we will be able to get facial recognition working in time, but we had some suggestions for open-source facial recognition 
o User’s login will automatically log them out after a certain time period (4 days? 2 weeks?)
o Once a browser is logged in, they will be able to get back in with a pin
o They will only be able to login on two trusted devices (the independent pages send to other people to show ID will not count in this)
o If they forget their pin but they are logged in, they can reenter their login info to create another pin
o If they forget their login information, we will need to have password recovery option
o We talked about a number of things for password recovery and login
o We have the options of having them enter their phone number, an email address, and a recovery phrase
o They won’t need both phone number and email unless they want it
o A number of us were in favor of using a recovery phrase as first-line login, with the possibility of not making them enter a phone number or email
o However, in order to make the app work, we most likely need at least one piece of contact information, most likely (for 2FA)
o Users may need a trusted third party or emergency contact to be able to access this, or one partner may be the one in charge of both partners’ online data—therefore, we need a way to have a trusted contact
o We could do trusted and/or emergency contact through a smart contract with asymmetric cryptography
o We need to talk through all this with Jim
* Once again, we are assuming we are creating a website (not a phone app, tho that would be the most useful to user)
* Multiple ways of doing things is good
* We decided to limit the scope of the IDs we will test, with the understanding that with each agency would have to establish a relationship. We will focus on one at first.
o We will focus on credentials with UW
o If possible, we may add Wyoming Driver’s License
o Probably won’t get to it but also a national ID such as Passport
* We will need 2FA
* We will have multiple ways to show an ID to someone
o It will have a time out
o One way is a QR code that takes the person asking to a web page not linked to any of our other login
o One QR code for each type of ID
o There will be a verification permission sent to user via text (reply Y or N) or another way such as a popup from the app so they can confirm to show that page to the outside person
o Other ways to share an ID may be text or email with link that goes to that web page display
* The home page will have buttons to each ID, and after button press, the user will need to enter a pin (even tho they are logged in)
* We need to further figure out how to just show the info they need and not expose the whole ID unless necessary
* We will test, for example, at liquor store with valid (of age) ID and invalid (underage) ID
* Because those wanting to see the ID won’t know if this is legit, we will have a button on the viewing page they can press that will go to the ID agency web page, and we would ask the agency to put up a page with a brief description of CredHub and saying that it’s legit
* We’ll start with UW and talk to Registrar’s Office (Tamara will email Lane, the Registrar)
* Selma said she’d like to do the UI/UX portion
* Megan has been talking about the project with Steve Lupien for ideas
* Kellen has been looking into Truffle boxes
* We will set up reminders for updates

Action Items

* We will meet with Jim next class period (10.10) in our classroom in the EERB
* Selma will begin our Status Update #1 and have it to us by Sunday, then the rest of us will go through and edit and add so that we can turn it in on Tuesday (10.10)
* Tamara will upload these notes
* Tamara will email the Registrar’s Office
* We will continue to develop and parse out responsibility for parts of the project


Meeting. 9.19.2023, Coe 310 - Selma, Megan, Kellen, and Tamara

Summary
* Our project:
o CredHub – Protecting your credentials 
o Tagline – You’ve got cred
o Group name – BlockHeads
o We will develop a web application (dApp) (mobile interface reserved for future due to limited development time)
* Everyone has their logins to the group on WyoCourses, Discord group, and GitHub
* Tamara and Selma had started the pitch document before the meeting
* We all developed the pitch document to be fairly complete during the meeting
* Jim is our advisor
* For now, all we need is a server
* Selma proposed our name be CredHub - Protecting your credentials
* Tamara proposed the tagline You’ve got cred
* Megan showed us an example app from Colorado state government that holds credentials that we can partially use as a model
* Kellen suggested we not only have a blockchain to store credentials but also we use a smart contract to verify with official organizations
* Types of IDs/credentials: social security number, birth certificate, passport, drivers license/ID card, degrees, marriage license, etc.
* Someone suggested using a QR code for sharing of credentials
* We discussed how to authenticate (2FA?) and what data would be used for user login (SSN? other?) and how to protect against someone getting your data and then spoofing you and creating an account
* Trust and security is going to be very important
* Verification with official organizations may be either through an API or through a analog process
* Reminders to renew ids and credentials will be built in
* As a phone app, will need a lock feature for when a user hands over their phone to someone to show id
* We may need alternate profile options (what someone goes by at work vs in private vs as a name that you go by for other things)
* For blockchain, we may use Solidity and Truffle and Truffle boxes
* Not sure the exact data storage model - blockchains with a database (hybrid)?
* Functionality to consider: authentication, user accounts, security/trust, UX/UI, data storage (blockchain and database), API integration, manual verification, use cases

Action Items
* Selma will edit through the pitch document and send to everyone else to review (Sunday?)
* Then we will submit the pitch document by Tuesday, 9.26, and also do a verbal pitch to the class
* We will meet with Jim sometime in the next two weeks
* We are setting up additional meeting times (during class time?)
* We will complete status update #1 and submit by 10.10
* Future topics – narrow in on functionality, tech stack, and who is doing what


Initial Meeting and Followup on Discord, 9.12.2023 - Megan, Selma, Kellen, and Tamara

Summary
* Tamara, Megan, and Selma pitched idea to class, 9.12.2023
* Kellen joined group and is interested in blockchain
* Selma emailed Jim, and he set up group on Discord and WyoCourses
* Megan is in contact with her prof Steve Lupien, who can help us or connect us with people as necessary

Action Items
* Because we’ve formed our group, we will not go to class 9.19.2023
* Instead, we’ll meet in Coe Library during that time (Tues., 9.19.2023, from 4-5, in Coe 263) to talk about the project and create the pitch document
* We all will bring ideas and what aspect we’re good at and what we would like to work on
* Selma is reserving the room in Coe
* Tamara is taking meeting notes







