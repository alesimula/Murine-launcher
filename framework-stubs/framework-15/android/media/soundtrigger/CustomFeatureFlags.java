package android.media.soundtrigger;

public class CustomFeatureFlags implements android.media.soundtrigger.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.media.soundtrigger.FeatureFlags>> p0) {}
    public boolean soundTriggerGenericModelApi() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.media.soundtrigger.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
