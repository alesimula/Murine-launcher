package com.android.internal.org.bouncycastle.jcajce;

public class PKIXExtendedParameters implements java.security.cert.CertPathParameters {
    public static final int PKIX_VALIDITY_MODEL = 0;
    public static final int CHAIN_VALIDITY_MODEL = 1;
    public java.util.List<com.android.internal.org.bouncycastle.jcajce.PKIXCertStore> getCertificateStores() { return null; }
    public java.util.Map<com.android.internal.org.bouncycastle.asn1.x509.GeneralName, com.android.internal.org.bouncycastle.jcajce.PKIXCertStore> getNamedCertificateStoreMap() { return null; }
    public java.util.List<com.android.internal.org.bouncycastle.jcajce.PKIXCRLStore> getCRLStores() { return null; }
    public java.util.Map<com.android.internal.org.bouncycastle.asn1.x509.GeneralName, com.android.internal.org.bouncycastle.jcajce.PKIXCRLStore> getNamedCRLStoreMap() { return null; }
    public java.util.Date getValidityDate() { return null; }
    public java.util.Date getDate() { return null; }
    public boolean isUseDeltasEnabled() { return false; }
    public int getValidityModel() { return 0; }
    public java.lang.Object clone() { return null; }
    public com.android.internal.org.bouncycastle.jcajce.PKIXCertStoreSelector getTargetConstraints() { return null; }
    public java.util.Set getTrustAnchors() { return null; }
    public java.util.Set getInitialPolicies() { return null; }
    public java.lang.String getSigProvider() { return null; }
    public boolean isExplicitPolicyRequired() { return false; }
    public boolean isAnyPolicyInhibited() { return false; }
    public boolean isPolicyMappingInhibited() { return false; }
    public java.util.List getCertPathCheckers() { return null; }
    public java.util.List<java.security.cert.CertStore> getCertStores() { return null; }
    public boolean isRevocationEnabled() { return false; }
    public boolean getPolicyQualifiersRejected() { return false; }

    public static class Builder {
        public Builder(java.security.cert.PKIXParameters p0) {}
        public Builder(com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters p0) {}
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters.Builder addCertificateStore(com.android.internal.org.bouncycastle.jcajce.PKIXCertStore p0) { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters.Builder addNamedCertificateStore(com.android.internal.org.bouncycastle.asn1.x509.GeneralName p0, com.android.internal.org.bouncycastle.jcajce.PKIXCertStore p1) { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters.Builder addCRLStore(com.android.internal.org.bouncycastle.jcajce.PKIXCRLStore p0) { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters.Builder addNamedCRLStore(com.android.internal.org.bouncycastle.asn1.x509.GeneralName p0, com.android.internal.org.bouncycastle.jcajce.PKIXCRLStore p1) { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters.Builder setTargetConstraints(com.android.internal.org.bouncycastle.jcajce.PKIXCertStoreSelector p0) { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters.Builder setUseDeltasEnabled(boolean p0) { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters.Builder setValidityModel(int p0) { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters.Builder setTrustAnchor(java.security.cert.TrustAnchor p0) { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters.Builder setTrustAnchors(java.util.Set<java.security.cert.TrustAnchor> p0) { return null; }
        public void setRevocationEnabled(boolean p0) {}
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters build() { return null; }
    }
}
