package android.content;

public final class AttributionSource implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.AttributionSource> CREATOR = null;
    public AttributionSource(int p0, java.lang.String p1, java.lang.String p2) {}
    public AttributionSource(int p0, int p1, java.lang.String p2, java.lang.String p3) {}
    public AttributionSource(int p0, java.lang.String p1, java.lang.String p2, android.os.IBinder p3) {}
    public AttributionSource(int p0, int p1, java.lang.String p2, java.lang.String p3, android.os.IBinder p4) {}
    public AttributionSource(int p0, java.lang.String p1, java.lang.String p2, java.util.Set<java.lang.String> p3, android.content.AttributionSource p4) {}
    public AttributionSource(android.content.AttributionSource p0, android.content.AttributionSource p1) {}
    public AttributionSource(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String[] p4, android.content.AttributionSource p5) {}
    public AttributionSource(int p0, int p1, java.lang.String p2, java.lang.String p3, android.os.IBinder p4, java.lang.String[] p5, android.content.AttributionSource p6) {}
    AttributionSource(android.os.Parcel p0) {}
    public AttributionSource(android.content.AttributionSourceState p0) {}
    public android.content.AttributionSource withNextAttributionSource(android.content.AttributionSource p0) { return null; }
    public android.content.AttributionSource withPackageName(java.lang.String p0) { return null; }
    public android.content.AttributionSource withToken(android.os.Binder p0) { return null; }
    public android.content.AttributionSource withPid(int p0) { return null; }
    public android.content.AttributionSourceState asState() { return null; }
    public android.content.AttributionSource.ScopedParcelState asScopedParcelState() { return null; }
    public static android.content.AttributionSource myAttributionSource() { return null; }
    public void enforceCallingUid() {}
    public boolean checkCallingUid() { return false; }
    public void enforceCallingPid() {}
    public java.lang.String toString() { return null; }
    public int getNextUid() { return 0; }
    public java.lang.String getNextPackageName() { return null; }
    public java.lang.String getNextAttributionTag() { return null; }
    public android.os.IBinder getNextToken() { return null; }
    public boolean isTrusted(android.content.Context p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RENOUNCE_PERMISSIONS")
    public java.util.Set<java.lang.String> getRenouncedPermissions() { return null; }
    public int getUid() { return 0; }
    public int getPid() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getAttributionTag() { return null; }
    public android.os.IBinder getToken() { return null; }
    public android.content.AttributionSource getNext() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder(int p0) {}
        public Builder(android.content.AttributionSource p0) {}
        public android.content.AttributionSource.Builder setPid(int p0) { return null; }
        public android.content.AttributionSource.Builder setPackageName(java.lang.String p0) { return null; }
        public android.content.AttributionSource.Builder setAttributionTag(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.RENOUNCE_PERMISSIONS")
        public android.content.AttributionSource.Builder setRenouncedPermissions(java.util.Set<java.lang.String> p0) { return null; }
        public android.content.AttributionSource.Builder setNext(android.content.AttributionSource p0) { return null; }
        public android.content.AttributionSource build() { return null; }
    }

    public static class ScopedParcelState implements java.lang.AutoCloseable {
        public android.os.Parcel getParcel() { return null; }
        public ScopedParcelState(android.content.AttributionSource p0) {}
        public void close() {}
    }
}
