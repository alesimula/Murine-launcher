package android.util;

public class SparseArrayMap<K extends java.lang.Object, V extends java.lang.Object> {
    public SparseArrayMap() {}
    public void add(int p0, K p1, V p2) {}
    public void clear() {}
    public boolean contains(int p0, K p1) { return false; }
    public void delete(int p0) {}
    public void deleteAt(int p0) {}
    public V delete(int p0, K p1) { return null; }
    public V get(int p0, K p1) { return null; }
    public V getOrDefault(int p0, K p1, V p2) { return null; }
    public int indexOfKey(int p0) { return 0; }
    public int indexOfKey(int p0, K p1) { return 0; }
    public int keyAt(int p0) { return 0; }
    public K keyAt(int p0, int p1) { return null; }
    public int numMaps() { return 0; }
    public int numElementsForKey(int p0) { return 0; }
    public int numElementsForKeyAt(int p0) { return 0; }
    public V valueAt(int p0, int p1) { return null; }
    public void forEach(java.util.function.Consumer<V> p0) {}
    public void forEach(android.util.SparseArrayMap.TriConsumer<K, V> p0) {}

    public static interface TriConsumer<K extends java.lang.Object, V extends java.lang.Object> {
        public void accept(int p0, K p1, V p2);
    }
}
