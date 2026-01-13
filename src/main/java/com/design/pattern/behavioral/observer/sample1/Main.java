package com.design.pattern.behavioral.observer.sample1;
import com.design.pattern.behavioral.observer.sample1.listenerImpl.LoggingListener;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();

        var logListener = new LoggingListener("/temp", "open something");
        var logListener2 = new LoggingListener("/temp2", "open something");
        editor.eventManager.subscribe("open", logListener);
        editor.eventManager.subscribe("open", logListener2);
        editor.openFile("open");

    }
}
