package com.android.internal.org.bouncycastle.asn1;

public class ASN1ObjectIdentifier extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive {
    private final java.lang.String identifier = null;
    private byte[] body;
    private static final long LONG_LIMIT = 72057594037927808L;
    private static final java.util.concurrent.ConcurrentMap<com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier.OidHandle, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier> pool = null;
    public static com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getInstance(java.lang.Object p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    ASN1ObjectIdentifier(byte[] p0) { super(); }
    public ASN1ObjectIdentifier(java.lang.String p0) { super(); }
    ASN1ObjectIdentifier(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1) { super(); }
    public java.lang.String getId() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier branch(java.lang.String p0) { return null; }
    public boolean on(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return false; }
    private void writeField(java.io.ByteArrayOutputStream p0, long p1) {}
    private void writeField(java.io.ByteArrayOutputStream p0, java.math.BigInteger p1) {}
    private void doOutput(java.io.ByteArrayOutputStream p0) {}
    private synchronized byte[] getBody() { return null; }
    boolean isConstructed() { return false; }
    int encodedLength() throws java.io.IOException { return 0; }
    void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException {}
    public int hashCode() { return 0; }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    public java.lang.String toString() { return null; }
    private static boolean isValidBranchID(java.lang.String p0, int p1) { return false; }
    private static boolean isValidIdentifier(java.lang.String p0) { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier intern() { return null; }
    static com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier fromOctetString(byte[] p0) { return null; }

    private static class OidHandle {
        private final int key = 0;
        private final byte[] enc = null;
        OidHandle(byte[] p0) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }
}
