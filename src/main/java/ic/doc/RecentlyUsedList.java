package ic.doc;

import java.util.ArrayList;

public class RecentlyUsedList<T> extends ArrayList<T> {
  @Override
  public boolean add(T x) {
    this.remove(x);
    this.add(0, x);
    return true;
  }
}
