package android.flags;

public interface Flag<T extends java.lang.Object> {
    @android.annotation.NonNull
    public java.lang.String getNamespace();
    @android.annotation.NonNull
    public java.lang.String getName();
    @android.annotation.NonNull
    public T getDefault();
    default public boolean isDynamic() { return false; }
    public android.flags.Flag<T> defineMetaData(java.lang.String p0, java.lang.String p1, java.lang.String p2);
    @android.annotation.NonNull
    default public java.lang.String getLabel() { return null; }
    default public java.lang.String getDescription() { return null; }
    default public java.lang.String getCategoryName() { return null; }
}
