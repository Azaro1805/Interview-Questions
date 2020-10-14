
import java.util.LinkedList;
import java.util.Stack;

public class Q7_Exception {
	
	public static void main(String[] args) {
		LinkedList<Box> listBoxes = new LinkedList <>();
		Stack <Box> anotherBoxList = new Stack <>();
		
		Box a = new Box(5.1f,"india");
		Box b = new Box(3.7f, "Japan");
		Box c = new Box(8.2f, "Thailand");
		
		listBoxes.add(a);
		listBoxes.add(b);
		listBoxes.add(c);
		
		anotherBoxList.push(a);
		anotherBoxList.push(b);
		anotherBoxList.push(c);
		
		System.out.println(listBoxes.poll().equals(anotherBoxList.pop()));
	}

}

class Box {
	private float weight;
	private String address;
	
	public Box (float weight, String address ) {
		super();
		this.weight=weight;
		this.address=address;
	}
	
	public float getWeight () {
		return weight;
	}
	
	public void setWeight ( float weight) {
		this.weight = weight;
	}
	
	public String getAddress () {
		return address;
	}
	
	public void setAddress (String address ) {
		this.address= address;
	}
}

//:התשובה  
//false
