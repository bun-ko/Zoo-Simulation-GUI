package zoo;
public class tiger extends animal
{
    @Override
    public String eat(){
        return "Eating meat...";
    }
    @Override
    public String move(){
        return "Prowling...";
    }
    @Override
    public String sound(){
        return "ROARRRRR!!!!";
    }
}