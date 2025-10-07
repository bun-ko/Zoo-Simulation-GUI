package zoo;
public class rhino extends animal
{
    @Override
    public String eat(){
        return "Eating grass...";
    }
    @Override
    public String move(){
        return "Galloping...";
    }
    @Override
    public String sound(){
        return "Mooing...";
    }
}