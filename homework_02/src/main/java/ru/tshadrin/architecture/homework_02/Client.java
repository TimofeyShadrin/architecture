package ru.tshadrin.architecture.homework_02;

// Клиентский код
public class Client {
    public static void main(String[] args) {
        // Создание прокси для сервиса
        Service proxyService = new ProxyService();

        // Вызов метода через прокси
        proxyService.request();
    }
}