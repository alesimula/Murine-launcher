package android.util;

public abstract class Singleton<T extends java.lang.Object> {
    private T mInstance;
    public Singleton() {}
    protected abstract T create();
    public final T get() { return null; }
}
