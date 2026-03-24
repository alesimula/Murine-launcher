package android.service.voice;

public abstract class VoiceInteractionManagerInternal {
    public VoiceInteractionManagerInternal() {}
    public abstract void startLocalVoiceInteraction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2);
    public abstract boolean supportsLocalVoiceInteraction();
    public abstract void stopLocalVoiceInteraction(android.os.IBinder p0);
    public abstract boolean hasActiveSession(java.lang.String p0);
    public abstract java.lang.String getVoiceInteractorPackageName(android.os.IBinder p0);
    @android.annotation.Nullable
    public abstract android.service.voice.VoiceInteractionManagerInternal.HotwordDetectionServiceIdentity getHotwordDetectionServiceIdentity();
    public abstract void onPreCreatedUserConversion(int p0);
    public abstract void startListeningFromWearable(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2, android.content.ComponentName p3, int p4, android.service.voice.VoiceInteractionManagerInternal.WearableHotwordDetectionCallback p5);

    public static class HotwordDetectionServiceIdentity {
        public HotwordDetectionServiceIdentity(int p0, int p1) {}
        public int getIsolatedUid() { return 0; }
        public int getOwnerUid() { return 0; }
    }

    public static interface WearableHotwordDetectionCallback {
        public void onDetected();
        public void onRejected();
        public void onError(java.lang.String p0);
    }
}
