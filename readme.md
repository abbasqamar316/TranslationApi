# Translation 



Translation API With Spring Security


## Getting Started

First you need to download the project from git and run the db scripts.

the script are 


### Prerequisites

You must have postgres and intellij idea and postgres sql.

### Installing

install the intellij idea and you can download the https://www.postgresql.org/download/ from there based on what kinda of OS you have.
And the credentials for particular database is test
and credentials are stored in users table

the Credentials are 

user name : abbas \
password : test

for encrypt i used the below website

https://www.browserling.com/tools/bcrypt

with round 13


## Running the tests

here is The Swagger URL 
http://localhost:9082/swagger-ui/index.html

I am running the project on port 9082 u can change from applicatoin.properties

### And coding style 

I have used the Spring Security for make sure every api is secured by authenticaoin and by JWT token.
I have used Reponse Entity for better response.
try to use the cache 

## Deployment


just deploy the war on the tomcat if you want to and run the scripts for database and for tables and insert user query for user table

## Add the user  into user table

## here is the query

INSERT INTO public.users(
id, username, password)
VALUES (1, 'abbas', '$2a$12$B.tdihqBPoeEXtfn37f5.uYOZLwS2LVDipN9vHTiHGHdaAWKONApy');
## Built With

here is the git url which is public
https://github.com/abbasqamar316/TranslationApi.git

and swagger url is

http://localhost:9082/swagger-ui/index.html


## Authors


Abbas Qamar


