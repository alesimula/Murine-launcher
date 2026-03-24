package com.android.internal.infra;

public final class WhitelistHelper {
    private static final java.lang.String TAG = "WhitelistHelper";
    private android.util.ArrayMap<java.lang.String, android.util.ArraySet<android.content.ComponentName>> mWhitelistedPackages;
    public WhitelistHelper() {}
    public void setWhitelist(android.util.ArraySet<java.lang.String> p0, android.util.ArraySet<android.content.ComponentName> p1) {}
    public void setWhitelist(java.util.List<java.lang.String> p0, java.util.List<android.content.ComponentName> p1) {}
    public boolean isWhitelisted(java.lang.String p0) { return false; }
    public boolean isWhitelisted(android.content.ComponentName p0) { return false; }
    public android.util.ArraySet<android.content.ComponentName> getWhitelistedComponents(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public void dump(java.lang.String p0, java.lang.String p1, java.io.PrintWriter p2) {}
}
