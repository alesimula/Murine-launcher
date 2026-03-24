package com.android.internal.telephony;

public class CellBroadcastServiceManager {
    public CellBroadcastServiceManager(android.content.Context p0, com.android.internal.telephony.Phone p1) {}
    public void sendGsmMessageToHandler(android.os.Message p0) {}
    public void sendCdmaMessageToHandler(com.android.internal.telephony.cdma.SmsMessage p0) {}
    public void sendCdmaScpMessageToHandler(com.android.internal.telephony.cdma.SmsMessage p0, android.os.RemoteCallback p1) {}
    public void enable() {}
    public void disable() {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private class CellBroadcastServiceConnection implements android.content.ServiceConnection {
        android.os.IBinder mService;
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void onBindingDied(android.content.ComponentName p0) {}
        public void onNullBinding(android.content.ComponentName p0) {}
    }
}
