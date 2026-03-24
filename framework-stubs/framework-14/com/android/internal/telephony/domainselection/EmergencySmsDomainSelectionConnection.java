package com.android.internal.telephony.domainselection;

public class EmergencySmsDomainSelectionConnection extends com.android.internal.telephony.domainselection.SmsDomainSelectionConnection {
    public EmergencySmsDomainSelectionConnection(com.android.internal.telephony.Phone p0, com.android.internal.telephony.domainselection.DomainSelectionController p1) { super((com.android.internal.telephony.Phone)null, (com.android.internal.telephony.domainselection.DomainSelectionController)null); }
    public EmergencySmsDomainSelectionConnection(com.android.internal.telephony.Phone p0, com.android.internal.telephony.domainselection.DomainSelectionController p1, com.android.internal.telephony.emergency.EmergencyStateTracker p2) { super((com.android.internal.telephony.Phone)null, (com.android.internal.telephony.domainselection.DomainSelectionController)null); }
    public void onWlanSelected(boolean p0) {}
    public void onWwanSelected() {}
    public void onDomainSelected(int p0, boolean p1) {}
    public void finishSelection() {}
    protected void onQualifiedNetworksChanged() {}
}
