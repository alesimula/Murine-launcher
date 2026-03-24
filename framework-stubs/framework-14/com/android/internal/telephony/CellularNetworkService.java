package com.android.internal.telephony;

public class CellularNetworkService extends android.telephony.NetworkService {
    public CellularNetworkService() { super(); }
    public static int getNetworkTypeForCellIdentity(int p0, android.telephony.CellIdentity p1, int p2) { return 0; }
    public android.telephony.NetworkService.NetworkServiceProvider onCreateNetworkServiceProvider(int p0) { return null; }

    private class CellularNetworkServiceProvider extends android.telephony.NetworkService.NetworkServiceProvider {
        CellularNetworkServiceProvider(com.android.internal.telephony.CellularNetworkService p0, int p1) { super(null, 0); }
        public void requestNetworkRegistrationInfo(int p0, android.telephony.NetworkServiceCallback p1) {}
        public void close() {}
    }
}
