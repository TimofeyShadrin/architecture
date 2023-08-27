package ru.tshadrin.architecture.homework_one.store3D.models;

public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public String getHexCode() {
        String hexRed = Integer.toHexString(red);
        String hexGreen = Integer.toHexString(green);
        String hexBlue = Integer.toHexString(blue);

        return "#" + padZeros(hexRed) + padZeros(hexGreen) + padZeros(hexBlue);
    }

    private String padZeros(String hexValue) {
        return hexValue.length() == 1 ? "0" + hexValue : hexValue;
    }
}
