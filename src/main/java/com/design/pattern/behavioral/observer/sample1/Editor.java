package com.design.pattern.behavioral.observer.sample1;

public class Editor {

    public IEventManager eventManager;

    private String file;

    public Editor(){
        eventManager = new EventManager();
    }

    public void openFile(String path){
        eventManager.notify("open", path);
    }

    public void saveFile(String path){
        eventManager.notify("save", path);
    }
}
