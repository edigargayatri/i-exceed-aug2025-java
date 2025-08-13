import java.util.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
class Assignment{
	public static void main(String[] args)throws Exception{
		System.out.println("Enter the filname ");
		Scanner sc = new Scanner(System.in);
		String fname=sc.nextLine();
		
		System.out.println("Enter the content");
	
		String c=sc.nextLine();
		
		FileOutputStream fout = new FileOutputStream(fname);
		byte b[] =c.getBytes();
		
		fout.write(b);
		fout.close();
		
		FileInputStream fin = new FileInputStream(fname);
		int i=0;
		while((i=fin.read())!= -1){
			System.out.print((char)i);
		}
		
		
	}
}