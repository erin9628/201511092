import java.util.ArrayList;
import java.util.List;

class Numbers {
	ArrayList<Integer> mylist;
	Numbers() {
		mylist = new ArrayList<Integer>();
		setNumbers();
		printList();
		System.out.printf("Sum of numbers from 1 to 1000 divided by 4 and not divisible by 5: %d\n", sumList());
	}
	void setNumbers() {
		for (int i = 1; i <= 1000; i++) {
			if (i % 4 == 0) {
				if (i % 5 != 0)
					mylist.add(i);
			}
		}
	}
	void printList() {
		System.out.print("[");
		for (int i : mylist)
			System.out.print(i + ", ");
		System.out.print("]\n");
	}
	int sumList() {
		int sum = 0;
		for (int i : mylist)
			sum += i;
		return sum;
	}
	public static void main(String[] args) {
		Numbers n = new Numbers();
	}