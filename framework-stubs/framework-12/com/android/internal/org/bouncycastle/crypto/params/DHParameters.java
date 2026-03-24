package com.android.internal.org.bouncycastle.crypto.params;

public class DHParameters implements com.android.internal.org.bouncycastle.crypto.CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;
    private java.math.BigInteger g;
    private java.math.BigInteger p;
    private java.math.BigInteger q;
    private java.math.BigInteger j;
    private int m;
    private int l;
    private com.android.internal.org.bouncycastle.crypto.params.DHValidationParameters validation;
    private static int getDefaultMParam(int p0) { return 0; }
    public DHParameters(java.math.BigInteger p0, java.math.BigInteger p1) {}
    public DHParameters(java.math.BigInteger p0, java.math.BigInteger p1, java.math.BigInteger p2) {}
    public DHParameters(java.math.BigInteger p0, java.math.BigInteger p1, java.math.BigInteger p2, int p3) {}
    public DHParameters(java.math.BigInteger p0, java.math.BigInteger p1, java.math.BigInteger p2, int p3, int p4) {}
    public DHParameters(java.math.BigInteger p0, java.math.BigInteger p1, java.math.BigInteger p2, java.math.BigInteger p3, com.android.internal.org.bouncycastle.crypto.params.DHValidationParameters p4) {}
    public DHParameters(java.math.BigInteger p0, java.math.BigInteger p1, java.math.BigInteger p2, int p3, int p4, java.math.BigInteger p5, com.android.internal.org.bouncycastle.crypto.params.DHValidationParameters p6) {}
    public java.math.BigInteger getP() { return null; }
    public java.math.BigInteger getG() { return null; }
    public java.math.BigInteger getQ() { return null; }
    public java.math.BigInteger getJ() { return null; }
    public int getM() { return 0; }
    public int getL() { return 0; }
    public com.android.internal.org.bouncycastle.crypto.params.DHValidationParameters getValidationParameters() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
