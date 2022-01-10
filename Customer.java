import java.lang.Locale;
public class Customer{
		private String firstName;
		private String lastName;
		private String email;
		private String mobile;
		private boolean newsletter = true;
		private String customerlocal;
		private String type;
	public Customer(){
	}
		public String getFirstName(){
			return firstName;
		}
		public void  setFirstName(String firstName){
			this.firstName = firstName;
		}
		public String getLastName(){
		
			return lastName;
		}
		public void setLastName(String lastName){
			this.lastName = lastName;
		}
		public String getEmail(){
			return email;
		}
		public void setEmail(String email){
			this.email = email;
		}
		public String getMobile(){
			return mobile;
		}
		public void setMobile(String mobile){
			this.mobile = mobile;
		}
		public Locale getCustomerLocale(){
			return customerlocal;
		}
		public void setCusomerLocale(Locale customerlocal){
			this.customerlocal = customerlocal;
		}
		public String getType(){
			return type;
		}
		public void setType(String type){
			this.type = type;
		}

}