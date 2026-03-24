package android.tracing;

public final class FeatureFlagsImpl implements android.tracing.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean perfettoIme() { return false; }
    public boolean perfettoImeTracing() { return false; }
    public boolean perfettoProtologTracing() { return false; }
    public boolean perfettoTransitionTracing() { return false; }
    public boolean perfettoViewCaptureTracing() { return false; }
}
