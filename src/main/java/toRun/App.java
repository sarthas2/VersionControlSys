package toRun;
import java.io.*;

public class App {
    public static void main(String[] args){
        try{
          File f1 = new File(args[0]);
          File f2 = new File(args[1]);
          fileReader fr1 = new fileReader(f1);
          fileReader fr2 = new fileReader(f2);
          fileComparer fc = new fileComparer(fr1, fr2);
          fc.printState(fr1);
          fc.printState(fr2);
          System.out.println("These two files are different: " + fc.areDifferent());
        }
        catch(ArrayIndexOutOfBoundsException outOfBounds){
          System.err.println("No file specified");
        }
    }
}
