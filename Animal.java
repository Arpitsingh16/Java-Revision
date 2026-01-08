public class Animal {
    private String breed;
    private String name;
    private double price;



    public Animal(String breed, String name, double price){
        this.breed = breed;
        this.name = name;
        this.price = price;
    }

    void bark(){
        System.out.println(name+" is a dog his breed is " + breed + " his price is " + price);
    }

    public int age(){
        return 10;
    }

    
}
