package com.moddasir.urlshorteningrestservice.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moddasir.urlshorteningrestservice.demo.entities.UrlEntity;
import com.moddasir.urlshorteningrestservice.demo.repos.UrlRepo;

@Service
public class UrlService {
	@Autowired
	private UrlRepo urlRepo;
	
	public UrlEntity saveUrl(UrlEntity urlEntity) {
		return urlRepo.save(urlEntity);
	}
	
	public List<UrlEntity> saveUrls(List<UrlEntity> urlEntityList) {
		return urlRepo.saveAll(urlEntityList);
	}
	
	public List<UrlEntity> getUrls() {
		return urlRepo.findAll();
	}
	
	public UrlEntity getUrlById(int id) {
		return urlRepo.findById(id).orElse(null);
	}
	
	public UrlEntity getShortUrlByUrl(String url) {
		return urlRepo.findShortUrlByUrl(url);
	}
	
	public String deleteUrlById(int id) {
		urlRepo.deleteById(id);
		return "URL is removed !!! " + id;
	}
	
	public UrlEntity updateUrl(UrlEntity urlEntity) {
		UrlEntity existingUrlEntity = urlRepo.findById(urlEntity.getId()).orElse(null);
		existingUrlEntity.setUrl(urlEntity.getUrl());
		existingUrlEntity.setShortUrl(urlEntity.getShortUrl());
		return urlRepo.save(existingUrlEntity);
	}
}
