
class Test  extends Q5_abstract {
	
	
}

public class Q5_abstract {

	private String name;
	
	public String getTestName () {
		return name;
	}
	
	public void setTestName(String tname) {
		name=tname;		
	}
	
	public static void main (String [] arg) {
		Q5_abstract test = new Test();
		test.setTestName("New Test");
		System.out.println(test.getTestName());
	}
}

//התשובה היא : A: public abstract class costumTest 
// A: public abstract class costumTest 
// C: public class costumTest 
// A&C !
