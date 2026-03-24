package android.app.ondeviceintelligence;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence")
public final class ProcessingSignal {
    public ProcessingSignal() {}
    public void sendSignal(android.os.PersistableBundle p0) {}
    public void setOnProcessingSignalCallback(java.util.concurrent.Executor p0, android.app.ondeviceintelligence.ProcessingSignal.OnProcessingSignalCallback p1) {}
    void setRemote(android.app.ondeviceintelligence.IProcessingSignal p0) {}
    public static android.app.ondeviceintelligence.IProcessingSignal createTransport() { return null; }
    public static android.app.ondeviceintelligence.ProcessingSignal fromTransport(android.app.ondeviceintelligence.IProcessingSignal p0) { return null; }

    public static interface OnProcessingSignalCallback {
        public void onSignalReceived(android.os.PersistableBundle p0);
    }

    private static final class Transport extends android.app.ondeviceintelligence.IProcessingSignal.Stub {
        final android.app.ondeviceintelligence.ProcessingSignal mProcessingSignal = null;
        public void sendSignal(android.os.PersistableBundle p0) {}
    }
}
