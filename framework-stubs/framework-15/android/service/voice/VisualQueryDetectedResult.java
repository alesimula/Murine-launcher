package android.service.voice;

@android.annotation.SystemApi
@android.annotation.SuppressLint("UnflaggedApi")
public final class VisualQueryDetectedResult implements android.os.Parcelable {
    @android.annotation.SuppressLint("UnflaggedApi")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.voice.VisualQueryDetectedResult> CREATOR = null;
    @android.annotation.SuppressLint("UnflaggedApi")
    public static int getMaxSpeakerId() { return 0; }
    public android.service.voice.VisualQueryDetectedResult.Builder buildUpon() { return null; }
    VisualQueryDetectedResult(java.lang.String p0, int p1, byte[] p2) {}
    @android.annotation.SuppressLint("UnflaggedApi")
    @android.annotation.NonNull
    public java.lang.String getPartialQuery() { return null; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public int getSpeakerId() { return 0; }
    @android.annotation.SuppressLint("UnflaggedApi")
    @android.annotation.Nullable
    public byte[] getAccessibilityDetectionData() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public int describeContents() { return 0; }
    VisualQueryDetectedResult(android.os.Parcel p0) {}

    @android.annotation.SuppressLint("UnflaggedApi")
    public static final class Builder {
        @android.annotation.SuppressLint("UnflaggedApi")
        public Builder() {}
        @android.annotation.SuppressLint("UnflaggedApi")
        @android.annotation.NonNull
        public android.service.voice.VisualQueryDetectedResult.Builder setPartialQuery(java.lang.String p0) { return null; }
        @android.annotation.SuppressLint("UnflaggedApi")
        @android.annotation.NonNull
        public android.service.voice.VisualQueryDetectedResult.Builder setSpeakerId(int p0) { return null; }
        @android.annotation.SuppressLint("UnflaggedApi")
        @android.annotation.NonNull
        public android.service.voice.VisualQueryDetectedResult.Builder setAccessibilityDetectionData(byte... p0) { return null; }
        @android.annotation.SuppressLint("UnflaggedApi")
        @android.annotation.NonNull
        public android.service.voice.VisualQueryDetectedResult build() { return null; }
    }
}
