package Dz4;

import java.util.Comparator;

public class DeadlineComparator implements Comparator<Task> {


  /**
   * сравнение задач
   * @param o1 the first object to be compared.
   * @param o2 the second object to be compared.
   * @return
   */
  @Override
  public int compare(Task o1, Task o2) {
    return o1.getDeadline().compareTo(o2.getDeadline());
  }
}
