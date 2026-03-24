package com.android.internal.telephony.domainselection;

public class SmsDomainSelectionConnection extends com.android.internal.telephony.domainselection.DomainSelectionConnection {
    public SmsDomainSelectionConnection(com.android.internal.telephony.Phone p0, com.android.internal.telephony.domainselection.DomainSelectionController p1) { super(null, 0, false, null); }
    protected SmsDomainSelectionConnection(com.android.internal.telephony.Phone p0, com.android.internal.telephony.domainselection.DomainSelectionController p1, boolean p2) { super(null, 0, false, null); }
    public void onWlanSelected() {}
    public void onSelectionTerminated(int p0) {}
    public void finishSelection() {}
    public java.util.concurrent.CompletableFuture<java.lang.Integer> requestDomainSelection(android.telephony.DomainSelectionService.SelectionAttributes p0, com.android.internal.telephony.domainselection.DomainSelectionConnection.DomainSelectionConnectionCallback p1) { return null; }
}
