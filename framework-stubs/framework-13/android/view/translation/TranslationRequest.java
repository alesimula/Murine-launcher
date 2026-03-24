package android.view.translation;

public final class TranslationRequest implements android.os.Parcelable {
    public static final int FLAG_TRANSLATION_RESULT = 1;
    public static final int FLAG_DICTIONARY_RESULT = 2;
    public static final int FLAG_TRANSLITERATION_RESULT = 4;
    public static final int FLAG_PARTIAL_RESPONSES = 8;
    public static final android.os.Parcelable.Creator<android.view.translation.TranslationRequest> CREATOR = null;
    public static java.lang.String requestFlagsToString(int p0) { return null; }
    static java.lang.String singleRequestFlagsToString(int p0) { return null; }
    TranslationRequest(int p0, java.util.List<android.view.translation.TranslationRequestValue> p1, java.util.List<android.view.translation.ViewTranslationRequest> p2) {}
    public int getFlags() { return 0; }
    public java.util.List<android.view.translation.TranslationRequestValue> getTranslationRequestValues() { return null; }
    public java.util.List<android.view.translation.ViewTranslationRequest> getViewTranslationRequests() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    TranslationRequest(android.os.Parcel p0) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
        @java.lang.Deprecated
        public abstract android.view.translation.TranslationRequest.Builder addTranslationRequestValue(android.view.translation.TranslationRequestValue p0);
        @java.lang.Deprecated
        public abstract android.view.translation.TranslationRequest.Builder addViewTranslationRequest(android.view.translation.ViewTranslationRequest p0);
    }

    public static final class Builder extends android.view.translation.TranslationRequest.BaseBuilder {
        public Builder() { super(); }
        public android.view.translation.TranslationRequest.Builder setFlags(int p0) { return null; }
        public android.view.translation.TranslationRequest.Builder setTranslationRequestValues(java.util.List<android.view.translation.TranslationRequestValue> p0) { return null; }
        @java.lang.Deprecated
        public android.view.translation.TranslationRequest.Builder addTranslationRequestValue(android.view.translation.TranslationRequestValue p0) { return null; }
        public android.view.translation.TranslationRequest.Builder setViewTranslationRequests(java.util.List<android.view.translation.ViewTranslationRequest> p0) { return null; }
        @java.lang.Deprecated
        public android.view.translation.TranslationRequest.Builder addViewTranslationRequest(android.view.translation.ViewTranslationRequest p0) { return null; }
        public android.view.translation.TranslationRequest build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestFlags {
    }
}
