package com.android.internal.telephony.domainselection;

public class NormalCallDomainSelectionConnection extends com.android.internal.telephony.domainselection.DomainSelectionConnection {
    public NormalCallDomainSelectionConnection(com.android.internal.telephony.Phone p0, com.android.internal.telephony.domainselection.DomainSelectionController p1) { super(null, 0, false, null); }
    public void onWlanSelected() {}
    public void onWwanSelected() {}
    public void onSelectionTerminated(int p0) {}
    public void onRequestEmergencyNetworkScan(int[] p0, int p1) {}
    public java.util.concurrent.CompletableFuture<java.lang.Integer> createNormalConnection(android.telephony.DomainSelectionService.SelectionAttributes p0, com.android.internal.telephony.domainselection.DomainSelectionConnection.DomainSelectionConnectionCallback p1) { return null; }
    public static android.telephony.DomainSelectionService.SelectionAttributes getSelectionAttributes(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, int p5, android.telephony.ims.ImsReasonInfo p6) { return null; }
    public static boolean isWpsCall(java.lang.String p0) { return false; }
}
