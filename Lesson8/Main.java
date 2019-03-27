package Lesson8;

public class Main {

    public static void main(String[] args) {
        ComputerFactory computer = new ComputerFactory();

        Gpu nvidiaGpu = new NvidiaGpu();
        Gpu radeonGpu = new RadeonGpu();

        CoolingSystem fanCS = new FanCS();
        CoolingSystem liquidCS = new LiquidCS();

        Processor intelProcessor = new IntelProcessor();
        Processor amdProcessor = new AmdProcessor();

        computer.installGpu(nvidiaGpu);
        computer.installProcessor(amdProcessor);
        computer.installCoolingSystem(liquidCS);
        System.out.println(computer.toString());

        computer.installGpu(radeonGpu);
        computer.installProcessor(intelProcessor);
        computer.installCoolingSystem(fanCS);
        System.out.println(computer.toString());
        System.out.println(intelProcessor.toString());
        System.out.println(amdProcessor.toString());
    }
}
