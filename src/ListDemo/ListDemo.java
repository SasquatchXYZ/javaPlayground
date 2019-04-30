package ListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

  public static void main(String[] args) {

    // Array List
//    List<Integer> userAgeList = new ArrayList<>();
    // Linked List (runs the same as the ArrayList
//    List<Integer> userAgeList = new LinkedList<>();
    // Declared as LinkedList in order to use additional Queue and Deque methods
    LinkedList<Integer> userAgeList = new LinkedList<>();

    userAgeList.add(40);
    userAgeList.add(53);
    userAgeList.add(45);
    userAgeList.add(53);
    userAgeList.add(2, 51);

    System.out.println(userAgeList.size());
    userAgeList.remove(3);
    System.out.println(userAgeList.contains(12));
    System.out.println(userAgeList.indexOf(12));
    System.out.println(userAgeList.get(2));

    Integer[] userAgeArray = userAgeList.toArray(new Integer[0]);
    System.out.println(userAgeArray[0]);
    System.out.println(userAgeList);

    // The following only work when declared specifically as a LinkedList
    // 'Poll' returns first element and removes it from the List
    System.out.println(userAgeList.poll());
    System.out.println(userAgeList);

    // 'Peek' returns first element but does not remove it
    System.out.println(userAgeList.peek());
    System.out.println(userAgeList);

    // 'getFirst' and 'getLast'
    System.out.println(userAgeList.getFirst());
    System.out.println(userAgeList.getLast());
    System.out.println(userAgeList);
  }
}
