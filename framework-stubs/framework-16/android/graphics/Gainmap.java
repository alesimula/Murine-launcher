package android.graphics;

public final class Gainmap implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.iso_gainmap_apis")
    public static final int GAINMAP_DIRECTION_SDR_TO_HDR = 0;
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.iso_gainmap_apis")
    public static final int GAINMAP_DIRECTION_HDR_TO_SDR = 1;
    final long mNativePtr = 0L;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.graphics.Gainmap> CREATOR = null;
    public Gainmap(android.graphics.Bitmap p0) {}
    public Gainmap(android.graphics.Gainmap p0, android.graphics.Bitmap p1) {}
    public android.graphics.Gainmap asShared() { return null; }
    @android.annotation.NonNull
    public android.graphics.Bitmap getGainmapContents() { return null; }
    public void setGainmapContents(android.graphics.Bitmap p0) {}
    public void setRatioMin(float p0, float p1, float p2) {}
    @android.annotation.NonNull
    public float[] getRatioMin() { return null; }
    public void setRatioMax(float p0, float p1, float p2) {}
    @android.annotation.NonNull
    public float[] getRatioMax() { return null; }
    public void setGamma(float p0, float p1, float p2) {}
    @android.annotation.NonNull
    public float[] getGamma() { return null; }
    public void setEpsilonSdr(float p0, float p1, float p2) {}
    @android.annotation.NonNull
    public float[] getEpsilonSdr() { return null; }
    public void setEpsilonHdr(float p0, float p1, float p2) {}
    @android.annotation.NonNull
    public float[] getEpsilonHdr() { return null; }
    public void setDisplayRatioForFullHdr(float p0) {}
    @android.annotation.NonNull
    public float getDisplayRatioForFullHdr() { return 0.0f; }
    public void setMinDisplayRatioForHdrTransition(float p0) {}
    @android.annotation.NonNull
    public float getMinDisplayRatioForHdrTransition() { return 0.0f; }
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.iso_gainmap_apis")
    public void setAlternativeImagePrimaries(android.graphics.ColorSpace p0) {}
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.iso_gainmap_apis")
    @android.annotation.Nullable
    public android.graphics.ColorSpace getAlternativeImagePrimaries() { return null; }
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.iso_gainmap_apis")
    public void setGainmapDirection(int p0) {}
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.iso_gainmap_apis")
    public int getGainmapDirection() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GainmapDirection {
    }

    private static class NoImagePreloadHolder {
    }
}
