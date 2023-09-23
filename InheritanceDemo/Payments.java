package inheritanceDemo;

public class Payments extends HomePage {
	
	// this class is child to Homepage and grandchild to base class
	// This is multilevel inheritance
	
	public void payments() {
		System.out.println("test payments page");
	}

	public static void main(String[] args) {
		
		Payments obj = new Payments();
		obj.openbrowser("Chrome");       // Base class
		login("admin", "admin@123");  // Base class
		obj.Homepagetest();  // homepage class
		obj.payments();   // current class
		obj.logut();  // base class
		

	}

}
