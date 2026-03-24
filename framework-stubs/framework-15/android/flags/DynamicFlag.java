package android.flags;

public interface DynamicFlag<T extends java.lang.Object> extends android.flags.Flag<T> {
    default public boolean isDynamic() { return false; }
}
