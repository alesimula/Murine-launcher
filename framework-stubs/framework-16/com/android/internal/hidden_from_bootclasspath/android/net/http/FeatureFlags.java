package com.android.internal.hidden_from_bootclasspath.android.net.http;

public interface FeatureFlags {
    public boolean preloadHttpengineInZygote();
    public boolean preloadHttpengineJavaImplClasses();
    public boolean preloadHttpengineSharedLibrary();
}
