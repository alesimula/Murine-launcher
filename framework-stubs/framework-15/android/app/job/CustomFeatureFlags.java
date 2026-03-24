package android.app.job;

public class CustomFeatureFlags implements android.app.job.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.app.job.FeatureFlags>> p0) {}
    public boolean backupJobsExemption() { return false; }
    public boolean enforceMinimumTimeWindows() { return false; }
    public boolean jobDebugInfoApis() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.app.job.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
