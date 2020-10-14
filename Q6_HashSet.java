import java.util.HashSet;

public class Q6_HashSet {

	public static void main(String[] args) {
		Book Book1 = new Book(10023);
		Book Book2 = new Book(10053);
		Book Book3 = new Book(10088);
		Book Book4 = new Book(10099);
		Book Book5 = new Book(12000);
		HashSet <Book> Bookset= new HashSet <> ();
		Bookset.add(Book1);
		Bookset.add(Book2);
		Bookset.add(Book3);
		Bookset.add(Book4);
		Bookset.add(Book5);
		
		System.out.println(Bookset.size());
		System.out.println(Bookset.contains(new Book (12000)));
		System.out.println(Bookset.remove(new Book (10099)));
		System.out.println(Bookset.size());
	}
}

class Book {
	
	public int number  ;
	
	public Book ( int num){
		number = num;
	}
}
//:התשובה  
// 5
// false
// false
// 5
// בסדר הזה !
