package myproject;

 class EmployeeDetails {
	 int id;
	 int year;
	 double salary;
	 String insuranceno;
	 EmployeeDetails(int id,int year,double salary,String insuranceno){
		 this.id=id;
		 this.year=year;
		 this.salary=salary;
		 this.insuranceno=insuranceno;
	 }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getInsuranceno() {
		return insuranceno;
	}
	public void setInsuranceno(String insuranceno) {
		this.insuranceno = insuranceno;
	}
	 
	

}
