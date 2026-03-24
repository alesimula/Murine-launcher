package android.text;

public final class AutoGrowArray {
    private static final int MIN_CAPACITY_INCREMENT = 12;
    private static final int MAX_CAPACITY_TO_BE_KEPT = 10000;
    public AutoGrowArray() {}
    private static int computeNewCapacity(int p0, int p1) { return 0; }

    public static class ByteArray {
        private byte[] mValues;
        private int mSize;
        public ByteArray() {}
        public ByteArray(int p0) {}
        public void resize(int p0) {}
        public void append(byte p0) {}
        private void ensureCapacity(int p0) {}
        public void clear() {}
        public void clearWithReleasingLargeArray() {}
        public byte get(int p0) { return 0; }
        public void set(int p0, byte p1) {}
        public int size() { return 0; }
        public byte[] getRawArray() { return null; }
    }

    public static class FloatArray {
        private float[] mValues;
        private int mSize;
        public FloatArray() {}
        public FloatArray(int p0) {}
        public void resize(int p0) {}
        public void append(float p0) {}
        private void ensureCapacity(int p0) {}
        public void clear() {}
        public void clearWithReleasingLargeArray() {}
        public float get(int p0) { return 0.0f; }
        public void set(int p0, float p1) {}
        public int size() { return 0; }
        public float[] getRawArray() { return null; }
    }

    public static class IntArray {
        private int[] mValues;
        private int mSize;
        public IntArray() {}
        public IntArray(int p0) {}
        public void resize(int p0) {}
        public void append(int p0) {}
        private void ensureCapacity(int p0) {}
        public void clear() {}
        public void clearWithReleasingLargeArray() {}
        public int get(int p0) { return 0; }
        public void set(int p0, int p1) {}
        public int size() { return 0; }
        public int[] getRawArray() { return null; }
    }
}
