package android.provider;

public abstract class OneTimeUseBuilder<T extends java.lang.Object> {
    public OneTimeUseBuilder() {}
    protected void markUsed() {}
    protected void checkNotUsed() {}
    public abstract T build();
}
