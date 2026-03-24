package com.android.internal.org.bouncycastle.jce.provider;

public class CertStoreCollectionSpi extends java.security.cert.CertStoreSpi {
    private java.security.cert.CollectionCertStoreParameters params;
    public CertStoreCollectionSpi(java.security.cert.CertStoreParameters p0) throws java.security.InvalidAlgorithmParameterException { super((java.security.cert.CertStoreParameters)null); }
    public java.util.Collection engineGetCertificates(java.security.cert.CertSelector p0) throws java.security.cert.CertStoreException { return null; }
    public java.util.Collection engineGetCRLs(java.security.cert.CRLSelector p0) throws java.security.cert.CertStoreException { return null; }
}
