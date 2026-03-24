package com.android.server;

abstract class ResettableTimeout {
    ResettableTimeout() {}
    public abstract void on(boolean p0);
    public abstract void off();
    public void go(long p0) {}
    public void cancel() {}

    private class T extends java.lang.Thread {
        public void run() {}
    }
}
