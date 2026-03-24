package com.android.internal.org.bouncycastle.asn1;

public class ASN1OutputStream {
    public static com.android.internal.org.bouncycastle.asn1.ASN1OutputStream create(java.io.OutputStream p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1OutputStream create(java.io.OutputStream p0, java.lang.String p1) { return null; }
    public ASN1OutputStream(java.io.OutputStream p0) {}
    final void writeLength(int p0) throws java.io.IOException {}
    final void write(int p0) throws java.io.IOException {}
    final void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    final void writeElements(com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] p0) throws java.io.IOException {}
    final void writeElements(java.util.Enumeration p0) throws java.io.IOException {}
    final void writeEncoded(boolean p0, int p1, byte p2) throws java.io.IOException {}
    final void writeEncoded(boolean p0, int p1, byte[] p2) throws java.io.IOException {}
    final void writeEncoded(boolean p0, int p1, byte[] p2, int p3, int p4) throws java.io.IOException {}
    final void writeEncoded(boolean p0, int p1, byte p2, byte[] p3) throws java.io.IOException {}
    final void writeEncoded(boolean p0, int p1, byte p2, byte[] p3, int p4, int p5, byte p6) throws java.io.IOException {}
    final void writeEncoded(boolean p0, int p1, int p2, byte[] p3) throws java.io.IOException {}
    final void writeEncodedIndef(boolean p0, int p1, int p2, byte[] p3) throws java.io.IOException {}
    final void writeEncodedIndef(boolean p0, int p1, com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] p2) throws java.io.IOException {}
    final void writeEncodedIndef(boolean p0, int p1, java.util.Enumeration p2) throws java.io.IOException {}
    final void writeTag(boolean p0, int p1, int p2) throws java.io.IOException {}
    public void writeObject(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) throws java.io.IOException {}
    public void writeObject(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) throws java.io.IOException {}
    void writePrimitive(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0, boolean p1) throws java.io.IOException {}
    public void close() throws java.io.IOException {}
    public void flush() throws java.io.IOException {}
    void flushInternal() throws java.io.IOException {}
    com.android.internal.org.bouncycastle.asn1.DEROutputStream getDERSubStream() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1OutputStream getDLSubStream() { return null; }
}
