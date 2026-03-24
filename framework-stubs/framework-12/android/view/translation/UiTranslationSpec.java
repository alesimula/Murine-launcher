package android.view.translation;

@android.annotation.SystemApi
public final class UiTranslationSpec implements android.os.Parcelable {
    private boolean mShouldPadContentForCompat;
    public static final android.os.Parcelable.Creator<android.view.translation.UiTranslationSpec> CREATOR = null;
    public boolean shouldPadContentForCompat() { return false; }
    UiTranslationSpec(boolean p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    UiTranslationSpec(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    public static final class Builder {
        private boolean mShouldPadContentForCompat;
        private long mBuilderFieldsSet;
        public Builder() {}
        public android.view.translation.UiTranslationSpec.Builder setShouldPadContentForCompat(boolean p0) { return null; }
        public android.view.translation.UiTranslationSpec build() { return null; }
        private void checkNotUsed() {}
    }
}
