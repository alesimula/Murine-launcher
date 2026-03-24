package com.android.internal.listeners;

public interface ListenerTransport<TListener extends java.lang.Object> {
    @android.annotation.Nullable
    public TListener getListener();
    public void unregister();
    default public void execute(java.util.concurrent.Executor p0, java.util.function.Consumer<TListener> p1) {}
}
