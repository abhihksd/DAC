package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class Emp {
	@Id
	int empno;
	@Column
	String ename;
	@Column
	Float sal;
	@Column
	int deptno;
	
	public Emp()
	{}

	public Emp(int empno, String ename, Float sal, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Float getSal() {
		return sal;
	}

	public void setSal(Float sal) {
		this.sal = sal;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	


}
