package android.net.lowpan;

public abstract class LowpanProperty<T extends java.lang.Object> {
    public LowpanProperty() {}
    public abstract java.lang.String getName();
    public abstract java.lang.Class<T> getType();
    public void putInMap(java.util.Map p0, T p1) {}
    public T getFromMap(java.util.Map p0) { return null; }
}
