package com.android.internal.org.bouncycastle.math.ec;

public class WNafPreCompInfo implements com.android.internal.org.bouncycastle.math.ec.PreCompInfo {
    volatile int promotionCountdown;
    protected int confWidth;
    protected com.android.internal.org.bouncycastle.math.ec.ECPoint[] preComp;
    protected com.android.internal.org.bouncycastle.math.ec.ECPoint[] preCompNeg;
    protected com.android.internal.org.bouncycastle.math.ec.ECPoint twice;
    protected int width;
    public WNafPreCompInfo() {}
    int decrementPromotionCountdown() { return 0; }
    int getPromotionCountdown() { return 0; }
    void setPromotionCountdown(int p0) {}
    public boolean isPromoted() { return false; }
    public int getConfWidth() { return 0; }
    public void setConfWidth(int p0) {}
    public com.android.internal.org.bouncycastle.math.ec.ECPoint[] getPreComp() { return null; }
    public void setPreComp(com.android.internal.org.bouncycastle.math.ec.ECPoint[] p0) {}
    public com.android.internal.org.bouncycastle.math.ec.ECPoint[] getPreCompNeg() { return null; }
    public void setPreCompNeg(com.android.internal.org.bouncycastle.math.ec.ECPoint[] p0) {}
    public com.android.internal.org.bouncycastle.math.ec.ECPoint getTwice() { return null; }
    public void setTwice(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) {}
    public int getWidth() { return 0; }
    public void setWidth(int p0) {}
}
