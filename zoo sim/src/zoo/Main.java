package zoo;

public class Main {
    public static void main(String[] args){
        gator gator = new gator(new carnivoreEat(), new swimmingMove(), new growlSound());
        System.out.println(gator.performEat());
        System.out.println(gator.performMove());
        System.out.println(gator.performSound());
    }
}