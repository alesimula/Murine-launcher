package com.android.internal.policy;

public class PhoneFallbackEventHandler implements android.view.FallbackEventHandler {
    private static java.lang.String TAG;
    private static final boolean DEBUG = false;
    @android.annotation.UnsupportedAppUsage
    android.content.Context mContext;
    @android.annotation.UnsupportedAppUsage
    android.view.View mView;
    android.media.AudioManager mAudioManager;
    android.app.KeyguardManager mKeyguardManager;
    android.app.SearchManager mSearchManager;
    android.telephony.TelephonyManager mTelephonyManager;
    android.media.session.MediaSessionManager mMediaSessionManager;
    @android.annotation.UnsupportedAppUsage
    public PhoneFallbackEventHandler(android.content.Context p0) {}
    public void setView(android.view.View p0) {}
    public void preDispatchKeyEvent(android.view.KeyEvent p0) {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    private boolean isNotInstantAppAndKeyguardRestricted(android.view.KeyEvent.DispatcherState p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    void startCallActivity() {}
    android.app.SearchManager getSearchManager() { return null; }
    android.telephony.TelephonyManager getTelephonyManager() { return null; }
    android.app.KeyguardManager getKeyguardManager() { return null; }
    android.media.AudioManager getAudioManager() { return null; }
    android.media.session.MediaSessionManager getMediaSessionManager() { return null; }
    void sendCloseSystemWindows() {}
    private void handleVolumeKeyEvent(android.view.KeyEvent p0) {}
    private void handleMediaKeyEvent(android.view.KeyEvent p0) {}
    private boolean isUserSetupComplete() { return false; }
}
