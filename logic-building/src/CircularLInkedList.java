

public class CircularLInkedList {

    public class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
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
        if (first == null) {
            first = n;
            current = n;
        } else {
            n.setPrev(current);
            current.setNext(n);
            current = n;
        }
    }


public void addFarward(int pos, int data) {
	Node t = first;
	while (t != null) {
		System.out.println(t.getData());
		t = t.getNext();

		}
}

public void addBackward(int pos, int data) {
	Node t = first;
	while (t != null) {
		System.out.println(t.getData());
		t = t.getNext();
		
	}

}
}
