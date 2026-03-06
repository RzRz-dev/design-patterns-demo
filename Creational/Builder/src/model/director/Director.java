package model.director;

import model.builders.Builder;
import model.computers.Computer;

public class Director {

    private final Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Computer constructGamingComputer(String cpu, int ram, String gpu, String storage, String powerSupply){
        builder.setCpu(cpu);
        builder.setRam(ram);
        builder.setGpu(gpu);
        builder.setStorage(storage);
        builder.setPowerSupply(powerSupply);
        return builder.getComputer();
    }

    public Computer constructOfficeCOmputer(String cpu, int ram, String storage){
        builder.setCpu(cpu);
        builder.setGpu(null);
        builder.setRam(ram);
        builder.setStorage(storage);
        builder.setPowerSupply(null);
        return builder.getComputer();
    }
}
