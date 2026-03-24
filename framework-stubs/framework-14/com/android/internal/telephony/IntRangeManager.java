package com.android.internal.telephony;

public abstract class IntRangeManager {
    protected IntRangeManager() {}
    public synchronized void clearRanges() {}
    public synchronized boolean enableRange(int p0, int p1, java.lang.String p2) { return false; }
    public synchronized boolean disableRange(int p0, int p1, java.lang.String p2) { return false; }
    public boolean updateRanges() { return false; }
    protected boolean tryAddRanges(int p0, int p1, boolean p2) { return false; }
    public boolean isEmpty() { return false; }
    protected abstract void startUpdate();
    protected abstract void addRange(int p0, int p1, boolean p2);
    protected abstract boolean finishUpdate();
    public java.lang.String toString() { return null; }

    private class ClientRange {
        final int mStartId = 0;
        final int mEndId = 0;
        final java.lang.String mClient = null;
        ClientRange(com.android.internal.telephony.IntRangeManager p0, int p1, int p2, java.lang.String p3) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private class IntRange {
        int mStartId;
        int mEndId;
        final java.util.ArrayList<com.android.internal.telephony.IntRangeManager.ClientRange> mClients = null;
        IntRange(com.android.internal.telephony.IntRangeManager p0, int p1, int p2, java.lang.String p3) {}
        IntRange(com.android.internal.telephony.IntRangeManager p0, com.android.internal.telephony.IntRangeManager.ClientRange p1) {}
        IntRange(com.android.internal.telephony.IntRangeManager p0, com.android.internal.telephony.IntRangeManager.IntRange p1, int p2) {}
        void insert(com.android.internal.telephony.IntRangeManager.ClientRange p0) {}
        public java.lang.String toString() { return null; }
    }
}
