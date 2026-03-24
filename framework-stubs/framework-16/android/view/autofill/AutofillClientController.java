package android.view.autofill;

public final class AutofillClientController implements android.view.autofill.AutofillManager.AutofillClient, android.util.Dumpable {
    public static final boolean DEBUG = Boolean.valueOf(false);
    public static final java.lang.String LAST_AUTOFILL_ID = "android:lastAutofillId";
    public static final java.lang.String AUTOFILL_RESET_NEEDED = "@android:autofillResetNeeded";
    public static final java.lang.String AUTO_FILL_AUTH_WHO_PREFIX = "@android:autoFillAuth:";
    public static final java.lang.String DUMPABLE_NAME = "AutofillManager";
    public int mLastAutofillId;
    public AutofillClientController(android.app.Activity p0) {}
    public boolean isRelayoutFixEnabled() { return false; }
    public void onActivityAttached(android.app.Application p0) {}
    public void onActivityCreated(android.os.Bundle p0) {}
    public void onActivityStarted() {}
    public void onActivityResumed() {}
    public void onActivityPostResumed() {}
    public void onActivityPerformResume(boolean p0) {}
    public void onActivityPaused() {}
    public void onActivityStopped(android.content.Intent p0, boolean p1) {}
    public void onActivityDestroyed() {}
    public void onSaveInstanceState(android.os.Bundle p0) {}
    public void onActivityFinish(android.content.Intent p0) {}
    public void onActivityBackPressed(android.content.Intent p0) {}
    public void onDispatchActivityResult(int p0, int p1, android.content.Intent p2) {}
    public void onStartActivity(android.content.Intent p0, android.content.Intent p1) {}
    public void restoreAutofillSaveUi(android.content.Intent p0) {}
    public void enableAutofillCompatibilityIfNeeded() {}
    public java.lang.String getDumpableName() { return null; }
    public void dump(java.io.PrintWriter p0, java.lang.String[] p1) {}
    public int getNextAutofillId() { return 0; }
    public android.view.autofill.AutofillId autofillClientGetNextAutofillId() { return null; }
    public boolean autofillClientIsCompatibilityModeEnabled() { return false; }
    public boolean autofillClientIsVisibleForAutofill() { return false; }
    public android.content.ComponentName autofillClientGetComponentName() { return null; }
    public android.os.IBinder autofillClientGetActivityToken() { return null; }
    public boolean[] autofillClientGetViewVisibility(android.view.autofill.AutofillId[] p0) { return null; }
    public android.view.View autofillClientFindViewByAccessibilityIdTraversal(int p0, int p1) { return null; }
    public android.view.View autofillClientFindViewByAutofillIdTraversal(android.view.autofill.AutofillId p0) { return null; }
    public android.view.View[] autofillClientFindViewsByAutofillIdTraversal(android.view.autofill.AutofillId[] p0) { return null; }
    public java.util.List<android.view.View> autofillClientFindAutofillableViewsByTraversal() { return null; }
    public boolean autofillClientIsFillUiShowing() { return false; }
    public boolean autofillClientRequestHideFillUi() { return false; }
    public boolean autofillClientRequestShowFillUi(android.view.View p0, int p1, int p2, android.graphics.Rect p3, android.view.autofill.IAutofillWindowPresenter p4) { return false; }
    public void autofillClientDispatchUnhandledKey(android.view.View p0, android.view.KeyEvent p1) {}
    public boolean isDisablingEnterExitEventForAutofill() { return false; }
    public void autofillClientResetableStateAvailable() {}
    public void autofillClientRunOnUiThread(java.lang.Runnable p0) {}
    public void autofillClientAuthenticate(int p0, android.content.IntentSender p1, android.content.Intent p2, boolean p3) {}
    public boolean isActivityResumed() { return false; }
}
