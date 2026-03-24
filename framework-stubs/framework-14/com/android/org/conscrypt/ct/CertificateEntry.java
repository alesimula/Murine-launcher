package com.android.org.conscrypt.ct;

public class CertificateEntry {
    public static com.android.org.conscrypt.ct.CertificateEntry createForPrecertificate(byte[] p0, byte[] p1) { return null; }
    public static com.android.org.conscrypt.ct.CertificateEntry createForPrecertificate(com.android.org.conscrypt.OpenSSLX509Certificate p0, com.android.org.conscrypt.OpenSSLX509Certificate p1) throws java.security.cert.CertificateException { return null; }
    public static com.android.org.conscrypt.ct.CertificateEntry createForX509Certificate(byte[] p0) { return null; }
    public static com.android.org.conscrypt.ct.CertificateEntry createForX509Certificate(java.security.cert.X509Certificate p0) throws java.security.cert.CertificateEncodingException { return null; }
    public com.android.org.conscrypt.ct.CertificateEntry.LogEntryType getEntryType() { return null; }
    public byte[] getCertificate() { return null; }
    public byte[] getIssuerKeyHash() { return null; }
    public void encode(java.io.OutputStream p0) throws com.android.org.conscrypt.ct.SerializationException {}

    public static enum LogEntryType {
        X509_ENTRY,
        PRECERT_ENTRY;
    }
}
