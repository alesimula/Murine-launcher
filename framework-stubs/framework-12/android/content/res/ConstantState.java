package android.content.res;

public abstract class ConstantState<T extends java.lang.Object> {
    public ConstantState() {}
    public abstract int getChangingConfigurations();
    public abstract T newInstance();
    public T newInstance(android.content.res.Resources p0) { return null; }
    public T newInstance(android.content.res.Resources p0, android.content.res.Resources.Theme p1) { return null; }
}
