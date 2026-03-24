package com.android.internal.hidden_from_bootclasspath.android.tracing;

public interface FeatureFlags {
    public boolean clientSideProtoLogging();
    public boolean imetrackerProtolog();
    public boolean perfettoIme();
    public boolean perfettoImeTracing();
    public boolean perfettoViewCaptureTracing();
    public boolean perfettoWmDump();
    public boolean perfettoWmDumpCts();
    public boolean perfettoWmTracing();
    public boolean systemServerLargePerfettoShmemBuffer();
}
