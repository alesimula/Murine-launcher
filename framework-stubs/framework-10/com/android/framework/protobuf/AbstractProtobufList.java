package com.android.framework.protobuf;

abstract class AbstractProtobufList<E extends java.lang.Object> extends java.util.AbstractList<E> implements com.android.framework.protobuf.Internal.ProtobufList<E> {
    protected static final int DEFAULT_CAPACITY = 10;
    private boolean isMutable;
    AbstractProtobufList() { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean add(E p0) { return false; }
    public void add(int p0, E p1) {}
    public boolean addAll(java.util.Collection<? extends E> p0) { return false; }
    public boolean addAll(int p0, java.util.Collection<? extends E> p1) { return false; }
    public void clear() {}
    public boolean isModifiable() { return false; }
    public final void makeImmutable() {}
    public E remove(int p0) { return null; }
    public boolean remove(java.lang.Object p0) { return false; }
    public boolean removeAll(java.util.Collection<?> p0) { return false; }
    public boolean retainAll(java.util.Collection<?> p0) { return false; }
    public E set(int p0, E p1) { return null; }
    protected void ensureIsMutable() {}
}
