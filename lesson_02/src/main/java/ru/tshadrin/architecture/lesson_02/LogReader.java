package ru.tshadrin.architecture.lesson_02;

import java.util.ArrayList;
import java.util.List;

/*
    Основа работы алгоритма чтения данных
 */
public abstract class LogReader {
    private int currentPosition = 0;

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Iterable<LogEntry> readLogEntry() {
        List<LogEntry> logList = new ArrayList<>();
        for (String string: readEntries(currentPosition)) {
            logList.add(parseLogEntry(string));
        }
        return logList;
    }
    public abstract void setDataSource(Object dataSource);
    public abstract Object getDataSource();
    protected abstract Iterable<String> readEntries(Integer position);
    protected abstract LogEntry parseLogEntry(String stringEntry);

}
