package toRun;
import java.io.*;

public class App {
    public static void main(String[] args){
        try{
          File fi = new File(args[0]);
          fileReader fr = new fileReader(fi);
          System.out.println("We are looking at: " + fr.getWorkingFile().getName());
          fr.calcInfo();
          System.out.println("This file has " + fr.getLen() + " characters.");
          System.out.println("This file has " + fr.getNumLines() + " lines");
        }
        catch(ArrayIndexOutOfBoundsException outOfBounds){
          System.err.println("No file specified");
        }
    }
}
