package ru.tshadrin.architecture.homework_one.store3D.models;

import java.util.List;

public class Scene {
    private static int counter = 0;
    private int id;
    private List<PoligonalModel> models;
    private List<Flash> flashes;
    private List<Camera> cameras;

    {
        id = ++counter;
    }

    public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        if (models == null || models.isEmpty()){
            throw new RuntimeException("Сцена должна содержать минимум один полигон.");
        }

        if (cameras == null || cameras.isEmpty()){
            throw new RuntimeException("Сцена должна содержать минимум одну камеру.");
        }
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public boolean addFlash(Flash flash) {
        //TODO добавляем источник света на сцену
        return true;
    }

    public boolean moveCamera(int index, Point3D location) {
        //TODO переместить камеру из имеющихся в списке с указанным индексом
        return true;
    }
}
