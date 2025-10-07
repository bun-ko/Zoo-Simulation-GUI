package zoo;

public class gorilla extends animal
{
    @Override
    public String eat(){
        return "Eating a banana...";
    }
    @Override
    public String move(){
        return "Moving primarily with forelimbs...";
    }
    @Override
    public String sound(){
        return "Screaming and beating chest...";
    }
}