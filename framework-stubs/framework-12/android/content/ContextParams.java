package android.content;

public final class ContextParams {
    private final java.lang.String mAttributionTag = null;
    private final android.content.AttributionSource mNext = null;
    private final java.util.Set<java.lang.String> mRenouncedPermissions = null;
    public static final android.content.ContextParams EMPTY = null;
    private ContextParams(java.lang.String p0, android.content.AttributionSource p1, java.util.Set<java.lang.String> p2) {}
    public java.lang.String getAttributionTag() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RENOUNCE_PERMISSIONS")
    public java.util.Set<java.lang.String> getRenouncedPermissions() { return null; }
    public boolean isRenouncedPermission(java.lang.String p0) { return false; }
    public android.content.AttributionSource getNextAttributionSource() { return null; }

    public static final class Builder {
        private java.lang.String mAttributionTag;
        private java.util.Set<java.lang.String> mRenouncedPermissions;
        private android.content.AttributionSource mNext;
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
