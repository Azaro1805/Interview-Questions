
public class QQ21 {

	static class MyExc extends Exception{}
	static class OtherExc extends Exception{}

	public void rethrowException(String exceptionName) throws RuntimeException {
		try {
			if(exceptionName.equals("MyExc")) {
				throw new MyExc();
			}else {
				throw new OtherExc();
			}
		}
	}catch (Exception e) {
		throw e;
	}


	
	public static void main(String[] args) {

	}

}
// התשובה היא :

