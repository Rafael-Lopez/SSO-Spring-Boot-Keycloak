//package com.lopez.rafael.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Table(name = "role")
//@Entity
//public class Roles {
//
//	@Id
//	@GeneratedValue
//	@Column(name = "id")
//	private Long id;
//
//	@Column(name = "role")
//	private String role;
//
//	@ManyToOne
//	@JoinColumn(name = "user_id")
//	private User user;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getRole() {
//		return role;
//	}
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//}
