class BMI { 
	public String computeBMI(float weight, float height) { 
		String res = null;
		float bmi = (float) weight / (height * height); 
		System.out.printf("Your BMI is %.1f\n", bmi); 
		 
		if (bmi <= 18.5) {
			res = "low weight"; 
		} else if (bmi >= 18.5 && bmi < 23) {
			res = "normal weight"; 
		} else if (bmi >= 23 && bmi < 25) {
			res = "overweight"; 
		} else if (bmi >= 25 && bmi < 30) {
			res = "obesity"; 
		} else if (bmi >= 30 && bmi < 40) {
			res = "obesity2"; 
		} else if (bmi >= 40) 
			res = "obesity3"; {
 		} else {
			res = "error"; 
		}
		return res;
	} 	
	public static void main(String[] args) { 
		float weight = (float) 75.0; 
		float height = (float) 1.7; 
  	BMI a = new BMI(); 
		String comp = a.computeBMI(weight, height); 
		System.out.printf("Person's weight = %.1f kg and height = %.1f m is %s\n", 
					weight, height, comp); 
	} 
} 
