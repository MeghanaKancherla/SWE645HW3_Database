package com.example.hw3.model;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@Override
	public int hashCode() {
		return Objects.hash(city, comments, dateOfSurvey, email, firstName, id, interest, lastName, likeCampus,
				phoneNumber, raffle, recommend, state, streetAddress, zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city) && Objects.equals(comments, other.comments)
				&& Objects.equals(dateOfSurvey, other.dateOfSurvey) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(interest, other.interest) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(likeCampus, other.likeCampus) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(raffle, other.raffle) && Objects.equals(recommend, other.recommend)
				&& Objects.equals(state, other.state) && Objects.equals(streetAddress, other.streetAddress)
				&& Objects.equals(zip, other.zip);
	}

	@Column(name="last_name", nullable=false)
	private String lastName;
	
	@Column(name="street_Address", nullable=false)
	private String streetAddress;
	
	@Column(name="city", nullable=false)
	private String city;
	
	@Column(name="state", nullable=false)
	private String state;
	
	@Column(name="zip", nullable=false)
	private String zip;
	
	@Column(name="phone_number", nullable=false)
	private String phoneNumber;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="date_of_survey", nullable=false)
	private String dateOfSurvey;
	
	@Column(name="like_campus", nullable=false)
	private String likeCampus;
	
	@Column(name="interest", nullable=false)
	private String interest;
	
	@Column(name="recommend", nullable=false)
	private String recommend;
	
	@Column(name="raffle", nullable=false)
	private String raffle;
	
	@Column(name="comments")
	private String comments;
	
	
	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfSurvey() {
		return dateOfSurvey;
	}

	public void setDateOfSurvey(String dateOfSurvey) {
		this.dateOfSurvey = dateOfSurvey;
	}

	public String getLikeCampus() {
		return likeCampus;
	}

	public void setLikeCampus(String likeCampus) {
		this.likeCampus = likeCampus;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getRaffle() {
		return raffle;
	}

	public void setRaffle(String raffle) {
		this.raffle = raffle;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
