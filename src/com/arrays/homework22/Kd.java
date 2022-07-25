package com.arrays.homework22;

public class Kd extends Door {
    private final KdFacing kdFacing;
    private final KdModel kdModel;
    private final KdSize kdSize;

    @Override
    public void open() {
        System.out.println("Kd Door " + kdFacing + kdModel + " " + "opened");
    }

    @Override
    public void close() {
        System.out.println("Kd Door " + kdFacing + kdModel + " " + "closed");
    }

    public Kd(KdFacing kdFacing, KdModel kdModel, KdSize kdSize) {
        this.kdFacing = kdFacing;
        this.kdModel = kdModel;
        this.kdSize = kdSize;
    }

    public KdFacing getKdFacing() {
        return kdFacing;
    }

    @Override
    public String toString() {
        return "Kd" +
                kdFacing +
                kdModel +
                " " + kdSize;
    }

    public KdModel getKdModel() {
        return kdModel;
    }

    public KdSize getKdSize() {
        return kdSize;
    }
}
