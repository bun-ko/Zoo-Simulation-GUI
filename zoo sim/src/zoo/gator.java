package zoo;

public class gator extends animal
{
    @Override
    public String eat(){
        return "Eating alligator food...";
    }
    @Override
    public String move(){
        return "Walking on all fours...";
    }
    @Override
    public String sound(){
        return "Hissing...";
    }
}
