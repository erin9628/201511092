class MultipleThreeFive {
 	public static void main(String[] args) {
 		MultipleThreeFive m = new MultipleThreeFive();
 		m.getSum();
 	}
 	
 	public void getSum() {
 		int sum = 0;
 		
 		for (int i = 0; i < 1000; i++) {
 			if (i % 3 == 0)
				sum += i;
 			else if (i % 5 == 0)
 				sum += i;
 			else {}
 		}
 		
 		System.out.println("Sum is " + sum);
 	}