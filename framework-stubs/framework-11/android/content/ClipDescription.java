package android.content;

public class ClipDescription implements android.os.Parcelable {
    public static final java.lang.String MIMETYPE_TEXT_PLAIN = "text/plain";
    public static final java.lang.String MIMETYPE_TEXT_HTML = "text/html";
    public static final java.lang.String MIMETYPE_TEXT_URILIST = "text/uri-list";
    public static final java.lang.String MIMETYPE_TEXT_INTENT = "text/vnd.android.intent";
    public static final java.lang.String MIMETYPE_UNKNOWN = "application/octet-stream";
    public static final java.lang.String EXTRA_TARGET_COMPONENT_NAME = "android.content.extra.TARGET_COMPONENT_NAME";
    public static final java.lang.String EXTRA_USER_SERIAL_NUMBER = "android.content.extra.USER_SERIAL_NUMBER";
    final java.lang.CharSequence mLabel = null;
    private final java.util.ArrayList<java.lang.String> mMimeTypes = null;
    private android.os.PersistableBundle mExtras;
    private long mTimeStamp;
    public static final android.os.Parcelable.Creator<android.content.ClipDescription> CREATOR = null;
    public ClipDescription(java.lang.CharSequence p0, java.lang.String[] p1) {}
    public ClipDescription(android.content.ClipDescription p0) {}
    public static boolean compareMimeTypes(java.lang.String p0, java.lang.String p1) { return false; }
    public void setTimestamp(long p0) {}
    public long getTimestamp() { return 0L; }
    public java.lang.CharSequence getLabel() { return null; }
    public boolean hasMimeType(java.lang.String p0) { return false; }
    public java.lang.String[] filterMimeTypes(java.lang.String p0) { return null; }
    public int getMimeTypeCount() { return 0; }
    public java.lang.String getMimeType(int p0) { return null; }
    void addMimeTypes(java.lang.String[] p0) {}
    public android.os.PersistableBundle getExtras() { return null; }
    public void setExtras(android.os.PersistableBundle p0) {}
    public void validate() {}
    public java.lang.String toString() { return null; }
    public boolean toShortString(java.lang.StringBuilder p0) { return false; }
    public boolean toShortStringTypesOnly(java.lang.StringBuilder p0) { return false; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    ClipDescription(android.os.Parcel p0) {}
}
