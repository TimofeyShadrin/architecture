package ru.tshadrin.architecture.lesson_02;

public class PoemReader extends LogReader{

    @Override
    public void setDataSource(Object dataSource) {

    }

    @Override
    public Object getDataSource() {
        return null;
    }

    @Override
    protected Iterable<String> readEntries(Integer position) {
        return null;
    }

    @Override
    protected LogEntry parseLogEntry(String stringEntry) {
        return null;
    }
}
