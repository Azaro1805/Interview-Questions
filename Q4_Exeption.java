
public class Q4_Exeption {

	public static void foo () {
		try {
			throw new Exception() ;
			}catch(MyException me) {
			System.out.println("In my Exception");
			}catch(Exception e) {
			System.out.println("In Exception");
			}
	}//foo end 
	
	public static void main (String [] args) {
		foo();
	}
}//end class

class MyException extends Exception{
	
}
// התשובה היא :  In Exception