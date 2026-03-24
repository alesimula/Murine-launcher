package com.android.internal.org.bouncycastle.math.ec.endo;

public interface ECEndomorphism {
    public com.android.internal.org.bouncycastle.math.ec.ECPointMap getPointMap();
    public boolean hasEfficientPointMap();
}
