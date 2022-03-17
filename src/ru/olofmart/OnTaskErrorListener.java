package ru.olofmart;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
