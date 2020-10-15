
public class QQ16 {

	
public static void main (String [] arg) {
	System.out.println(factorial(5));
}

public static long factorial(int n) {
	if (n==1) return 1;
	return n*factorial(n-1);
}

}

//התשובה היא :
//120