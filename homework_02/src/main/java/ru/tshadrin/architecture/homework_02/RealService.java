package ru.tshadrin.architecture.homework_02;

// Реализация реального сервиса
public class RealService implements Service {
    @Override
    public void request() {
        System.out.println("Выполнение запроса реального сервиса");
    }
}