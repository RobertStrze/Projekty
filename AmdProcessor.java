package Lesson8;

public class AmdProcessor extends Processor {
    @Override
    int getMHz(){
        return 3700;
    }
    @Override
    String getProcessor(){
        return "AMD Ryzen 7 2700X";
    }
}
