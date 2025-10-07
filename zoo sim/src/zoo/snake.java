package zoo;

public class snake extends animal{
    @Override
    public String eat(){
        return "Eating mice...";
    }
    @Override
    public String move(){
        return "Slithering...";
    }
    @Override
    public String sound(){
        return "Hissing and rattling...";
    }
}
