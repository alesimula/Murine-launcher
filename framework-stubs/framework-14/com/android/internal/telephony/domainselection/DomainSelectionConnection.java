package com.android.internal.telephony.domainselection;

public class DomainSelectionConnection {
    protected static final int EVENT_EMERGENCY_NETWORK_SCAN_RESULT = 1;
    protected static final int EVENT_QUALIFIED_NETWORKS_CHANGED = 2;
    protected java.lang.String mTag;
    protected com.android.internal.telephony.Phone mPhone;
    protected com.android.internal.telephony.domainselection.DomainSelectionConnection.DomainSelectionConnectionHandler mHandler;
    public DomainSelectionConnection(com.android.internal.telephony.Phone p0, int p1, boolean p2, com.android.internal.telephony.domainselection.DomainSelectionController p3) {}
    public android.telephony.DomainSelectionService.SelectionAttributes getSelectionAttributes() { return null; }
    public android.telephony.TransportSelectorCallback getTransportSelectorCallback() { return null; }
    public java.util.concurrent.CompletableFuture<java.lang.Integer> getCompletableFuture() { return null; }
    public com.android.internal.telephony.Phone getPhone() { return null; }
    public void selectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0) {}
    public void onCreated() {}
    public void onWlanSelected() {}
    public void onWlanSelected(boolean p0) {}
    public void onWwanSelected() {}
    public void onSelectionTerminated(int p0) {}
    public void onRequestEmergencyNetworkScan(int[] p0, int p1) {}
    public void onDomainSelected(int p0) {}
    public void onDomainSelected(int p0, boolean p1) {}
    public void onCancel() {}
    public void cancelSelection() {}
    public java.util.concurrent.CompletableFuture<java.lang.Integer> reselectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0) { return null; }
    public void finishSelection() {}
    public void onServiceDisconnected() {}
    protected void initHandler() {}
    protected void onQualifiedNetworksChanged() {}
    public void dump(java.io.PrintWriter p0) {}
    protected void logd(java.lang.String p0) {}
    protected void logi(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}

    public static interface DomainSelectionConnectionCallback {
        public void onSelectionTerminated(int p0);
    }

    protected final class DomainSelectionConnectionHandler extends android.os.Handler {
        DomainSelectionConnectionHandler(com.android.internal.telephony.domainselection.DomainSelectionConnection p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private final class TransportSelectorCallbackWrapper implements android.telephony.TransportSelectorCallback {
        public void onCreated(android.telephony.DomainSelector p0) {}
        public void onWlanSelected(boolean p0) {}
        public android.telephony.WwanSelectorCallback onWwanSelected() { return null; }
        public void onWwanSelected(java.util.function.Consumer<android.telephony.WwanSelectorCallback> p0) {}
        public void onSelectionTerminated(int p0) {}
    }

    private final class WwanSelectorCallbackWrapper implements android.telephony.WwanSelectorCallback, android.os.CancellationSignal.OnCancelListener {
        public void onRequestEmergencyNetworkScan(java.util.List<java.lang.Integer> p0, int p1, android.os.CancellationSignal p2, java.util.function.Consumer<android.telephony.EmergencyRegResult> p3) {}
        public void onDomainSelected(int p0, boolean p1) {}
        public void onCancel() {}
    }
}
