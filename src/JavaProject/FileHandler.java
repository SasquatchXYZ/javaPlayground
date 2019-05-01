package JavaProject;

import java.util.LinkedList;
import java.io.*;

public class FileHandler {

  public LinkedList<Member> readFile() {

    LinkedList<Member> m = new LinkedList<>();
    String lineRead;
    String[] splitLine;
    Member mem;

    try (BufferedReader reader = new BufferedReader(new FileReader("members.csv"))) {
      // Code inside Try Block
      lineRead = reader.readLine();
      while (lineRead != null) {
        splitLine = lineRead.split(", ");
        if (splitLine[0].equals("S")) {
          // Instantiate a SingleClubMember
        } else {
          // Instantiate a MultiClubMember
        }
      }
    } catch {
      // Code inside Catch Block
    }

  }

}
