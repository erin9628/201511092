class dice {
    int number = 0;
    public void roll() {   
        number = (int) (Math.random() * 6)+1 ;
        System.out.println("turns on " + number);
    }   
}
