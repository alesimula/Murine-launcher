package com.android.internal.telephony;

public class MockModem {
    static final int RADIOCONFIG_SERVICE = 8;
    static final int BINDER_RETRY_MILLIS = 300;
    static final int BINDER_MAX_RETRY = 10;
    MockModem(android.content.Context p0, java.lang.String p1) {}
    MockModem(android.content.Context p0, java.lang.String p1, int p2) {}
    public android.os.IBinder getServiceBinder(int p0) { return null; }
    public void bindAllMockModemService() {}
    public void bindToMockModemService(int p0) {}
    public void unbindMockModemService(int p0) {}
    public java.lang.String getServiceName() { return null; }

    private class MockModemConnection implements android.content.ServiceConnection {
        MockModemConnection(com.android.internal.telephony.MockModem p0, int p1) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }
}
