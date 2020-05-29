package com.hibernate.HibernateApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="alien_table")
public class Alien {
	@Id
	private int id;
	//@Transient
	private AlienName name;
	@Column(name="alien_Colour")
	private String colour;

	public Alien() {

	}

	

	public Alien(int id, AlienName name, String colour) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
	}



	public AlienName getName() {
		return name;
	}



	public void setName(AlienName name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", colour=" + colour + "]";
	}

}
