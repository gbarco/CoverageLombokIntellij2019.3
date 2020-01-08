package TestCoverage;

import lombok.Builder;
import lombok.Data;

public class SimpleClass {

  @Data
  @Builder
  public static class InnerStaticClass {

    private String id;
    private boolean suspended;

    public int someThingThatActuallyNeedsTesting() {
      return 1;
    }
  }
}