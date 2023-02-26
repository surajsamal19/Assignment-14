import java.util.EmptyStackException;

public class StackQueue {
    public class LinkedListStack {
        private Node top;

        private class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (top == null) {
                throw new EmptyStackException();
            }
            int data = top.data;
            top = top.next;
            return data;
        }

        public int peek() {
            if (top == null) {
                throw new EmptyStackException();
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public void main(String[] args) {
            LinkedListStack stack = new LinkedListStack();
            stack.push(70);
            stack.push(30);
            stack.push(56);

            System.out.println("Top element: " + stack.peek());

            System.out.print("Stack: ");
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
        }
    }

}
