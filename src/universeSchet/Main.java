package universeSchet;

public class Main {
    public static void main(String[] args) {
	List ml = new List();
	ml.addBack("name1");
	ml.addBack("name2");
	ml.addBack("name3");
	ml.addBack("name4");
	ml.addBack("name5");
	ml.addBack("name6");
	ml.addBack("name7");
	ml.addBack("name8");

	ml.printList();
	System.out.println();

	ml.delEl(4);

	System.out.println();
    }
}