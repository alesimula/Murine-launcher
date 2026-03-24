package android.graphics;

public final class Gainmap implements android.os.Parcelable {
    final long mNativePtr = 0L;
    public static final android.os.Parcelable.Creator<android.graphics.Gainmap> CREATOR = null;
    public Gainmap(android.graphics.Bitmap p0) {}
    public Gainmap(android.graphics.Gainmap p0, android.graphics.Bitmap p1) {}
    public android.graphics.Bitmap getGainmapContents() { return null; }
    public void setGainmapContents(android.graphics.Bitmap p0) {}
    public void setRatioMin(float p0, float p1, float p2) {}
    public float[] getRatioMin() { return null; }
    public void setRatioMax(float p0, float p1, float p2) {}
    public float[] getRatioMax() { return null; }
    public void setGamma(float p0, float p1, float p2) {}
    public float[] getGamma() { return null; }
    public void setEpsilonSdr(float p0, float p1, float p2) {}
    public float[] getEpsilonSdr() { return null; }
    public void setEpsilonHdr(float p0, float p1, float p2) {}
    public float[] getEpsilonHdr() { return null; }
    public void setDisplayRatioForFullHdr(float p0) {}
    public float getDisplayRatioForFullHdr() { return 0.0f; }
    public void setMinDisplayRatioForHdrTransition(float p0) {}
    public float getMinDisplayRatioForHdrTransition() { return 0.0f; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static class NoImagePreloadHolder {
    }
}
