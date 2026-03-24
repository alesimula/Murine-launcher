package com.android.internal.infra;

public abstract class PerUser<T extends java.lang.Object> extends android.util.SparseArray<T> {
    public PerUser() { super(); }
    protected abstract T create(int p0);
    public T forUser(int p0) { return null; }
    public T get(int p0) { return null; }
}
