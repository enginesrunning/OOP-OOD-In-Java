package uml;

public class Employee extends Person {
	  private String department;
	  private String title;

	  public Employee(String name, int age, String department, String title) {
	    super(name, age); 
	    this.department = department;
	    this.title = title;
	  }

	  public String getDepartment() {
	    return department;
	  }

	  public String getTitle() {
	    return title;
	  }

	  @Override 
	  public String introduce() {
	    return super.introduce() + " I am an employee in the " + department + " department as a " + title + ".";
	  }
	}

//to string

