package ic.doc;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList<T> {
  protected List<T> ls;

  RecentlyUsedList() {
    this.ls = new ArrayList<>(0);
  }

  public void add(T x) {
    ls.remove(x);
    ls.add(0, x);
  }

  public T at(int x) {
    return ls.get(x);
  }
}
