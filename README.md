# posts-api
This APIs allow users to create posts and other users make comments on the posts

# How to run the project
follow the below points to run the project successfully:
* build the project
* server on port 8081
* initiate request to be Authorized to the following url in postman POST http://localhost:8081/login
with Json body```{
"username":"amer", "password":"ss1254" 
}```
* you will find other users details in the /resources directory in data.sql
* you will get Authorization header in the response use it in request Header to perform other operation
#### server host : http://localhost:8081

## List of Available APIs

### GET /public/v2/users
this API will return list of existing users.

### GET /public/v2/users/{id}
this API will return single user.

### GET /public/v2/posts
this API will return list of posts

### GET /public/v2/posts/{id}
this API is used to retrieve single post

### GET /public/v2/comments
this API will return list of comments

### GET /public/v2/comments/{id}
this API will return single comment


* written by: Amer Hijazi
* date: 11/06/2022