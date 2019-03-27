package Lesson8;

public class RadeonGpu extends Gpu {
    @Override
    int getG3dMark() {
        return 6;
    }

    @Override
    String getGpu() {
        return "Radeon RX570";
    }
}
