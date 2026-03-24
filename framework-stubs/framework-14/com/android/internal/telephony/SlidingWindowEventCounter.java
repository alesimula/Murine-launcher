package com.android.internal.telephony;

public class SlidingWindowEventCounter {
    public SlidingWindowEventCounter(long p0, int p1) {}
    public synchronized boolean addOccurrence() { return false; }
    public synchronized boolean addOccurrence(long p0) { return false; }
    public synchronized boolean isInWindow() { return false; }
    int getQueuedNumOccurrences() { return 0; }
    public synchronized long getWindowSizeMillis() { return 0L; }
    public synchronized int getNumOccurrences() { return 0; }
    public java.lang.String getFrequencyString() { return null; }
    public java.lang.String toString() { return null; }
}
