package com.android.internal.org.bouncycastle.operator.jcajce;

public class JcaDigestCalculatorProviderBuilder {
    public JcaDigestCalculatorProviderBuilder() {}
    public com.android.internal.org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder setProvider(java.security.Provider p0) { return null; }
    public com.android.internal.org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder setProvider(java.lang.String p0) { return null; }
    public com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider build() throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }

    private class DigestOutputStream extends java.io.OutputStream {
        DigestOutputStream(com.android.internal.org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder p0, java.security.MessageDigest p1) { super(); }
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void write(byte[] p0) throws java.io.IOException {}
        public void write(int p0) throws java.io.IOException {}
        byte[] getDigest() { return null; }
    }
}
