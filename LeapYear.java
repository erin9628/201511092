class LeapYear{
	int a;
	LeapYear(int a){
		this.a=a;
	}
	void getLeap(){
		if((a%4==0&&a%100!=0)||(a%400==0))
			System.out.println(a+" is a leap year.");
		else
			System.out.println(a+" is not leap year.");
	}
	public static void main(String[] args){
		LeapYear a=new LeapYear(2016);
		a.getLeap();
	}
}