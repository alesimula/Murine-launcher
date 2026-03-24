package android.view.translation;

public final class TranslationContext implements android.os.Parcelable {
    public static final int FLAG_LOW_LATENCY = 1;
    public static final int FLAG_TRANSLITERATION = 2;
    public static final int FLAG_DEFINITIONS = 4;
    public static final android.os.Parcelable.Creator<android.view.translation.TranslationContext> CREATOR = null;
    @android.annotation.SystemApi
    public android.app.assist.ActivityId getActivityId() { return null; }
    public static java.lang.String translationFlagToString(int p0) { return null; }
    static java.lang.String singleTranslationFlagToString(int p0) { return null; }
    TranslationContext(android.view.translation.TranslationSpec p0, android.view.translation.TranslationSpec p1, int p2, android.app.assist.ActivityId p3) {}
    public android.view.translation.TranslationSpec getSourceSpec() { return null; }
    public android.view.translation.TranslationSpec getTargetSpec() { return null; }
    public int getTranslationFlags() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    TranslationContext(android.os.Parcel p0) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
    }

    public static final class Builder extends android.view.translation.TranslationContext.BaseBuilder {
        public Builder(android.view.translation.TranslationSpec p0, android.view.translation.TranslationSpec p1) { super(); }
        public android.view.translation.TranslationContext.Builder setTranslationFlags(int p0) { return null; }
        public android.view.translation.TranslationContext.Builder setActivityId(android.app.assist.ActivityId p0) { return null; }
        public android.view.translation.TranslationContext build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TranslationFlag {
    }
}
