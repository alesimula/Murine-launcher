package android.bluetooth.le;

public final class DistanceMeasurementManager {
    DistanceMeasurementManager() {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.channel_sounding_25q2_apis")
    public int getChannelSoundingMaxSupportedSecurityLevel(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.channel_sounding_25q2_apis")
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getChannelSoundingSupportedSecurityLevels() { return null; }
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.channel_sounding_25q2_apis")
    public int getLocalChannelSoundingMaxSupportedSecurityLevel() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.le.DistanceMeasurementMethod> getSupportedMethods() { return null; }
    @android.annotation.Nullable
    public android.os.CancellationSignal startMeasurementSession(android.bluetooth.le.DistanceMeasurementParams p0, java.util.concurrent.Executor p1, android.bluetooth.le.DistanceMeasurementSession.Callback p2) { return null; }
}
