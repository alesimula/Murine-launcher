package android.util;

public class ListenerGroup<T extends java.lang.Object> {
    public ListenerGroup(T p0, android.os.Handler p1) {}
    public void accept(T p0) {}
    public void addListener(java.util.concurrent.Executor p0, java.util.function.Consumer<T> p1) {}
    public void removeListener(java.util.function.Consumer<T> p0) {}
}
