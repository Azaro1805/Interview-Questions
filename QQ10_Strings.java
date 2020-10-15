
public class QQ10_Strings {

	public static void main(String[] args) {
		String name = new String ("Test");
		String secondName = new String("Test");
		String thirdName = "Test";
		String fourthName ="Test";
		
		System.out.println(name==secondName);
		System.out.println(name.equals(secondName));
		System.out.println(thirdName == fourthName);
		System.out.println(thirdName.equals(fourthName));

	}

}
// התשובה היא :
//false
//true
//true
//true
