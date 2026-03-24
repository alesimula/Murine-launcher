package com.android.internal.hidden_from_bootclasspath.android.tracing;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.tracing.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.tracing.FeatureFlags>> p0) {}
    public boolean clientSideProtoLogging() { return false; }
    public boolean imetrackerProtolog() { return false; }
    public boolean perfettoIme() { return false; }
    public boolean perfettoImeTracing() { return false; }
    public boolean perfettoViewCaptureTracing() { return false; }
    public boolean perfettoWmDump() { return false; }
    public boolean perfettoWmDumpCts() { return false; }
    public boolean perfettoWmTracing() { return false; }
    public boolean systemServerLargePerfettoShmemBuffer() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.tracing.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
