package devoxx;

import java.nio.file.Paths;
import org.junit.Test;

public class CsvParserTest {

  @Test
  public void testTotalWeight() {
    CsvParser parser = new CsvParser();
    parser.totalAnimalWeight(Paths.get("src/test/resources/sample.csv"));

    // TODO add assertion
  }

}
