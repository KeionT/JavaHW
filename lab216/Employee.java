package lab216;

public class Employee extends Person implements PersonInterface{
  private static String favfood;
int emp_id;
  double emp_salary;
  
  
  Employee()
  {
	  
  }     
  
  
  Employee(int id, String name,int age, char gender,double salary, boolean traveling)
  {
	 
	 super(name,age,gender,traveling, favfood);
	 emp_id=id;
	 emp_salary=salary;
  }
  


public void display()
{
	//System.out.println(ORGINIZATION);
	System.out.println("-------------");
	System.out.println("Id : "+this.emp_id);
	super.display();
	super.travel();
	System.out.println("Salary : "+this.emp_salary);
	System.out.println();
	
	
}



public double calculate(int bonus) {
	double  netsalary= bonus+ this.emp_salary;
	return netsalary;
}

public int compute(int num1, int num2)
{
	int time= num2-num1;
	return time;
}


void calculate(double n1, double n2)
{
	System.out.println(n1+n2);
}
  
}
