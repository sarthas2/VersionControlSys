import java.io.*;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){
        try{
          File fi = new File(args[0]);
          System.out.println(fi.getName());
        }
        catch(ArrayIndexOutOfBoundsException outOfBounds){
          System.err.println("No file specified");
        }
    }
}
