package com.android.internal.org.bouncycastle.jcajce.spec;

public class PBKDF2KeySpec extends javax.crypto.spec.PBEKeySpec {
    private static final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier defaultPRF = null;
    private com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier prf;
    public PBKDF2KeySpec(char[] p0, byte[] p1, int p2, int p3, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p4) { super((char[])null); }
    public boolean isDefaultPrf() { return false; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getPrf() { return null; }
}
