package android.net.http;

public final class FeatureFlagsImpl implements android.net.http.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean preloadHttpengineInZygote() { return false; }
    public boolean preloadHttpengineJavaImplClasses() { return false; }
    public boolean preloadHttpengineSharedLibrary() { return false; }
}
