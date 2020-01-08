package TestCoverage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import TestCoverage.SimpleClass.InnerStaticClass;
import org.junit.jupiter.api.Test;

class SimpleClassTest {

  @Test
  void shouldConstructorReturnNonNull() {
    assertNotNull(new SimpleClass());
  }

  @Test
  void shouldCoverEverythingAfterExclusingLombok() {
    InnerStaticClass innerStaticClass = new InnerStaticClass("Id",true);

    assertTrue(innerStaticClass.isSuspended(), "This tests something generated!");
    assertEquals("Id", innerStaticClass.getId(), "This tests something generated!");
    assertEquals(1, innerStaticClass.someThingThatActuallyNeedsTesting(),
        "This should cover all code");
  }
}