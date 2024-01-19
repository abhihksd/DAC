package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="contacts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Contact {
	@Id
	int cid;
	@Column
	String uid;
	@Column
	String password;
	@Column
	String fname;
	@Column
	String lname;
	@Column
	String email;
	@Column
	String contactno;

//	public Contact() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

//	public Contact(int cid, String uid, String password, String fname, String lname, String email, String contactno) {
//		super();
//		this.cid = cid;
//		this.uid = uid;
//		this.password = password;
//		this.fname = fname;
//		this.lname = lname;
//		this.email = email;
//		this.contactno = contactno;
//	}
//
//	public int getCid() {
//		return cid;
//	}
//
//	public void setCid(int cid) {
//		this.cid = cid;
//	}
//
//	public String getUid() {
//		return uid;
//	}
//
//	public void setUid(String uid) {
//		this.uid = uid;
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
//	public String getFname() {
//		return fname;
//	}
//
//	public void setFname(String fname) {
//		this.fname = fname;
//	}
//
//	public String getLname() {
//		return lname;
//	}
//
//	public void setLname(String lname) {
//		this.lname = lname;
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
//	public String getContactno() {
//		return contactno;
//	}
//
//	public void setContactno(String contactno) {
//		this.contactno = contactno;
//	}

}
