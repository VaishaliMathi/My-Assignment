package week1.day1;

public class Mobile {
      private void makeCall() {
    	  String model="Y51A";
  		float mobileWeight=156.78f;
		System.out.println("Make Call");
		System.out.println("Model:" +model);
	    System.out.println("Mobile Weight(in grm):" +mobileWeight);
      }
      
        public void sendMessage() {
        	boolean fullyCharged=true;
        	int mobileCost=15000;
			System.out.println("Send Message");
           System.out.println("Fully Charged:" +fullyCharged);
		   System.out.println("Mobile Cost(INR):" +mobileCost);
        }
      
	public static void main(String[] args) {
	
	Mobile obj=new Mobile();
	obj.makeCall();
	obj.sendMessage();
	System.out.println("This is my Mobile");

	}

}
