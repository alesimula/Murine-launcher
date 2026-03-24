package com.android.internal.org.bouncycastle.math.ec;

public abstract class AbstractECMultiplier implements com.android.internal.org.bouncycastle.math.ec.ECMultiplier {
    public AbstractECMultiplier() {}
    public com.android.internal.org.bouncycastle.math.ec.ECPoint multiply(com.android.internal.org.bouncycastle.math.ec.ECPoint p0, java.math.BigInteger p1) { return null; }
    protected abstract com.android.internal.org.bouncycastle.math.ec.ECPoint multiplyPositive(com.android.internal.org.bouncycastle.math.ec.ECPoint p0, java.math.BigInteger p1);
    protected com.android.internal.org.bouncycastle.math.ec.ECPoint checkResult(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return null; }
}
