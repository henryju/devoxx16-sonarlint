package devoxx;

import java.nio.file.Paths;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CsvParserTest {

  @Test
  public void testTotalWeight() {
    CsvParser parser = new CsvParser();
    assertThat(parser.totalAnimalWeight(Paths.get("src/test/resources/sample.csv"))).isEqualTo(8 + 2 + 20);
  }

}
