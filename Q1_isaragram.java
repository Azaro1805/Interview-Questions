import java.util.Arrays;

public class Q1_isaragram {

	static boolean isAnagram(String str1, String str2){
        int value=0;
        int[] str_1=new int[256];
        int[] str_2=new int[256];

        for (int i = 0; i < str1.length(); i++) {
            value=str1.charAt(i);
            str_1[value]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            value=str2.charAt(i);
            str_2[value]++;
        }
        if (Arrays.equals(str_1,str_2)){
            return true;
        }
        return false;
    }

	
	public static void main(String[] args) {
String s1="dog";
String s2 ="oga";
		boolean ans = isAnagram(s1,s2);
		System.out.println(ans);
	}
}
