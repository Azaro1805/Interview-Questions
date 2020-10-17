import java.io.InputStream;
import java.io.OutputStream;

public static void copyfiles(File src , File dst) throw IOException{
	try(InputStream input = new FileInputStream(src);
			OutputStream output =  new FileOutputStream(dst)){
		byte[] buffer = new byte[1024];
		int bytesRead=0;
		while((bytesRead=input.read(buffer))>0) {
			output.write(buffer , 0 , bytesRead);
		}
	}
}

public class QQ23_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	
	
}
