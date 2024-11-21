package com.examportal;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Question {

	private int id;
	private String qname;
	private List<String> answer;
	
}