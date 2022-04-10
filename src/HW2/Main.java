package HW2;

public class Main {
  public static void main(String[] args) {

    int[] input = new int[]{1, 3, 4, -100, 300, 159, 4, 2, -111};

    System.out.println("max: " + ArrayOperations.max(input));
    System.out.println("min: " + ArrayOperations.min(input));
    System.out.println("4: " + ArrayOperations.indexOf(input, 4));
    System.out.println("-111: " + ArrayOperations.indexOf(input, -111));
    System.out.println("0: " + ArrayOperations.indexOf(input, 0));
  }
}
