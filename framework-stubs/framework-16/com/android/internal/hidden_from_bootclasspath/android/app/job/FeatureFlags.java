package com.android.internal.hidden_from_bootclasspath.android.app.job;

public interface FeatureFlags {
    public boolean addTypeInfoToWakelockTag();
    public boolean enforceMinimumTimeWindows();
    public boolean getPendingJobReasonsApi();
    public boolean getPendingJobReasonsHistoryApi();
    public boolean handleAbandonedJobs();
    public boolean ignoreImportantWhileForeground();
    public boolean jobCategoryApis();
    public boolean jobDebugInfoApis();
}
