package Lesson8;

public class AmdProcessor extends Processor {
    @Override
    int getMHz(){
        return 3700;
    }
    @Override
    String getSocket(){
        return "AM4";
    }
    @Override
    String getProcessor(){
        return "AMD Ryzen 7 2700X";
    }
    @Override
    public String toString(){
        return "Name: " + getProcessor() + " Clock Speed: " + getMHz() + " Socket: " + getSocket() ;
    }
}
