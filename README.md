# url-shortening-rest-service
Welcome to Url shortening service
The project url is http://localhost:8989/ 
To Run this project please create a mysql database name <b>urlshorteningdb</b> 
'create database urlshorteningdb'
You also need to change the username and also the password in application.properties file
/ or /home or /index -> for the readme or intructions page
/addUrl -> for add url as url and shortUrl 
/addUrls -> for add list of urls with same structure as like url and shortUrl 
/getUrls -> get all urls as list 
/getUrlById/{id} -> get specific url by <b> id </b> which is auto generated 
/getShortUrlByUrl/{url} -> get shortUrl by sending url 
/deleteUrl/{id} delete url by id 
/updateUrl -> just need to pass url obj and it will find the record and update it
