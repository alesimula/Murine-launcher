package android.location;

@java.lang.Deprecated
public final class GpsSatellite {
    boolean mValid;
    boolean mHasEphemeris;
    boolean mHasAlmanac;
    boolean mUsedInFix;
    int mPrn;
    float mSnr;
    float mElevation;
    float mAzimuth;
    GpsSatellite(int p0) {}
    void setStatus(android.location.GpsSatellite p0) {}
    public int getPrn() { return 0; }
    public float getSnr() { return 0.0f; }
    public float getElevation() { return 0.0f; }
    public float getAzimuth() { return 0.0f; }
    public boolean hasEphemeris() { return false; }
    public boolean hasAlmanac() { return false; }
    public boolean usedInFix() { return false; }
}
