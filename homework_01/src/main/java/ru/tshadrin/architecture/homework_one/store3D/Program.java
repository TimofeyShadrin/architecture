package ru.tshadrin.architecture.homework_one.store3D;

import ru.tshadrin.architecture.homework_one.store3D.inmemory.ModelStore;
import ru.tshadrin.architecture.homework_one.store3D.inmemory.Observer1;
import ru.tshadrin.architecture.homework_one.store3D.models.Poligon;
import ru.tshadrin.architecture.homework_one.store3D.models.PoligonalModel;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();

        ModelStore store = new ModelStore();
        store.RegisterModelChanger(observer1);

        Poligon p1 = new Poligon();
        List<Poligon> polygons = new ArrayList<>();
        polygons.add(p1);
        PoligonalModel poligonalModel = new PoligonalModel(polygons);
        store.add(poligonalModel);

    }

}
