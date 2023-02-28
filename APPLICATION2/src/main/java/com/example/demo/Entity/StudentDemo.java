package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ANIMELIST")
public class StudentDemo {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="anime")
	private String anime;
	@Column(name="status")
	private String status;
	@Column(name="no of episodes")
	private int noofepisodes;
	@Column(name="release date")
	private int releasedate;
	@Column(name="rating")
	private int rating;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getanime() {
		return anime;
	}
	public void setanime(String anime) {
		this.anime = anime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getnoofepisodes() {
		return noofepisodes;
	}
	public int getreleasedate()
	{
		return releasedate;
	}
	public void setreleasedate(int releasedate) {
		this.releasedate = releasedate;
	}

	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	public StudentDemo(int id, String anime, String status, int noofepisodes, int releasedate, int rating) {
		super();
		this.id = id;
		this.anime = anime;
		this.status = status;
		this.noofepisodes = noofepisodes;
		this.releasedate = releasedate;
		this.rating = rating;
		
	}
	public StudentDemo()
	{
		
	}
}
