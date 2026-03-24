package android.tracing;

public class CustomFeatureFlags implements android.tracing.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.tracing.FeatureFlags>> p0) {}
    public boolean perfettoIme() { return false; }
    public boolean perfettoImeTracing() { return false; }
    public boolean perfettoProtologTracing() { return false; }
    public boolean perfettoTransitionTracing() { return false; }
    public boolean perfettoViewCaptureTracing() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.tracing.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
