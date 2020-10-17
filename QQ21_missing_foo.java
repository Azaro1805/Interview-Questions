
public class QQ21_missing_foo {

	public static int binserch (int  [] search ,int  find) {
		var start=0 ; 
		var end=0 ;
		var foo=0;
		end= search.length-1;
		while (start<end) {
			foo=Math.round(start+end)/2;
			if(search[foo] == find ) {
				return foo;
			} else if (search[foo] < find) {
				start = foo+1;
			}  else {
				end = foo-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {

	}
}
// התושבה היא :
//Math.round(start+end)/2;