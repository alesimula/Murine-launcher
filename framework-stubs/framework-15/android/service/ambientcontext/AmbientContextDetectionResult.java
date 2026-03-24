package android.service.ambientcontext;

@android.annotation.SystemApi
public final class AmbientContextDetectionResult implements android.os.Parcelable {
    public static final java.lang.String RESULT_RESPONSE_BUNDLE_KEY = "android.app.ambientcontext.AmbientContextDetectionResultBundleKey";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.ambientcontext.AmbientContextDetectionResult> CREATOR = null;
    AmbientContextDetectionResult(java.util.List<android.app.ambientcontext.AmbientContextEvent> p0, java.lang.String p1) {}
    @android.annotation.SuppressLint("ConcreteCollection")
    @android.annotation.NonNull
    public java.util.List<android.app.ambientcontext.AmbientContextEvent> getEvents() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    AmbientContextDetectionResult(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.service.ambientcontext.AmbientContextDetectionResult.Builder addEvent(android.app.ambientcontext.AmbientContextEvent p0) { return null; }
        @android.annotation.NonNull
        public android.service.ambientcontext.AmbientContextDetectionResult.Builder addEvents(java.util.List<android.app.ambientcontext.AmbientContextEvent> p0) { return null; }
        @android.annotation.NonNull
        public android.service.ambientcontext.AmbientContextDetectionResult.Builder clearEvents() { return null; }
        @android.annotation.NonNull
        public android.service.ambientcontext.AmbientContextDetectionResult build() { return null; }
    }
}
