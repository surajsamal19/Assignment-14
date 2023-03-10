public class Queue {
    public class LinkedListQueue {
        private Node front;
        private Node rear;

        private class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public int dequeue() {
            if (front == null) {
                throw new NoSuchFieldException();
            }
            int data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return data;
        }

        public int peek() {
            if (front == null) {
                throw new NoSuchFieldException();
            }
            return front.data;
        }

        public boolean isEmpty() {
            return front == null;
        }

        public static void main(String[] args) {
            LinkedListQueue queue = new LinkedListQueue();
            queue.enqueue(56);
            queue.enqueue(30);
            queue.enqueue(70);

            System.out.println("Front element: " + queue.peek());

            System.out.print("Queue: ");
            while (!queue.isEmpty()) {
                System.out.print(queue.dequeue() + " ");
            }
        }
    }

}
