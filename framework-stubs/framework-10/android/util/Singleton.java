package android.util;

public abstract class Singleton<T extends java.lang.Object> {
    @android.annotation.UnsupportedAppUsage
    private T mInstance;
    public Singleton() {}
    protected abstract T create();
    @android.annotation.UnsupportedAppUsage
    public final T get() { return null; }
}
