package com.android.internal.telephony.domainselection;

public class DomainSelectionResolver {
    public static void make(android.content.Context p0, boolean p1) {}
    public static com.android.internal.telephony.domainselection.DomainSelectionResolver getInstance() { return null; }
    public static void setDomainSelectionResolver(com.android.internal.telephony.domainselection.DomainSelectionResolver p0) {}
    public DomainSelectionResolver(android.content.Context p0, boolean p1) {}
    public boolean isDomainSelectionSupported() { return false; }
    public com.android.internal.telephony.domainselection.DomainSelectionConnection getDomainSelectionConnection(com.android.internal.telephony.Phone p0, int p1, boolean p2) { return null; }
    public void setDomainSelectionControllerFactory(com.android.internal.telephony.domainselection.DomainSelectionResolver.DomainSelectionControllerFactory p0) {}
    public void initialize(android.telephony.DomainSelectionService p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static interface DomainSelectionControllerFactory {
        public com.android.internal.telephony.domainselection.DomainSelectionController create(android.content.Context p0, android.telephony.DomainSelectionService p1);
    }
}
