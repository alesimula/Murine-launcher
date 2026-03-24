package com.android.tradeinmode.flags;

public class CustomFeatureFlags implements com.android.tradeinmode.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.tradeinmode.flags.FeatureFlags>> p0) {}
    public boolean enableTradeInMode() { return false; }
    public boolean tradeInMode2025q4() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.tradeinmode.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
