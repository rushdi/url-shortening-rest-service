package com.moddasir.urlshorteningrestservice.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moddasir.urlshorteningrestservice.demo.entities.UrlEntity;
import com.moddasir.urlshorteningrestservice.demo.services.UrlService;

@RestController
public class UrlController {
	@Autowired
	private UrlService urlService;
	
	@PostMapping("/addUrl")
	public UrlEntity saveUrl(@RequestBody UrlEntity urlEntity) {
		return urlService.saveUrl(urlEntity);
	}

	@PostMapping("/addUrls")
	public List<UrlEntity> saveUrls(@RequestBody List<UrlEntity> urlEntityList) {
		return urlService.saveUrls(urlEntityList);
	}
	
	@GetMapping("/getUrls")
	public List<UrlEntity> getUrls() {
		return urlService.getUrls();
	}
	
	@GetMapping("/getUrlById/{id}")
	public UrlEntity getUrlById(@PathVariable int id) {
		return urlService.getUrlById(id);
	}
	
	@GetMapping("/getShortUrlByUrl/{url}")
	public UrlEntity getShortUrlByUrl(@PathVariable String url) {
		return urlService.getShortUrlByUrl(url);
	}
	
	@DeleteMapping("/deleteUrl/{id}")
	public String deleteUrlById(@PathVariable int id) {
		return urlService.deleteUrlById(id);
	}
	
	@PutMapping("/updateUrl")
	public UrlEntity updateUrl(@RequestBody UrlEntity urlEntity) {
		return urlService.updateUrl(urlEntity);
	}
}
