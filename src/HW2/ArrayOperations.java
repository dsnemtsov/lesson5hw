package HW2;

import java.util.Arrays;

public final class ArrayOperations {

  private ArrayOperations() {
  }

  public static int max(int[] input) {
    return Arrays.stream(input).max().getAsInt();
  }

  public static int min(int[] input) {
    return Arrays.stream(input).min().getAsInt();
  }

  public static int indexOf(int[] input, int value) {
    int result = -1;
    for (int i = 0; i < input.length; i++) {
      if (input[i] == value) {
        result = i;
        return result;
      }
    }
    return result;
  }

}
