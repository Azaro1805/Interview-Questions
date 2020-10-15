
import java.util.List;
import java.util.ArrayList;

public class QQ19 {

	public static void main(String[] args) {
		List <String> nameList = new ArrayList <>();
		String first = "Luk";
		String second = "David";
		Object third = "Michael";
		nameList.add(first);
		nameList.add(second);
		nameList.add(third);
		System.out.println(nameList.size());

	}

}

// התשובה היא :
// אי אפשר יש אובג'קט במקום סטרינג יהיה שגיאת קומפילציה 
// צריך להוסיף CASTING 
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//The method add(String) in the type List<String> is not applicable for the arguments (Object)
//
//at QQ19.main(QQ19.java:14)
