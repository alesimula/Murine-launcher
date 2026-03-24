package com.android.internal.telephony.metrics;

public class DataCallSessionStats {
    public static final int SIZE_LIMIT_HANDOVER_FAILURES = 15;
    public DataCallSessionStats(com.android.internal.telephony.Phone p0) {}
    public synchronized void onSetupDataCall(int p0) {}
    public synchronized void onSetupDataCallResponse(android.telephony.data.DataCallResponse p0, int p1, int p2, int p3, int p4) {}
    public synchronized void setDeactivateDataCallReason(int p0) {}
    public synchronized void onDataCallDisconnected(int p0) {}
    public synchronized void onHandoverFailure(int p0, int p1, int p2) {}
    public synchronized void onDrsOrRatChanged(int p0) {}
    public void onUnmeteredUpdate(int p0) {}
    public synchronized void conclude() {}
    protected long getTimeMillis() { return 0L; }
}
