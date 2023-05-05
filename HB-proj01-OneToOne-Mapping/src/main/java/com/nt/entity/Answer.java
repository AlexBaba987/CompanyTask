package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ANSWER")
public class Answer {

	@Id
	private Integer answerId;
	private String answer;
	
	@OneToOne
	@JoinColumn(name="q_id")
	private Question question;
}
