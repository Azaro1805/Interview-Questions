
public class polindrom {

	public static void main(String[] args) {
		int a = 123321; 
		String a2= "aavvaa";
		System.out.println(ispolindrom(a));
		System.out.println(ispolindromS(a2));
	}

    static boolean ispolindrom(int x){
        String a = String.valueOf(x);
        for (int i=0, j=a.length()-1; i<=j; i++,j--){
            if (a.charAt(i)!=a.charAt(j)){
                return false;
            }
        }
        return true;
    }
    
    static boolean ispolindromS(String x){
        for (int i=0, j=x.length()-1; i<=j; i++,j--){
            if (x.charAt(i)!=x.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
