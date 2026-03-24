package android.view.textclassifier;

public final class TextClassification implements android.os.Parcelable {
    public static final android.view.textclassifier.TextClassification EMPTY = null;
    public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassification> CREATOR = null;
    public java.lang.String getText() { return null; }
    public int getEntityCount() { return 0; }
    public java.lang.String getEntity(int p0) { return null; }
    public float getConfidenceScore(java.lang.String p0) { return 0.0f; }
    public java.util.List<android.app.RemoteAction> getActions() { return null; }
    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getIcon() { return null; }
    @java.lang.Deprecated
    public java.lang.CharSequence getLabel() { return null; }
    @java.lang.Deprecated
    public android.content.Intent getIntent() { return null; }
    public android.view.View.OnClickListener getOnClickListener() { return null; }
    public java.lang.String getId() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public android.view.textclassifier.TextClassification.Builder toBuilder() { return null; }
    public java.lang.String toString() { return null; }
    public static android.view.View.OnClickListener createIntentOnClickListener(android.app.PendingIntent p0) { return null; }
    public static android.app.PendingIntent createPendingIntent(android.content.Context p0, android.content.Intent p1, int p2) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Request implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassification.Request> CREATOR = null;
        public java.lang.CharSequence getText() { return null; }
        public int getStartIndex() { return 0; }
        public int getEndIndex() { return 0; }
        public android.os.LocaleList getDefaultLocales() { return null; }
        public java.time.ZonedDateTime getReferenceTime() { return null; }
        public java.lang.String getCallingPackageName() { return null; }
        public void setSystemTextClassifierMetadata(android.view.textclassifier.SystemTextClassifierMetadata p0) {}
        public android.view.textclassifier.SystemTextClassifierMetadata getSystemTextClassifierMetadata() { return null; }
        public android.os.Bundle getExtras() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            public Builder(java.lang.CharSequence p0, int p1, int p2) {}
            public android.view.textclassifier.TextClassification.Request.Builder setDefaultLocales(android.os.LocaleList p0) { return null; }
            public android.view.textclassifier.TextClassification.Request.Builder setReferenceTime(java.time.ZonedDateTime p0) { return null; }
            public android.view.textclassifier.TextClassification.Request.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.view.textclassifier.TextClassification.Request build() { return null; }
        }
    }

    public static final class Builder {
        public Builder() {}
        public android.view.textclassifier.TextClassification.Builder setText(java.lang.String p0) { return null; }
        public android.view.textclassifier.TextClassification.Builder setEntityType(java.lang.String p0, float p1) { return null; }
        android.view.textclassifier.TextClassification.Builder setEntityConfidence(android.view.textclassifier.EntityConfidence p0) { return null; }
        public android.view.textclassifier.TextClassification.Builder clearEntityTypes() { return null; }
        public android.view.textclassifier.TextClassification.Builder addAction(android.app.RemoteAction p0) { return null; }
        public android.view.textclassifier.TextClassification.Builder addActions(java.util.Collection<android.app.RemoteAction> p0) { return null; }
        public android.view.textclassifier.TextClassification.Builder clearActions() { return null; }
        @java.lang.Deprecated
        public android.view.textclassifier.TextClassification.Builder setIcon(android.graphics.drawable.Drawable p0) { return null; }
        @java.lang.Deprecated
        public android.view.textclassifier.TextClassification.Builder setLabel(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.view.textclassifier.TextClassification.Builder setIntent(android.content.Intent p0) { return null; }
        @java.lang.Deprecated
        public android.view.textclassifier.TextClassification.Builder setOnClickListener(android.view.View.OnClickListener p0) { return null; }
        public android.view.textclassifier.TextClassification.Builder setId(java.lang.String p0) { return null; }
        public android.view.textclassifier.TextClassification.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.view.textclassifier.TextClassification build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface IntentType {
        public static final int UNSUPPORTED = -1;
        public static final int ACTIVITY = 0;
        public static final int SERVICE = 1;
    }
}
