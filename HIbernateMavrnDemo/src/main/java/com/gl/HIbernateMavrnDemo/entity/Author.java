package com.gl.HIbernateMavrnDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// author is a database managed entity
@Entity
@Table(name = "author_m2m") // optional
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "authorid")
	private int aid;
	@Column(name="authorname", length = 120, nullable = false)
	private String name;
	private String genre;
	@Column(nullable = true)
	private int year;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(String name, String genre) {
		super();
		this.name = name;
		this.genre = genre;
	}

	public Author(String name, String genre, int year) {
		super();
		this.name = name;
		this.genre = genre;
		this.year = year;
	}
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + ", genre=" + genre + ", year=" + year + "]";
	}
	
}

