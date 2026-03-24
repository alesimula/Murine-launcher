package com.android.internal.telephony;

public class BtSmsInterfaceManager {
    public BtSmsInterfaceManager() {}
    public void sendText(android.content.Context p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, android.telephony.SubscriptionInfo p5) {}

    private class MapMessageSender implements android.bluetooth.BluetoothProfile.ServiceListener {
        final java.util.Collection<android.net.Uri> mDestAddr = null;
        final android.bluetooth.BluetoothDevice mDevice = null;
        final android.app.PendingIntent mSentIntent = null;
        final android.app.PendingIntent mDeliveryIntent = null;
        MapMessageSender(com.android.internal.telephony.BtSmsInterfaceManager p0, java.lang.String p1, java.lang.String p2, android.bluetooth.BluetoothDevice p3, android.app.PendingIntent p4, android.app.PendingIntent p5) {}
        public void onServiceConnected(int p0, android.bluetooth.BluetoothProfile p1) {}
        public void onServiceDisconnected(int p0) {}
    }
}
