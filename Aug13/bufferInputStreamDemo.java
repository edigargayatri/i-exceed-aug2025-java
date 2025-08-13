import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

class bufferInputStreamDemo{
	public static void main(String[] args) throws Exception{
	FileOutputStream fout=new FileOutputStream("sample.txt");
    String str="this is the content which is going to embed into sample";
	byte bystr[]=str.getBytes();
	   fout.write(bystr);
	   fout.close();
	
	FileInputStream fin=new FileInputStream("sample.txt");
	BufferedInputStream bin=new BufferedInputStream(fin);
	  int i=0;
	   //fin.skip(10);
	   while((i=bin.read())!=-1){
		System.out.print((char)i);
	   }
     bin.close();
     fin.close();

	
	}
	
}