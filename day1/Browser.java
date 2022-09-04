package week1.day1;

public class Browser {
  public void getName() {
	System.out.println("Get Name");
}

  public void printName() {	
System.out.println("Print Name");
}
	public static void main(String[] args) {
		Browser obj=new Browser();
		obj.getName();
		obj.printName();
		System.out.println("This is my Browser");

	}

}
