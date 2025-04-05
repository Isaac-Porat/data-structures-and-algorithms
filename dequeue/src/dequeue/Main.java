package dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
  public static void main(String[] args) {
    Deque<Integer> arrayDq = new ArrayDeque<>(); // "new LinkedList<>();" variation

    arrayDq.addFirst(1);
    arrayDq.addLast(2);
    System.out.println(arrayDq.removeFirst()); // 1
    arrayDq.add(3);
    System.out.println(arrayDq.removeLast()); // 2
  }
}
