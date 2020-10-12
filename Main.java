class Main {
    public static void main(String... args) {
        Animals dog = new Animals();
        dog.name = "josh";
        dog.legs = 4;
        String legs = multiplyLegs(dog.legs,2);
        String title = dog.name + legs;
        System.out.println(title);
    }
    
    public static String multiplyLegs(int legs,int multiplier){
        int product = legs * multiplier;
        String productStr = Integer.toString(product);
        return productStr;
    }
}