package com.android.internal.infra;

public abstract class PerUser<T extends java.lang.Object> extends android.util.SparseArray<T> {
    public PerUser() { super(); }
    @android.annotation.NonNull
    protected abstract T create(int p0);
    @android.annotation.NonNull
    public T forUser(int p0) { return null; }
    @android.annotation.NonNull
    public T get(int p0) { return null; }
}
