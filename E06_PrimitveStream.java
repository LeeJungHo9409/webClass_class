import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E06_PrimitveStream {
	/*
	 	# DataOutputStream, DataInputStream
	 	
	 	  - �⺻�� Ÿ���� �ս��� ��Ʈ������ �����ϱ� ���� Ŭ����
	 	  - Java�� �⺻�� Ÿ���̱� ������ Java �̿��� ���α׷��� ������ �ش� ������ Ȱ���� �� ����.
	 	  - �����͸� �ݵ�� �־��� ������� ������ �Ѵ�.
	 */
	
	public static void main(String[] args) {
		File f = new File("practice/prime.txt");
		
		/*
		try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(f));) { 
			out.write(1024);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(f)) ){
			for(byte b : in.readAllBytes()) {
				System.out.println(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream(f))){
			out.writeDouble(123.123);
			out.writeChars("bye!");
			out.writeInt(6666);
			out.writeShort(12);
			out.writeUTF("�ȳ��ϼ���");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(DataInputStream in = new DataInputStream(new FileInputStream(f))){
			System.out.println(in.readDouble());
			System.out.println(in.readChar());
			System.out.println(in.readChar());
			System.out.println(in.readChar());
			System.out.println(in.readChar());
			System.out.println(in.readInt());
			System.out.println(in.readShort());
			System.out.println(in.readUTF());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
