package android.view.textclassifier;

public final class TextSelection implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.textclassifier.TextSelection> CREATOR = null;
    public int getSelectionStartIndex() { return 0; }
    public int getSelectionEndIndex() { return 0; }
    public int getEntityCount() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getEntity(int p0) { return null; }
    public float getConfidenceScore(java.lang.String p0) { return 0.0f; }
    @android.annotation.Nullable
    public java.lang.String getId() { return null; }
    @android.annotation.Nullable
    public android.view.textclassifier.TextClassification getTextClassification() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    public android.view.textclassifier.TextSelection.Builder toBuilder() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, int p1) {}
        @android.annotation.NonNull
        public android.view.textclassifier.TextSelection.Builder setEntityType(java.lang.String p0, float p1) { return null; }
        android.view.textclassifier.TextSelection.Builder setEntityConfidence(android.view.textclassifier.EntityConfidence p0) { return null; }
        @android.annotation.NonNull
        public android.view.textclassifier.TextSelection.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.view.textclassifier.TextSelection.Builder setTextClassification(android.view.textclassifier.TextClassification p0) { return null; }
        @android.annotation.NonNull
        public android.view.textclassifier.TextSelection.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.view.textclassifier.TextSelection build() { return null; }
    }

    public static final class Request implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextSelection.Request> CREATOR = null;
        @android.annotation.NonNull
        public java.lang.CharSequence getText() { return null; }
        public int getStartIndex() { return 0; }
        public int getEndIndex() { return 0; }
        public boolean isDarkLaunchAllowed() { return false; }
        @android.annotation.Nullable
        public android.os.LocaleList getDefaultLocales() { return null; }
        @android.annotation.Nullable
        public java.lang.String getCallingPackageName() { return null; }
        public void setSystemTextClassifierMetadata(android.view.textclassifier.SystemTextClassifierMetadata p0) {}
        @android.annotation.Nullable
        public android.view.textclassifier.SystemTextClassifierMetadata getSystemTextClassifierMetadata() { return null; }
        public boolean shouldIncludeTextClassification() { return false; }
        @android.annotation.NonNull
        public android.os.Bundle getExtras() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            public Builder(java.lang.CharSequence p0, int p1, int p2) {}
            @android.annotation.NonNull
            public android.view.textclassifier.TextSelection.Request.Builder setDefaultLocales(android.os.LocaleList p0) { return null; }
            @android.annotation.NonNull
            public android.view.textclassifier.TextSelection.Request.Builder setDarkLaunchAllowed(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.view.textclassifier.TextSelection.Request.Builder setIncludeTextClassification(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.view.textclassifier.TextSelection.Request.Builder setExtras(android.os.Bundle p0) { return null; }
            @android.annotation.NonNull
            public android.view.textclassifier.TextSelection.Request build() { return null; }
        }
    }
}
