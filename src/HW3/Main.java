package HW3;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> inputAsArrayList = Arrays.asList(1, 3, 4, -100, 300, 159, 4, 2, -111);

    List<Integer> inputAsLinkedList = Arrays.asList(1, 3, 4, -100, 300, 159, 4, 2, -111);

    System.out.println("inputAsArrayList:");
    System.out.println("max: " + ListOperations.max(inputAsArrayList));
    System.out.println("min: " + ListOperations.min(inputAsArrayList));
    System.out.println("4: " + ListOperations.indexOf(inputAsArrayList, 4));
    System.out.println("-111: " + ListOperations.indexOf(inputAsArrayList, -111));
    System.out.println("0: " + ListOperations.indexOf(inputAsArrayList, 0));
    System.out.println("sum " + ListOperations.sum(inputAsArrayList));
    System.out.println("Input collection: " + inputAsArrayList);
    ListOperations.replace(inputAsArrayList, 4, 999 );
    System.out.println("Input collection after replace 4 to 999: " + inputAsArrayList);

    System.out.println("====================================");

    System.out.println("inputAsLinkedList:");
    System.out.println("max: " + ListOperations.max(inputAsLinkedList));
    System.out.println("min: " + ListOperations.min(inputAsLinkedList));
    System.out.println("4: " + ListOperations.indexOf(inputAsLinkedList, 4));
    System.out.println("-111: " + ListOperations.indexOf(inputAsLinkedList, -111));
    System.out.println("0: " + ListOperations.indexOf(inputAsLinkedList, 0));
    System.out.println("sum " + ListOperations.sum(inputAsLinkedList));
    System.out.println("Input collection: " + inputAsLinkedList);
    ListOperations.replace(inputAsLinkedList, 4, 999 );
    System.out.println("Input collection after replace 4 to 999: " + inputAsLinkedList);
  }
}
