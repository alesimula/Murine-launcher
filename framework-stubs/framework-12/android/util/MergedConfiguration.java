package android.util;

public class MergedConfiguration implements android.os.Parcelable {
    private final android.content.res.Configuration mGlobalConfig = null;
    private final android.content.res.Configuration mOverrideConfig = null;
    private final android.content.res.Configuration mMergedConfig = null;
    public static final android.os.Parcelable.Creator<android.util.MergedConfiguration> CREATOR = null;
    public MergedConfiguration() {}
    public MergedConfiguration(android.content.res.Configuration p0, android.content.res.Configuration p1) {}
    public MergedConfiguration(android.content.res.Configuration p0) {}
    public MergedConfiguration(android.util.MergedConfiguration p0) {}
    private MergedConfiguration(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void setConfiguration(android.content.res.Configuration p0, android.content.res.Configuration p1) {}
    public void setGlobalConfiguration(android.content.res.Configuration p0) {}
    public void setOverrideConfiguration(android.content.res.Configuration p0) {}
    public void setTo(android.util.MergedConfiguration p0) {}
    public void unset() {}
    public android.content.res.Configuration getGlobalConfiguration() { return null; }
    public android.content.res.Configuration getOverrideConfiguration() { return null; }
    public android.content.res.Configuration getMergedConfiguration() { return null; }
    private void updateMergedConfig() {}
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
}
