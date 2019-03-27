package Lesson8;

public class NvidiaGpu extends Gpu{
    @Override
    int getG3dMark(){
        return 10;
    }
    @Override
    String getGpu(){
        return "NVIDIA GeForce 1080 Ti";
    }
}
