package android.view.translation;

public final class TranslationResponse implements android.os.Parcelable {
    public static final int TRANSLATION_STATUS_SUCCESS = 0;
    public static final int TRANSLATION_STATUS_UNKNOWN_ERROR = 1;
    public static final int TRANSLATION_STATUS_CONTEXT_UNSUPPORTED = 2;
    private final int mTranslationStatus = 0;
    private final android.util.SparseArray<android.view.translation.TranslationResponseValue> mTranslationResponseValues = null;
    private final android.util.SparseArray<android.view.translation.ViewTranslationResponse> mViewTranslationResponses = null;
    private final boolean mFinalResponse = false;
    public static final android.os.Parcelable.Creator<android.view.translation.TranslationResponse> CREATOR = null;
    private static android.util.SparseArray<android.view.translation.TranslationResponseValue> defaultTranslationResponseValues() { return null; }
    private static android.util.SparseArray<android.view.translation.ViewTranslationResponse> defaultViewTranslationResponses() { return null; }
    private static boolean defaultFinalResponse() { return false; }
    public static java.lang.String translationStatusToString(int p0) { return null; }
    TranslationResponse(int p0, android.util.SparseArray<android.view.translation.TranslationResponseValue> p1, android.util.SparseArray<android.view.translation.ViewTranslationResponse> p2, boolean p3) {}
    public int getTranslationStatus() { return 0; }
    public android.util.SparseArray<android.view.translation.TranslationResponseValue> getTranslationResponseValues() { return null; }
    public android.util.SparseArray<android.view.translation.ViewTranslationResponse> getViewTranslationResponses() { return null; }
    public boolean isFinalResponse() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    TranslationResponse(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
        @java.lang.Deprecated
        public abstract android.view.translation.TranslationResponse.Builder setTranslationStatus(int p0);
        public android.view.translation.TranslationResponse.Builder setTranslationResponseValue(int p0, android.view.translation.TranslationResponseValue p1) { return null; }
        public android.view.translation.TranslationResponse.Builder setViewTranslationResponse(int p0, android.view.translation.ViewTranslationResponse p1) { return null; }
    }

    public static final class Builder extends android.view.translation.TranslationResponse.BaseBuilder {
        private int mTranslationStatus;
        private android.util.SparseArray<android.view.translation.TranslationResponseValue> mTranslationResponseValues;
        private android.util.SparseArray<android.view.translation.ViewTranslationResponse> mViewTranslationResponses;
        private boolean mFinalResponse;
        private long mBuilderFieldsSet;
        public Builder(int p0) { super(); }
        @java.lang.Deprecated
        public android.view.translation.TranslationResponse.Builder setTranslationStatus(int p0) { return null; }
        public android.view.translation.TranslationResponse.Builder setTranslationResponseValues(android.util.SparseArray<android.view.translation.TranslationResponseValue> p0) { return null; }
        public android.view.translation.TranslationResponse.Builder setViewTranslationResponses(android.util.SparseArray<android.view.translation.ViewTranslationResponse> p0) { return null; }
        public android.view.translation.TranslationResponse.Builder setFinalResponse(boolean p0) { return null; }
        public android.view.translation.TranslationResponse build() { return null; }
        private void checkNotUsed() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TranslationStatus {
    }
}
