package com.android.internal.telephony.data;

public class CellularDataService extends android.telephony.data.DataService {
    public CellularDataService() { super(); }
    public android.telephony.data.DataService.DataServiceProvider onCreateDataServiceProvider(int p0) { return null; }

    private class CellularDataServiceProvider extends android.telephony.data.DataService.DataServiceProvider {
        CellularDataServiceProvider() { super(null, 0); }
        public void setupDataCall(int p0, android.telephony.data.DataProfile p1, boolean p2, boolean p3, int p4, android.net.LinkProperties p5, int p6, android.telephony.data.NetworkSliceInfo p7, android.telephony.data.TrafficDescriptor p8, boolean p9, android.telephony.data.DataServiceCallback p10) {}
        public void deactivateDataCall(int p0, int p1, android.telephony.data.DataServiceCallback p2) {}
        public void setInitialAttachApn(android.telephony.data.DataProfile p0, boolean p1, android.telephony.data.DataServiceCallback p2) {}
        public void setDataProfile(java.util.List<android.telephony.data.DataProfile> p0, boolean p1, android.telephony.data.DataServiceCallback p2) {}
        public void requestDataCallList(android.telephony.data.DataServiceCallback p0) {}
        public void startHandover(int p0, android.telephony.data.DataServiceCallback p1) {}
        public void cancelHandover(int p0, android.telephony.data.DataServiceCallback p1) {}
        public void close() {}
    }
}
