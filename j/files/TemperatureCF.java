class TemperatureCF {

	public static void main (String [] args) {
			
	

		String sel = "C";
		double temp = 25.1;

		if (sel.equals("F")) {
			temp = (temp-32)/1.8 ;
			System.out.printf("converting %.1fF",temp);
		}
		else {
			temp = (temp*1.8)+32 ;
			System.out.printf("converting %.1fC",temp);	
		}


	}	

}


