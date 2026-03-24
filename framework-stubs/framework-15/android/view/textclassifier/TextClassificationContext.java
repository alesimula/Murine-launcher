package android.view.textclassifier;

public final class TextClassificationContext implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassificationContext> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    void setSystemTextClassifierMetadata(android.view.textclassifier.SystemTextClassifierMetadata p0) {}
    @android.annotation.Nullable
    public android.view.textclassifier.SystemTextClassifierMetadata getSystemTextClassifierMetadata() { return null; }
    @android.annotation.NonNull
    public java.lang.String getWidgetType() { return null; }
    @android.annotation.Nullable
    public java.lang.String getWidgetVersion() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.view.textclassifier.TextClassificationContext.Builder setWidgetVersion(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.view.textclassifier.TextClassificationContext build() { return null; }
    }
}
