package com.android.internal.org.bouncycastle.operator.bc;

public class BcDigestCalculatorProvider implements com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider {
    public BcDigestCalculatorProvider() {}
    public com.android.internal.org.bouncycastle.operator.DigestCalculator get(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }

    private static class DigestOutputStream extends java.io.OutputStream {
        DigestOutputStream(com.android.internal.org.bouncycastle.crypto.Digest p0) { super(); }
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void write(byte[] p0) throws java.io.IOException {}
        public void write(int p0) throws java.io.IOException {}
        byte[] getDigest() { return null; }
    }
}
