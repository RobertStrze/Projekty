package Lesson8;

public class IntelProcessor extends Processor{
    @Override
    int getMHz() {
        return 2000;
    }

    @Override
    String getSocket() {
        return "1151";
    }

    @Override
    String getProcessor(){
        return "Intel Core i3-6006U";
    }
    @Override
    public String toString(){
        return "Name: " + getProcessor() + " Clock Speed: " + getMHz() + " Socket: " + getSocket() ;
    }
}
