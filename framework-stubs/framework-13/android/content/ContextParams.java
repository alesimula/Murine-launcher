package android.content;

public final class ContextParams {
    public static final android.content.ContextParams EMPTY = null;
    public java.lang.String getAttributionTag() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RENOUNCE_PERMISSIONS")
    public java.util.Set<java.lang.String> getRenouncedPermissions() { return null; }
    public boolean isRenouncedPermission(java.lang.String p0) { return false; }
    public android.content.AttributionSource getNextAttributionSource() { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.content.ContextParams p0) {}
        public android.content.ContextParams.Builder setAttributionTag(java.lang.String p0) { return null; }
        public android.content.ContextParams.Builder setNextAttributionSource(android.content.AttributionSource p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.RENOUNCE_PERMISSIONS")
        public android.content.ContextParams.Builder setRenouncedPermissions(java.util.Set<java.lang.String> p0) { return null; }
        public android.content.ContextParams build() { return null; }
    }
}
