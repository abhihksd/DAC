package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	String contactno;
	@Column 
	String email;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact( String uid, String password, String fname, String lname, String contactno,String email) {
		super();
		
		this.uid = uid;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.contactno = contactno;
		this.email=email;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
