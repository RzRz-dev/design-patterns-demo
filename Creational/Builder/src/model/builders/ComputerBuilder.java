package model.builders;

import model.computers.Computer;

public class ComputerBuilder implements Builder{
    private String cpu;
    private int ram;
    private String gpu;
    private String storage;
    private String powerSupply;

    @Override
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    @Override
    public void setRam(int ram) {
        this.ram = ram;
    }
    @Override
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    @Override
    public void setStorage(String storage) {
        this.storage = storage;
    }
    @Override
    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }
    @Override
    public Computer getComputer(){
        return new Computer(cpu, ram, gpu, storage, powerSupply);
    }
}
