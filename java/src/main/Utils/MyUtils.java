package Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyUtils {
  public static <T> boolean eqaulsUnsortList(List<T> list1, List<T> list2) {
    List<T> temp1 = new ArrayList<>(list1);
    List<T> temp2 = new ArrayList<>(list2);

    for (T element : temp1) {
      if (temp2.contains(element)) {
        temp2.remove(element);
      } else {
        return false;
      }
    }
    return temp2.size() == 0;
  }
}
