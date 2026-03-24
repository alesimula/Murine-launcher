package android.tracing;

public final class FeatureFlagsImpl implements android.tracing.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean clientSideProtoLogging() { return false; }
    public boolean imetrackerProtolog() { return false; }
    public boolean perfettoIme() { return false; }
    public boolean perfettoImeTracing() { return false; }
    public boolean perfettoViewCaptureTracing() { return false; }
    public boolean perfettoWmDump() { return false; }
    public boolean perfettoWmDumpCts() { return false; }
    public boolean perfettoWmTracing() { return false; }
    public boolean systemServerLargePerfettoShmemBuffer() { return false; }
}
