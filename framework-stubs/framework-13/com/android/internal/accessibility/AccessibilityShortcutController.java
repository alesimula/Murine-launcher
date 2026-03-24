package com.android.internal.accessibility;

public class AccessibilityShortcutController {
    public static final android.content.ComponentName COLOR_INVERSION_COMPONENT_NAME = null;
    public static final android.content.ComponentName DALTONIZER_COMPONENT_NAME = null;
    public static final java.lang.String MAGNIFICATION_CONTROLLER_NAME = "com.android.server.accessibility.MagnificationController";
    public static final android.content.ComponentName MAGNIFICATION_COMPONENT_NAME = null;
    public static final android.content.ComponentName ONE_HANDED_COMPONENT_NAME = null;
    public static final android.content.ComponentName REDUCE_BRIGHT_COLORS_COMPONENT_NAME = null;
    public static final android.content.ComponentName ACCESSIBILITY_BUTTON_COMPONENT_NAME = null;
    public static final android.content.ComponentName COLOR_INVERSION_TILE_COMPONENT_NAME = null;
    public static final android.content.ComponentName DALTONIZER_TILE_COMPONENT_NAME = null;
    public static final android.content.ComponentName ONE_HANDED_TILE_COMPONENT_NAME = null;
    public static final android.content.ComponentName REDUCE_BRIGHT_COLORS_TILE_SERVICE_COMPONENT_NAME = null;
    public com.android.internal.accessibility.AccessibilityShortcutController.FrameworkObjectProvider mFrameworkObjectProvider;
    public static java.util.Map<android.content.ComponentName, com.android.internal.accessibility.AccessibilityShortcutController.ToggleableFrameworkFeatureInfo> getFrameworkShortcutFeaturesMap() { return null; }
    public AccessibilityShortcutController(android.content.Context p0, android.os.Handler p1, int p2) {}
    public void setCurrentUser(int p0) {}
    public boolean isAccessibilityShortcutAvailable(boolean p0) { return false; }
    public void onSettingsChanged() {}
    public void performAccessibilityShortcut() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface DialogStatus {
        public static final int NOT_SHOWN = 0;
        public static final int SHOWN = 1;
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

    public static class ToggleableFrameworkFeatureInfo {
        ToggleableFrameworkFeatureInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) {}
        public java.lang.String getSettingKey() { return null; }
        public java.lang.String getSettingOnValue() { return null; }
        public java.lang.String getSettingOffValue() { return null; }
        public java.lang.String getLabel(android.content.Context p0) { return null; }
    }

    private class TtsPrompt implements android.speech.tts.TextToSpeech.OnInitListener {
        TtsPrompt(com.android.internal.accessibility.AccessibilityShortcutController p0, java.lang.String p1) {}
        public void dismiss() {}
        public void onInit(int p0) {}
    }

    private class UserSetupCompleteObserver extends android.database.ContentObserver {
        UserSetupCompleteObserver(com.android.internal.accessibility.AccessibilityShortcutController p0, android.os.Handler p1, int p2) { super(null); }
        public void onChange(boolean p0) {}
        void onUserSwitched(int p0) {}
    }
}
