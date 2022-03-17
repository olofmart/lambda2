package ru.olofmart;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {

        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                try {
                    i = i/0;
                } catch (Exception e) {
                    errorCallback.onError("Ошибка! " + e);
                }
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}
