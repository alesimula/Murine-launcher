package com.android.internal.org.bouncycastle.operator;

public interface PBEMacCalculatorProvider {
    public com.android.internal.org.bouncycastle.operator.MacCalculator get(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, char[] p1) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException;
}
