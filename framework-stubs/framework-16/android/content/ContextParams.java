package android.content;

public final class ContextParams {
    public static final android.content.ContextParams EMPTY = null;
    @android.annotation.Nullable
    public java.lang.String getAttributionTag() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RENOUNCE_PERMISSIONS")
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getRenouncedPermissions() { return null; }
    public boolean isRenouncedPermission(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public android.content.AttributionSource getNextAttributionSource() { return null; }
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("android.permission.flags.should_register_attribution_source")
    public boolean shouldRegisterAttributionSource() { return false; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.content.ContextParams p0) {}
        @android.annotation.NonNull
        public android.content.ContextParams.Builder setAttributionTag(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.content.ContextParams.Builder setNextAttributionSource(android.content.AttributionSource p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("android.permission.flags.should_register_attribution_source")
        public android.content.ContextParams.Builder setShouldRegisterAttributionSource(boolean p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.RENOUNCE_PERMISSIONS")
        @android.annotation.NonNull
        public android.content.ContextParams.Builder setRenouncedPermissions(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.content.ContextParams build() { return null; }
    }
}
