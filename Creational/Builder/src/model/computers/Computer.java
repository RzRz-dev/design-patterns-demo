package model.computers;


public class Computer {
    private String cpu;
    private int ram;
    private String gpu;
    private String storage;
    private String powerSupply;
    //Constructor
    public Computer(String cpu, int ram, String gpu, String storage, String powerSupply) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.storage = storage;
        this.powerSupply = powerSupply;
    }

    //Getters and setters
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getStorage() {
        return storage;
    }
    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getPowerSupply() {
        return powerSupply;
    }
    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    
    //To string
    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", ram=" + ram + ", gpu=" + gpu + ", storage=" + storage + ", powerSupply="
                + powerSupply+"]";
    }

    
    

}
