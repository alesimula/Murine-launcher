package android.view.translation;

public final class TranslationResponse implements android.os.Parcelable {
    public static final int TRANSLATION_STATUS_SUCCESS = 0;
    public static final int TRANSLATION_STATUS_UNKNOWN_ERROR = 1;
    public static final int TRANSLATION_STATUS_CONTEXT_UNSUPPORTED = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.translation.TranslationResponse> CREATOR = null;
    public static java.lang.String translationStatusToString(int p0) { return null; }
    TranslationResponse(int p0, android.util.SparseArray<android.view.translation.TranslationResponseValue> p1, android.util.SparseArray<android.view.translation.ViewTranslationResponse> p2, boolean p3) {}
    public int getTranslationStatus() { return 0; }
    @android.annotation.NonNull
    public android.util.SparseArray<android.view.translation.TranslationResponseValue> getTranslationResponseValues() { return null; }
    @android.annotation.NonNull
    public android.util.SparseArray<android.view.translation.ViewTranslationResponse> getViewTranslationResponses() { return null; }
    public boolean isFinalResponse() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    TranslationResponse(android.os.Parcel p0) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
        @java.lang.Deprecated
        public abstract android.view.translation.TranslationResponse.Builder setTranslationStatus(int p0);
        @android.annotation.NonNull
        public android.view.translation.TranslationResponse.Builder setTranslationResponseValue(int p0, android.view.translation.TranslationResponseValue p1) { return null; }
        @android.annotation.NonNull
        public android.view.translation.TranslationResponse.Builder setViewTranslationResponse(int p0, android.view.translation.ViewTranslationResponse p1) { return null; }
    }

    public static final class Builder extends android.view.translation.TranslationResponse.BaseBuilder {
        public Builder(int p0) { super(); }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.view.translation.TranslationResponse.Builder setTranslationStatus(int p0) { return null; }
        @android.annotation.NonNull
        public android.view.translation.TranslationResponse.Builder setTranslationResponseValues(android.util.SparseArray<android.view.translation.TranslationResponseValue> p0) { return null; }
        @android.annotation.NonNull
        public android.view.translation.TranslationResponse.Builder setViewTranslationResponses(android.util.SparseArray<android.view.translation.ViewTranslationResponse> p0) { return null; }
        @android.annotation.NonNull
        public android.view.translation.TranslationResponse.Builder setFinalResponse(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.view.translation.TranslationResponse build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TranslationStatus {
    }
}
