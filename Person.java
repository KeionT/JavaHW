package lab216;

import java.util.Scanner;
public class Person {
   static int  count=0;
	
   String pname;
   int page;
   char pgender;
   boolean ptraveling;
   String pfood;
  

		   
    //constructor empty
    
    public Person()
    {
    	//count++;
//    	this("Peter",34,'M',true);
    }
    
    //constructor with params
    public Person(String name, int age, char gender,boolean traveling, String favfoof )
    {
    	pname=name;
    	page=age;
    	pgender=gender;
    	count++;
    	ptraveling=traveling;
//    	pfood=favfood;
    		
    }   
    
    public void food() 
    {
    	System.out.println("My fav food is "+this.pfood);
    	
    }
    public void Hello()
    {
    	System.out.println("Hello there!!");
    }
    //
    public void travel()
    {
     if(ptraveling) {
      System.out.println("I am traveling ");
     }
     else {
    	 System.out.println("I am remote ");
     }
    }
    
    
    public void display()
    {
    	System.out.println("Name : "+this.pname);
    	System.out.println("Gender : "+this.pgender);
    	System.out.println("Age : "+this.page);
    	    	
    }
    
    
    
    
//   public void display(Person obj)
//    {
//  	System.out.println("within parameterized display...");
//  	System.out.println("Name : "+obj.pname);
//
//    }
    
   double calculate(int num)
    {
    	System.out.println("calculate inside parent class");
    	return 121.33;
    }
    
    public  static  void totalPerson()
    {
    	System.out.println("total person objects are:"+ count);
    }
    
    


}
