package model.builders;

import model.computers.Computer;

public interface Builder {
    void setCpu(String cpu);
    void setRam(int ram);
    void setGpu(String gpu);
    void setStorage(String storage);
    void setPowerSupply(String powerSupply);   
    Computer getComputer();
}
