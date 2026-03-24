package com.android.internal.infra;

public class GlobalWhitelistState {
    protected final java.lang.Object mGlobalWhitelistStateLock = null;
    protected android.util.SparseArray<com.android.internal.infra.WhitelistHelper> mWhitelisterHelpers;
    public GlobalWhitelistState() {}
    public void setWhitelist(int p0, java.util.List<java.lang.String> p1, java.util.List<android.content.ComponentName> p2) {}
    public boolean isWhitelisted(int p0, java.lang.String p1) { return false; }
    public boolean isWhitelisted(int p0, android.content.ComponentName p1) { return false; }
    public android.util.ArraySet<android.content.ComponentName> getWhitelistedComponents(int p0, java.lang.String p1) { return null; }
    public android.util.ArraySet<java.lang.String> getWhitelistedPackages(int p0) { return null; }
    public void resetWhitelist(int p0) {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
}
