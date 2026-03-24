package com.android.internal.org.bouncycastle.math.ec;

public interface ECLookupTable {
    public int getSize();
    public com.android.internal.org.bouncycastle.math.ec.ECPoint lookup(int p0);
    public com.android.internal.org.bouncycastle.math.ec.ECPoint lookupVar(int p0);
}
