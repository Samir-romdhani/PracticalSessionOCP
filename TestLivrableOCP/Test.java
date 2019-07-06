import java.io.*;

/**
 * @author samirromdhani
 */
public class Test {

	public static void main(String[] args) {
		///////////////  Test 1 //////////////
		/*
		boolean newFile = false ;
		File file = new File("simpletxt.txt");
		System.out.println(file.exists());
		try {
			newFile = file.createNewFile() ;
			System.out.println(newFile);
			System.out.println(file.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		*/
		
	///////////////////////////////
		/*
		Cat cat = new Cat("cat", 2);
		try {
			FileOutputStream fs = new FileOutputStream("testSer.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(cat);
			os.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		
		try {
			FileInputStream fis = new FileInputStream("testSer.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Cat cat = (Cat) ois.readObject();
			System.out.println("cat name : "+cat.getName());
			System.out.println("cat age : "+cat.getAge()+" month");
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
