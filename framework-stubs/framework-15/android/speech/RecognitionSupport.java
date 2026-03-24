package android.speech;

public final class RecognitionSupport implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.speech.RecognitionSupport> CREATOR = null;
    RecognitionSupport(java.util.List<java.lang.String> p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3) {}
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getInstalledOnDeviceLanguages() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getPendingOnDeviceLanguages() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSupportedOnDeviceLanguages() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getOnlineLanguages() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    RecognitionSupport(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.speech.RecognitionSupport.Builder setInstalledOnDeviceLanguages(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.speech.RecognitionSupport.Builder addInstalledOnDeviceLanguage(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.speech.RecognitionSupport.Builder setPendingOnDeviceLanguages(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.speech.RecognitionSupport.Builder addPendingOnDeviceLanguage(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.speech.RecognitionSupport.Builder setSupportedOnDeviceLanguages(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.speech.RecognitionSupport.Builder addSupportedOnDeviceLanguage(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.speech.RecognitionSupport.Builder setOnlineLanguages(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.speech.RecognitionSupport.Builder addOnlineLanguage(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.speech.RecognitionSupport build() { return null; }
    }
}
