package EmployeeDetails;

public class Employee {

	int eid;
	String ename;
	String edept;
	String edesignation;
	Long esalary;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edept=" + edept + ", edesignation=" + edesignation
				+ ", esalary=" + esalary + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	public String getEdesignation() {
		return edesignation;
	}

	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}

	public Long getEsalary() {
		return esalary;
	}

	public void setEsalary(Long esalary) {
		this.esalary = esalary;
	}

}
