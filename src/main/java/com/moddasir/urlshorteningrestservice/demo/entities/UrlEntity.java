package com.moddasir.urlshorteningrestservice.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "URL_TBL")
public class UrlEntity {
	public UrlEntity(int id, @Size(min = 6, max = 255) String url, @Size(min = 6, max = 255) String shortUrl) {
		super();
		this.id = id;
		this.url = url;
		this.shortUrl = shortUrl;
	}

	@Id
	@GeneratedValue
	private int id;
	@Column(unique = true, nullable = false)
	@Size(min = 6, max = 255)
	private String url;
	@Column(unique = true, nullable = false)
	@Size(min = 6, max = 255)
	private String shortUrl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getShortUrl() {
		return shortUrl;
	}

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}

}
