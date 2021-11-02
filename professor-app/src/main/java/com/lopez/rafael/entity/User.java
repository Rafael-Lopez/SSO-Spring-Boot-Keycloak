//package com.lopez.rafael.entity;
//
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Table(name = "user")
//@Entity
//public class User {
//
//	@Id
//	@GeneratedValue
//	@Column(name = "id")
//	private Long id;
//
//	@Column(name = "first_name")
//	private String firstName;
//
//	@Column(name = "last_name")
//	private String lastName;
//
//	@Column(name = "email")
//	private String email;
//
//	@Column(name = "username")
//	private String username;
//
//	@Column(name = "password")
//	private String password;
//
//	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
//	private Set<Roles> roles;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public Set<Roles> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(Set<Roles> roles) {
//		this.roles = roles;
//	}
//
//}
