import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationTest {

	public static void main(String[] args) {
		
		
		  Studentinfo si=null ;
		  
		  try  
		  {
			  FileInputStream fis = new FileInputStream("d:/student.txt");
		        BufferedInputStream bis = new BufferedInputStream(fis);
		        ObjectInputStream ois = new ObjectInputStream(bis);
		        si = (Studentinfo)ois.readObject();
		        ois.close();
			   /*FileInputStream fis = new FileInputStream("student.ser");
			   ObjectOutputStream ois = new ObjectOutputStream(fis);
			   si = (studentinfo);
			   ois.readObject();*/
			  } 
		  catch (Exception e)
		   { e.printStackTrace(); }
		  System.out.println(si.name);
		  System.out. println(si.rid);
		  System.out.println(si.contact);
		  System.out.println(si.serializable.i);
		  System.out.println(si.serializable.str);
		  /*System.out.println("Str"+ si.testSerializable.str);
		  System.out.println("i" + si.testSerializable.i);*/
		 
		
		
	}

}
