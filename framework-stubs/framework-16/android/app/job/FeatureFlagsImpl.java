package android.app.job;

public final class FeatureFlagsImpl implements android.app.job.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean addTypeInfoToWakelockTag() { return false; }
    public boolean enforceMinimumTimeWindows() { return false; }
    public boolean getPendingJobReasonsApi() { return false; }
    public boolean getPendingJobReasonsHistoryApi() { return false; }
    public boolean handleAbandonedJobs() { return false; }
    public boolean ignoreImportantWhileForeground() { return false; }
    public boolean jobCategoryApis() { return false; }
    public boolean jobDebugInfoApis() { return false; }
}
