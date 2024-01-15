import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;



public class Test {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
//		FileOutputStream fos = new FileOutputStream("c://abc.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		Student s = new Student(1, "Ruchi", 1000.89f);
//		
//		oos.writeObject(s);
//		System.out.println("Success");
//		
//		oos.close();
//		fos.close();
		
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("c://abc.txt"));
		Student s = (Student)ois.readObject();
		System.out.println(s);
	}
}
