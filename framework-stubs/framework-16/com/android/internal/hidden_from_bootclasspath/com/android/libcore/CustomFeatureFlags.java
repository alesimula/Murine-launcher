package com.android.internal.hidden_from_bootclasspath.com.android.libcore;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.libcore.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.libcore.FeatureFlags>> p0) {}
    public boolean appinfo() { return false; }
    public boolean hpkePublicApi() { return false; }
    public boolean hpkeVApis() { return false; }
    public boolean madviseApi() { return false; }
    public boolean nativeMetrics() { return false; }
    public boolean nicenessApis() { return false; }
    public boolean openjdk21Stringconcat() { return false; }
    public boolean openjdk21V1Apis() { return false; }
    public boolean openjdk21V2Apis() { return false; }
    public boolean openjdk25V1Apis() { return false; }
    public boolean postCleanupApis() { return false; }
    public boolean readOnlyDynamicCodeLoad() { return false; }
    public boolean vApis() { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.libcore.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
}
