package com.android.internal.app;

public class AssistUtils {
    private static final java.lang.String TAG = "AssistUtils";
    private final android.content.Context mContext = null;
    private final com.android.internal.app.IVoiceInteractionManagerService mVoiceInteractionManagerService = null;
    @android.annotation.UnsupportedAppUsage
    public AssistUtils(android.content.Context p0) {}
    public boolean showSessionForActiveService(android.os.Bundle p0, int p1, com.android.internal.app.IVoiceInteractionSessionShowCallback p2, android.os.IBinder p3) { return false; }
    public void getActiveServiceSupportedActions(java.util.Set<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) {}
    public void launchVoiceAssistFromKeyguard() {}
    public boolean activeServiceSupportsAssistGesture() { return false; }
    public boolean activeServiceSupportsLaunchFromKeyguard() { return false; }
    public android.content.ComponentName getActiveServiceComponentName() { return null; }
    public boolean isSessionRunning() { return false; }
    public void hideCurrentSession() {}
    public void onLockscreenShown() {}
    public void registerVoiceInteractionSessionListener(com.android.internal.app.IVoiceInteractionSessionListener p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.content.ComponentName getAssistComponentForUser(int p0) { return null; }
    public static boolean isPreinstalledAssistant(android.content.Context p0, android.content.ComponentName p1) { return false; }
    private static boolean isDisclosureEnabled(android.content.Context p0) { return false; }
    public static boolean shouldDisclose(android.content.Context p0, android.content.ComponentName p1) { return false; }
    public static boolean allowDisablingAssistDisclosure(android.content.Context p0) { return false; }
}
