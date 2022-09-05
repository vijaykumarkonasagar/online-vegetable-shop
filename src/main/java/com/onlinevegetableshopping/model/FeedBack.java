package com.onlinevegetableshopping.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Feedback is the Entity representing feedback table in database
 *
 */

@Entity
@Table(name="feedback")
public class FeedBack {
	
	@Id
	@Column(name = "feedback_id")
	private int feedbackId;
	private String description;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(targetEntity = User.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "user_Id")
	private User users;

	
	
	/**
	 * feedback default constructor
	 */
	public FeedBack() {
		super();
	}

	

	/**
	 * feedback constructor with fields as parameters
	 * 
	 * @param feedbackId   the feedback Id
	 * @param description  the description given for feedback
	 * @param feedbackDate the date on which feedback was given
	 */
	public FeedBack(int feedbackId, String description, User users) {
		super();
		this.feedbackId = feedbackId;
		this.description = description;
		this.users = users;
	}

	/**
	 * gets the Feedback Id
	 * 
	 * @return
	 */

	public int getFeedbackId() {
		return feedbackId;
	}

	/**
	 * setters for the feedBack Id
	 * 
	 * @param feedbackId
	 */

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}


	/**
	 * gets the feedback description
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * setters for the feedback description
	 * 
	 * @param description
	 */

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public User getUsers() {
		return users;
	}

	/**
	 * setters for the users
	 * 
	 * @param users
	 */

	public void setUsers(User users) {
		this.users = users;
	}




	@Override
	public String toString() {
		return "FeedBack [feedbackId=" + feedbackId + ", description=" + description + " , users= " +users + "]";
	}



	



	
	
	
	
	

}
