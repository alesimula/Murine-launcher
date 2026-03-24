package android.view.autofill;

public final class AutofillManager {
    private static final java.lang.String TAG = "AutofillManager";
    public static final java.lang.String EXTRA_ASSIST_STRUCTURE = "android.view.autofill.extra.ASSIST_STRUCTURE";
    public static final java.lang.String EXTRA_AUTHENTICATION_RESULT = "android.view.autofill.extra.AUTHENTICATION_RESULT";
    public static final java.lang.String EXTRA_AUTHENTICATION_RESULT_EPHEMERAL_DATASET = "android.view.autofill.extra.AUTHENTICATION_RESULT_EPHEMERAL_DATASET";
    public static final java.lang.String EXTRA_CLIENT_STATE = "android.view.autofill.extra.CLIENT_STATE";
    public static final java.lang.String EXTRA_INLINE_SUGGESTIONS_REQUEST = "android.view.autofill.extra.INLINE_SUGGESTIONS_REQUEST";
    public static final java.lang.String EXTRA_RESTORE_SESSION_TOKEN = "android.view.autofill.extra.RESTORE_SESSION_TOKEN";
    public static final java.lang.String EXTRA_RESTORE_CROSS_ACTIVITY = "android.view.autofill.extra.RESTORE_CROSS_ACTIVITY";
    public static final java.lang.String EXTRA_AUGMENTED_AUTOFILL_CLIENT = "android.view.autofill.extra.AUGMENTED_AUTOFILL_CLIENT";
    private static final java.lang.String SESSION_ID_TAG = "android:sessionId";
    private static final java.lang.String STATE_TAG = "android:state";
    private static final java.lang.String LAST_AUTOFILLED_DATA_TAG = "android:lastAutoFilledData";
    public static final int ACTION_START_SESSION = 1;
    public static final int ACTION_VIEW_ENTERED = 2;
    public static final int ACTION_VIEW_EXITED = 3;
    public static final int ACTION_VALUE_CHANGED = 4;
    public static final int ACTION_RESPONSE_EXPIRED = 5;
    public static final int NO_LOGGING = 0;
    public static final int FLAG_ADD_CLIENT_ENABLED = 1;
    public static final int FLAG_ADD_CLIENT_DEBUG = 2;
    public static final int FLAG_ADD_CLIENT_VERBOSE = 4;
    public static final int FLAG_ADD_CLIENT_ENABLED_FOR_AUGMENTED_AUTOFILL_ONLY = 8;
    public static final int RECEIVER_FLAG_SESSION_FOR_AUGMENTED_AUTOFILL_ONLY = 1;
    public static final int DEFAULT_LOGGING_LEVEL = Integer.valueOf(0);
    public static final int DEFAULT_MAX_PARTITIONS_SIZE = 10;
    private static final int AUTHENTICATION_ID_DATASET_ID_MASK = 65535;
    private static final int AUTHENTICATION_ID_DATASET_ID_SHIFT = 16;
    public static final int AUTHENTICATION_ID_DATASET_ID_UNDEFINED = 65535;
    public static final int PENDING_UI_OPERATION_CANCEL = 1;
    public static final int PENDING_UI_OPERATION_RESTORE = 2;
    public static final int STATE_UNKNOWN = 0;
    public static final int STATE_ACTIVE = 1;
    public static final int STATE_FINISHED = 2;
    public static final int STATE_SHOWING_SAVE_UI = 3;
    public static final int STATE_DISABLED_BY_SERVICE = 4;
    public static final int STATE_UNKNOWN_COMPAT_MODE = 5;
    public static final int STATE_UNKNOWN_FAILED = 6;
    public static final int FC_SERVICE_TIMEOUT = 5000;
    private static final int SYNC_CALLS_TIMEOUT_MS = 5000;
    public static final int MAX_TEMP_AUGMENTED_SERVICE_DURATION_MS = 120000;
    public static final int FLAG_SMART_SUGGESTION_OFF = 0;
    public static final int FLAG_SMART_SUGGESTION_SYSTEM = 1;
    public static final java.lang.String DEVICE_CONFIG_AUTOFILL_SMART_SUGGESTION_SUPPORTED_MODES = "smart_suggestion_supported_modes";
    public static final java.lang.String DEVICE_CONFIG_AUGMENTED_SERVICE_IDLE_UNBIND_TIMEOUT = "augmented_service_idle_unbind_timeout";
    public static final java.lang.String DEVICE_CONFIG_AUGMENTED_SERVICE_REQUEST_TIMEOUT = "augmented_service_request_timeout";
    public static final int RESULT_OK = 0;
    public static final int RESULT_CODE_NOT_SERVICE = -1;
    private final com.android.internal.logging.MetricsLogger mMetricsLogger = null;
    public static final int NO_SESSION = 2147483647;
    private final android.view.autofill.IAutoFillManager mService = null;
    private final java.lang.Object mLock = null;
    private android.view.autofill.IAutoFillManagerClient mServiceClient;
    private android.view.autofill.IAugmentedAutofillManagerClient mAugmentedAutofillServiceClient;
    private android.view.autofill.AutofillManager.AutofillCallback mCallback;
    private final android.content.Context mContext = null;
    private int mSessionId;
    private int mState;
    private boolean mEnabled;
    private android.view.autofill.ParcelableMap mLastAutofilledData;
    private android.view.autofill.AutofillManager.TrackedViews mTrackedViews;
    private android.util.ArraySet<android.view.autofill.AutofillId> mFillableIds;
    private android.view.autofill.AutofillId mIdShownFillUi;
    private android.util.ArraySet<android.view.autofill.AutofillId> mEnteredIds;
    private java.util.Set<android.view.autofill.AutofillId> mEnteredForAugmentedAutofillIds;
    private android.view.autofill.AutofillId mSaveTriggerId;
    private boolean mOnInvisibleCalled;
    private boolean mSaveOnFinish;
    private android.view.autofill.AutofillManager.CompatibilityBridge mCompatibilityBridge;
    private final android.content.AutofillOptions mOptions = null;
    private boolean mForAugmentedAutofillOnly;
    private boolean mEnabledForAugmentedAutofillOnly;
    public static final int SET_STATE_FLAG_ENABLED = 1;
    public static final int SET_STATE_FLAG_RESET_SESSION = 2;
    public static final int SET_STATE_FLAG_RESET_CLIENT = 4;
    public static final int SET_STATE_FLAG_DEBUG = 8;
    public static final int SET_STATE_FLAG_VERBOSE = 16;
    public static final int SET_STATE_FLAG_FOR_AUTOFILL_ONLY = 32;
    public static int makeAuthenticationId(int p0, int p1) { return 0; }
    public static int getRequestIdFromAuthenticationId(int p0) { return 0; }
    public static int getDatasetIdFromAuthenticationId(int p0) { return 0; }
    public AutofillManager(android.content.Context p0, android.view.autofill.IAutoFillManager p1) {}
    public void enableCompatibilityMode() {}
    public void onCreate(android.os.Bundle p0) {}
    public void onVisibleForAutofill() {}
    public void onInvisibleForAutofill(boolean p0) {}
    public void onSaveInstanceState(android.os.Bundle p0) {}
    public boolean isCompatibilityModeEnabledLocked() { return false; }
    public boolean isEnabled() { return false; }
    public android.service.autofill.FillEventHistory getFillEventHistory() { return null; }
    public void requestAutofill(android.view.View p0) {}
    void requestAutofillFromNewSession(android.view.View p0) {}
    public void requestAutofill(android.view.View p0, int p1, android.graphics.Rect p2) {}
    public void notifyViewEntered(android.view.View p0) {}
    private boolean shouldIgnoreViewEnteredLocked(android.view.autofill.AutofillId p0, int p1) { return false; }
    private boolean isClientVisibleForAutofillLocked() { return false; }
    private boolean isClientDisablingEnterExitEvent() { return false; }
    private void notifyViewEntered(android.view.View p0, int p1) {}
    private android.view.autofill.AutofillManager.AutofillCallback notifyViewEnteredLocked(android.view.View p0, int p1) { return null; }
    public void notifyViewExited(android.view.View p0) {}
    void notifyViewExitedLocked(android.view.View p0) {}
    public void notifyViewVisibilityChanged(android.view.View p0, boolean p1) {}
    public void notifyViewVisibilityChanged(android.view.View p0, int p1, boolean p2) {}
    private void notifyViewVisibilityChangedInternal(android.view.View p0, int p1, boolean p2, boolean p3) {}
    public void notifyViewEntered(android.view.View p0, int p1, android.graphics.Rect p2) {}
    private void notifyViewEntered(android.view.View p0, int p1, android.graphics.Rect p2, int p3) {}
    private android.view.autofill.AutofillManager.AutofillCallback notifyViewEnteredLocked(android.view.View p0, int p1, android.graphics.Rect p2, int p3) { return null; }
    private void addEnteredIdLocked(android.view.autofill.AutofillId p0) {}
    public void notifyViewExited(android.view.View p0, int p1) {}
    private void notifyViewExitedLocked(android.view.View p0, int p1) {}
    public void notifyValueChanged(android.view.View p0) {}
    public void notifyValueChanged(android.view.View p0, int p1, android.view.autofill.AutofillValue p2) {}
    public void notifyViewClicked(android.view.View p0) {}
    public void notifyViewClicked(android.view.View p0, int p1) {}
    private void notifyViewClicked(android.view.autofill.AutofillId p0) {}
    public void onActivityFinishing() {}
    public void commit() {}
    private void commitLocked() {}
    public void cancel() {}
    private void cancelLocked() {}
    public void disableOwnedAutofillServices() {}
    public void disableAutofillServices() {}
    public boolean hasEnabledAutofillServices() { return false; }
    public android.content.ComponentName getAutofillServiceComponentName() { return null; }
    public java.lang.String getUserDataId() { return null; }
    public android.service.autofill.UserData getUserData() { return null; }
    public void setUserData(android.service.autofill.UserData p0) {}
    public boolean isFieldClassificationEnabled() { return false; }
    public java.lang.String getDefaultFieldClassificationAlgorithm() { return null; }
    public java.util.List<java.lang.String> getAvailableFieldClassificationAlgorithms() { return null; }
    public boolean isAutofillSupported() { return false; }
    private android.view.autofill.AutofillManager.AutofillClient getClient() { return null; }
    public boolean isAutofillUiShowing() { return false; }
    public void onAuthenticationResult(int p0, android.content.Intent p1, android.view.View p2) {}
    public android.view.autofill.AutofillId getNextAutofillId() { return null; }
    private static android.view.autofill.AutofillId getAutofillId(android.view.View p0, int p1) { return null; }
    private void startSessionLocked(android.view.autofill.AutofillId p0, android.graphics.Rect p1, android.view.autofill.AutofillValue p2, int p3) {}
    private void finishSessionLocked() {}
    private void cancelSessionLocked() {}
    private void resetSessionLocked(boolean p0) {}
    private void updateSessionLocked(android.view.autofill.AutofillId p0, android.graphics.Rect p1, android.view.autofill.AutofillValue p2, int p3, int p4) {}
    private boolean tryAddServiceClientIfNeededLocked() { return false; }
    private boolean startAutofillIfNeededLocked(android.view.View p0) { return false; }
    public void registerCallback(android.view.autofill.AutofillManager.AutofillCallback p0) {}
    public void unregisterCallback(android.view.autofill.AutofillManager.AutofillCallback p0) {}
    @android.annotation.SystemApi
    public void setAugmentedAutofillWhitelist(java.util.Set<java.lang.String> p0, java.util.Set<android.content.ComponentName> p1) {}
    public void notifyViewEnteredForAugmentedAutofill(android.view.View p0) {}
    private void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) {}
    private void authenticate(int p0, int p1, android.content.IntentSender p2, android.content.Intent p3, boolean p4) {}
    private void dispatchUnhandledKey(int p0, android.view.autofill.AutofillId p1, android.view.KeyEvent p2) {}
    private void setState(int p0) {}
    private void setAutofilledIfValuesIs(android.view.View p0, android.view.autofill.AutofillValue p1, boolean p2) {}
    private void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) {}
    private void autofillContent(int p0, android.view.autofill.AutofillId p1, android.content.ClipData p2) {}
    private void reportAutofillContentFailure(android.view.autofill.AutofillId p0) {}
    private android.metrics.LogMaker newLog(int p0) { return null; }
    private void setTrackedViews(int p0, android.view.autofill.AutofillId[] p1, boolean p2, boolean p3, android.view.autofill.AutofillId[] p4, android.view.autofill.AutofillId p5) {}
    private void setNotifyOnClickLocked(android.view.autofill.AutofillId p0, boolean p1) {}
    private void setSaveUiState(int p0, boolean p1) {}
    private void setSessionFinished(int p0, java.util.List<android.view.autofill.AutofillId> p1) {}
    private void getAugmentedAutofillClient(com.android.internal.os.IResultReceiver p0) {}
    private void requestShowSoftInput(android.view.autofill.AutofillId p0) {}
    private static void requestShowSoftInputInViewThread(android.view.View p0) {}
    public void requestHideFillUi() {}
    private void requestHideFillUi(android.view.autofill.AutofillId p0, boolean p1) {}
    private void requestHideFillUi(android.view.autofill.AutofillId p0, android.view.View p1) {}
    private void notifyDisableAutofill(long p0, android.content.ComponentName p1) {}
    void notifyReenableAutofill() {}
    private void notifyNoFillUi(int p0, android.view.autofill.AutofillId p1, int p2) {}
    private void notifyCallback(int p0, android.view.autofill.AutofillId p1, int p2) {}
    private android.view.View findView(android.view.autofill.AutofillId p0) { return null; }
    public boolean hasAutofillFeature() { return false; }
    public void onPendingSaveUi(int p0, android.os.IBinder p1) {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    private java.lang.String getStateAsStringLocked() { return null; }
    private static java.lang.String getStateAsString(int p0) { return null; }
    public static java.lang.String getSmartSuggestionModeToString(int p0) { return null; }
    private boolean isActiveLocked() { return false; }
    private boolean isDisabledByServiceLocked() { return false; }
    private boolean isFinishedLocked() { return false; }
    private void post(java.lang.Runnable p0) {}

    private static final class AugmentedAutofillManagerClient extends android.view.autofill.IAugmentedAutofillManagerClient.Stub {
        private final java.lang.ref.WeakReference<android.view.autofill.AutofillManager> mAfm = null;
        private AugmentedAutofillManagerClient(android.view.autofill.AutofillManager p0) { super(); }
        public android.app.assist.AssistStructure.ViewNodeParcelable getViewNodeParcelable(android.view.autofill.AutofillId p0) { return null; }
        public android.graphics.Rect getViewCoordinates(android.view.autofill.AutofillId p0) { return null; }
        public void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) {}
        public void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) {}
        public void requestHideFillUi(int p0, android.view.autofill.AutofillId p1) {}
        public boolean requestAutofill(int p0, android.view.autofill.AutofillId p1) { return false; }
        private android.view.View getView(android.view.autofill.AutofillManager p0, android.view.autofill.AutofillId p1) { return null; }
    }

    public static abstract class AutofillCallback {
        public static final int EVENT_INPUT_SHOWN = 1;
        public static final int EVENT_INPUT_HIDDEN = 2;
        public static final int EVENT_INPUT_UNAVAILABLE = 3;
        public AutofillCallback() {}
        public void onAutofillEvent(android.view.View p0, int p1) {}
        public void onAutofillEvent(android.view.View p0, int p1, int p2) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface AutofillEventType {
        }
    }

    public static interface AutofillClient {
        public void autofillClientAuthenticate(int p0, android.content.IntentSender p1, android.content.Intent p2, boolean p3);
        public void autofillClientResetableStateAvailable();
        public boolean autofillClientRequestShowFillUi(android.view.View p0, int p1, int p2, android.graphics.Rect p3, android.view.autofill.IAutofillWindowPresenter p4);
        public void autofillClientDispatchUnhandledKey(android.view.View p0, android.view.KeyEvent p1);
        public boolean autofillClientRequestHideFillUi();
        public boolean autofillClientIsFillUiShowing();
        public boolean[] autofillClientGetViewVisibility(android.view.autofill.AutofillId[] p0);
        public boolean autofillClientIsVisibleForAutofill();
        public boolean isDisablingEnterExitEventForAutofill();
        public android.view.View[] autofillClientFindViewsByAutofillIdTraversal(android.view.autofill.AutofillId[] p0);
        public android.view.View autofillClientFindViewByAutofillIdTraversal(android.view.autofill.AutofillId p0);
        public android.view.View autofillClientFindViewByAccessibilityIdTraversal(int p0, int p1);
        public void autofillClientRunOnUiThread(java.lang.Runnable p0);
        public android.content.ComponentName autofillClientGetComponentName();
        public android.os.IBinder autofillClientGetActivityToken();
        public boolean autofillClientIsCompatibilityModeEnabled();
        public android.view.autofill.AutofillId autofillClientGetNextAutofillId();
    }

    private static final class AutofillManagerClient extends android.view.autofill.IAutoFillManagerClient.Stub {
        private final java.lang.ref.WeakReference<android.view.autofill.AutofillManager> mAfm = null;
        private AutofillManagerClient(android.view.autofill.AutofillManager p0) { super(); }
        public void setState(int p0) {}
        public void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) {}
        public void autofillContent(int p0, android.view.autofill.AutofillId p1, android.content.ClipData p2) {}
        public void authenticate(int p0, int p1, android.content.IntentSender p2, android.content.Intent p3, boolean p4) {}
        public void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) {}
        public void requestHideFillUi(int p0, android.view.autofill.AutofillId p1) {}
        public void notifyNoFillUi(int p0, android.view.autofill.AutofillId p1, int p2) {}
        public void notifyFillUiShown(int p0, android.view.autofill.AutofillId p1) {}
        public void notifyFillUiHidden(int p0, android.view.autofill.AutofillId p1) {}
        public void notifyDisableAutofill(long p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public void dispatchUnhandledKey(int p0, android.view.autofill.AutofillId p1, android.view.KeyEvent p2) {}
        public void startIntentSender(android.content.IntentSender p0, android.content.Intent p1) {}
        public void setTrackedViews(int p0, android.view.autofill.AutofillId[] p1, boolean p2, boolean p3, android.view.autofill.AutofillId[] p4, android.view.autofill.AutofillId p5) {}
        public void setSaveUiState(int p0, boolean p1) {}
        public void setSessionFinished(int p0, java.util.List<android.view.autofill.AutofillId> p1) {}
        public void getAugmentedAutofillClient(com.android.internal.os.IResultReceiver p0) {}
        public void requestShowSoftInput(android.view.autofill.AutofillId p0) {}
    }

    private final class CompatibilityBridge implements android.view.accessibility.AccessibilityManager.AccessibilityPolicy {
        private final android.graphics.Rect mFocusedBounds = null;
        private final android.graphics.Rect mTempBounds = null;
        private int mFocusedWindowId;
        private long mFocusedNodeId;
        android.accessibilityservice.AccessibilityServiceInfo mCompatServiceInfo;
        CompatibilityBridge(android.view.autofill.AutofillManager p0) {}
        private android.accessibilityservice.AccessibilityServiceInfo getCompatServiceInfo() { return null; }
        public boolean isEnabled(boolean p0) { return false; }
        public int getRelevantEventTypes(int p0) { return 0; }
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p0) { return null; }
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0, java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p1) { return null; }
        public android.view.accessibility.AccessibilityEvent onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, boolean p1, int p2) { return null; }
        private boolean notifyViewEntered(int p0, long p1, android.graphics.Rect p2) { return false; }
        private void notifyViewExited(int p0, long p1) {}
        private void notifyValueChanged(int p0, long p1) {}
        private void notifyViewClicked(int p0, long p1) {}
        private void updateTrackedViewsLocked() {}
        private android.view.View findViewByAccessibilityId(int p0, long p1) { return null; }
        private android.view.accessibility.AccessibilityNodeInfo findVirtualNodeByAccessibilityId(android.view.View p0, int p1) { return null; }
        private boolean isVirtualNode(int p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SmartSuggestionMode {
    }

    private class TrackedViews {
        private android.util.ArraySet<android.view.autofill.AutofillId> mVisibleTrackedIds;
        private android.util.ArraySet<android.view.autofill.AutofillId> mInvisibleTrackedIds;
        private <T extends java.lang.Object> boolean isInSet(android.util.ArraySet<T> p0, T p1) { return false; }
        private <T extends java.lang.Object> android.util.ArraySet<T> addToSet(android.util.ArraySet<T> p0, T p1) { return null; }
        private <T extends java.lang.Object> android.util.ArraySet<T> removeFromSet(android.util.ArraySet<T> p0, T p1) { return null; }
        TrackedViews(android.view.autofill.AutofillManager p0, android.view.autofill.AutofillId[] p1) {}
        void notifyViewVisibilityChangedLocked(android.view.autofill.AutofillId p0, boolean p1) {}
        void onVisibleForAutofillChangedLocked() {}
    }
}
