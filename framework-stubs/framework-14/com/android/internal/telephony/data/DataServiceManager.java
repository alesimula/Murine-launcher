package com.android.internal.telephony.data;

public class DataServiceManager extends android.os.Handler {
    static final java.lang.String DATA_CALL_RESPONSE = "data_call_response";
    public DataServiceManager(com.android.internal.telephony.Phone p0, android.os.Looper p1, int p2) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public java.lang.String getDataServicePackageName() { return null; }
    public void setupDataCall(int p0, android.telephony.data.DataProfile p1, boolean p2, boolean p3, int p4, android.net.LinkProperties p5, int p6, android.telephony.data.NetworkSliceInfo p7, android.telephony.data.TrafficDescriptor p8, boolean p9, android.os.Message p10) {}
    public void deactivateDataCall(int p0, int p1, android.os.Message p2) {}
    public void startHandover(int p0, android.os.Message p1) {}
    public void cancelHandover(int p0, android.os.Message p1) {}
    public void setInitialAttachApn(android.telephony.data.DataProfile p0, boolean p1, android.os.Message p2) {}
    public void setDataProfile(java.util.List<android.telephony.data.DataProfile> p0, boolean p1, android.os.Message p2) {}
    public void requestDataCallList(android.os.Message p0) {}
    public void registerForDataCallListChanged(android.os.Handler p0, int p1) {}
    public void unregisterForDataCallListChanged(android.os.Handler p0) {}
    public void registerForApnUnthrottled(android.os.Handler p0, int p1) {}
    public void unregisterForApnUnthrottled(android.os.Handler p0) {}
    public void registerForServiceBindingChanged(android.os.Handler p0, int p1) {}
    public void unregisterForServiceBindingChanged(android.os.Handler p0) {}

    private final class CellularDataServiceConnection implements android.content.ServiceConnection {
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }

    private final class DataServiceCallbackWrapper extends android.telephony.data.IDataServiceCallback.Stub {
        DataServiceCallbackWrapper(com.android.internal.telephony.data.DataServiceManager p0, java.lang.String p1) { super(); }
        public java.lang.String getTag() { return null; }
        public void onSetupDataCallComplete(int p0, android.telephony.data.DataCallResponse p1) {}
        public void onDeactivateDataCallComplete(int p0) {}
        public void onSetInitialAttachApnComplete(int p0) {}
        public void onSetDataProfileComplete(int p0) {}
        public void onRequestDataCallListComplete(int p0, java.util.List<android.telephony.data.DataCallResponse> p1) {}
        public void onDataCallListChanged(java.util.List<android.telephony.data.DataCallResponse> p0) {}
        public void onHandoverStarted(int p0) {}
        public void onHandoverCancelled(int p0) {}
        public void onApnUnthrottled(java.lang.String p0) {}
        public void onDataProfileUnthrottled(android.telephony.data.DataProfile p0) {}
    }

    private class DataServiceManagerDeathRecipient implements android.os.IBinder.DeathRecipient {
        public void binderDied() {}
    }
}
