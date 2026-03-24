package com.android.internal.telephony.domainselection;

public class EmergencyCallDomainSelectionConnection extends com.android.internal.telephony.domainselection.DomainSelectionConnection {
    public EmergencyCallDomainSelectionConnection(com.android.internal.telephony.Phone p0, com.android.internal.telephony.domainselection.DomainSelectionController p1) { super(null, 0, false, null); }
    public EmergencyCallDomainSelectionConnection(com.android.internal.telephony.Phone p0, com.android.internal.telephony.domainselection.DomainSelectionController p1, com.android.internal.telephony.emergency.EmergencyStateTracker p2) { super(null, 0, false, null); }
    public void onWlanSelected(boolean p0) {}
    public void onWwanSelected() {}
    public void onSelectionTerminated(int p0) {}
    public void onDomainSelected(int p0, boolean p1) {}
    public java.util.concurrent.CompletableFuture<java.lang.Integer> createEmergencyConnection(android.telephony.DomainSelectionService.SelectionAttributes p0, com.android.internal.telephony.domainselection.DomainSelectionConnection.DomainSelectionConnectionCallback p1) { return null; }
    protected void onQualifiedNetworksChanged() {}
    public void cancelSelection() {}
    public static android.telephony.DomainSelectionService.SelectionAttributes getSelectionAttributes(int p0, int p1, boolean p2, java.lang.String p3, java.lang.String p4, int p5, android.telephony.ims.ImsReasonInfo p6, android.telephony.EmergencyRegResult p7) { return null; }
}
