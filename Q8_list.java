import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q8_list {

	public static void main(String[] args) {
		List <Integer> numbers = new ArrayList <Integer> ();
		
		int num = 1;
		removeNumbers(numbers, num);
		System.out.println(numbers);
		removeNumbers2(numbers, num);
		System.out.println(numbers);
	}

	private static void removeNumbers (List <Integer> numbers, int num ) {
		for (Iterator <Integer> iter = numbers.iterator(); iter.hasNext(); ) {
			int nextNum=iter.next();
			if(nextNum>num) {
				numbers.remove(num);
			}
		}
	}
	
	private static void removeNumbers2 (List <Integer> numbers, int num ) {
		for (Iterator <Integer> iter = numbers.iterator(); iter.hasNext(); ) {
			int nextNum=iter.next();
			if(nextNum>num) {
				iter.remove();	
			}
		}
	}
	
}
//:התשובה  
//iter.remove();	or numbers.remove(num); שניהם עובדים !