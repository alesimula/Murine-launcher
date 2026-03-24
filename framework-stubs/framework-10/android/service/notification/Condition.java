package android.service.notification;

public final class Condition implements android.os.Parcelable {
    public static final java.lang.String SCHEME = "condition";
    public static final int STATE_FALSE = 0;
    public static final int STATE_TRUE = 1;
    public static final int STATE_UNKNOWN = 2;
    public static final int STATE_ERROR = 3;
    public static final int FLAG_RELEVANT_NOW = 1;
    public static final int FLAG_RELEVANT_ALWAYS = 2;
    public final android.net.Uri id = null;
    public final java.lang.String summary = null;
    public final java.lang.String line1 = null;
    public final java.lang.String line2 = null;
    public final int state = 0;
    public final int flags = 0;
    public final int icon = 0;
    public static final android.os.Parcelable.Creator<android.service.notification.Condition> CREATOR = null;
    public Condition(android.net.Uri p0, java.lang.String p1, int p2) {}
    public Condition(android.net.Uri p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6) {}
    public Condition(android.os.Parcel p0) {}
    private static boolean isValidState(int p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    public static java.lang.String stateToString(int p0) { return null; }
    public static java.lang.String relevanceToString(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public android.service.notification.Condition copy() { return null; }
    public static android.net.Uri.Builder newId(android.content.Context p0) { return null; }
    public static boolean isValidId(android.net.Uri p0, java.lang.String p1) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
