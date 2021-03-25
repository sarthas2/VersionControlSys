package toRun;

import java.io.*;

public class fileComparer{
  private fileReader comp1, comp2;
  public fileComparer(fileReader first, fileReader second){
    comp1 = first;
    comp2 = second;
  }
  public void printState(fileReader fr){
    System.out.println("We are looking at: " + fr.getWorkingFile().getName());
    fr.calcInfo();
    System.out.println("This file has " + fr.getLen() + " characters.");
    System.out.println("This file has " + fr.getNumLines() + " lines");
  }
  public boolean areDifferent(){
    boolean flag = false;
    if(comp1.getLen() != comp2.getLen()){
        System.out.format("\n%s does not have the same number of characters as %s\n", comp1.getWorkingFile().getName(), comp2.getWorkingFile().getName());
        flag = true;
    }
    if(comp1.getNumLines() != comp2.getNumLines()){
        System.out.format("\n%s does not have the same number of lines as %s\n", comp1.getWorkingFile().getName(), comp2.getWorkingFile().getName());
        flag = true;
    }
    return flag;
  }
}
