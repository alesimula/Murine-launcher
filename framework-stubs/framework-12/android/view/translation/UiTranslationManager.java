package android.view.translation;

public final class UiTranslationManager {
    private static final java.lang.String TAG = "UiTranslationManager";
    public static final java.lang.String LOG_TAG = "UiTranslation";
    public static final int STATE_UI_TRANSLATION_STARTED = 0;
    public static final int STATE_UI_TRANSLATION_PAUSED = 1;
    public static final int STATE_UI_TRANSLATION_RESUMED = 2;
    public static final int STATE_UI_TRANSLATION_FINISHED = 3;
    public static final java.lang.String EXTRA_STATE = "state";
    public static final java.lang.String EXTRA_SOURCE_LOCALE = "source_locale";
    public static final java.lang.String EXTRA_TARGET_LOCALE = "target_locale";
    private final android.content.Context mContext = null;
    private final android.view.translation.ITranslationManager mService = null;
    private final java.util.Map<android.view.translation.UiTranslationStateCallback, android.os.IRemoteCallback> mCallbacks = null;
    public UiTranslationManager(android.content.Context p0, android.view.translation.ITranslationManager p1) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_UI_TRANSLATION")
    public void startTranslation(android.view.translation.TranslationSpec p0, android.view.translation.TranslationSpec p1, java.util.List<android.view.autofill.AutofillId> p2, android.app.assist.ActivityId p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_UI_TRANSLATION")
    public void startTranslation(android.view.translation.TranslationSpec p0, android.view.translation.TranslationSpec p1, java.util.List<android.view.autofill.AutofillId> p2, android.app.assist.ActivityId p3, android.view.translation.UiTranslationSpec p4) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_UI_TRANSLATION")
    public void finishTranslation(android.app.assist.ActivityId p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_UI_TRANSLATION")
    public void pauseTranslation(android.app.assist.ActivityId p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_UI_TRANSLATION")
    public void resumeTranslation(android.app.assist.ActivityId p0) {}
    public void registerUiTranslationStateCallback(java.util.concurrent.Executor p0, android.view.translation.UiTranslationStateCallback p1) {}
    public void unregisterUiTranslationStateCallback(android.view.translation.UiTranslationStateCallback p0) {}
    public void onTranslationFinished(boolean p0, android.app.assist.ActivityId p1, android.content.ComponentName p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UiTranslationState {
    }

    private static class UiTranslationStateRemoteCallback extends android.os.IRemoteCallback.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.view.translation.UiTranslationStateCallback mCallback = null;
        UiTranslationStateRemoteCallback(java.util.concurrent.Executor p0, android.view.translation.UiTranslationStateCallback p1) { super(); }
        public void sendResult(android.os.Bundle p0) {}
        private void onStateChange(android.os.Bundle p0) {}
    }
}
