package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="QUESTIONO")
public class Question {
	
	@Id
	private Integer questionId;
	private String question;
	
	@OneToOne
	@JoinColumn(name="a_id")
	private Answer answer;

}
