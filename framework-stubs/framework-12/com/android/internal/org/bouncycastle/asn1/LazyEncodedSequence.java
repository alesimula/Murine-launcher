package com.android.internal.org.bouncycastle.asn1;

class LazyEncodedSequence extends com.android.internal.org.bouncycastle.asn1.ASN1Sequence {
    private byte[] encoded;
    LazyEncodedSequence(byte[] p0) throws java.io.IOException { super(); }
    public synchronized com.android.internal.org.bouncycastle.asn1.ASN1Encodable getObjectAt(int p0) { return null; }
    public synchronized java.util.Enumeration getObjects() { return null; }
    public synchronized int hashCode() { return 0; }
    public synchronized java.util.Iterator<com.android.internal.org.bouncycastle.asn1.ASN1Encodable> iterator() { return null; }
    public synchronized int size() { return 0; }
    public synchronized com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] toArray() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] toArrayInternal() { return null; }
    synchronized int encodedLength() throws java.io.IOException { return 0; }
    synchronized void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException {}
    synchronized com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    synchronized com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
    private void force() {}
}
