##### What program it is?

Jwt or json web token. In authentication, when the user successful log in, web will return token and saved in local storage. If the client passes a valid JWT assertion the server will generate an  access_token valid for making calls to the application and pass it back  to the client.

this is the first time i try to use jwt. theres couple of depedency that i use in this program here is the list :

1. spring security : authentication for spring 
2. spring web : for build web
3. mysql connector : database jdbc
4. jjwt : for jwt token

and other depedency that you can see in pom.xml



##### How to use 

1. go to application.properties
2. change database name as you like, i name it as "tryjwt"  (without quote)
3. insert username and password as your mysql setting
4. change "hibernate.ddl-auto" to "create" (without quote)
5. check your mysql,  now the database and table should exist
6. if it exist, change again "hibertnate.ddl-auto" to "update" (without quote)
7. run the program, open post man and go to localhost/8000/register
8. insert username and password in body, using method post
9. now you should see token in respon body
10. insert token in bearer and now you have authentic to see other page



##### How to use(other way)

1. i'm include database name tryjwt.sql in sama place as this readme
2. import it to mysql and now you just need to follow step 7 - 10 above











