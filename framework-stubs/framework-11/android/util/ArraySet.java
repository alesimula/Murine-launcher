package android.util;

public final class ArraySet<E extends java.lang.Object> implements java.util.Collection<E>, java.util.Set<E> {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ArraySet";
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    static java.lang.Object[] sBaseCache;
    static int sBaseCacheSize;
    static java.lang.Object[] sTwiceBaseCache;
    static int sTwiceBaseCacheSize;
    private static final java.lang.Object sBaseCacheLock = null;
    private static final java.lang.Object sTwiceBaseCacheLock = null;
    private final boolean mIdentityHashCode = false;
    int[] mHashes;
    java.lang.Object[] mArray;
    int mSize;
    private android.util.MapCollections<E, E> mCollections;
    private int binarySearch(int[] p0, int p1) { return 0; }
    private int indexOf(java.lang.Object p0, int p1) { return 0; }
    private int indexOfNull() { return 0; }
    private void allocArrays(int p0) {}
    private static void freeArrays(int[] p0, java.lang.Object[] p1, int p2) {}
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
    private boolean shouldShrink() { return false; }
    private int getNewShrunkenSize() { return 0; }
    public E removeAt(int p0) { return null; }
    public boolean removeAll(android.util.ArraySet<? extends E> p0) { return false; }
    public boolean removeIf(java.util.function.Predicate<? super E> p0) { return false; }
    public int size() { return 0; }
    public java.lang.Object[] toArray() { return null; }
    public <T extends java.lang.Object> T[] toArray(T[] p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    private android.util.MapCollections<E, E> getCollection() { return null; }
    public java.util.Iterator<E> iterator() { return null; }
    public boolean containsAll(java.util.Collection<?> p0) { return false; }
    public boolean addAll(java.util.Collection<? extends E> p0) { return false; }
    public boolean removeAll(java.util.Collection<?> p0) { return false; }
    public boolean retainAll(java.util.Collection<?> p0) { return false; }
}
