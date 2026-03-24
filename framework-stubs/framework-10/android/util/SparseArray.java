package android.util;

public class SparseArray<E extends java.lang.Object> implements java.lang.Cloneable {
    private static final java.lang.Object DELETED = null;
    private boolean mGarbage;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int[] mKeys;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private java.lang.Object[] mValues;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int mSize;
    public SparseArray() {}
    public SparseArray(int p0) {}
    public android.util.SparseArray<E> clone() { return null; }
    public E get(int p0) { return null; }
    public E get(int p0, E p1) { return null; }
    public void delete(int p0) {}
    public E removeReturnOld(int p0) { return null; }
    public void remove(int p0) {}
    public void removeAt(int p0) {}
    public void removeAtRange(int p0, int p1) {}
    private void gc() {}
    public void put(int p0, E p1) {}
    public int size() { return 0; }
    public int keyAt(int p0) { return 0; }
    public E valueAt(int p0) { return null; }
    public void setValueAt(int p0, E p1) {}
    public int indexOfKey(int p0) { return 0; }
    public int indexOfValue(E p0) { return 0; }
    public int indexOfValueByValue(E p0) { return 0; }
    public void clear() {}
    public void append(int p0, E p1) {}
    public java.lang.String toString() { return null; }
}
