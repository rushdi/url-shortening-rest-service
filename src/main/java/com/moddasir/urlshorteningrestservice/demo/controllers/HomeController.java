package com.moddasir.urlshorteningrestservice.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping({ "/", "/home", "index" })
	public String home() {
		String msg = " Welcome to Url shortening service <br> " + " The project url is http://localhost:8989/ <br>"
				+ " To Run this project please create a mysql database name <b>urlshorteningdb</b> <br>"
				+ " 'create database urlshorteningdb' <br>"
				+ " You also need to change the username and also the password in application.properties file <br>"
				+ " / or /home or /index -> for the readme or intructions page <br>"
				+ " /addUrl -> for add url as url and shortUrl <br>"
				+ " /addUrls -> for add list of urls with same structure as like url and shortUrl <br>"
				+ " /getUrls -> get all urls as list <br>"
				+ " /getUrlById/{id} -> get specific url by <b> id </b> which is auto generated <br>"
				+ " /getShortUrlByUrl/{url} -> get shortUrl by sending url <br>"
				+ " /deleteUrl/{id} delete url by id <br>"
				+ " /updateUrl -> just need to pass url obj and it will find the record and update it. <br>";
		return msg;
	}
}
