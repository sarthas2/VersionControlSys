package toRun;
import java.io.*;

public class fileReader{
  private File current;
  private BufferedReader working;
  private int len;
  private int numLines;
  public fileReader(File toRead){
    try{
      current = toRead;
      working = new BufferedReader(new FileReader(toRead));
      len = 0;
      numLines = 0;
    }
    catch(Exception e){
      // do nothing at the moment
    }
  }
  public File getWorkingFile(){
    return current;
  }
  public void calcInfo(){
    try{
      String reading;
      if(current.exists() && current.length() > 0){
        while((reading = working.readLine()) != null){
          numLines++;
          for (char c : reading.toCharArray()) {
            len++;
          }
        }
      }
      else if(!current.exists()) System.out.println("File does not exist");
      else System.out.println("File is Empty");
    }
    catch(Exception e){
      // do nothing at the moment
    }
  }
  public int getLen(){
    return len;
  }
  public int getNumLines(){
    return numLines;
  }
  public boolean isEmpty(){
    return (current.length() == 0)? true: false;
  }
}
