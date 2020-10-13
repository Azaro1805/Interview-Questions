
public class Q2_car {

	private String name ;
	
	public Q2_car (String name ) {
		super();
		this.name = name ;
	}
	
	public void setName (String newname) {
		name = newname;	
	}
	
	public String getName () {
		return this.name;
	}
	
	public static void main(String[] args) {
		Q2_car Mycar = new Q2_car ("Honda");
		foo(Mycar);
		System.out.println(Mycar.getName().equals("Kia"));
	}
	
	public static void foo (Q2_car car) {
		System.out.println(car.getName().equals("Honda"));
		car.setName("Kia");
	}
}
/// תשובה : true , true 