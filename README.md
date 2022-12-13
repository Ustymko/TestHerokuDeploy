# TAB documentation
Base url: https://glacial-earth-93029.herokuapp.com/

## Users table:
1. GET (all users)
Url: https://glacial-earth-93029.herokuapp.com/users/all
2. GET (by id)
Url: https://glacial-earth-93029.herokuapp.com/users/{id}
3. POST
Url: https://glacial-earth-93029.herokuapp.com/users/
Body: 
{
"userId": some_id (in users table): int,
"name": some_name: str,
"username": some_username: str,
"phoneNumber": some_phone_number: str
}
 4. PUT (by id)
Url: https://glacial-earth-93029.herokuapp.com/users/put/{id}
Body:
{
"userId": some_id (in users table): int,
"name": some_name: str,
"username": some_username: str,
"phoneNumber": some_phone_number: str
}
5. DELETE (by id)
Url: https://glacial-earth-93029.herokuapp.com/users/delete/{id}


## Groups table:
1. GET (all groups)
Url: https://glacial-earth-93029.herokuapp.com/groups/all
2. GET (by id)
Url: https://glacial-earth-93029.herokuapp.com/groups/{id}
3. POST
Url: https://glacial-earth-93029.herokuapp.com/groups/
Body: 
{
"groupId": some_id: int,
"name": some_name: str
} 
4. PUT (by id)
Url: https://glacial-earth-93029.herokuapp.com/groups/put/{id}
Body:
{
"groupId": some_id: int,
"name": some_name: str
} 
5. DELETE (by id)
Url: https://glacial-earth-93029.herokuapp.com/groups/delete/{id}


## Messages table:
1. GET (all messages)
Url: https://glacial-earth-93029.herokuapp.com/messages/all
2. GET (by id)
Url: https://glacial-earth-93029.herokuapp.com/messages/{id}
3. POST
Url: https://glacial-earth-93029.herokuapp.com/messages/
Body: 
{
  "messageId": some_id: int,
  "isAdvertisement": null or bool value,
  "messageBody": some_message_body: str,
  "sendDate": "2018-12-10T13:49:51.141Z" : timestamp,
  "group": {
"groupId": some_id: int,
"name": some_name: str
},
  "user": {
"userId": some_id (in users table): int,
"name": some_name: str,
"username": some_username: str,
"phoneNumber": some_phone_number: str
}
}
4. PUT (by id)
Url: https://glacial-earth-93029.herokuapp.com/messages/put/{id}
Body:
{
  "messageId": some_id: int,
  "isAdvertisement": null or bool value,
  "messageBody": some_message_body: str,
  "sendDate": "2018-12-10T13:49:51.141Z" : timestamp,
  "group": {
"groupId": some_id: int,
"name": some_name: str
},
  "user": {
"userId": some_id (in users table): int,
"name": some_name: str,
"username": some_username: str,
"phoneNumber": some_phone_number: str
}
}

5. DELETE (by id)
Url: https://glacial-earth-93029.herokuapp.com/messages/delete/{id}
