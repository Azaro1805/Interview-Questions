
public class Q52_excption {

	public  static void foo () {
//���� ��� ��� ���� ����� 
		System.out.println("in middle");
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		foo();
		
	}

}

// :������  
// ���� ���� �� ����� ��� ���� - ���� ���� �� ��� ���� ������ ����� ! 