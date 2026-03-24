package android.content;

public class ClipDescription implements android.os.Parcelable {
    public static final java.lang.String MIMETYPE_TEXT_PLAIN = "text/plain";
    public static final java.lang.String MIMETYPE_TEXT_HTML = "text/html";
    public static final java.lang.String MIMETYPE_TEXT_URILIST = "text/uri-list";
    public static final java.lang.String MIMETYPE_TEXT_INTENT = "text/vnd.android.intent";
    public static final java.lang.String MIMETYPE_APPLICATION_ACTIVITY = "application/vnd.android.activity";
    public static final java.lang.String MIMETYPE_APPLICATION_SHORTCUT = "application/vnd.android.shortcut";
    public static final java.lang.String MIMETYPE_APPLICATION_TASK = "application/vnd.android.task";
    public static final java.lang.String MIMETYPE_UNKNOWN = "application/octet-stream";
    public static final java.lang.String EXTRA_PENDING_INTENT = "android.intent.extra.PENDING_INTENT";
    public static final java.lang.String EXTRA_ACTIVITY_OPTIONS = "android.intent.extra.ACTIVITY_OPTIONS";
    public static final java.lang.String EXTRA_LOGGING_INSTANCE_ID = "android.intent.extra.LOGGING_INSTANCE_ID";
    public static final java.lang.String EXTRA_IS_SENSITIVE = "android.content.extra.IS_SENSITIVE";
    public static final java.lang.String EXTRA_IS_REMOTE_DEVICE = "android.content.extra.IS_REMOTE_DEVICE";
    public static final int CLASSIFICATION_NOT_COMPLETE = 1;
    public static final int CLASSIFICATION_NOT_PERFORMED = 2;
    public static final int CLASSIFICATION_COMPLETE = 3;
    final java.lang.CharSequence mLabel = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.ClipDescription> CREATOR = null;
    public ClipDescription(java.lang.CharSequence p0, java.lang.String[] p1) {}
    public ClipDescription(android.content.ClipDescription p0) {}
    public static boolean compareMimeTypes(java.lang.String p0, java.lang.String p1) { return false; }
    public void setTimestamp(long p0) {}
    public long getTimestamp() { return 0L; }
    public java.lang.CharSequence getLabel() { return null; }
    public boolean hasMimeType(java.lang.String p0) { return false; }
    public boolean hasMimeType(java.lang.String[] p0) { return false; }
    public java.lang.String[] filterMimeTypes(java.lang.String p0) { return null; }
    public int getMimeTypeCount() { return 0; }
    public java.lang.String getMimeType(int p0) { return null; }
    void addMimeTypes(java.lang.String[] p0) {}
    public android.os.PersistableBundle getExtras() { return null; }
    public void setExtras(android.os.PersistableBundle p0) {}
    public void validate() {}
    public boolean isStyledText() { return false; }
    void setIsStyledText(boolean p0) {}
    public void setClassificationStatus(int p0) {}
    public float getConfidenceScore(java.lang.String p0) { return 0.0f; }
    public int getClassificationStatus() { return 0; }
    public void setConfidenceScores(java.util.Map<java.lang.String, java.lang.Float> p0) {}
    public java.lang.String toString() { return null; }
    public boolean toShortString(java.lang.StringBuilder p0, boolean p1) { return false; }
    public boolean toShortStringTypesOnly(java.lang.StringBuilder p0) { return false; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    ClipDescription(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ClassificationStatus {
    }
}
