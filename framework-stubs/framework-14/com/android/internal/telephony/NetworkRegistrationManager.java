package com.android.internal.telephony;

public class NetworkRegistrationManager extends android.os.Handler {
    public NetworkRegistrationManager(int p0, com.android.internal.telephony.Phone p1) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public boolean isServiceConnected() { return false; }
    public void unregisterForNetworkRegistrationInfoChanged(android.os.Handler p0) {}
    public void registerForNetworkRegistrationInfoChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void requestNetworkRegistrationInfo(int p0, android.os.Message p1) {}

    private class NetworkRegStateCallback extends android.telephony.INetworkServiceCallback.Stub {
        public void onRequestNetworkRegistrationInfoComplete(int p0, android.telephony.NetworkRegistrationInfo p1) {}
        public void onNetworkStateChanged() {}
    }

    private class NetworkServiceConnection implements android.content.ServiceConnection {
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }

    private class RegManagerDeathRecipient implements android.os.IBinder.DeathRecipient {
        RegManagerDeathRecipient(com.android.internal.telephony.NetworkRegistrationManager p0, android.content.ComponentName p1) {}
        public void binderDied() {}
    }
}
