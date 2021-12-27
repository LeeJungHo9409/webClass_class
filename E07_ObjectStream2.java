import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class E07_ObjectStream2 {
	public static void main(String[] args) {
		
		File f = new File("practice/object.txt");
		
		try (ObjectInputStream in = new ObjectInputStream(
				new FileInputStream(f));){
			Apple_2 a = (Apple_2)(in.readObject());
			System.out.println(a.size);
			System.out.println(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
