package HW3;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ListOperations {

  private ListOperations() {
  }

  public static int max(List<Integer> input) {
    return Collections.max(input);
  }

  public static int min(List<Integer> input) {
    return Collections.min(input);
  }

  public static int indexOf(List<Integer> input, int value) {
    int result = -1;
    for (int i = 0; i < input.size(); i++) {
      if (input.get(i) == value) {
        result = i;
        return result;
      }
    }
    return result;
  }

  public static int sum(List<Integer> input) {
    return input
            .stream()
            .reduce(Integer::sum)
            .get();
  }

  public static void replace(List<Integer> input, int oldInt, int newInt) {
    for (int i = 0; i < input.size(); i++) {
      if (input.get(i) == oldInt) {
        input.set(i, newInt);
      }
    }
  }
}
