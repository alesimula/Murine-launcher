package android.util;

public final class ArraySet<E extends java.lang.Object> implements java.util.Collection<E>, java.util.Set<E> {
    static java.lang.Object[] sBaseCache;
    static int sBaseCacheSize;
    static java.lang.Object[] sTwiceBaseCache;
    static int sTwiceBaseCacheSize;
    int[] mHashes;
    java.lang.Object[] mArray;
    int mSize;
    public ArraySet() {}
    public ArraySet(int p0) {}
    public ArraySet(int p0, boolean p1) {}
    public ArraySet(android.util.ArraySet<E> p0) {}
    public ArraySet(java.util.Collection<? extends E> p0) {}
    public ArraySet(E[] p0) {}
    public void clear() {}
    public void ensureCapacity(int p0) {}
    public boolean contains(java.lang.Object p0) { return false; }
    public int indexOf(java.lang.Object p0) { return 0; }
    public E valueAt(int p0) { return null; }
    public E valueAtUnchecked(int p0) { return null; }
    public boolean isEmpty() { return false; }
    public boolean add(E p0) { return false; }
    public void append(E p0) {}
    public void addAll(android.util.ArraySet<? extends E> p0) {}
    public boolean remove(java.lang.Object p0) { return false; }
    public E removeAt(int p0) { return null; }
    public boolean removeAll(android.util.ArraySet<? extends E> p0) { return false; }
    public boolean removeIf(java.util.function.Predicate<? super E> p0) { return false; }
    public int size() { return 0; }
    public void forEach(java.util.function.Consumer<? super E> p0) {}
    public java.lang.Object[] toArray() { return null; }
    public <T extends java.lang.Object> T[] toArray(T[] p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public java.util.Iterator<E> iterator() { return null; }
    public boolean containsAll(java.util.Collection<?> p0) { return false; }
    public boolean addAll(java.util.Collection<? extends E> p0) { return false; }
    public boolean removeAll(java.util.Collection<?> p0) { return false; }
    public boolean retainAll(java.util.Collection<?> p0) { return false; }
}
