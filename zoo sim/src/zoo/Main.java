package zoo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Im a unicorn.");
        animal unicorn = new unicorn();
        System.out.println(unicorn.eat());
        System.out.println(unicorn.move());
        System.out.println(unicorn.sound());

        System.out.println("\n Im a tiger.");
        animal tiger = new tiger();
        System.out.println(tiger.eat());
        System.out.println(tiger.move());
        System.out.println(tiger.sound());

        System.out.println("\n Im a rhino.");
        animal rhino = new rhino();
        System.out.println(rhino.eat());
        System.out.println(rhino.move());
        System.out.println(rhino.sound());

        System.out.println("\n Im a raven.");
        animal raven = new raven();
        System.out.println(raven.eat());
        System.out.println(raven.move());
        System.out.println(raven.sound());

        System.out.println("\n Im a gorilla.");
        animal gorilla = new gorilla();
        System.out.println(gorilla.eat());
        System.out.println(gorilla.move());
        System.out.println(gorilla.sound());

        System.out.println("\n Im a giraffe.");
        animal giraffe = new giraffe();
        System.out.println(giraffe.eat());
        System.out.println(giraffe.move());
        System.out.println(giraffe.sound());

        System.out.println("\n Im an alligator.");
        animal gator = new gator();
        System.out.println(gator.eat());
        System.out.println(gator.move());
        System.out.println(gator.sound());
    }
}