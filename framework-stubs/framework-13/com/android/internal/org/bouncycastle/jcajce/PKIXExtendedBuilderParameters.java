package com.android.internal.org.bouncycastle.jcajce;

public class PKIXExtendedBuilderParameters implements java.security.cert.CertPathParameters {
    public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters getBaseParameters() { return null; }
    public java.util.Set getExcludedCerts() { return null; }
    public int getMaxPathLength() { return 0; }
    public java.lang.Object clone() { return null; }

    public static class Builder {
        public Builder(java.security.cert.PKIXBuilderParameters p0) {}
        public Builder(com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters p0) {}
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder addExcludedCerts(java.util.Set<java.security.cert.X509Certificate> p0) { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder setMaxPathLength(int p0) { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedBuilderParameters build() { return null; }
    }
}
