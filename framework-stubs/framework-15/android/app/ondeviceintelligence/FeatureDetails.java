package android.app.ondeviceintelligence;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence")
public final class FeatureDetails implements android.os.Parcelable {
    public static final int FEATURE_STATUS_UNAVAILABLE = 0;
    public static final int FEATURE_STATUS_DOWNLOADABLE = 1;
    public static final int FEATURE_STATUS_DOWNLOADING = 2;
    public static final int FEATURE_STATUS_AVAILABLE = 3;
    public static final int FEATURE_STATUS_SERVICE_UNAVAILABLE = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.ondeviceintelligence.FeatureDetails> CREATOR = null;
    public FeatureDetails(int p0, android.os.PersistableBundle p1) {}
    public FeatureDetails(int p0) {}
    public int getFeatureStatus() { return 0; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getFeatureDetailParams() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    FeatureDetails(android.os.Parcel p0) {}

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
