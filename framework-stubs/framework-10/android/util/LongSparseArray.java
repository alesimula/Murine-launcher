package android.util;

public class LongSparseArray<E extends java.lang.Object> implements java.lang.Cloneable {
    private static final java.lang.Object DELETED = null;
    private boolean mGarbage;
    private long[] mKeys;
    private java.lang.Object[] mValues;
    private int mSize;
    public LongSparseArray() {}
    public LongSparseArray(int p0) {}
    public android.util.LongSparseArray<E> clone() { return null; }
    public E get(long p0) { return null; }
    public E get(long p0, E p1) { return null; }
    public void delete(long p0) {}
    public void remove(long p0) {}
    public void removeAt(int p0) {}
    private void gc() {}
    public void put(long p0, E p1) {}
    public int size() { return 0; }
    public long keyAt(int p0) { return 0L; }
    public E valueAt(int p0) { return null; }
    public void setValueAt(int p0, E p1) {}
    public int indexOfKey(long p0) { return 0; }
    public int indexOfValue(E p0) { return 0; }
    public int indexOfValueByValue(E p0) { return 0; }
    public void clear() {}
    public void append(long p0, E p1) {}
    public java.lang.String toString() { return null; }
}
