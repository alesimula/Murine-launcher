package android.app.appfunctions.flags;

public class CustomFeatureFlags implements android.app.appfunctions.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.app.appfunctions.flags.FeatureFlags>> p0) {}
    public boolean enableAppFunctionManager() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.app.appfunctions.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
