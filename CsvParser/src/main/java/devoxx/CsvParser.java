package devoxx;

public class CsvParser {

  // private static boolean isNotBlank(String str) {
  // return str != null || !str.trim().isEmpty();
  // }

  public int totalWeight(String csv) {
    if (csv == null) {
      return 0;
    }
    if (csv != null && csv.length() == 0) {
      return 0;
    }
    int result = 0;
    String[] lines = csv.split("\n");
    for (String line : lines) {
      String[] cells = line.split(",");
      result += Integer.parseInt(cells[2]);
    }
    return result;
  }
}
