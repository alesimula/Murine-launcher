package android.view.accessibility;

final class WeakSparseArray<E extends java.lang.Object> {
    private final java.lang.ref.ReferenceQueue<E> mRefQueue = null;
    private final android.util.SparseArray<android.view.accessibility.WeakSparseArray.WeakReferenceWithId<E>> mSparseArray = null;
    WeakSparseArray() {}
    public void append(int p0, E p1) {}
    public void remove(int p0) {}
    public E get(int p0) { return null; }
    private void removeUnreachableValues() {}

    private static class WeakReferenceWithId<E extends java.lang.Object> extends java.lang.ref.WeakReference<E> {
        final int mId = 0;
        WeakReferenceWithId(E p0, java.lang.ref.ReferenceQueue<? super E> p1, int p2) { super(null); }
    }
}
