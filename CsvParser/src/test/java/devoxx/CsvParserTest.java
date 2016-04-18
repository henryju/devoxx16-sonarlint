package devoxx;

import org.junit.Assert;
import org.junit.Test;

public class CsvParserTest {
  @Test
  public void test_total_weight() throws Exception {
    CsvParser csvParser = new CsvParser();
    int weight = csvParser.totalWeight(
      "medor,dog,8\n" +
      "kitty,kat,2\n" +
      "garfield,kat,20\n");
    Assert.assertEquals(30, weight);
  }
}
