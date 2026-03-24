package android.service.voice;

public class VoiceInteractionService extends android.app.Service {
    static final java.lang.String TAG = null;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.voice.VoiceInteractionService";
    public static final java.lang.String SERVICE_META_DATA = "android.voice_interaction";
    static final long MULTIPLE_ACTIVE_HOTWORD_DETECTORS = 193232191L;
    android.service.voice.IVoiceInteractionService mInterface;
    com.android.internal.app.IVoiceInteractionManagerService mSystemService;
    public VoiceInteractionService() { super(); }
    public void onLaunchVoiceAssistFromKeyguard() {}
    public void onPrepareToShowSession(android.os.Bundle p0, int p1) {}
    public void onShowSessionFailed(android.os.Bundle p0) {}
    public static boolean isActiveService(android.content.Context p0, android.content.ComponentName p1) { return false; }
    public void setDisabledShowContext(int p0) {}
    public int getDisabledShowContext() { return 0; }
    public void showSession(android.os.Bundle p0, int p1) {}
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> onGetSupportedVoiceActions(java.util.Set<java.lang.String> p0) { return null; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onReady() {}
    public void onShutdown() {}
    @android.annotation.NonNull
    public final java.util.List<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> listModuleProperties() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.NonNull
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, android.service.voice.AlwaysOnHotwordDetector.Callback p2) { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, java.util.concurrent.Executor p2, android.service.voice.AlwaysOnHotwordDetector.Callback p3) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_HOTWORD_DETECTION")
    @android.annotation.NonNull
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetectorForTest(java.lang.String p0, java.util.Locale p1, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p2, java.util.concurrent.Executor p3, android.service.voice.AlwaysOnHotwordDetector.Callback p4) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MANAGE_HOTWORD_DETECTION")
    @android.annotation.NonNull
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, android.os.PersistableBundle p2, android.os.SharedMemory p3, android.service.voice.AlwaysOnHotwordDetector.Callback p4) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_HOTWORD_DETECTION")
    @android.annotation.NonNull
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, android.os.PersistableBundle p2, android.os.SharedMemory p3, java.util.concurrent.Executor p4, android.service.voice.AlwaysOnHotwordDetector.Callback p5) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_HOTWORD_DETECTION")
    @android.annotation.NonNull
    public final android.service.voice.AlwaysOnHotwordDetector createAlwaysOnHotwordDetectorForTest(java.lang.String p0, java.util.Locale p1, android.os.PersistableBundle p2, android.os.SharedMemory p3, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p4, java.util.concurrent.Executor p5, android.service.voice.AlwaysOnHotwordDetector.Callback p6) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MANAGE_HOTWORD_DETECTION")
    @android.annotation.NonNull
    public final android.service.voice.HotwordDetector createHotwordDetector(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.service.voice.HotwordDetector.Callback p2) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_HOTWORD_DETECTION")
    @android.annotation.NonNull
    public final android.service.voice.HotwordDetector createHotwordDetector(android.os.PersistableBundle p0, android.os.SharedMemory p1, java.util.concurrent.Executor p2, android.service.voice.HotwordDetector.Callback p3) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_HOTWORD_DETECTION")
    @android.annotation.NonNull
    public final android.service.voice.VisualQueryDetector createVisualQueryDetector(android.os.PersistableBundle p0, android.os.SharedMemory p1, java.util.concurrent.Executor p2, android.service.voice.VisualQueryDetector.Callback p3) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_VOICE_KEYPHRASES")
    @android.annotation.NonNull
    public final android.media.voice.KeyphraseModelManager createKeyphraseModelManager() { return null; }
    protected final android.hardware.soundtrigger.KeyphraseEnrollmentInfo getKeyphraseEnrollmentInfo() { return null; }
    public final void setTestModuleForAlwaysOnHotwordDetectorEnabled(boolean p0) {}
    public final boolean isKeyphraseAndLocaleSupportedForHotword(java.lang.String p0, java.util.Locale p1) { return false; }
    public final void setUiHints(android.os.Bundle p0) {}
    @android.annotation.FlaggedApi("android.service.voice.flags.set_invocation_effect_enabled_api")
    public final void setInvocationEffectEnabled(boolean p0) {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
