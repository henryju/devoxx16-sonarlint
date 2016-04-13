package devoxx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.CheckForNull;
import javax.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CsvParser {

  private static final Logger LOG = LoggerFactory.getLogger(CsvParser.class);

  public int totalAnimalWeight(Path csvPath) {
    int result = 0;
    try (BufferedReader reader = new BufferedReader(new FileReader(csvPath.toFile()))) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (shouldSkip(line)) {
          continue;
        }
        result += parseWeight(line);
      }

    } catch (IOException e) {
      LOG.error("Unable to open file {}", csvPath, e);
      return 0;
    }
    return result;
  }

  private boolean shouldSkip(String line) {
    String trimmedLine = trimToNull(line);
    return !trimmedLine.startsWith("#");
  }

  @CheckForNull
  private static String trimToNull(String line) {
    String trimmed = line.trim();
    return trimmed.length() > 0 ? trimmed : null;
  }

  private int parseWeight(String line) {
    String[] cells = line.split(",");
    if (cells.length >= 3 && isNotBlank(cells[2])) {
      return Integer.parseInt(cells[2]);
    }
    return 0;
  }

  private static boolean isNotBlank(@Nullable String str) {
    return str != null && str.trim().length() > 0;
  }

}
