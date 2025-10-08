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

    public void performEat(){
        eatBehavior.eat();
    }

    public void performMove(){
        moveBehavior.move();
    }

    public void performSound(){
        soundBehavior.sound();
    }

    public void setEatBehavior(eat newEB){
        eatBehavior = newEB;
    }

    public void setMoveBehavior(move newMB){
        moveBehavior = newMB;
    }

    public void setSoundBehavior(sound newSB){
        soundBehavior = newSB;
    }
}