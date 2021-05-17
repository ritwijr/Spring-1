package com.cg.freelanceapp.dto;

/**************************************************************************************
 * @author       Ritwij Raj 
 * Description : This is the DTO class for Feedback module. 
 * Created Date: 14 May, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
public class FeedbackDTO {
	private Integer ratings;
	private String comments;
	private Long recruiterId;
	private Long freelancerId;

	public FeedbackDTO() {
		super();
	}

	public FeedbackDTO(Integer ratings, String comments, Long recruiterId, Long freelancerId) {
		super();
		this.ratings = ratings;
		this.comments = comments;
		this.recruiterId = recruiterId;
		this.freelancerId = freelancerId;
	}

	public String getComments() {
		return comments;
	}

	public Long getFreelancerId() {
		return freelancerId;
	}

	public Integer getRatings() {
		return ratings;
	}

	public Long getRecruiterId() {
		return recruiterId;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}

	public void setRatings(Integer ratings) {
		this.ratings = ratings;
	}

	public void setRecruiterId(Long recruiterId) {
		this.recruiterId = recruiterId;
	}

}
