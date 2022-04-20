package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="team")
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cid")
	private int id;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cprize")
	private int prize;
	
	@Column(name="cskill")
	private String skill;
	
	public Team() {
		
	}

	public Team(String cname, int prize, String skill) {
		this.cname = cname;
		this.prize = prize;
		this.skill = skill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
	
	

}
