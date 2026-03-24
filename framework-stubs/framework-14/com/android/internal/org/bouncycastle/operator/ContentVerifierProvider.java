package com.android.internal.org.bouncycastle.operator;

public interface ContentVerifierProvider {
    public boolean hasAssociatedCertificate();
    public com.android.internal.org.bouncycastle.cert.X509CertificateHolder getAssociatedCertificate();
    public com.android.internal.org.bouncycastle.operator.ContentVerifier get(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException;
}
