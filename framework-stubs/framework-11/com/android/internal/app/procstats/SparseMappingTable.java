package com.android.internal.app.procstats;

public class SparseMappingTable {
    private static final java.lang.String TAG = "SparseMappingTable";
    public static final int ARRAY_SIZE = 4096;
    public static final int INVALID_KEY = -1;
    private static final int ID_SHIFT = 0;
    private static final int ID_MASK = 255;
    private static final int ARRAY_SHIFT = 8;
    private static final int ARRAY_MASK = 255;
    private static final int INDEX_SHIFT = 16;
    private static final int INDEX_MASK = 65535;
    private int mSequence;
    private int mNextIndex;
    private final java.util.ArrayList<long[]> mLongs = null;
    public SparseMappingTable() {}
    public void reset() {}
    public void writeToParcel(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String dumpInternalState(boolean p0) { return null; }
    private static void writeCompactedLongArray(android.os.Parcel p0, long[] p1, int p2) {}
    private static void readCompactedLongArray(android.os.Parcel p0, long[] p1, int p2) {}
    public static byte getIdFromKey(int p0) { return 0; }
    public static int getArrayFromKey(int p0) { return 0; }
    public static int getIndexFromKey(int p0) { return 0; }
    private static void logOrThrow(java.lang.String p0) {}
    private static void logOrThrow(java.lang.String p0, java.lang.Throwable p1) {}

    public static class Table {
        private com.android.internal.app.procstats.SparseMappingTable mParent;
        private int mSequence;
        private int[] mTable;
        private int mSize;
        public Table(com.android.internal.app.procstats.SparseMappingTable p0) {}
        public void copyFrom(com.android.internal.app.procstats.SparseMappingTable.Table p0, int p1) {}
        public int getOrAddKey(byte p0, int p1) { return 0; }
        public int getKey(byte p0) { return 0; }
        public long getValue(int p0) { return 0L; }
        public long getValue(int p0, int p1) { return 0L; }
        public long getValueForId(byte p0) { return 0L; }
        public long getValueForId(byte p0, int p1) { return 0L; }
        public long[] getArrayForKey(int p0) { return null; }
        public void setValue(int p0, long p1) {}
        public void setValue(int p0, int p1, long p2) {}
        public void resetTable() {}
        public void writeToParcel(android.os.Parcel p0) {}
        public boolean readFromParcel(android.os.Parcel p0) { return false; }
        public int getKeyCount() { return 0; }
        public int getKeyAt(int p0) { return 0; }
        private void assertConsistency() {}
        private int binarySearch(byte p0) { return 0; }
        private boolean validateKeys(boolean p0) { return false; }
        public java.lang.String dumpInternalState() { return null; }
    }
}
