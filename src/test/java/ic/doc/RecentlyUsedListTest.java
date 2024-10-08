package ic.doc;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RecentlyUsedListTest {
  @Test
  public void empty_when_initialised() {
    assertTrue(new RecentlyUsedList<Integer>().isEmpty());
  }

  @Test
  public void add_items() {
    RecentlyUsedList<Integer> list = new RecentlyUsedList<>();
    list.add(3);
    list.add(5);
    list.add(2);
    assertTrue(list.contains(3));
    assertTrue(list.contains(5));
    assertTrue(list.contains(2));
  }

  @Test
  public void retrieve_items() {
    RecentlyUsedList<Integer> list = new RecentlyUsedList<>();
    list.add(3);
    assertEquals(3, (int) list.get(0));
  }

  @Test
  public void first_is_most_recent() {
    RecentlyUsedList<Integer> list = new RecentlyUsedList<>();
    list.add(3);
    list.add(5);
    list.add(2);
    assertEquals(2, (int) list.get(0));
    assertEquals(5, (int) list.get(1));
    assertEquals(3, (int) list.get(2));
  }

  @Test
  public void duplicates_are_moved() {
    RecentlyUsedList<Integer> list = new RecentlyUsedList<>();
    list.add(3);
    list.add(5);
    list.add(2);
    list.add(5);
    int count = 0;
    for (int e : list) {
      if (e == 5) {
        count++;
      }
    }
    if (count > 1) {
      fail("Contains duplicate elements");
    }
    assertEquals(5, (int) list.get(0));
  }
}
