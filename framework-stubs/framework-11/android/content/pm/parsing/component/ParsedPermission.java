package android.content.pm.parsing.component;

public class ParsedPermission extends android.content.pm.parsing.component.ParsedComponent {
    java.lang.String backgroundPermission;
    private java.lang.String group;
    int requestRes;
    int protectionLevel;
    boolean tree;
    private android.content.pm.parsing.component.ParsedPermissionGroup parsedPermissionGroup;
    public static final android.os.Parcelable.Creator<android.content.pm.parsing.component.ParsedPermission> CREATOR = null;
    public ParsedPermission() { super((android.content.pm.parsing.component.ParsedComponent)null); }
    public ParsedPermission(android.content.pm.parsing.component.ParsedPermission p0) { super((android.content.pm.parsing.component.ParsedComponent)null); }
    public ParsedPermission(android.content.pm.parsing.component.ParsedPermission p0, android.content.pm.PermissionInfo p1, java.lang.String p2, java.lang.String p3) { super((android.content.pm.parsing.component.ParsedComponent)null); }
    public android.content.pm.parsing.component.ParsedPermission setGroup(java.lang.String p0) { return null; }
    public android.content.pm.parsing.component.ParsedPermission setFlags(int p0) { return null; }
    public boolean isRuntime() { return false; }
    public boolean isAppOp() { return false; }
    public int getProtection() { return 0; }
    public int getProtectionFlags() { return 0; }
    public int calculateFootprint() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected ParsedPermission(android.os.Parcel p0) { super((android.content.pm.parsing.component.ParsedComponent)null); }
    public java.lang.String getBackgroundPermission() { return null; }
    public java.lang.String getGroup() { return null; }
    public int getRequestRes() { return 0; }
    public int getProtectionLevel() { return 0; }
    public boolean isTree() { return false; }
    public android.content.pm.parsing.component.ParsedPermissionGroup getParsedPermissionGroup() { return null; }
    public android.content.pm.parsing.component.ParsedPermission setProtectionLevel(int p0) { return null; }
    public android.content.pm.parsing.component.ParsedPermission setParsedPermissionGroup(android.content.pm.parsing.component.ParsedPermissionGroup p0) { return null; }
}
