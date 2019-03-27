package Lesson8;

class ComputerFactory {
    private Processor proc;
    private Gpu gpu;
    private CoolingSystem cs;

    void installProcessor(Processor proc) {
        this.proc = proc;
    }

    void installGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    void installCoolingSystem(CoolingSystem cs){
        this.cs = cs;
    }

    public String toString(){
        return "You have build your computer with " + proc.getProcessor() + ", " + proc.getMHz() + " MHz processor, " + cs.getCoolingSystem()+ " and " + gpu.getGpu() +" graphic card with " + gpu.getG3dMark() + " points on 3DMark";
    }
}
