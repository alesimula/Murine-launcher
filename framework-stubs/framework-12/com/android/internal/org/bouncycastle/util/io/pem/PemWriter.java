package com.android.internal.org.bouncycastle.util.io.pem;

public class PemWriter extends java.io.BufferedWriter {
    private static final int LINE_LENGTH = 64;
    private final int nlLength = 0;
    private char[] buf;
    public PemWriter(java.io.Writer p0) { super((java.io.Writer)null); }
    public int getOutputSize(com.android.internal.org.bouncycastle.util.io.pem.PemObject p0) { return 0; }
    public void writeObject(com.android.internal.org.bouncycastle.util.io.pem.PemObjectGenerator p0) throws java.io.IOException {}
    private void writeEncoded(byte[] p0) throws java.io.IOException {}
    private void writePreEncapsulationBoundary(java.lang.String p0) throws java.io.IOException {}
    private void writePostEncapsulationBoundary(java.lang.String p0) throws java.io.IOException {}
}
