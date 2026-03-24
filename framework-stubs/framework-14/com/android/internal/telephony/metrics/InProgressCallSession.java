package com.android.internal.telephony.metrics;

public class InProgressCallSession {
    public final int phoneId = 0;
    public final java.util.Deque<com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event> events = null;
    public final int startSystemTimeMin = 0;
    public final long startElapsedTimeMs = 0L;
    public boolean isEventsDropped() { return false; }
    public InProgressCallSession(int p0) {}
    public void addEvent(com.android.internal.telephony.metrics.CallSessionEventBuilder p0) {}
    public synchronized void addEvent(long p0, com.android.internal.telephony.metrics.CallSessionEventBuilder p1) {}
    public synchronized boolean containsCsCalls() { return false; }
    public void setLastKnownPhoneState(int p0) {}
    public boolean isPhoneIdle() { return false; }
}
