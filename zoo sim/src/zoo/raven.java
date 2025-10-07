package zoo;

public class raven extends animal
{
    @Override
    public String eat(){
        return "Eating vegetables, fruits, and bugs...";
    }
    @Override
    public String move(){
        return "Flying...";
    }
    @Override
    public String sound(){
        return "Cawing...";
    }
}