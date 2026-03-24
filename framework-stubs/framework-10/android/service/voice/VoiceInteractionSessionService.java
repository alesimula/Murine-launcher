package android.service.voice;

public abstract class VoiceInteractionSessionService extends android.app.Service {
    static final int MSG_NEW_SESSION = 1;
    com.android.internal.app.IVoiceInteractionManagerService mSystemService;
    android.service.voice.VoiceInteractionSession mSession;
    android.service.voice.IVoiceInteractionSessionService mInterface;
    com.android.internal.os.HandlerCaller mHandlerCaller;
    final com.android.internal.os.HandlerCaller.Callback mHandlerCallerCallback = null;
    public VoiceInteractionSessionService() { super(); }
    public void onCreate() {}
    public abstract android.service.voice.VoiceInteractionSession onNewSession(android.os.Bundle p0);
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onLowMemory() {}
    public void onTrimMemory(int p0) {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    void doNewSession(android.os.IBinder p0, android.os.Bundle p1, int p2) {}
}
