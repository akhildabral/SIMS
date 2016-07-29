package com.sims.model;

import java.util.HashSet;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Lecture")
public class Lecture {
	
	@Id
	@GeneratedValue
	@Column(name="lectureId", nullable=false)
	private int lectureId;
	
	@Column(name="lectureName")
	private String lectureName;

    @OneToMany(mappedBy = "lecture", cascade = CascadeType.ALL, targetEntity=User.class, fetch=FetchType.EAGER)
    private List<User> user;
    
	public Lecture() {
		super();
	}

	public Lecture(String lectureName) {
		super();
		this.lectureName = lectureName;
	}

	public int getLectureId() {
		return lectureId;
	}

	public void setLectureId(int lectureId) {
		this.lectureId = lectureId;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Lecture [lectureId=" + lectureId + ", lectureName="
				+ lectureName + ", user=" + user + "]";
	}
	
	@ManyToMany(cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinTable(name="Lecture_Subject", 
				joinColumns={@JoinColumn(name="lectureId")}, 
				inverseJoinColumns={@JoinColumn(name="subjectId")})
	private Set<Subject> subjects = new HashSet<Subject>();

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	
}
