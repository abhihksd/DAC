package entites;

import java.util.Objects;

public class Emp {
	 int empno;
	 String ename;
	 float salary;
	 int deptno;
	//default constructor
	public Emp() {
		super();
	}
	//parameterized constructor
	public Emp(int empno, String ename, float salary,int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		this.deptno=deptno;
	}


	//getter and setters
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", salary=" + salary +", deptno="+deptno+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return deptno == other.deptno;
	}
	
	
	
	
	
	
}
