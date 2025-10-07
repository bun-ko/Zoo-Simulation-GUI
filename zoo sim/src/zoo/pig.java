package zoo;

public class pig extends animal{
    @Override
    public String eat(){
        return "Eating slop...";
    }
    @Override
    public String move(){
        return "Waddling on all fours...";
    }
    @Override
    public String sound(){
        return "Oinking...";
    }
}
