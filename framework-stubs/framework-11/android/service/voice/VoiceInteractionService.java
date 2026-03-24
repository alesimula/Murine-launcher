package android.service.voice;

public class VoiceInteractionService extends android.app.Service {
    static final java.lang.String TAG = null;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.voice.VoiceInteractionService";
    public static final java.lang.String SERVICE_META_DATA = "android.voice_interaction";
    android.service.voice.IVoiceInteractionService mInterface;
    com.android.internal.app.IVoiceInteractionManagerService mSystemService;
    private final java.lang.Object mLock = null;
    private android.hardware.soundtrigger.KeyphraseEnrollmentInfo mKeyphraseEnrollmentInfo;
    private android.service.voice.AlwaysOnHotwordDetector mHotwordDetector;
    private android.os.IBinder.DeathRecipient mDeathRecipient;
    public VoiceInteractionService() { super(); }
    public void onLaunchVoiceAssistFromKeyguard() {}
    public static boolean isActiveService(android.content.Context p0, android.content.ComponentName p1) { return false; }
    public void setDisabledShowContext(int p0) {}
    public int getDisabledShowContext() { return 0; }
    public void showSession(android.os.Bundle p0, int p1) {}
    public java.util.Set<java.lang.String> onGetSupportedVoiceActions(java.util.Set<java.lang.String> p0) { return null; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onReady() {}
    private void onShutdownInternal() {}
    public void onShutdown() {}
    private void onSoundModelsChangedInternal() {}
    private void onHandleVoiceActionCheck(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) {}
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, android.service.voice.AlwaysOnHotwordDetector.Callback p2) { return null; }
    @android.annotation.SystemApi
    public final android.media.voice.KeyphraseModelManager createKeyphraseModelManager() { return null; }
    protected final android.hardware.soundtrigger.KeyphraseEnrollmentInfo getKeyphraseEnrollmentInfo() { return null; }
    public final boolean isKeyphraseAndLocaleSupportedForHotword(java.lang.String p0, java.util.Locale p1) { return false; }
    private void safelyShutdownHotwordDetector() {}
    public final void setUiHints(android.os.Bundle p0) {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
