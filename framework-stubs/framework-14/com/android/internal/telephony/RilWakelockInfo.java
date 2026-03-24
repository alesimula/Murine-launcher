package com.android.internal.telephony;

@android.annotation.TargetApi(8)
public class RilWakelockInfo {
    public int getConcurrentRequests() { return 0; }
    RilWakelockInfo(int p0, int p1, int p2, long p3) {}
    int getTokenNumber() { return 0; }
    int getRilRequestSent() { return 0; }
    void setResponseTime(long p0) {}
    void updateConcurrentRequests(int p0, long p1) {}
    synchronized void updateTime(long p0) {}
    long getWakelockTimeAttributedToClient() { return 0L; }
    public java.lang.String toString() { return null; }
}
