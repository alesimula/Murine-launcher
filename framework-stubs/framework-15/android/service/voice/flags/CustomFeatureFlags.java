package android.service.voice.flags;

public class CustomFeatureFlags implements android.service.voice.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.service.voice.flags.FeatureFlags>> p0) {}
    public boolean allowForegroundActivitiesInOnShow() { return false; }
    public boolean allowHotwordBumpEgress() { return false; }
    public boolean allowTrainingDataEgressFromHds() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.service.voice.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
