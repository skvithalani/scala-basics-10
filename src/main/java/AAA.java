import example.StringExtensions;

public class AAA {
    public static void main(String a[]) {
        Tigar[] tigars = new Tigar[2];
        tigars[0] = new Tigar();
        Animal[] animals ;
        animals = tigars;
        Animal lionAsAnimal =new Lion();
        animals[0] = lionAsAnimal;
//        animals[0] = new Lion();
        System.out.println(animals[0]);
    }
    static class Animal{

    }

    static class Tigar extends Animal {

    }

    static class Lion extends Animal {

    }
}

