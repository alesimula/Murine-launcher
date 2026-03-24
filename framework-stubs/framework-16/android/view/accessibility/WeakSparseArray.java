package android.view.accessibility;

final class WeakSparseArray<E extends java.lang.Object> {
    WeakSparseArray() {}
    public void append(int p0, E p1) {}
    public void remove(int p0) {}
    public E get(int p0) { return null; }

    private static class WeakReferenceWithId<E extends java.lang.Object> extends java.lang.ref.WeakReference<E> {
        final int mId = 0;
        WeakReferenceWithId(E p0, java.lang.ref.ReferenceQueue<? super E> p1, int p2) { super(null); }
    }
}
