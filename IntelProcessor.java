package Lesson8;

public class IntelProcessor extends Processor{
    @Override
    int getMHz() {
        return 2000;
    }
    @Override
    String getProcessor(){
        return "Intel Core i3-6006U";
    }
}
