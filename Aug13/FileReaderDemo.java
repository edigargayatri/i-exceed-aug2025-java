import java.io.FileReader;
import java.io.File;

class FileReaderDemo{
    public static void main(String[] args)throws Exception{
		int i=0;
		
		File f = new File("sample.txt");
		//File f = new File(args[0]);
		FileReader fr = new FileReader(f);
		while((i =fr.read())!=-1){
			System.out.println((char)i);
		}
	}
}
