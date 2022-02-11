package GetterSetter;

public class StarterC {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		
		
//		//Assigning or setting the properties
//      p1.setPname("John");
//		p1.setPage(33);
//		p1.setPgender('M');
//		p1.setPname("Abel");
		
		
		
		c1.setName("Mac");
		c1.setYear(1999);
		c1.setCost(1000);
		
		c2.setName("HP");
		c2.setYear(1977);
		c2.setCost(500.00);
		
		System.out.println(c1.getName()+ " "+c1.getYear()+" "+c1.getCost());
		System.out.println(c2.getName()+" "+c2.getYear()+" "+c2.getCost());
		Computer.totalComputer();
	}

}
