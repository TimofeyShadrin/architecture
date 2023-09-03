package ru.tshadrin.architecture.homework_02;

// Прокси для сервиса
public class ProxyService implements Service {
    private Service realService;

    @Override
    public void request() {
        if (realService == null) {
            realService = new RealService();
        }
        preRequest();
        realService.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("Выполнение предварительных действий перед запросом");
    }

    private void postRequest() {
        System.out.println("Выполнение действий после запроса");
    }
}