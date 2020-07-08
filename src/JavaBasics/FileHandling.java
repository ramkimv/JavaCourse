package JavaBasics;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling {

	public static void main(String[] args) throws Exception {
		
			File f = new File("C:\\Users\\ENTERPRISE TOUCH\\Documents\\javaInputOutput\\demo.txt");
			DataOutputStream dos= new DataOutputStream(new FileOutputStream(f));
		
			dos.writeUTF("This is a demo file");
			
			DataInputStream dis= new DataInputStream(new FileInputStream(f));
			
			String st = dis.readUTF();
			System.out.println(st);

	}

}
