package android.view.translation;

public final class TranslationContext implements android.os.Parcelable {
    public static final int FLAG_LOW_LATENCY = 1;
    public static final int FLAG_TRANSLITERATION = 2;
    public static final int FLAG_DEFINITIONS = 4;
    private final android.view.translation.TranslationSpec mSourceSpec = null;
    private final android.view.translation.TranslationSpec mTargetSpec = null;
    private final int mTranslationFlags = 0;
    public static final android.os.Parcelable.Creator<android.view.translation.TranslationContext> CREATOR = null;
    private static int defaultTranslationFlags() { return 0; }
    public static java.lang.String translationFlagToString(int p0) { return null; }
    static java.lang.String singleTranslationFlagToString(int p0) { return null; }
    TranslationContext(android.view.translation.TranslationSpec p0, android.view.translation.TranslationSpec p1, int p2) {}
    public android.view.translation.TranslationSpec getSourceSpec() { return null; }
    public android.view.translation.TranslationSpec getTargetSpec() { return null; }
    public int getTranslationFlags() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    TranslationContext(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
    }

    public static final class Builder extends android.view.translation.TranslationContext.BaseBuilder {
        private android.view.translation.TranslationSpec mSourceSpec;
        private android.view.translation.TranslationSpec mTargetSpec;
        private int mTranslationFlags;
        private long mBuilderFieldsSet;
        public Builder(android.view.translation.TranslationSpec p0, android.view.translation.TranslationSpec p1) { super(); }
        public android.view.translation.TranslationContext.Builder setTranslationFlags(int p0) { return null; }
        public android.view.translation.TranslationContext build() { return null; }
        private void checkNotUsed() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TranslationFlag {
    }
}
