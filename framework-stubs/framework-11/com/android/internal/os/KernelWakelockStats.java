package com.android.internal.os;

public class KernelWakelockStats extends java.util.HashMap<java.lang.String, com.android.internal.os.KernelWakelockStats.Entry> {
    int kernelWakelockVersion;
    public KernelWakelockStats() { super(); }

    public static class Entry {
        public int mCount;
        public long mTotalTime;
        public int mVersion;
        Entry(int p0, long p1, int p2) {}
    }
}
