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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "userId", nullable=false)
	private int userId;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "email", unique = true)
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "identity")
	private int identity;
	@Column(name = "Phone")
	private long phone;
	@Column(name = "Picture")
	private String picture;
	@Column(name = "parentId")
	private String parentId;

	public User() {
		super();
	}

	public User(String firstName, String lastName, String email, String password, int identity, long phone,
			String picture, String parentId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.identity = identity;
		this.phone = phone;
		this.picture = picture;
		this.parentId = parentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@OneToMany(mappedBy = "parent")
	private Set<User> users;

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "parentId", insertable = false, updatable = false)
	private User parent;

	public User getParent() {
		return parent;
	}

	public void setParent(User parent) {
		this.parent = parent;
	}
	
	 @ManyToOne(optional = false)
	    @JoinColumn( referencedColumnName="lectureId")
	    private Lecture lecture;

	public Lecture getLecture() {
		return lecture;
	}

	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", identity=" + identity + ", phone=" + phone
				+ ", picture=" + picture + ", parentId=" + parentId
				+ ", users=" + users + ", parent=" + parent + ", lecture="
				+ lecture + "]";
	}

	@Override
		public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (!(obj instanceof User))
	            return false;
	        User other = (User) obj;
	        if (userId != other.userId)
	            return false;
	        return true;
	    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (userId ^ (userId >>> 32));
        return result;
    }
    
	@ManyToMany(cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinTable(name="student_test", 
				joinColumns={@JoinColumn(name="userId")}, 
				inverseJoinColumns={@JoinColumn(name="testId")})
	private Set<Test> studentTest = new HashSet<Test>();

	public Set<Test> getStudentTest() {
		return studentTest;
	}

	public void setStudentTest(Set<Test> studentTest) {
		this.studentTest = studentTest;
	}
	
	
}
