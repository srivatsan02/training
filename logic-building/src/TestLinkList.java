
public class TestLinkList {

	public static void main(String[] args) {
		
		LinkedList lst = new LinkedList();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		
		lst.print();
		System.out.println("***********");
		lst.addAfter(20,25);
		lst.addAfter(10,15);

		
		lst.print();
		
		System.out.println("***********");
		lst.addBefore(20,17);
		lst.addBefore(10,5);
		
		lst.print();
		

		System.out.println("***********");
		lst.remove(17);
		lst.remove(5);
		lst.print();
		

		
		
	

		
	}

}
