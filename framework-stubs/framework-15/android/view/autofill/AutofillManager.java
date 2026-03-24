package android.view.autofill;

public final class AutofillManager {
    public static final java.lang.String EXTRA_ASSIST_STRUCTURE = "android.view.autofill.extra.ASSIST_STRUCTURE";
    public static final java.lang.String EXTRA_AUTHENTICATION_RESULT = "android.view.autofill.extra.AUTHENTICATION_RESULT";
    public static final java.lang.String EXTRA_AUTHENTICATION_RESULT_EPHEMERAL_DATASET = "android.view.autofill.extra.AUTHENTICATION_RESULT_EPHEMERAL_DATASET";
    public static final java.lang.String EXTRA_CLIENT_STATE = "android.view.autofill.extra.CLIENT_STATE";
    public static final java.lang.String EXTRA_AUTH_STATE = "android.view.autofill.extra.AUTH_STATE";
    public static final java.lang.String EXTRA_INLINE_SUGGESTIONS_REQUEST = "android.view.autofill.extra.INLINE_SUGGESTIONS_REQUEST";
    public static final java.lang.String EXTRA_RESTORE_SESSION_TOKEN = "android.view.autofill.extra.RESTORE_SESSION_TOKEN";
    public static final java.lang.String EXTRA_RESTORE_CROSS_ACTIVITY = "android.view.autofill.extra.RESTORE_CROSS_ACTIVITY";
    public static final java.lang.String EXTRA_AUGMENTED_AUTOFILL_CLIENT = "android.view.autofill.extra.AUGMENTED_AUTOFILL_CLIENT";
    public static final java.lang.String EXTRA_AUTOFILL_REQUEST_ID = "android.view.autofill.extra.AUTOFILL_REQUEST_ID";
    public static final java.lang.String ANY_HINT = "any";
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
    public static final int STATE_PENDING_AUTHENTICATION = 7;
    public static final int FC_SERVICE_TIMEOUT = 5000;
    public static final int MAX_TEMP_AUGMENTED_SERVICE_DURATION_MS = 120000;
    public static final int FLAG_SMART_SUGGESTION_OFF = 0;
    public static final int FLAG_SMART_SUGGESTION_SYSTEM = 1;
    public static final int RESULT_OK = 0;
    public static final int RESULT_CODE_NOT_SERVICE = -1;
    public static final int COMMIT_REASON_UNKNOWN = 0;
    public static final int COMMIT_REASON_ACTIVITY_FINISHED = 1;
    public static final int COMMIT_REASON_VIEW_COMMITTED = 2;
    public static final int COMMIT_REASON_VIEW_CLICKED = 3;
    public static final int COMMIT_REASON_VIEW_CHANGED = 4;
    public static final int COMMIT_REASON_SESSION_DESTROYED = 5;
    public static final int NO_SESSION = 2147483647;
    public static final java.lang.String PINNED_DATASET_ID = "PINNED_DATASET_ID";
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
    public boolean isTriggerFillRequestOnFilteredImportantViewsEnabled() { return false; }
    public boolean isTriggerFillRequestOnUnimportantViewEnabled() { return false; }
    public boolean shouldIncludeAllChildrenViewsWithAutofillTypeNotNoneInAssistStructure() { return false; }
    public boolean shouldIncludeAllChildrenViewInAssistStructure() { return false; }
    public boolean shouldAlwaysIncludeWebviewInAssistStructure() { return false; }
    public boolean shouldIncludeInvisibleViewInAssistStructure() { return false; }
    public boolean isActivityDeniedForAutofill() { return false; }
    public boolean isActivityAllowedForAutofill() { return false; }
    public boolean isAutofillable(android.view.View p0) { return false; }
    public void enableCompatibilityMode() {}
    public void onCreate(android.os.Bundle p0) {}
    public void onVisibleForAutofill() {}
    public void onInvisibleForAutofill(boolean p0) {}
    public void onSaveInstanceState(android.os.Bundle p0) {}
    public boolean isCompatibilityModeEnabledLocked() { return false; }
    public boolean isEnabled() { return false; }
    @android.annotation.Nullable
    public android.service.autofill.FillEventHistory getFillEventHistory() { return null; }
    public void requestAutofill(android.view.View p0) {}
    void requestAutofillFromNewSession(android.view.View p0) {}
    public void requestAutofill(android.view.View p0, int p1, android.graphics.Rect p2) {}
    public void notifyViewEntered(android.view.View p0) {}
    public void notifyVirtualViewsReady(android.view.View p0, android.util.SparseArray<android.view.autofill.VirtualViewFillInfo> p1) {}
    public void notifyViewEnteredForFillDialog(android.view.View p0) {}
    public void notifyViewExited(android.view.View p0) {}
    void notifyViewExitedLocked(android.view.View p0) {}
    public void notifyViewVisibilityChanged(android.view.View p0, boolean p1) {}
    public void notifyViewVisibilityChanged(android.view.View p0, int p1, boolean p2) {}
    public void notifyViewEntered(android.view.View p0, int p1, android.graphics.Rect p2) {}
    public void notifyViewExited(android.view.View p0, int p1) {}
    public void notifyValueChanged(android.view.View p0) {}
    public void notifyValueChanged(android.view.View p0, int p1, android.view.autofill.AutofillValue p2) {}
    public void notifyViewClicked(android.view.View p0) {}
    public void notifyViewClicked(android.view.View p0, int p1) {}
    public void onActivityFinishing() {}
    public void commit() {}
    public void cancel() {}
    public void disableOwnedAutofillServices() {}
    public void disableAutofillServices() {}
    public boolean hasEnabledAutofillServices() { return false; }
    @android.annotation.Nullable
    public android.content.ComponentName getAutofillServiceComponentName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getUserDataId() { return null; }
    @android.annotation.Nullable
    public android.service.autofill.UserData getUserData() { return null; }
    public void setUserData(android.service.autofill.UserData p0) {}
    public boolean isFieldClassificationEnabled() { return false; }
    @android.annotation.Nullable
    public java.lang.String getDefaultFieldClassificationAlgorithm() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAvailableFieldClassificationAlgorithms() { return null; }
    public boolean isAutofillSupported() { return false; }
    public boolean isAutofillUiShowing() { return false; }
    public boolean shouldIgnoreCredentialViews() { return false; }
    public void onAuthenticationResult(int p0, android.content.Intent p1, android.view.View p2) {}
    @android.annotation.Nullable
    public android.view.autofill.AutofillId getNextAutofillId() { return null; }
    public void registerCallback(android.view.autofill.AutofillManager.AutofillCallback p0) {}
    public void unregisterCallback(android.view.autofill.AutofillManager.AutofillCallback p0) {}
    @android.annotation.SystemApi
    public void setAugmentedAutofillWhitelist(java.util.Set<java.lang.String> p0, java.util.Set<android.content.ComponentName> p1) {}
    public void notifyViewEnteredForAugmentedAutofill(android.view.View p0) {}
    public void requestHideFillUi() {}
    void notifyReenableAutofill() {}
    public boolean hasAutofillFeature() { return false; }
    public void onPendingSaveUi(int p0, android.os.IBinder p1) {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public static java.lang.String getSmartSuggestionModeToString(int p0) { return null; }
    public boolean showAutofillDialog(android.view.View p0) { return false; }
    public boolean showAutofillDialog(android.view.View p0, int p1) { return false; }

    private static final class AugmentedAutofillManagerClient extends android.view.autofill.IAugmentedAutofillManagerClient.Stub {
        @android.annotation.Nullable
        public android.app.assist.AssistStructure.ViewNodeParcelable getViewNodeParcelable(android.view.autofill.AutofillId p0) { return null; }
        public android.graphics.Rect getViewCoordinates(android.view.autofill.AutofillId p0) { return null; }
        public void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) {}
        public void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) {}
        public void requestHideFillUi(int p0, android.view.autofill.AutofillId p1) {}
        public boolean requestAutofill(int p0, android.view.autofill.AutofillId p1) { return false; }
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
        @android.annotation.NonNull
        public boolean[] autofillClientGetViewVisibility(android.view.autofill.AutofillId[] p0);
        public boolean autofillClientIsVisibleForAutofill();
        public boolean isDisablingEnterExitEventForAutofill();
        @android.annotation.NonNull
        public android.view.View[] autofillClientFindViewsByAutofillIdTraversal(android.view.autofill.AutofillId[] p0);
        @android.annotation.Nullable
        public android.view.View autofillClientFindViewByAutofillIdTraversal(android.view.autofill.AutofillId p0);
        @android.annotation.Nullable
        public android.view.View autofillClientFindViewByAccessibilityIdTraversal(int p0, int p1);
        public void autofillClientRunOnUiThread(java.lang.Runnable p0);
        public android.content.ComponentName autofillClientGetComponentName();
        @android.annotation.Nullable
        public android.os.IBinder autofillClientGetActivityToken();
        public boolean autofillClientIsCompatibilityModeEnabled();
        @android.annotation.Nullable
        public android.view.autofill.AutofillId autofillClientGetNextAutofillId();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutofillCommitReason {
    }

    private static final class AutofillManagerClient extends android.view.autofill.IAutoFillManagerClient.Stub {
        public void setState(int p0) {}
        public void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) {}
        public void onGetCredentialResponse(int p0, android.view.autofill.AutofillId p1, android.credentials.GetCredentialResponse p2) {}
        public void onGetCredentialException(int p0, android.view.autofill.AutofillId p1, java.lang.String p2, java.lang.String p3) {}
        public void autofillContent(int p0, android.view.autofill.AutofillId p1, android.content.ClipData p2) {}
        public void authenticate(int p0, int p1, android.content.IntentSender p2, android.content.Intent p3, boolean p4) {}
        public void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) {}
        public void requestHideFillUi(int p0, android.view.autofill.AutofillId p1) {}
        public void requestHideFillUiWhenDestroyed(int p0, android.view.autofill.AutofillId p1) {}
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
        public void notifyFillDialogTriggerIds(java.util.List<android.view.autofill.AutofillId> p0) {}
    }

    private final class CompatibilityBridge implements android.view.accessibility.AccessibilityManager.AccessibilityPolicy {
        @android.annotation.NonNull
        android.accessibilityservice.AccessibilityServiceInfo mCompatServiceInfo;
        CompatibilityBridge(android.view.autofill.AutofillManager p0) {}
        public boolean isEnabled(boolean p0) { return false; }
        public int getRelevantEventTypes(int p0) { return 0; }
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p0) { return null; }
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0, java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p1) { return null; }
        public android.view.accessibility.AccessibilityEvent onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, boolean p1, int p2) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SmartSuggestionMode {
    }

    private class TrackedViews {
        boolean mHasNewTrackedView;
        boolean mIsTrackedSaveView;
        TrackedViews(android.view.autofill.AutofillManager p0, android.view.autofill.AutofillId[] p1, android.view.autofill.AutofillId[] p2) {}
        void notifyViewVisibilityChangedLocked(android.view.autofill.AutofillId p0, boolean p1) {}
        void onVisibleForAutofillChangedLocked() {}
        void onVisibleForAutofillChangedInternalLocked(android.util.ArraySet<android.view.autofill.AutofillId> p0, android.util.ArraySet<android.view.autofill.AutofillId> p1) {}
        void checkViewState(android.view.autofill.AutofillId p0) {}
    }
}
