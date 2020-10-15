
public class QQ12 {

	public void foo() {
		try {
			throw new RuntimeException();
		}finally {
			System.out.println("In finally block");
		}
	}
	
	public static void main(String[] args) {
		try {
			QQ12 t = new QQ12 ();
			t.foo();
			System.out.println("Finished running");
		}catch(Exception e ) {}
	}

}
// התשובה היא :
//In finally block