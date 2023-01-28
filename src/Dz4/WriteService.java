package Dz4;

import java.io.File;
import java.util.Scanner;

public class WriteService {
  public static String path = "src/Dz4/TaskList";
  static Scanner sc = new Scanner(System.in);

  /**
   * ВЫбор формата записи файла
   */
  public static void getChoice() {

    while (true) {
      System.out.println("Write to: 1-XML, 2-CSV, 3-JSON");
      switch (sc.next()) {
        case ("1") -> {
          WriteToXML();
          break;
        }
        case ("2") -> {
          WriteToCSV();
          break;
        }
        case ("3") -> {
          WriteToJSON();
          break;
        }
        default -> System.out.println("write ERROR");
      }
    }
  }

  public static void WriteToXML() {
    path += ".xml";
    WriteToXML exp = new WriteToXML(new File(path));
  }

  public static void WriteToCSV() {
    path += ".csv";
    WriteToCSV exp = new WriteToCSV(new File(path));
  }

  public static void WriteToJSON() {
    path += ".json";
    WriteToJSON exp = new WriteToJSON(new File(path));
  }

}
