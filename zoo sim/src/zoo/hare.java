package zoo;

public class hare extends animal
{
    @Override
    public String eat(){
        return "Eating various vegetables...";
    }
    @Override
    public String move(){
        return "Hopping around...";
    }
    @Override
    public String sound(){
        return "Squeaking...";
    }
}