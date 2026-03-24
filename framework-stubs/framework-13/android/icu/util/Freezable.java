package android.icu.util;

public interface Freezable<T extends java.lang.Object> extends java.lang.Cloneable {
    public boolean isFrozen();
    public T freeze();
    public T cloneAsThawed();
}
