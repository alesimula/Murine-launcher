package com.android.internal.util;

public class RingBuffer<T extends java.lang.Object> {
    public RingBuffer(java.lang.Class<T> p0, int p1) {}
    public int size() { return 0; }
    public boolean isEmpty() { return false; }
    public void clear() {}
    public void append(T p0) {}
    public T getNextSlot() { return null; }
    protected T createNewItem() { return null; }
    public T[] toArray() { return null; }
}
