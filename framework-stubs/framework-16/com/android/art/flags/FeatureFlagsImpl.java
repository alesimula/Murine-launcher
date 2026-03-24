package com.android.art.flags;

public final class FeatureFlagsImpl implements com.android.art.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean alwaysEnableProfileCode() { return false; }
    public boolean artServiceV3() { return false; }
    public boolean executableMethodFileOffsets() { return false; }
    public boolean executableMethodFileOffsetsDeprecation() { return false; }
    public boolean executableMethodFileOffsetsV2() { return false; }
}
