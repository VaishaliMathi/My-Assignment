package week1.day1;

public class Student {
	
 public void studentName() {
	// TODO Auto-generated method stub

}
 public void rollNumber() {
	// TODO Auto-generated method stub

}
public void collegeName() {
	// TODO Auto-generated method stub

}
public void markScored() {
	// TODO Auto-generated method stub

}
public void cgpaObtained() {
	// TODO Auto-generated method stub
System.out.println("This is Student Report");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentName="Prema";
		int rollNumber=45896;
		String collegeName="TestLeaf";
		float markScored=189.6f;
		int cgpaObtained=90;
		System.out.println("Student Name:" + studentName);
		System.out.println("Roll Number:"  +rollNumber);
		System.out.println("College Name:" +collegeName);
		System.out.println("Mark Scored:" +markScored);
		System.out.println("cgpa:"+cgpaObtained);
		
		Student obj=new Student();
		obj.studentName();
	    obj.rollNumber();
	    obj.collegeName();
	    obj.markScored();
	    obj.cgpaObtained();
	
	
	
	}

}
