 class convertTemperature{
 	void convert(String sel, float temp){
 		float z;
 		if(x.equals("F")){
 			z = (temp-32f)/1.8f;
 			System.out.println("input "+sel+" "+temp);
 			System.out.println("Convert "+"C "+z);
 		}
 		else if(sel.equals("C")){
 			z = (temp*1.8f)+32f;
 			System.out.println("input "+sel+" "+temp);
 			System.out.println("Convert "+"F "+z);
 		}
 		else{
 			System.out.println("Error");
 		}
 	}
 	public static void main(String[] args){
 		convertTemperature a = new convertTemperature();
 		a.convert("C", 30.0f);
 		convertTemperature b = new convertTemperature();
 		b.convert("F", 30.0f);
 	}
 } 