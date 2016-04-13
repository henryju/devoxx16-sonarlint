package devoxx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class CsvParser {

  public int totalAnimalWeight(Path cvsPath) {
    int result = 0;

    try {
      BufferedReader reader = new BufferedReader(new FileReader(cvsPath.toFile()));

      while (true) {
        String line = reader.readLine();
        if (line == null) {
          break;
        }

        // TODO

      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    return result;
  }

}
