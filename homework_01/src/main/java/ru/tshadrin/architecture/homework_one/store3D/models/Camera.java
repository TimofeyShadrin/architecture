package ru.tshadrin.architecture.homework_one.store3D.models;

import javax.xml.stream.Location;

public class Camera {
    private Point3D location;
    private Angle3D angle;

    public Camera() {
    }

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public void rotate(Angle3D angle3D) {
        //TODO изменение угла камеры на указанный
    }

    public void move(Point3D location) {
        //TODO перемещение камеры в указанную точку
    }
}
