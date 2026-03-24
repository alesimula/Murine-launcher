package com.android.org.conscrypt.ct;

public class SignedCertificateTimestamp {
    public SignedCertificateTimestamp(com.android.org.conscrypt.ct.SignedCertificateTimestamp.Version p0, byte[] p1, long p2, byte[] p3, com.android.org.conscrypt.ct.DigitallySigned p4, com.android.org.conscrypt.ct.SignedCertificateTimestamp.Origin p5) {}
    public com.android.org.conscrypt.ct.SignedCertificateTimestamp.Version getVersion() { return null; }
    public byte[] getLogID() { return null; }
    public long getTimestamp() { return 0L; }
    public byte[] getExtensions() { return null; }
    public com.android.org.conscrypt.ct.DigitallySigned getSignature() { return null; }
    public com.android.org.conscrypt.ct.SignedCertificateTimestamp.Origin getOrigin() { return null; }
    public static com.android.org.conscrypt.ct.SignedCertificateTimestamp decode(java.io.InputStream p0, com.android.org.conscrypt.ct.SignedCertificateTimestamp.Origin p1) throws com.android.org.conscrypt.ct.SerializationException { return null; }
    public static com.android.org.conscrypt.ct.SignedCertificateTimestamp decode(byte[] p0, com.android.org.conscrypt.ct.SignedCertificateTimestamp.Origin p1) throws com.android.org.conscrypt.ct.SerializationException { return null; }
    public void encodeTBS(java.io.OutputStream p0, com.android.org.conscrypt.ct.CertificateEntry p1) throws com.android.org.conscrypt.ct.SerializationException {}
    public byte[] encodeTBS(com.android.org.conscrypt.ct.CertificateEntry p0) throws com.android.org.conscrypt.ct.SerializationException { return null; }

    public static enum Origin {
        EMBEDDED,
        TLS_EXTENSION,
        OCSP_RESPONSE;
    }

    public static enum SignatureType {
        CERTIFICATE_TIMESTAMP,
        TREE_HASH;
    }

    public static enum Version {
        V1;
    }
}
