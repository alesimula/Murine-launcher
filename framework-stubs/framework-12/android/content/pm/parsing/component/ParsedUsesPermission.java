package android.content.pm.parsing.component;

public class ParsedUsesPermission implements android.os.Parcelable {
    public java.lang.String name;
    public int usesPermissionFlags;
    public static final int FLAG_NEVER_FOR_LOCATION = 65536;
    public static final android.os.Parcelable.Creator<android.content.pm.parsing.component.ParsedUsesPermission> CREATOR = null;
    public ParsedUsesPermission(java.lang.String p0, int p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    protected ParsedUsesPermission(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsesPermissionFlags {
    }
}
