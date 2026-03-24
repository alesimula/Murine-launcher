package org.apache.harmony.dalvik.ddmc;

public class DdmVmInternal {
    public DdmVmInternal() {}
    public void enableRecentAllocations(boolean p0) {}
    public boolean heapInfoNotify(int p0) { return false; }
    public boolean heapSegmentNotify(int p0, int p1, boolean p2) { return false; }
    public boolean getRecentAllocationStatus() { return false; }
    public byte[] getRecentAllocations() { return null; }
    public void threadNotify(boolean p0) {}
    public byte[] getThreadStats() { return null; }
    public java.lang.StackTraceElement[] getStackTraceById(int p0) { return null; }
}
