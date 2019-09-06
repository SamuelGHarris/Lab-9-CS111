
public class Tester {
public static void main(String args[]) {
	Unordered<Integer> listNum = new Unordered();
	listNum.add(1);
	listNum.add(2);
	listNum.add(5);
	listNum.add(0);
	listNum.displayForward();
	listNum.remove(5);
	System.out.println();
	listNum.displayForward();
	listNum.remove(1);
	System.out.println();
	listNum.displayForward();
	listNum.remove(0);
	System.out.println();
	listNum.displayForward();
	System.out.println("\n" + listNum.size());
}
}
