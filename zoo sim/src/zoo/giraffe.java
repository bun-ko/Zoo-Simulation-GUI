package zoo;

public class giraffe extends animal
{
    public String eat(){
        return "Eating leaves from tall trees...";
    }
    @Override
    public String move(){
        return "Walking on all fours...";
    }
    @Override
    public String sound(){
        return "Humming, snorting, grunting...";
    }
}
