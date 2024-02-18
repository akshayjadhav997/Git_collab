package Testing;

class Parent {
    void show()
    {
        System.out.println("Parent");
    }
}
 
// Parent inherit in Child class
class Child extends Parent {
 
   
    void show2()
    {
    	super.show();
        System.out.println("Child");
    }
    
}
 

public class inheritance {
	 public static void main(String[] args)
	    {
	        Parent p = new Child();
	        // calling Parent's show()
	        p.show();
	 
	        Child c = new Child();
	        // calling Child's show()
	        c.show2();
	    }

	}


