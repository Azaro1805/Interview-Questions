
public class Q52_excption {

	public  static void foo () {
//זורק תוך כדי ריצה דברים 
		System.out.println("in middle");
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		foo();
		
	}

}

// :התשובה  
// הקוד יפול על שגיאת זמן ריצה - הקוד יפעל עד אשר יגיע לזריקת שגיאה ! 