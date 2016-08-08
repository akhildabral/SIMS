package com.sims.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Test")
public class Test {
	
	@Id
	@GeneratedValue
	@Column(name="testId")
	private int testId;
	
	@Column(name="testName")
	private String testName;

	public Test() {
		super();
	}

	public Test(String testName) {
		super();
		this.testName = testName;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	@ManyToMany(mappedBy="studentTest")
	private Set<User> tests = new HashSet<User>();

	public Set<User> getTests() {
		return tests;
	}

	public void setTests(Set<User> tests) {
		this.tests = tests;
	}
	
}
