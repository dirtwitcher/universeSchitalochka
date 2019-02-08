package universeSchet;

class List {
    private ListElement head;
    private ListElement tail;

    void addBack(String data) {
	ListElement a = new ListElement();
	a.data = data;
	if (tail == null) {
	    head = a;
	    tail = a;
	} else {
	    tail.next = a;

	    tail = a;

	}
    }

    void printList() {
	ListElement t = head;
	while (t != tail) {
	    System.out.print(t.data + " ");
	    t = t.next;
	}
	System.out.print(t.data + " ");
	// System.exit(0);
    }

    void delEl(int count) {
	// ListElement t = head;

	while (true) {

	    if (head == null)
		return;

	    if (head == tail) {
		System.out.println("win");
		printList();
		System.exit(0);
	    }

	    for (int i = 1; i < count; i++) {
		addBack(head.data);
		head = head.next;
		printList();
		System.out.println(" ");
	    }
	    head = head.next;
	    printList();
	    System.out.println(" ");

	}
    }
}