package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class FrontendInfo {
    public int getId() { return 0; }
    public int getType() { return 0; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public android.util.Range<java.lang.Integer> getFrequencyRange() { return null; }
    @android.annotation.NonNull
    public android.util.Range<java.lang.Long> getFrequencyRangeLong() { return null; }
    @android.annotation.NonNull
    public android.util.Range<java.lang.Integer> getSymbolRateRange() { return null; }
    @java.lang.Deprecated
    public int getAcquireRange() { return 0; }
    public long getAcquireRangeLong() { return 0L; }
    public int getExclusiveGroupId() { return 0; }
    @android.annotation.NonNull
    public int[] getStatusCapabilities() { return null; }
    @android.annotation.NonNull
    public android.media.tv.tuner.frontend.FrontendCapabilities getFrontendCapabilities() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
