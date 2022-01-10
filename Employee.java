public class Employee{
		long id;
		String firstName;
		String lastName;
		long mobileNo;
		String post;
		int salary;
		String email;
	public Employee(){
	}
	public Employee(long id,String firstName,String lastName,long mobileNo,String post,int salary,String email){
			this.id = id;
			this.firstName  = firstName;
			this.lastName = lastName;
			this.mobileNo  = mobileNo;
			this.post = post;
			this.salary = salary;
			this.email = email;
	}	
	public long getId(){
		return id;
	}
	public void setId(long id){
		this.id = id;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName  =firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void SetLastName(String lastName){
		this.lastName = lastName;
	}
	public long getMObileNo(){
		return mobileNo;
	}
	public void setMobileNo(long mobileNo){
		this.mobileNo = mobileNo;
	}
	public String getPost(){
		return post;
	}
	public void setPost( String post){
		this.post = post;
	}
	public int getSalary(){
		return salary;
	}
	public void  setSalary( int salary){
			this.salary  =salary;
	}
	public String getEmail(){
	return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String toString(){
		return id+" "+firstName+" "+lastName+" "+mobileNo+" "+post+" "+salary+" "+email;
	}

}