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
        return eatBehavior.eat();
    }

    public String performMove(){
        return moveBehavior.move();
    }

    public String performSound(){
        return soundBehavior.sound();
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