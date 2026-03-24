package android.service.voice;

@android.annotation.SystemApi
public final class HotwordRejectedResult implements android.os.Parcelable {
    public static final int CONFIDENCE_LEVEL_NONE = 0;
    public static final int CONFIDENCE_LEVEL_LOW = 1;
    public static final int CONFIDENCE_LEVEL_MEDIUM = 2;
    public static final int CONFIDENCE_LEVEL_HIGH = 3;
    @android.service.voice.HotwordRejectedResult.HotwordConfidenceLevelValue
    private final int mConfidenceLevel = 0;
    public static final android.os.Parcelable.Creator<android.service.voice.HotwordRejectedResult> CREATOR = null;
    private static int defaultConfidenceLevel() { return 0; }
    public static java.lang.String confidenceLevelToString(int p0) { return null; }
    HotwordRejectedResult(int p0) {}
    @android.service.voice.HotwordRejectedResult.HotwordConfidenceLevelValue
    public int getConfidenceLevel() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    HotwordRejectedResult(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    public static final class Builder {
        @android.service.voice.HotwordRejectedResult.HotwordConfidenceLevelValue
        private int mConfidenceLevel;
        private long mBuilderFieldsSet;
        public Builder() {}
        public android.service.voice.HotwordRejectedResult.Builder setConfidenceLevel(int p0) { return null; }
        public android.service.voice.HotwordRejectedResult build() { return null; }
        private void checkNotUsed() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConfidenceLevel {
    }

    static @interface HotwordConfidenceLevelValue {
    }
}
