package android.service.voice;

public abstract class VoiceInteractionManagerInternal {
    public VoiceInteractionManagerInternal() {}
    public abstract void startLocalVoiceInteraction(android.os.IBinder p0, android.os.Bundle p1);
    public abstract boolean supportsLocalVoiceInteraction();
    public abstract void stopLocalVoiceInteraction(android.os.IBinder p0);
}
