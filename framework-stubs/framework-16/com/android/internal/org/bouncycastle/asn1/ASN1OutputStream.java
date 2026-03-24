package com.android.internal.org.bouncycastle.asn1;

public class ASN1OutputStream {
    public static com.android.internal.org.bouncycastle.asn1.ASN1OutputStream create(java.io.OutputStream p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1OutputStream create(java.io.OutputStream p0, java.lang.String p1) { return null; }
    ASN1OutputStream(java.io.OutputStream p0) {}
    public void close() throws java.io.IOException {}
    public void flush() throws java.io.IOException {}
    public final void writeObject(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) throws java.io.IOException {}
    public final void writeObject(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) throws java.io.IOException {}
    void flushInternal() throws java.io.IOException {}
    com.android.internal.org.bouncycastle.asn1.DEROutputStream getDERSubStream() { return null; }
    com.android.internal.org.bouncycastle.asn1.DLOutputStream getDLSubStream() { return null; }
    final void writeDL(int p0) throws java.io.IOException {}
    final void write(int p0) throws java.io.IOException {}
    final void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    void writeElements(com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] p0) throws java.io.IOException {}
    final void writeEncodingDL(boolean p0, int p1, byte p2) throws java.io.IOException {}
    final void writeEncodingDL(boolean p0, int p1, byte[] p2) throws java.io.IOException {}
    final void writeEncodingDL(boolean p0, int p1, byte[] p2, int p3, int p4) throws java.io.IOException {}
    final void writeEncodingDL(boolean p0, int p1, byte p2, byte[] p3, int p4, int p5) throws java.io.IOException {}
    final void writeEncodingDL(boolean p0, int p1, byte[] p2, int p3, int p4, byte p5) throws java.io.IOException {}
    final void writeEncodingDL(boolean p0, int p1, int p2, byte[] p3) throws java.io.IOException {}
    final void writeEncodingIL(boolean p0, int p1, com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] p2) throws java.io.IOException {}
    final void writeIdentifier(boolean p0, int p1) throws java.io.IOException {}
    final void writeIdentifier(boolean p0, int p1, int p2) throws java.io.IOException {}
    void writePrimitive(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0, boolean p1) throws java.io.IOException {}
    void writePrimitives(com.android.internal.org.bouncycastle.asn1.ASN1Primitive[] p0) throws java.io.IOException {}
    static int getLengthOfDL(int p0) { return 0; }
    static int getLengthOfEncodingDL(boolean p0, int p1) { return 0; }
    static int getLengthOfIdentifier(int p0) { return 0; }
}
