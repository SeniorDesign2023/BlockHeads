Status Update #2 
Name: BlockHeads
CredHub: Protecting Your Credentials


1.	Recap: 
Over the past few weeks, our group has successfully outlined our minimum viable product and distributed responsibilities among team members according to their interests and strengths. We conducted detailed research in each of the key functional areas for our product and are establishing the validation and verification processes for driver’s licenses and diplomas with both the State of Wyoming and University of Wyoming. We have decided on the server, programming languages, and functionality of our product. Our team is actively researching and developing our minimum viable product.  Please see the attached meeting notes for details.

2.	Tasks completed: 
•	Our group had a meeting with Brett Williams, Doug Lee, and Lane Buchanan regarding the validation process of diplomas.  
•	Tamara set up a meeting with WyDOT concerning the validation process of Driver’s license ID.
•	Kellen researched the AWS server for initial setup. 
•	Tamara and Megan looked into the Colorado mobile app for research.
•	Selma researched the security measures to be implemented in our product.

3.	Successes:
i.	Group accomplishments:
•	Identifying our minimum vial product.
•	Finding solutions for validation and verification process.
•	Figuring out details regarding the functionality of our product.
i.	Other things tried: 
•	   n/a

4.	Challenges:
i.	Describe the challenges:
•	We are facing some challenges regarding the validation process of both the Drivers’s license and diplomas.
•	We are also aware that we need to nail security and authentication.
•	We’ll also need to make sure all the parts fit together.
ii.	Did you overcome them or are there challenges left?
•	We are actively setting up follow-up meetings with UW regarding this process to find better solutions.
•	We will contact the National Student Clearinghouse for possible linking for verification of degrees.

iii.	Do you need help? Can mentor help or external help is needed?
•	We have received great support from our mentors and external resources so no further help is needed so far. 

5.	Changes/deviations: The only change from initial pitch document is that we will be developing an Android application instead of a website since we believe that will make our product more user-friendly. 

6.	Confidence:   
We are confident in our product.

7.	Group dynamics:  
Our team is working great together. We are actively seeking solutions and ideas for our product and each member is taking actions to fulfill their role.



MEETING NOTES

Senior Design
COSC 4950

Group: BlockHeads

Megan Steeves
Selma Samet
Kellen Mentock
Tamara Linse

Project: CredHub – Protecting Your Credentials


Meeting: 12.1.23 (with Jim, EERB 225) – Megan, Kellen, Selma, and Tamara

Summary
•	Checked in with Jim.
•	He released his and Lars’s comments on our work so far.
•	We decided to see if the Registrar can just manually verify Tamara’s previous degrees for our proof of verification.
•	We’re in a good place to wrap up the semester.
•	We decided to meet with Steve Lupien next semester, when we’ll have more questions.

Action Items
•	Will turn in Status Report #2 on Friday, 12.1.
•	Last class - a standup on Tues. 12.5.
•	We will turn in all our final documents (final planning document and retrospective).
•	We’ll all try to get some work in on the project over break.

 
Meeting: 11.20.23 (Zoom, with Brett Williams, UW IT, and Lane Buchanan, UW Registrar) – Megan, Kellen, Selma, and Tamara

Summary
•	In the end, Lane affirmed that a process would be possible, and worst case scenario we present our project without actually having that implemented.
•	But we would like to have a working model, and so we’ll continue discussions with Brett, Lane, and Doug Lee of UW. 
•	It may be, for the few test degrees we’re going to do, we could have a manual process, but Lane is concerned that, if this becomes a full app, the amount of staff time would be overwhelming.
•	We had sent a project proposal over for them last week so they would know what we’re working on and who we are.
•	We talked through a number of options for verification.
•	Verification on their end could be through a website they go to and press verified that connects to the app. Or it could be part of the email they get (if there’s no API).
•	An email was suggested, but that would be hard to connect to the app. We want the process to be out of the hands of the user and not just the honor system (“I have received verification.”).
•	There is no API at the moment, though there are companies who get data in various ways.
•	Brett said an API like this is a few years away.
•	A case in point is the Pathways to Prison project, where they’re trying to figure out a way to deliver content outside the security of UW infrastructure.
•	The National Student Clearinghouse is a place that gathers degrees from all over, and it may be an option that is even more efficient, if this app were to go live. However, they may charge for their services.
•	Kellen mentioned we’re doing basically a proof of concept, and so there’s less pressure to have a completed full-service product.
•	Selma outlined our security approaches and also suggested possibly calling in for a pin like international students do to reset their password. However, calling in would only be possible during business hours.
•	Megan affirmed BCDiploma is also a place we might reach out to.
•	Tamara explained how the UK credential app for doctors during covid allowed quick transfer of doctors between hospitals and helped doctors keep their credentials even if their university no longer existed. She also mentioned the myColorado app.
•	Lane explained many of the challenges of providing this type of information. People don’t enter their names of record or they don’t give correct college or degree information or they misspell things.  That way, it’s hard to link people with their degrees.
•	Lane explained the process that National Student Clearinghouse uses with graduates. They give them a code, which when they use it authenticates who they are later when they access their diploma. He suggested they might be a place we could get information about degrees.
•	Lane suggested a flat-file of degrees, but that would mean the app would receive a full list of graduates that year, which seems careless and inefficient.
•	Kellen asked what is the information we need for UW to be able to verify degrees. This is a unique connecting identifier.
•	The crux of it is that we need a unique identifier of some kind, and it needs to be something that UW most likely has and also one that’s public directory information.  After considering a number of options (name and degree which might be entered wrong, last four of social or birthdate which we don’t want because it’s not public) we decided an email is the best unique identifier. If the person’s email is not in the system, we would have a popup explaining that and that they would need to update their email with UW before the app could proceed.
•	Lane said that it’s not a no but we need to further consider and develop our ideas together over the next couple months.
•	We as a group with take this feedback and incorporate it in our design and development.
•	We followed up the next day and asked if it might be possible to link to Ellucian Advance - who works with the National Student Clearinghouse - through the UW Foundation to create an API. Lane answered that since the info comes from Banner, if we’re going to develop an API it’s best to go through Banner.

Action Items
•	Brett is going to talk with Doug Lee, the developer, about APIs and other options. (Doug is on vacation.)
•	Research and contact the National Student Clearinghouse (studentclearinghouse.org) for possible linking for verification of degrees.
•	Continue talking with Brett and Lane about ways to connect with UW (future API, manual process).
•	Use the ideas presented to continue to develop our ideas.

 

Meetings: 11.7.23 (Standup, EERB 255) and 11.14.23 (Coe 266) - Kellen, Megan, Selma, and Tamara

Summary
•	We got a response from UW about degree verification, and we set up a zoom meeting with Brett Williams and Doug Lee from IT and Lane Buchanan from the Registrar for Monday, 11.20, at 3:00 p.m.
•	We got a response from the Wyoming DMV about Wyoming Driver’s License ID verification, and we are in the process of setting up a zoom meeting with Misty Zimmerman, WYDOT Program Manager of Driver Services, on either Monday 11.20 or Monday 12.4.
•	We are meeting with one of our mentors, Steve Lupien, Director of the Center for Blockchain and Digital Innovation, on Wednesday, 11.19, at 2 p.m. for his input on our project.
•	We researched an AWS server and will be setting it up over the next couple of weeks. We should be able to use the free tier.
•	We researched databases, and we can use AWS RDS for a PostgreSQL database. We need to set up the server in order to develop the database.  
•	We researched the app that Colorado has that is similar to what we’re trying to do.  It is called the myColorado mobile app, which was released in November of 2019. The app was created by the State of Colorado in conjunction with Ping Identity, ID DataWeb, and ProofID.  https://www.govtech.com/biz/three-vendors-partner-on-digital-id-mobile-app-for-colorado.html 
•	We created a personal GPT to help us with overall organization of our project and to dig deeper into our ideas.
•	Megan has a connection with the CEO of BCdiploma, Luc Jarry-Lacombe, and we can consult with him about our project.

Action Items

•	Adapt our materials to a one-page project proposal for UW IT and the State of Wyoming and develop a list of questions. Be prepared for our meetings.
•	Meet with the State of Wyoming WYDOT, UW IT, and Steve Lupien.
•	Review Jim’s and Lars’s feedback on our Intermediate Planning Document posted on WyoCourses when available.
•	Continue to research and develop our ideas in our areas. Get started on programming possibly over Thanksgiving but definitely over Christmas break.
•	Begin setting up server and database.
•	Meet with Jim after Thanksgiving during our class period, 11.28.
•	Start working on our Status Update #2, Retrospective, and Final Project Plan.
 
Meetings: 10.17.23 (Standup, EERB 255), 10.24.23 (Coe 264), and 10.31.23 (with Jim, EERB 255) - Selma, Megan, Kellen, and Tamara

Summary

•	Our minimum viable product:
o	Target verifying one or both a Wyoming driver’s license/ID and a UW degree,
o	Login, 2FA, and recovery of passwords,
o	An android interface,
o	Use smart contracts to interact with blockchain and blockchain to store IDs and credentials,
o	A server to interact with devices and the blockchain,
o	A database for temporary data mirrored between a device and the server, and
o	A procedure to verify with UW and Wyoming.
•	We will assume that the user is only connecting one device.
•	We decided a phone app would be more appropriate than a website and with consultation with Jim decided to design for android.
•	We made a list of functionality, potential programming languages, and then designated a lead and a backup for each area, with the understanding that if we need help or need to hand it off to someone that will be okay.
o	Database, SQL – Tamara (Selma)
o	Blockchain and Smart Contracts, Solidity – Kellen (Tamara)
o	Android UI/UX, Java/Kotlin – Megan (Selma)
o	Server, Python/C++ – Kellen (Megan)
o	Security and Authentication, Java/Kotlin – Selma (Megan)
o	Validation (contacting organizations) – Tamara (Selma)
•	Security and authentication are important and may be challenging, so we need to be on top of that.
•	We will each do research on our areas to firm up our approach, including developing diagrams.
•	We reached out to the State of Wyoming to develop a procedure for validating driver’s licenses/IDs (Tamara, with group added to email).  We completed the contact form, called, emailed per the phone call contact’s instructions to helpdesk@wyo.gov, and followed up with email, but we have not yet heard back. We will continue to follow up.
•	We reached out to the University of Wyoming to develop a procedure for validating credentials—degrees received.  We (Tamara, with group added to email) first emailed the registrar (Lane Buchanan) and he referred us to IT (Brett Williams). We then emailed IT and did not get a response. We followed up and got a response. Brett is out of the office after surgery and isn’t able to meet yet but will be able to soon. Megan and Selma will be meeting him.
•	Brett said he had concerns about student data privacy, but since we’re only asking for degrees—which are public information—that are connect to a person and it’s that person who is asking for it, it should be okay.
•	We also will need to develop language and then ask the State of Wyoming and University of Wyoming to put a page on their website that can be accessed by people verifying identification and credentials that says that our product is legitimate.
•	In consultation with Jim, we decided to develop our server on the AWS platform.
•	We firmed up our security and authentication plans.
o	For first-time login, the user will enter username and password plus facial recognition that is built in to android devices. 
o	They will also enter their phone number and enroll in two-factor authentication. 
o	If they forget their password, they can reset their password with a code (that expires after a period of time) sent via text to their phone that will be entered into the interface.
o	A stretch goal would be to also offer a twelve-word recovery phrase.
•	Memory management will be via a database and a blockchain. The database will store process, account, and temporary information, while the blockchain will store identities, credentials, and long-term information.
•	Our model for communication and memory: 
o	There will be two-way communication between devices and the server.
o	The server will have two-way communication with the blockchain, but devices will only be able to read from the blockchain.
o	Each person’s database will be mirrored between their device and the server.
•	Our mentors so far are Jim Ward, Steve Lupien, and Danny Radosovich.

Action Items

•	Continue to follow up with the State of Wyoming about validating driver’s licenses or IDs (Tamara).
•	Do research on how Colorado sets up their digital ID system (Tamara and Megan).
•	Continue to follow up with the University of Wyoming about validating UW degrees (Selma, Megan, and Tamara).
•	We will all so research into our designated areas and firm up our approach, including diagrams and models.
•	We will develop a flow chart of security/login/authentication and the related technologies (Selma).
•	We will research which database language to use, PostgreSQL or MySQL (Tamara).
•	We will research server setup and decide on a language, Python or C++ (Kellen).
•	We will research Truffle boxes and smart contracts and how they apply to our project (Kellen).
•	We will research the android interface, store, messaging for password recovery, and face recognition (Megan).
•	We’ll attempt to do some programming before the end of the semester and over the holidays to get ahead of next semester.
•	We are developing the Intermediate Planning Document and, possibly, a team contract.
 
Meeting with Jim: 10.10.2023, EERB 255 - Selma, Megan, Kellen, and Tamara

Summary
•	We gave our status report to Jim
•	Jim let us know expectations for status report and the course going forward – status reports every so often, be able to hand off project to another team at end of semester if it was necessary, planning docs, working through details
•	We don’t necessarily need to divide the project evenly by 4, just everyone work on their strengths and speak up if one of us feels like we’re taking on too much and hand things off as necessary
•	We need to limit the scope of our project as much as possible or we won’t be able to finish it
•	Maybe focus just on Wyoming ID and UW credentials
•	We’re now thinking a phone app (dApp) as opposed to a website
•	Talked through what we’d decided about security and keep it to a minimum
o	First login – ID and facial recognition if possible, otherwise just verify id number
o	Login after that – bio such as facial recognition or username and password
o	Have logins expire and timeout
o	Use text messages for recovery
o	Can offer the user choices of they they want for security (trust this device, how long before timeout, how to send pin code)
o	Not having to give phone number or email is a stretch goal
•	Think outside the box and think about failures and backup plan
•	Minimum viable project in April
•	Our status report is done (status report + these meeting notes) and we’ve turned it in on WyoCourses and GitHub

Action Items
•	Megan and Selma will give verbal status update next week (standup, 3-5 min max, wins and losses and failures and what we’ve tried and what others can learn from it), with support from Kellen and Tamara
•	After next class period, we will do the same thing we did this past two weeks. The first week during the class period we’ll meet in Coe to further develop the project. The following week we’ll meet with Jim in the classroom for an update.
•	Everyone will continue to research things
•	Intermediate planning document due 11.3
•	He also suggests a team contract 11.3
•	Next status doc due 11.27
•	Final planning doc and retrospective due 12.7

 

Meeting: 10.3.2023, Coe 264 - Selma, Megan, Kellen, and Tamara

Summary
•	We addressed the great questions that came up in class from other members of the class
•	We talked a lot about processes for security
o	Megan came up with idea to solve our initial login problem – When someone initially logs in, they take a photo of themselves and their id.  Facial recognition plus validating their ID (e.g., quick API validation with driver’s license through DMV) will allow them to create an account
o	Not sure we will be able to get facial recognition working in time, but we had some suggestions for open-source facial recognition 
o	User’s login will automatically log them out after a certain time period (4 days? 2 weeks?)
o	Once a browser is logged in, they will be able to get back in with a pin
o	They will only be able to login on two trusted devices (the independent pages send to other people to show ID will not count in this)
o	If they forget their pin but they are logged in, they can reenter their login info to create another pin
o	If they forget their login information, we will need to have password recovery option
o	We talked about a number of things for password recovery and login
o	We have the options of having them enter their phone number, an email address, and a recovery phrase
o	They won’t need both phone number and email unless they want it
o	A number of us were in favor of using a recovery phrase as first-line login, with the possibility of not making them enter a phone number or email
o	However, in order to make the app work, we most likely need at least one piece of contact information, most likely (for 2FA)
o	Users may need a trusted third party or emergency contact to be able to access this, or one partner may be the one in charge of both partners’ online data—therefore, we need a way to have a trusted contact
o	We could do trusted and/or emergency contact through a smart contract with asymmetric cryptography
o	We need to talk through all this with Jim
•	Once again, we are assuming we are creating a website (not a phone app, tho that would be the most useful to user)
•	Multiple ways of doing things is good
•	We decided to limit the scope of the IDs we will test, with the understanding that with each agency would have to establish a relationship. We will focus on one at first.
o	We will focus on credentials with UW
o	If possible, we may add Wyoming Driver’s License
o	Probably won’t get to it but also a national ID such as Passport
•	We will need 2FA
•	We will have multiple ways to show an ID to someone
o	It will have a time out
o	One way is a QR code that takes the person asking to a web page not linked to any of our other login
o	One QR code for each type of ID
o	There will be a verification permission sent to user via text (reply Y or N) or another way such as a popup from the app so they can confirm to show that page to the outside person
o	Other ways to share an ID may be text or email with link that goes to that web page display
•	The home page will have buttons to each ID, and after button press, the user will need to enter a pin (even tho they are logged in)
•	We need to further figure out how to just show the info they need and not expose the whole ID unless necessary
•	We will test, for example, at liquor store with valid (of age) ID and invalid (underage) ID
•	Because those wanting to see the ID won’t know if this is legit, we will have a button on the viewing page they can press that will go to the ID agency web page, and we would ask the agency to put up a page with a brief description of CredHub and saying that it’s legit
•	We’ll start with UW and talk to Registrar’s Office (Tamara will email Lane, the Registrar)
•	Selma said she’d like to do the UI/UX portion
•	Megan has been talking about the project with Steve Lupien for ideas
•	Kellen has been looking into Truffle boxes
•	We will set up reminders for updates

Action Items

•	We will meet with Jim next class period (10.10) in our classroom in the EERB
•	Selma will begin our Status Update #1 and have it to us by Sunday, then the rest of us will go through and edit and add so that we can turn it in on Tuesday (10.10)
•	Tamara will upload these notes
•	Tamara will email the Registrar’s Office
•	We will continue to develop and parse out responsibility for parts of the project
 
Meeting. 9.19.2023, Coe 310 - Selma, Megan, Kellen, and Tamara

Summary
•	Our project:
o	CredHub – Protecting your credentials 
o	Tagline – You’ve got cred
o	Group name – BlockHeads
o	We will develop a web application (dApp) (mobile interface reserved for future due to limited development time)
•	Everyone has their logins to the group on WyoCourses, Discord group, and GitHub
•	Tamara and Selma had started the pitch document before the meeting
•	We all developed the pitch document to be fairly complete during the meeting
•	Jim is our advisor
•	For now, all we need is a server
•	Selma proposed our name be CredHub - Protecting your credentials
•	Tamara proposed the tagline You’ve got cred
•	Megan showed us an example app from Colorado state government that holds credentials that we can partially use as a model
•	Kellen suggested we not only have a blockchain to store credentials but also we use a smart contract to verify with official organizations
•	Types of IDs/credentials: social security number, birth certificate, passport, drivers license/ID card, degrees, marriage license, etc.
•	Someone suggested using a QR code for sharing of credentials
•	We discussed how to authenticate (2FA?) and what data would be used for user login (SSN? other?) and how to protect against someone getting your data and then spoofing you and creating an account
•	Trust and security is going to be very important
•	Verification with official organizations may be either through an API or through a analog process
•	Reminders to renew ids and credentials will be built in
•	As a phone app, will need a lock feature for when a user hands over their phone to someone to show id
•	We may need alternate profile options (what someone goes by at work vs in private vs as a name that you go by for other things)
•	For blockchain, we may use Solidity and Truffle and Truffle boxes
•	Not sure the exact data storage model - blockchains with a database (hybrid)?
•	Functionality to consider: authentication, user accounts, security/trust, UX/UI, data storage (blockchain and database), API integration, manual verification, use cases

Action Items
•	Selma will edit through the pitch document and send to everyone else to review (Sunday?)
•	Then we will submit the pitch document by Tuesday, 9.26, and also do a verbal pitch to the class
•	We will meet with Jim sometime in the next two weeks
•	We are setting up additional meeting times (during class time?)
•	We will complete status update #1 and submit by 10.10
•	Future topics – narrow in on functionality, tech stack, and who is doing what
 
Initial Meeting and Followup on Discord, 9.12.2023 - Megan, Selma, Kellen, and Tamara

Summary
•	Tamara, Megan, and Selma pitched idea to class, 9.12.2023
•	Kellen joined group and is interested in blockchain
•	Selma emailed Jim, and he set up group on Discord and WyoCourses
•	Megan is in contact with her prof Steve Lupien, who can help us or connect us with people as necessary

Action Items
•	Because we’ve formed our group, we will not go to class 9.19.2023
•	Instead, we’ll meet in Coe Library during that time (Tues., 9.19.2023, from 4-5, in Coe 263) to talk about the project and create the pitch document
•	We all will bring ideas and what aspect we’re good at and what we would like to work on
•	Selma is reserving the room in Coe
•	Tamara is taking meeting notes




