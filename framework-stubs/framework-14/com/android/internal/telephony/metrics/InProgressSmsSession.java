package com.android.internal.telephony.metrics;

public class InProgressSmsSession {
    public final int phoneId = 0;
    public final java.util.Deque<com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event> events = null;
    public final int startSystemTimeMin = 0;
    public final long startElapsedTimeMs = 0L;
    public void increaseExpectedResponse() {}
    public void decreaseExpectedResponse() {}
    public int getNumExpectedResponses() { return 0; }
    public boolean isEventsDropped() { return false; }
    public InProgressSmsSession(int p0) {}
    public void addEvent(com.android.internal.telephony.metrics.SmsSessionEventBuilder p0) {}
    public synchronized void addEvent(long p0, com.android.internal.telephony.metrics.SmsSessionEventBuilder p1) {}
}
