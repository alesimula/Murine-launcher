package com.android.internal.telephony.domainselection;

public class DomainSelectionController {
    protected final java.lang.Object mLock = null;
    protected final android.content.Context mContext = null;
    protected final int[] mConnectionCounts = null;
    public DomainSelectionController(android.content.Context p0, android.telephony.DomainSelectionService p1) {}
    public DomainSelectionController(android.content.Context p0, android.telephony.DomainSelectionService p1, android.os.Looper p2) {}
    public com.android.internal.telephony.domainselection.DomainSelectionConnection getDomainSelectionConnection(com.android.internal.telephony.Phone p0, int p1, boolean p2) { return null; }
    public void removeConnection(com.android.internal.telephony.domainselection.DomainSelectionConnection p0) {}
    public void selectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0, android.telephony.TransportSelectorCallback p1) {}
    public java.util.concurrent.Executor getDomainSelectionServiceExecutor() { return null; }
    public void dump(java.io.PrintWriter p0) {}

    private final class DomainSelectionControllerHandler extends android.os.Handler {
        DomainSelectionControllerHandler(com.android.internal.telephony.domainselection.DomainSelectionController p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
