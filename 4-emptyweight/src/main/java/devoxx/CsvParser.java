package devoxx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CsvParser {

  private static final Logger LOG = LoggerFactory.getLogger(CsvParser.class);

  public int totalAnimalWeight(Path csvPath) {
    int result = 0;

    try (BufferedReader reader = new BufferedReader(new FileReader(csvPath.toFile()))) {

      while (true) {
        String line = reader.readLine();
        if (line == null) {
          break;
        }

        String[] cells = line.split(",");
        if (cells.length >= 3) {
          if (isNotBlank(cells[2])) {
            int weight = Integer.parseInt(cells[2]);
            result += weight;
          }
        }

      }

    } catch (IOException e) {
      LOG.error("Unable to open file {}", csvPath, e);
      return 0;
    }

    return result;
  }

  private static boolean isNotBlank(@Nullable String str) {
    return str != null && str.trim().length() > 0;
  }

}
