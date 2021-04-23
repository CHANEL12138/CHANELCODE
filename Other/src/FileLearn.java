import java.io.File;

public class FileLearn {
    static void Print(Object obj)
    {
        System.out.println(obj);
    }
    public static void main(String[] args)
    {
        File file= new File("test.txt");
        FileProperty(file);
    }

    public static void FileProperty(File file)
    {

        Print("exists?"+file.exists());
        Print("the file has "+file.length()+" bytes");
        Print("Can it be read" +file.canRead());
        Print("Can it be written "+ file.canWrite());
        Print("Is it a dictionary "+ file.isDirectory());
        Print("Is it a file> "+file.isFile());
        Print("Is it hidden "+file.isHidden());
        Print("Absolute path is " + file.getAbsolutePath());
        Print("Last modify " +file.lastModified());
    }
    public static void PrintWriter()
    {
        File file = new File("/test.txt");
        //PrintWriter output = new PrintWriter("/test.txt");


    }
}
