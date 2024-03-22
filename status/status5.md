Status Update #5 Name: BlockHeads CredHub: Protecting Your Credentials

1.	Recap: 
Over the past couple of weeks, our group has been working on the blockchain portion of our android app, connecting our databases, and adding security measures. We are making constant progress on the development of our android app as well as planning out our commercial video.  

2.	Tasks completed: 
A.	Description of tasks completed:
a.	We have created an S3 storage bucket on AWS for image files (although we may not use it). 
b.	We have created an elastic VPC for our blockchain (although we may not use it). 
c.	We worked on Firebase to implement our 2FA and possibly the database. 
d.	We our blockchain up running. 
e.	We attempted unsuccessfully to connect the Android app to the RDS database.
B.	Your choice of quantifiable metric:
a.	Meeting for group work session once to twice a week. 
b.	Basic Android app development. 
c.	Working on our individual portions each week.
d.	Taking weekly notes of group progress. 
e.	Updating the group on Discord. 
3.	Successes:
i.	Group accomplishments:
•	We planned our commercial video. 
•	We are almost done with our Android App development.
•	We are in the process of connecting the app to our database. 
•	We got our blockchain running on the test net using Truffle and Ganache. 
•	We are implementing 2FA for our app. 
ii.	Successful solutions: 
•	Using Android Studio for the UI and app.
•	Using Truffle, Ganache, and Metamask to develop our blockchain and smart contracts.
•	Using MetaMask as the wallet for our smart contracts.
•	Using Firebase for 2FA. 
iii.	Other things tried: 
•	We’ve tried or are trying AWS server, AWS RDS database of both MySQL and PostgreSQL, MongoDB, Firebase, and other tools.
4.	Challenges:
i.	Describe the challenges:
•	We ran into problems while trying to connect the Android App to the AWS RDS database.
•	Figuring out how to properly implement 2FA in was challenging. 
•	Connecting our blockchain and smart contracts to our app.
ii.	Describe how you overcame them:
•	We are switching to either MongoDB or Firebase database instead of AWS because of permission issues—whichever will connect with our Android app and work best.  This will most likely act as server, file storage, and database.
•	We used Firebase to implement google authenticate in Android studio as our 2FA. 
•	We hope that we will be able to use a local testnet—not connect to the actual Ethereum net—to implement our blockchain.  If we can’t use a local testnet through Ganache, we could use the AWS Sepolia or Holesky testnets.
iii.	What challenges are still left?
•	Figuring out which database platform to use that works best with our current project that will connect to our Android app.
•	Implementing the rest of security measures.
•	Connecting the blockchain and smart contracts to the Android app and database, with a wallet that is probably Metamask, either through a local testnet or AWS testnet.  
iv.	What do you need help with? How can a mentor help?
•	We have received great advice from our mentors and no help is needed now. 
5.	Changes/deviations 
•	We are not implementing facial recognition, and so our security measures are pin codes and 2FA. 
6.	Detailed description of goals for next 3 weeks: 
Week1: Figuring out the best server/database/filestorage platform to switch to and get it connected. Finishing 2FA. Finishing API for mock data.  Connect our blockchain to our app and database. Test a local testnet and possibly an AWS testnet.
Week2: Filming our commercial video. Finish figuring out how to implement smart contracts in Android studio. Keep fine-tuning our app. 
Week3: Planning our presentation. Wrapping up our app and testing. 
7.	Confidence:
We are confident in our project (5).


