package android.view.translation;

public final class TranslationResponseValue implements android.os.Parcelable {
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_ERROR = 1;
    public static final java.lang.String EXTRA_DEFINITIONS = "android.view.translation.extra.DEFINITIONS";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.translation.TranslationResponseValue> CREATOR = null;
    @android.annotation.NonNull
    public static android.view.translation.TranslationResponseValue forError() { return null; }
    public static java.lang.String statusToString(int p0) { return null; }
    TranslationResponseValue(int p0, java.lang.CharSequence p1, android.os.Bundle p2, java.lang.CharSequence p3) {}
    public int getStatusCode() { return 0; }
    @android.annotation.Nullable
    public java.lang.CharSequence getText() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getTransliteration() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    TranslationResponseValue(android.os.Parcel p0) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
    }

    public static final class Builder extends android.view.translation.TranslationResponseValue.BaseBuilder {
        public Builder(int p0) { super(); }
        @android.annotation.NonNull
        public android.view.translation.TranslationResponseValue.Builder setText(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.view.translation.TranslationResponseValue.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.view.translation.TranslationResponseValue.Builder setTransliteration(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.view.translation.TranslationResponseValue build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
