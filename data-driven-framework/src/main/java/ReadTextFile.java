import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTextFile {
	
	public static void main(String[] args) throws IOException {
		String filePath =  System.getProperty("user.dir")+File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "test.txt";
		System.out.println("The file path is :: "+filePath);
		File testFile = new File(filePath);
		FileInputStream fis = new FileInputStream(testFile);
		int i = 0;
		
		while((i=fis.read())!= -1) {
			System.out.print((char)i);
		}
	}

}
