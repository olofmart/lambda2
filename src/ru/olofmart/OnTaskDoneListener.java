package ru.olofmart;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
