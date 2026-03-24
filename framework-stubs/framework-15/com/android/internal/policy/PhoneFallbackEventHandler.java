package com.android.internal.policy;

public class PhoneFallbackEventHandler implements android.view.FallbackEventHandler {
    android.content.Context mContext;
    android.view.View mView;
    android.media.AudioManager mAudioManager;
    android.app.KeyguardManager mKeyguardManager;
    android.app.SearchManager mSearchManager;
    android.telephony.TelephonyManager mTelephonyManager;
    android.media.session.MediaSessionManager mMediaSessionManager;
    public PhoneFallbackEventHandler(android.content.Context p0) {}
    public void setView(android.view.View p0) {}
    public void preDispatchKeyEvent(android.view.KeyEvent p0) {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    void startCallActivity() {}
    android.app.SearchManager getSearchManager() { return null; }
    android.telephony.TelephonyManager getTelephonyManager() { return null; }
    android.app.KeyguardManager getKeyguardManager() { return null; }
    android.media.AudioManager getAudioManager() { return null; }
    android.media.session.MediaSessionManager getMediaSessionManager() { return null; }
}
