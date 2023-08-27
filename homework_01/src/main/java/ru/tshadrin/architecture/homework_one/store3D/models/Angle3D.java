package ru.tshadrin.architecture.homework_one.store3D.models;

public class Angle3D {
    private double pitch;
    private double yaw;
    private double roll;

    public Angle3D(double pitch, double yaw, double roll) {
        this.pitch = pitch;
        this.yaw = yaw;
        this.roll = roll;
    }

    public double getPitch() {
        return pitch;
    }

    public double getYaw() {
        return yaw;
    }

    public double getRoll() {
        return roll;
    }

    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    public void setYaw(double yaw) {
        this.yaw = yaw;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }
}