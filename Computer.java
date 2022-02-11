package GetterSetter;

public class Computer {

static int count = 0 ;
private String pname;
private int pyear;
private double pcost;

public Computer()
{
	count ++;
}

public String getName() {
	return pname;
}
public void setName(String name) {
	this.pname = name;
}
public int getYear() {
	return pyear;
}
public void setYear(int year) {
	this.pyear = year;
}
public double getCost() {
	return pcost;
}
public void setCost(double cost) {
	this.pcost = cost;
} 

public static void totalComputer()
{
	System.out.println("total computers objects are:"+ count);
}

}
