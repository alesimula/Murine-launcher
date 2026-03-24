package com.android.internal.app.procstats;

public class SparseMappingTable {
    public static final int ARRAY_SIZE = 4096;
    public static final int INVALID_KEY = -1;
    public SparseMappingTable() {}
    public void reset() {}
    public void writeToParcel(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String dumpInternalState(boolean p0) { return null; }
    public static byte getIdFromKey(int p0) { return 0; }
    public static int getArrayFromKey(int p0) { return 0; }
    public static int getIndexFromKey(int p0) { return 0; }

    public static class Table {
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
        public java.lang.String dumpInternalState() { return null; }
    }
}
