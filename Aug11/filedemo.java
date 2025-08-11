import java.io.File;

class filedemo{
    public static void main(String[] args) throws Exception {
        File f = new File("C:/Users/gayatri.edigar/Downloads/I-exceed/I-exceed-Aug-25-Java/Aug11/sample.txt");
        f.createNewFile();
        System.out.println(f.isAbsolute());
        System.out.println(f.getAbsolutePath());
        boolean e = f.exists();
        System.out.println(e);
        if (e) {
            System.out.println(" can we read the file: "+f.canRead());
            System.out.println(" can we write the file: "+f.canWrite());
        }
        f.delete();
        System.out.println(f.exists());
    }
}