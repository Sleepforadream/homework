package com.homeworks.homework22;

public class Sofia extends Door {
    private final SofiaFacing sofiaFacing;
    private final SofiaModel sofiaModel;
    private final SofiaSize sofiaSize;

    @Override
    public void open() {
        System.out.println("Sofia Door " + sofiaFacing + sofiaModel + " " + "opened");
    }

    @Override
    public void close() {
        System.out.println("Sofia Door " + sofiaFacing + sofiaModel + " " + "closed");
    }

    public Sofia(SofiaFacing sofiaFacing, SofiaModel sofiaModel, SofiaSize sofiaSize) {
        this.sofiaFacing = sofiaFacing;
        this.sofiaModel = sofiaModel;
        this.sofiaSize = sofiaSize;
    }

    public SofiaFacing getSofiaFacing() {
        return sofiaFacing;
    }

    @Override
    public String toString() {
        return "Sofia" +
                sofiaFacing +
                sofiaModel +
                " " + sofiaSize;
    }

    public SofiaModel getSofiaModel() {
        return sofiaModel;
    }

    public SofiaSize getSofiaSize() {
        return sofiaSize;
    }
}
