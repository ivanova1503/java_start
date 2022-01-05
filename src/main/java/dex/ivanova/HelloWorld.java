package dex.ivanova;

public class HelloWorld {

    public static void main (String[] args) {



        Human yu = new Human();

        yu.name = "Yuliya";
        yu.age =35;

        System.out.println(yu.name);
        System.out.println(yu.age);
        yu.sayName();



        Cat cat = new Cat();
        cat.age= 10;
        cat.name="Murzic";
        cat.sayMeow();
        System.out.println(cat.name +" " + cat.age + "let");



    }
}
