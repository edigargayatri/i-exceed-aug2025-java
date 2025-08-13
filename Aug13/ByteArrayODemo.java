 import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
 
class ByteArrayDemo

{

   public static void main(String asd[])throws Exception

	{

	   ByteArrayOutputStream bos=new ByteArrayOutputStream();
 
	   bos.writeBytes("this is the sample string to be embed into multiple source".getBytes());
 
	   FileOutputStream f1=new FileOutputStream(new File("b1.txt"));

	   FileOutputStream f2=new FileOutputStream(new File("b2.txt"));

	   bos.writeTo(f1);

	   bos.writeTo(f2);


	}

}
 