How to execute programs:


1. Navigate to main directory of submission
2. Compile server class: javac ChatServer.java
3. Compile client class: javac Client.java
4. Run server class: java ChatServer
5. [New terminal] Run first client class: java Client
6. [New terminal] Run second client class: java Client

What to do next?

Setting up sender client:
Prompt: 'Do you wish to (s)end or (r)receive messages:'
Response: Type in 's' and click enter
Prompt: 'Enter a username'
Response: Enter username of your choice and hit enter
Prompt: Do you wish to (c)reate or (j)oin a chat room:
Response: Type in 'c' and hit enter
Prompt: 'Chat room name:'
Response: Enter chat room name of your choice and hit enter
Prompt: 'Password:'
Response: Enter chat room password of your choice and hit enter

NB: Before sending a message, ensure the receiver is set up and has joined the chat room

Setting up receiver client:
Prompt: 'Do you wish to (s)end or (r)receive messages:'
Response: Type in 'r' and click enter
Prompt: 'Enter a username'
Response: Enter username of your choice and hit enter
Prompt: Do you wish to (c)reate or (j)oin a chat room:
Response: Type in 'j' and hit enter
Prompt: 'Chat room name:'
Response: Enter name that was used by the sender client to create the chat room
Prompt: 'Password:'
Response: Enter password that was used by the sender client to create the chat room

Once the receiver has successfully joined the chat room, the sender can then send a message

[Sender client]:
To send a message, the sender client must do the following:
Prompt: 'Please enter a message to encrypt(/q to quit):'
Response: Type in any message of your choice and hit enter

The PGP process involved with sending the message will now begin

[Receiver client]
To receive a message, the receiver client must do the following:
Prompt: 'Hit enter when ready to receive a message (/q to quit)'
Response: Hit enter

The PGP process involved with receiving the message will now begin

'/q' can be entered to close the connection

