package android.net.http;

public interface FeatureFlags {
    public boolean preloadHttpengineInZygote();
    public boolean preloadHttpengineJavaImplClasses();
    public boolean preloadHttpengineSharedLibrary();
}
