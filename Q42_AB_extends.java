
public class Q42_AB_extends {

	public void printstuff() {
		System.out.println("printstuff in A");
	}
	
	
	public static void main(String[] args) {
		Q42_AB_extends a =  new B ();
		a.printstuff();
	}
}

class B extends Q42_AB_extends {
	
	public void printstuff() {
		super.printstuff();
		System.out.println("printstuff in B");
	}
	
}
//התשובה היא : 
//printstuff in A 
//printstuff in B
