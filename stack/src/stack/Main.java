package stack;

import java.util.Stack;

class Main {
  public static void main(String[] args) {
    Stack<Integer> ds = new Stack<>();

    ds.add(1);
    ds.add(3);
    ds.add(5);
    ds.add(2);
    ds.add(10);

    System.out.println(ds.peek()); // 10
    System.out.println(ds.pop()); // 10
    System.out.println(ds.peek()); // 2

    System.out.println(ds.removeFirst()); // 1
    System.out.println(ds.remove(1)); // 5
  }
}
