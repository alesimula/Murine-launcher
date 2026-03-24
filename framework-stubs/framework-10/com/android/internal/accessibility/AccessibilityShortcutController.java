package com.android.internal.accessibility;

public class AccessibilityShortcutController {
    private static final java.lang.String TAG = "AccessibilityShortcutController";
    public static final android.content.ComponentName COLOR_INVERSION_COMPONENT_NAME = null;
    public static final android.content.ComponentName DALTONIZER_COMPONENT_NAME = null;
    private static final android.media.AudioAttributes VIBRATION_ATTRIBUTES = null;
    private static java.util.Map<android.content.ComponentName, com.android.internal.accessibility.AccessibilityShortcutController.ToggleableFrameworkFeatureInfo> sFrameworkShortcutFeaturesMap;
    private final android.content.Context mContext = null;
    private final android.os.Handler mHandler = null;
    private android.app.AlertDialog mAlertDialog;
    private boolean mIsShortcutEnabled;
    private boolean mEnabledOnLockScreen;
    private int mUserId;
    public com.android.internal.accessibility.AccessibilityShortcutController.FrameworkObjectProvider mFrameworkObjectProvider;
    public static java.lang.String getTargetServiceComponentNameString(android.content.Context p0, int p1) { return null; }
    public static java.util.Map<android.content.ComponentName, com.android.internal.accessibility.AccessibilityShortcutController.ToggleableFrameworkFeatureInfo> getFrameworkShortcutFeaturesMap() { return null; }
    public AccessibilityShortcutController(android.content.Context p0, android.os.Handler p1, int p2) {}
    public void setCurrentUser(int p0) {}
    public boolean isAccessibilityShortcutAvailable(boolean p0) { return false; }
    public void onSettingsChanged() {}
    public void performAccessibilityShortcut() {}
    private android.app.AlertDialog createShortcutWarningDialog(int p0) { return null; }
    private android.accessibilityservice.AccessibilityServiceInfo getInfoForTargetService() { return null; }
    private java.lang.String getShortcutFeatureDescription(boolean p0) { return null; }
    private boolean isServiceEnabled(android.accessibilityservice.AccessibilityServiceInfo p0) { return false; }
    private boolean hasFeatureLeanback() { return false; }
    private void playNotificationTone() {}
    private boolean performTtsPrompt(android.app.AlertDialog p0) { return false; }

    private class TtsPrompt implements android.speech.tts.TextToSpeech.OnInitListener {
        private final java.lang.CharSequence mText = null;
        private boolean mDismiss;
        private android.speech.tts.TextToSpeech mTts;
        TtsPrompt(com.android.internal.accessibility.AccessibilityShortcutController p0, java.lang.String p1) {}
        public void dismiss() {}
        public void onInit(int p0) {}
        private void play() {}
        private boolean setLanguage(java.util.Locale p0) { return false; }
    }

    public static class ToggleableFrameworkFeatureInfo {
        private final java.lang.String mSettingKey = null;
        private final java.lang.String mSettingOnValue = null;
        private final java.lang.String mSettingOffValue = null;
        private final int mLabelStringResourceId = 0;
        private int mIconDrawableId;
        ToggleableFrameworkFeatureInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) {}
        public java.lang.String getSettingKey() { return null; }
        public java.lang.String getSettingOnValue() { return null; }
        public java.lang.String getSettingOffValue() { return null; }
        public java.lang.String getLabel(android.content.Context p0) { return null; }
    }

    public static class FrameworkObjectProvider {
        public FrameworkObjectProvider() {}
        public android.view.accessibility.AccessibilityManager getAccessibilityManagerInstance(android.content.Context p0) { return null; }
        public android.app.AlertDialog.Builder getAlertDialogBuilder(android.content.Context p0) { return null; }
        public android.widget.Toast makeToastFromText(android.content.Context p0, java.lang.CharSequence p1, int p2) { return null; }
        public android.content.Context getSystemUiContext() { return null; }
        public android.speech.tts.TextToSpeech getTextToSpeech(android.content.Context p0, android.speech.tts.TextToSpeech.OnInitListener p1) { return null; }
        public android.media.Ringtone getRingtone(android.content.Context p0, android.net.Uri p1) { return null; }
    }
}
