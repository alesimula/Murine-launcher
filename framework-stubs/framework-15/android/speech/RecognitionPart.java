package android.speech;

public final class RecognitionPart implements android.os.Parcelable {
    public static final int CONFIDENCE_LEVEL_UNKNOWN = 0;
    public static final int CONFIDENCE_LEVEL_LOW = 1;
    public static final int CONFIDENCE_LEVEL_MEDIUM_LOW = 2;
    public static final int CONFIDENCE_LEVEL_MEDIUM = 3;
    public static final int CONFIDENCE_LEVEL_MEDIUM_HIGH = 4;
    public static final int CONFIDENCE_LEVEL_HIGH = 5;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.speech.RecognitionPart> CREATOR = null;
    public static java.lang.String confidenceLevelToString(int p0) { return null; }
    RecognitionPart(java.lang.String p0, java.lang.String p1, long p2, int p3) {}
    @android.annotation.NonNull
    public java.lang.String getRawText() { return null; }
    @android.annotation.Nullable
    public java.lang.String getFormattedText() { return null; }
    public long getTimestampMillis() { return 0L; }
    public int getConfidenceLevel() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    RecognitionPart(android.os.Parcel p0) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
        @android.annotation.NonNull
        public android.speech.RecognitionPart.Builder setFormattedText(java.lang.String p0) { return null; }
    }

    public static final class Builder extends android.speech.RecognitionPart.BaseBuilder {
        public Builder(java.lang.String p0) { super(); }
        @android.annotation.NonNull
        public android.speech.RecognitionPart.Builder setRawText(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.speech.RecognitionPart.Builder setTimestampMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.speech.RecognitionPart.Builder setConfidenceLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.speech.RecognitionPart build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConfidenceLevel {
    }
}
