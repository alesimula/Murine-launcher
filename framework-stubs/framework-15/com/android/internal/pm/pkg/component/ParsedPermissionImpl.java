package com.android.internal.pm.pkg.component;

public class ParsedPermissionImpl extends com.android.internal.pm.pkg.component.ParsedComponentImpl implements com.android.internal.pm.pkg.component.ParsedPermission, android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedPermissionImpl> CREATOR = null;
    public ParsedPermissionImpl() { super(); }
    public com.android.internal.pm.pkg.component.ParsedPermissionGroup getParsedPermissionGroup() { return null; }
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setGroup(java.lang.String p0) { return null; }
    protected void setKnownCert(java.lang.String p0) {}
    protected void setKnownCerts(java.lang.String[] p0) {}
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getKnownCerts() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected ParsedPermissionImpl(android.os.Parcel p0) { super(); }
    public ParsedPermissionImpl(java.lang.String p0, java.lang.String p1, int p2, int p3, boolean p4, com.android.internal.pm.pkg.component.ParsedPermissionGroup p5, java.util.Set<java.lang.String> p6) { super(); }
    @android.annotation.Nullable
    public java.lang.String getBackgroundPermission() { return null; }
    @android.annotation.Nullable
    public java.lang.String getGroup() { return null; }
    public int getRequestRes() { return 0; }
    public int getProtectionLevel() { return 0; }
    public boolean isTree() { return false; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setBackgroundPermission(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setRequestRes(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setProtectionLevel(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setTree(boolean p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setParsedPermissionGroup(com.android.internal.pm.pkg.component.ParsedPermissionGroup p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setKnownCerts(java.util.Set<java.lang.String> p0) { return null; }
}
