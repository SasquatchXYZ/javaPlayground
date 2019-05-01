package FileHandlingDemo;

import java.io.*;

public class FileHandlingDemo {

  public static void main(String[] args) {

    // Using Try-Catch-Finally and closing the reader
    /*String line;
    BufferedReader reader = null;

    try {
      reader = new BufferedReader(new FileReader("myFile.txt"));
      line = reader.readLine();
      while (line != null) {
        System.out.println(line);
        line = reader.readLine();
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }*/

    // Using Try-With-Resource
    String line;

    try (BufferedReader reader = new BufferedReader(new FileReader("myFile.txt"))) {
      line = reader.readLine();
      while (line != null) {
        System.out.println(line);
        line = reader.readLine();
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // Writing to a Text File
   /* String text = "Hello World!";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("myFile2.txt", true))) {
      writer.write(text);
      writer.newLine();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }*/

  }
}
