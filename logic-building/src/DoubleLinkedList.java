public class DoubleLinkedList {
    public class Node {

        private int data;
        private Node next;
        private Node prev;

        public Node getPrev() {

            return prev;

        }

 

        public void setPrev(Node prev) {

            this.prev = prev;

        }

        public Node(int data) {

            this.data = data;

        }

        public int getData() {
            return data;

        }

        public Node getNext() {
            return next;

        }
        public void setNext(Node next) {

            this.next = next;

        }

 

    }

 

    private Node first;

    private Node current;

 

    public void add(int d) {

        Node n = new Node(d);

 

        if (first == null)

            first = n;

        if (current != null)

            current.setNext(n);

        n.setPrev(current);

        current = n;

 

    }

 

    public void printforward() {

        Node t = first;

 

        while (t != null) {

            System.out.println(t.getData());

            t = t.getNext();

        }

    }

    public void printbackwards() {

        Node t = current;

 

        while (t != null) {

            System.out.println(t.getData());

            t = t.getPrev();
        }
    }

    

    

 

    

 

}