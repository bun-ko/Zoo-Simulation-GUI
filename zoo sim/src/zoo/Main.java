package zoo;

public class Main {
    public static void main(String[] args){
        gator gator = new gator();
        gator.setEatBehavior(eat.carnivoreEat);
    }
}