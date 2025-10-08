package zoo;

public abstract class animal{
    protected eat eatBehavior;
    protected move moveBehavior;
    protected sound soundBehavior;

    public animal(eat eatBehavior, move moveBehavior, sound soundBehavior){
        this.eatBehavior = eatBehavior;
        this.moveBehavior = moveBehavior;
        this.soundBehavior = soundBehavior;

        

    }
    
    public String performEat(){
            eatBehavior.eat();
        }
}