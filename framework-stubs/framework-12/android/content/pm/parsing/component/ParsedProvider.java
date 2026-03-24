package android.content.pm.parsing.component;

public class ParsedProvider extends android.content.pm.parsing.component.ParsedMainComponent {
    private java.lang.String authority;
    boolean syncable;
    private java.lang.String readPermission;
    private java.lang.String writePermission;
    boolean grantUriPermissions;
    boolean forceUriPermissions;
    boolean multiProcess;
    int initOrder;
    android.os.PatternMatcher[] uriPermissionPatterns;
    android.content.pm.PathPermission[] pathPermissions;
    public static final android.os.Parcelable.Creator<android.content.pm.parsing.component.ParsedProvider> CREATOR = null;
    public ParsedProvider(android.content.pm.parsing.component.ParsedProvider p0) { super(); }
    public void setAuthority(java.lang.String p0) {}
    public void setSyncable(boolean p0) {}
    public void setReadPermission(java.lang.String p0) {}
    public void setWritePermission(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public ParsedProvider() { super(); }
    protected ParsedProvider(android.os.Parcel p0) { super(); }
    public java.lang.String getAuthority() { return null; }
    public boolean isSyncable() { return false; }
    public java.lang.String getReadPermission() { return null; }
    public java.lang.String getWritePermission() { return null; }
    public boolean isGrantUriPermissions() { return false; }
    public boolean isForceUriPermissions() { return false; }
    public boolean isMultiProcess() { return false; }
    public int getInitOrder() { return 0; }
    public android.os.PatternMatcher[] getUriPermissionPatterns() { return null; }
    public android.content.pm.PathPermission[] getPathPermissions() { return null; }
}
