package android.app.job;

public final class FeatureFlagsImpl implements android.app.job.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean backupJobsExemption() { return false; }
    public boolean enforceMinimumTimeWindows() { return false; }
    public boolean jobDebugInfoApis() { return false; }
}
