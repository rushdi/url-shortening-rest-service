package com.moddasir.urlshorteningrestservice.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moddasir.urlshorteningrestservice.demo.entities.UrlEntity;

public interface UrlRepo extends JpaRepository<UrlEntity, Integer>{

	UrlEntity findShortUrlByUrl(String url);

}
