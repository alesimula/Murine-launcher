package android.app;

public class Activity extends android.view.ContextThemeWrapper implements android.view.LayoutInflater.Factory2, android.view.Window.Callback, android.view.KeyEvent.Callback, android.view.View.OnCreateContextMenuListener, android.content.ComponentCallbacks2, android.view.Window.OnWindowDismissedCallback, android.view.contentcapture.ContentCaptureManager.ContentCaptureClient {
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_OK = -1;
    public static final int RESULT_FIRST_USER = 1;
    public static final int DONT_FINISH_TASK_WITH_ACTIVITY = 0;
    public static final int FINISH_TASK_WITH_ROOT_ACTIVITY = 1;
    public static final int FINISH_TASK_WITH_ACTIVITY = 2;
    static final java.lang.String FRAGMENTS_TAG = "android:fragments";
    public static final java.lang.String DUMP_ARG_AUTOFILL = "--autofill";
    public static final java.lang.String DUMP_ARG_CONTENT_CAPTURE = "--contentcapture";
    public static final java.lang.String DUMP_ARG_TRANSLATION = "--translation";
    public static final java.lang.String DUMP_ARG_LIST_DUMPABLES = "--list-dumpables";
    public static final java.lang.String DUMP_ARG_DUMP_DUMPABLE = "--dump-dumpable";
    java.lang.String mEmbeddedID;
    android.content.Intent mIntent;
    java.lang.String mReferrer;
    android.content.pm.ActivityInfo mActivityInfo;
    android.app.ActivityThread mMainThread;
    android.app.Activity mParent;
    boolean mCalled;
    boolean mResumed;
    boolean mStopped;
    boolean mFinished;
    boolean mStartedActivity;
    boolean mChangingConfigurations;
    int mConfigChangeFlags;
    android.content.res.Configuration mCurrentConfig;
    android.app.Activity.NonConfigurationInstances mLastNonConfigurationInstances;
    android.view.View mDecor;
    boolean mWindowAdded;
    boolean mVisibleFromServer;
    boolean mVisibleFromClient;
    android.app.ActionBar mActionBar;
    android.app.VoiceInteractor mVoiceInteractor;
    final android.os.Handler mHandler = null;
    final android.app.FragmentController mFragments = null;
    android.app.ActivityOptions mPendingOptions;
    boolean mLaunchedFromBubble;
    int mResultCode;
    android.content.Intent mResultData;
    protected static final int[] FOCUSED_STATE_SET = null;
    android.app.ActivityTransitionState mActivityTransitionState;
    android.app.SharedElementCallback mEnterTransitionListener;
    android.app.SharedElementCallback mExitTransitionListener;
    boolean mEnterAnimationComplete;
    boolean mIsInPictureInPictureMode;
    public static final int FULLSCREEN_MODE_REQUEST_EXIT = 0;
    public static final int FULLSCREEN_MODE_REQUEST_ENTER = 1;
    public static final int OVERRIDE_TRANSITION_OPEN = 0;
    public static final int OVERRIDE_TRANSITION_CLOSE = 1;
    public static final int DEFAULT_KEYS_DISABLE = 0;
    public static final int DEFAULT_KEYS_DIALER = 1;
    public static final int DEFAULT_KEYS_SHORTCUT = 2;
    public static final int DEFAULT_KEYS_SEARCH_LOCAL = 3;
    public static final int DEFAULT_KEYS_SEARCH_GLOBAL = 4;
    public Activity() { super(); }
    public android.content.Intent getIntent() { return null; }
    public void setIntent(android.content.Intent p0) {}
    public void setLocusContext(android.content.LocusId p0, android.os.Bundle p1) {}
    public final android.app.Application getApplication() { return null; }
    public final boolean isChild() { return false; }
    public final android.app.Activity getParent() { return null; }
    public android.view.WindowManager getWindowManager() { return null; }
    public android.view.Window getWindow() { return null; }
    @java.lang.Deprecated
    public android.app.LoaderManager getLoaderManager() { return null; }
    public android.view.View getCurrentFocus() { return null; }
    protected void attachBaseContext(android.content.Context p0) {}
    public final android.view.autofill.AutofillManager.AutofillClient getAutofillClient() { return null; }
    public final android.view.contentcapture.ContentCaptureManager.ContentCaptureClient getContentCaptureClient() { return null; }
    public void registerActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks p0) {}
    public void unregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks p0) {}
    public void registerComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public void unregisterComponentCallbacks(android.content.ComponentCallbacks p0) {}
    protected void onCreate(android.os.Bundle p0) {}
    public final android.window.SplashScreen getSplashScreen() { return null; }
    public void onCreate(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    final void performRestoreInstanceState(android.os.Bundle p0) {}
    final void performRestoreInstanceState(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    protected void onRestoreInstanceState(android.os.Bundle p0) {}
    public void onRestoreInstanceState(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    protected void onPostCreate(android.os.Bundle p0) {}
    public void onPostCreate(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    protected void onStart() {}
    protected void onRestart() {}
    @java.lang.Deprecated
    public void onStateNotSaved() {}
    protected void onResume() {}
    protected void onPostResume() {}
    public void onTopResumedActivityChanged(boolean p0) {}
    final void performTopResumedActivityChanged(boolean p0, java.lang.String p1) {}
    void setVoiceInteractor(com.android.internal.app.IVoiceInteractor p0) {}
    public int getNextAutofillId() { return 0; }
    public boolean isVoiceInteraction() { return false; }
    public boolean isVoiceInteractionRoot() { return false; }
    public android.app.VoiceInteractor getVoiceInteractor() { return null; }
    public boolean isLocalVoiceInteractionSupported() { return false; }
    public void startLocalVoiceInteraction(android.os.Bundle p0) {}
    public void onLocalVoiceInteractionStarted() {}
    public void onLocalVoiceInteractionStopped() {}
    public void stopLocalVoiceInteraction() {}
    protected void onNewIntent(android.content.Intent p0) {}
    final void performSaveInstanceState(android.os.Bundle p0) {}
    final void performSaveInstanceState(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    public void onSaveInstanceState(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    protected void onPause() {}
    protected void onUserLeaveHint() {}
    @java.lang.Deprecated
    public boolean onCreateThumbnail(android.graphics.Bitmap p0, android.graphics.Canvas p1) { return false; }
    public java.lang.CharSequence onCreateDescription() { return null; }
    public void onProvideAssistData(android.os.Bundle p0) {}
    public void onProvideAssistContent(android.app.assist.AssistContent p0) {}
    public void onGetDirectActions(android.os.CancellationSignal p0, java.util.function.Consumer<java.util.List<android.app.DirectAction>> p1) {}
    public void onPerformDirectAction(java.lang.String p0, android.os.Bundle p1, android.os.CancellationSignal p2, java.util.function.Consumer<android.os.Bundle> p3) {}
    public final void requestShowKeyboardShortcuts() {}
    public final void dismissKeyboardShortcutsHelper() {}
    public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> p0, android.view.Menu p1, int p2) {}
    public boolean showAssist(android.os.Bundle p0) { return false; }
    protected void onStop() {}
    protected void onDestroy() {}
    public void reportFullyDrawn() {}
    public void onMultiWindowModeChanged(boolean p0, android.content.res.Configuration p1) {}
    @java.lang.Deprecated
    public void onMultiWindowModeChanged(boolean p0) {}
    public boolean isInMultiWindowMode() { return false; }
    public void onPictureInPictureModeChanged(boolean p0, android.content.res.Configuration p1) {}
    public void onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState p0) {}
    @java.lang.Deprecated
    public void onPictureInPictureModeChanged(boolean p0) {}
    public boolean isInPictureInPictureMode() { return false; }
    @java.lang.Deprecated
    public void enterPictureInPictureMode() {}
    public boolean enterPictureInPictureMode(android.app.PictureInPictureParams p0) { return false; }
    public void setPictureInPictureParams(android.app.PictureInPictureParams p0) {}
    public int getMaxNumPictureInPictureActions() { return 0; }
    public boolean onPictureInPictureRequested() { return false; }
    public void requestFullscreenMode(int p0, android.os.OutcomeReceiver<java.lang.Void, java.lang.Throwable> p1) {}
    public void setShouldDockBigOverlays(boolean p0) {}
    public boolean shouldDockBigOverlays() { return false; }
    void dispatchMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    public void onMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public int getChangingConfigurations() { return 0; }
    public java.lang.Object getLastNonConfigurationInstance() { return null; }
    public java.lang.Object onRetainNonConfigurationInstance() { return null; }
    java.util.HashMap<java.lang.String, java.lang.Object> getLastNonConfigurationChildInstances() { return null; }
    java.util.HashMap<java.lang.String, java.lang.Object> onRetainNonConfigurationChildInstances() { return null; }
    android.app.Activity.NonConfigurationInstances retainNonConfigurationInstances() { return null; }
    public void onLowMemory() {}
    public void onTrimMemory(int p0) {}
    @java.lang.Deprecated
    public android.app.FragmentManager getFragmentManager() { return null; }
    @java.lang.Deprecated
    public void onAttachFragment(android.app.Fragment p0) {}
    @java.lang.Deprecated
    public final android.database.Cursor managedQuery(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String p3) { return null; }
    @java.lang.Deprecated
    public final android.database.Cursor managedQuery(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    @java.lang.Deprecated
    public void startManagingCursor(android.database.Cursor p0) {}
    @java.lang.Deprecated
    public void stopManagingCursor(android.database.Cursor p0) {}
    @java.lang.Deprecated
    public void setPersistent(boolean p0) {}
    public <T extends android.view.View> T findViewById(int p0) { return null; }
    public final <T extends android.view.View> T requireViewById(int p0) { return null; }
    public android.app.ActionBar getActionBar() { return null; }
    public void setActionBar(android.widget.Toolbar p0) {}
    public void setContentView(int p0) {}
    public void setContentView(android.view.View p0) {}
    public void setContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void addContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public android.transition.TransitionManager getContentTransitionManager() { return null; }
    public void setContentTransitionManager(android.transition.TransitionManager p0) {}
    public android.transition.Scene getContentScene() { return null; }
    public void setFinishOnTouchOutside(boolean p0) {}
    public final void setDefaultKeyMode(int p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    @java.lang.Deprecated
    public void onBackPressed() {}
    public boolean onKeyShortcut(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public void onUserInteraction() {}
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams p0) {}
    public void onContentChanged() {}
    public void onWindowFocusChanged(boolean p0) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public boolean hasWindowFocus() { return false; }
    public void onWindowDismissed(boolean p0, boolean p1) {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public android.view.View onCreatePanelView(int p0) { return null; }
    public boolean onCreatePanelMenu(int p0, android.view.Menu p1) { return false; }
    public boolean onPreparePanel(int p0, android.view.View p1, android.view.Menu p2) { return false; }
    public boolean onMenuOpened(int p0, android.view.Menu p1) { return false; }
    public boolean onMenuItemSelected(int p0, android.view.MenuItem p1) { return false; }
    public void onPanelClosed(int p0, android.view.Menu p1) {}
    public void invalidateOptionsMenu() {}
    public boolean onCreateOptionsMenu(android.view.Menu p0) { return false; }
    public boolean onPrepareOptionsMenu(android.view.Menu p0) { return false; }
    public boolean onOptionsItemSelected(android.view.MenuItem p0) { return false; }
    public boolean onNavigateUp() { return false; }
    @java.lang.Deprecated
    public boolean onNavigateUpFromChild(android.app.Activity p0) { return false; }
    public void onCreateNavigateUpTaskStack(android.app.TaskStackBuilder p0) {}
    public void onPrepareNavigateUpTaskStack(android.app.TaskStackBuilder p0) {}
    public void onOptionsMenuClosed(android.view.Menu p0) {}
    public void openOptionsMenu() {}
    public void closeOptionsMenu() {}
    public void onCreateContextMenu(android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu.ContextMenuInfo p2) {}
    public void registerForContextMenu(android.view.View p0) {}
    public void unregisterForContextMenu(android.view.View p0) {}
    public void openContextMenu(android.view.View p0) {}
    public void closeContextMenu() {}
    public boolean onContextItemSelected(android.view.MenuItem p0) { return false; }
    public void onContextMenuClosed(android.view.Menu p0) {}
    @java.lang.Deprecated
    protected android.app.Dialog onCreateDialog(int p0) { return null; }
    @java.lang.Deprecated
    protected android.app.Dialog onCreateDialog(int p0, android.os.Bundle p1) { return null; }
    @java.lang.Deprecated
    protected void onPrepareDialog(int p0, android.app.Dialog p1) {}
    @java.lang.Deprecated
    protected void onPrepareDialog(int p0, android.app.Dialog p1, android.os.Bundle p2) {}
    @java.lang.Deprecated
    public final void showDialog(int p0) {}
    @java.lang.Deprecated
    public final boolean showDialog(int p0, android.os.Bundle p1) { return false; }
    @java.lang.Deprecated
    public final void dismissDialog(int p0) {}
    @java.lang.Deprecated
    public final void removeDialog(int p0) {}
    public boolean onSearchRequested(android.view.SearchEvent p0) { return false; }
    public boolean onSearchRequested() { return false; }
    public final android.view.SearchEvent getSearchEvent() { return null; }
    public void startSearch(java.lang.String p0, boolean p1, android.os.Bundle p2, boolean p3) {}
    public void triggerSearch(java.lang.String p0, android.os.Bundle p1) {}
    public void takeKeyEvents(boolean p0) {}
    public final boolean requestWindowFeature(int p0) { return false; }
    public final void setFeatureDrawableResource(int p0, int p1) {}
    public final void setFeatureDrawableUri(int p0, android.net.Uri p1) {}
    public final void setFeatureDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public final void setFeatureDrawableAlpha(int p0, int p1) {}
    public android.view.LayoutInflater getLayoutInflater() { return null; }
    public android.view.MenuInflater getMenuInflater() { return null; }
    public void setTheme(int p0) {}
    protected void onApplyThemeResource(android.content.res.Resources.Theme p0, int p1, boolean p2) {}
    public final void requestPermissions(java.lang.String[] p0, int p1) {}
    public void onRequestPermissionsResult(int p0, java.lang.String[] p1, int[] p2) {}
    public boolean shouldShowRequestPermissionRationale(java.lang.String p0) { return false; }
    public void startActivityForResult(android.content.Intent p0, int p1) {}
    public void startActivityForResult(android.content.Intent p0, int p1, android.os.Bundle p2) {}
    public boolean isActivityTransitionRunning() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void startActivityForResultAsUser(android.content.Intent p0, int p1, android.os.UserHandle p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void startActivityForResultAsUser(android.content.Intent p0, int p1, android.os.Bundle p2, android.os.UserHandle p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void startActivityForResultAsUser(android.content.Intent p0, java.lang.String p1, int p2, android.os.Bundle p3, android.os.UserHandle p4) {}
    public void startActivityAsUser(android.content.Intent p0, android.os.UserHandle p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void startActivityAsUser(android.content.Intent p0, android.os.Bundle p1, android.os.UserHandle p2) {}
    public void startActivityAsCaller(android.content.Intent p0, android.os.Bundle p1, boolean p2, int p3) {}
    public void startActivityAsCaller(android.content.Intent p0, android.os.Bundle p1, boolean p2, int p3, int p4) {}
    public void startIntentSenderForResult(android.content.IntentSender p0, int p1, android.content.Intent p2, int p3, int p4, int p5) throws android.content.IntentSender.SendIntentException {}
    public void startIntentSenderForResult(android.content.IntentSender p0, java.lang.String p1, int p2, android.content.Intent p3, int p4, int p5, android.os.Bundle p6) throws android.content.IntentSender.SendIntentException {}
    public void startIntentSenderForResult(android.content.IntentSender p0, int p1, android.content.Intent p2, int p3, int p4, int p5, android.os.Bundle p6) throws android.content.IntentSender.SendIntentException {}
    public void startIntentSenderForResultInner(android.content.IntentSender p0, java.lang.String p1, int p2, android.content.Intent p3, int p4, int p5, android.os.Bundle p6) throws android.content.IntentSender.SendIntentException {}
    public void startActivity(android.content.Intent p0) {}
    public void startActivity(android.content.Intent p0, android.os.Bundle p1) {}
    public void startActivities(android.content.Intent[] p0) {}
    public void startActivities(android.content.Intent[] p0, android.os.Bundle p1) {}
    public void startIntentSender(android.content.IntentSender p0, android.content.Intent p1, int p2, int p3, int p4) throws android.content.IntentSender.SendIntentException {}
    public void startIntentSender(android.content.IntentSender p0, android.content.Intent p1, int p2, int p3, int p4, android.os.Bundle p5) throws android.content.IntentSender.SendIntentException {}
    public boolean startActivityIfNeeded(android.content.Intent p0, int p1) { return false; }
    public boolean startActivityIfNeeded(android.content.Intent p0, int p1, android.os.Bundle p2) { return false; }
    public boolean startNextMatchingActivity(android.content.Intent p0) { return false; }
    public boolean startNextMatchingActivity(android.content.Intent p0, android.os.Bundle p1) { return false; }
    @java.lang.Deprecated
    public void startActivityFromChild(android.app.Activity p0, android.content.Intent p1, int p2) {}
    @java.lang.Deprecated
    public void startActivityFromChild(android.app.Activity p0, android.content.Intent p1, int p2, android.os.Bundle p3) {}
    @java.lang.Deprecated
    public void startActivityFromFragment(android.app.Fragment p0, android.content.Intent p1, int p2) {}
    @java.lang.Deprecated
    public void startActivityFromFragment(android.app.Fragment p0, android.content.Intent p1, int p2, android.os.Bundle p3) {}
    public void startActivityForResult(java.lang.String p0, android.content.Intent p1, int p2, android.os.Bundle p3) {}
    public boolean canStartActivityForResult() { return false; }
    @java.lang.Deprecated
    public void startIntentSenderFromChild(android.app.Activity p0, android.content.IntentSender p1, int p2, android.content.Intent p3, int p4, int p5, int p6) throws android.content.IntentSender.SendIntentException {}
    @java.lang.Deprecated
    public void startIntentSenderFromChild(android.app.Activity p0, android.content.IntentSender p1, int p2, android.content.Intent p3, int p4, int p5, int p6, android.os.Bundle p7) throws android.content.IntentSender.SendIntentException {}
    public void overrideActivityTransition(int p0, int p1, int p2) {}
    public void overrideActivityTransition(int p0, int p1, int p2, int p3) {}
    public void clearOverrideActivityTransition(int p0) {}
    @java.lang.Deprecated
    public void overridePendingTransition(int p0, int p1) {}
    @java.lang.Deprecated
    public void overridePendingTransition(int p0, int p1, int p2) {}
    public final void setResult(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public final void setForceSendResultForMediaProjection() {}
    public final void setResult(int p0, android.content.Intent p1) {}
    public android.net.Uri getReferrer() { return null; }
    public android.net.Uri onProvideReferrer() { return null; }
    public java.lang.String getCallingPackage() { return null; }
    public android.content.ComponentName getCallingActivity() { return null; }
    public int getLaunchedFromUid() { return 0; }
    public java.lang.String getLaunchedFromPackage() { return null; }
    public void setVisible(boolean p0) {}
    void makeVisible() {}
    public boolean isFinishing() { return false; }
    public boolean isDestroyed() { return false; }
    public boolean isChangingConfigurations() { return false; }
    public void recreate() {}
    public void finish() {}
    public void finishAffinity() {}
    @java.lang.Deprecated
    public void finishFromChild(android.app.Activity p0) {}
    public void finishAfterTransition() {}
    public void finishActivity(int p0) {}
    @java.lang.Deprecated
    public void finishActivityFromChild(android.app.Activity p0, int p1) {}
    public void finishAndRemoveTask() {}
    public boolean releaseInstance() { return false; }
    protected void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    public void onActivityReenter(int p0, android.content.Intent p1) {}
    public android.app.PendingIntent createPendingResult(int p0, android.content.Intent p1, int p2) { return null; }
    public void setRequestedOrientation(int p0) {}
    public int getRequestedOrientation() { return 0; }
    public int getTaskId() { return 0; }
    public boolean isTaskRoot() { return false; }
    public boolean moveTaskToBack(boolean p0) { return false; }
    public java.lang.String getLocalClassName() { return null; }
    public android.content.ComponentName getComponentName() { return null; }
    public final android.content.ComponentName contentCaptureClientGetComponentName() { return null; }
    public android.content.SharedPreferences getPreferences(int p0) { return null; }
    public boolean isLaunchedFromBubble() { return false; }
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public void setTitle(java.lang.CharSequence p0) {}
    public void setTitle(int p0) {}
    @java.lang.Deprecated
    public void setTitleColor(int p0) {}
    public final java.lang.CharSequence getTitle() { return null; }
    public final int getTitleColor() { return 0; }
    protected void onTitleChanged(java.lang.CharSequence p0, int p1) {}
    protected void onChildTitleChanged(android.app.Activity p0, java.lang.CharSequence p1) {}
    public void setTaskDescription(android.app.ActivityManager.TaskDescription p0) {}
    @java.lang.Deprecated
    public final void setProgressBarVisibility(boolean p0) {}
    @java.lang.Deprecated
    public final void setProgressBarIndeterminateVisibility(boolean p0) {}
    @java.lang.Deprecated
    public final void setProgressBarIndeterminate(boolean p0) {}
    @java.lang.Deprecated
    public final void setProgress(int p0) {}
    @java.lang.Deprecated
    public final void setSecondaryProgress(int p0) {}
    public final void setVolumeControlStream(int p0) {}
    public final int getVolumeControlStream() { return 0; }
    public final void setMediaController(android.media.session.MediaController p0) {}
    public final android.media.session.MediaController getMediaController() { return null; }
    public final void runOnUiThread(java.lang.Runnable p0) {}
    public android.view.View onCreateView(java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2) { return null; }
    public android.view.View onCreateView(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3) { return null; }
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public final boolean addDumpable(android.util.Dumpable p0) { return false; }
    @android.annotation.SuppressLint("OnNameExpected")
    public void dumpInternal(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    void dumpInner(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    public boolean isImmersive() { return false; }
    final boolean isTopOfTask() { return false; }
    public boolean setTranslucent(boolean p0) { return false; }
    @android.annotation.SystemApi
    public void convertFromTranslucent() {}
    @android.annotation.SystemApi
    public boolean convertToTranslucent(android.app.Activity.TranslucentConversionListener p0, android.app.ActivityOptions p1) { return false; }
    void onTranslucentConversionComplete(boolean p0) {}
    public void onNewActivityOptions(android.app.ActivityOptions p0) {}
    android.app.ActivityOptions getActivityOptions() { return null; }
    @java.lang.Deprecated
    public boolean requestVisibleBehind(boolean p0) { return false; }
    @java.lang.Deprecated
    public void onVisibleBehindCanceled() {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean isBackgroundVisibleBehind() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void onBackgroundVisibleBehindChanged(boolean p0) {}
    public void onEnterAnimationComplete() {}
    public void dispatchEnterAnimationComplete() {}
    public void setImmersive(boolean p0) {}
    public void setVrModeEnabled(boolean p0, android.content.ComponentName p1) throws android.content.pm.PackageManager.NameNotFoundException {}
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
    public void onActionModeStarted(android.view.ActionMode p0) {}
    public void onActionModeFinished(android.view.ActionMode p0) {}
    public boolean shouldUpRecreateTask(android.content.Intent p0) { return false; }
    public boolean navigateUpTo(android.content.Intent p0) { return false; }
    @java.lang.Deprecated
    public boolean navigateUpToFromChild(android.app.Activity p0, android.content.Intent p1) { return false; }
    public android.content.Intent getParentActivityIntent() { return null; }
    public void setEnterSharedElementCallback(android.app.SharedElementCallback p0) {}
    public void setExitSharedElementCallback(android.app.SharedElementCallback p0) {}
    public void postponeEnterTransition() {}
    public void startPostponedEnterTransition() {}
    public android.view.DragAndDropPermissions requestDragAndDropPermissions(android.view.DragEvent p0) { return null; }
    final void setParent(android.app.Activity p0) {}
    final void attach(android.content.Context p0, android.app.ActivityThread p1, android.app.Instrumentation p2, android.os.IBinder p3, int p4, android.app.Application p5, android.content.Intent p6, android.content.pm.ActivityInfo p7, java.lang.CharSequence p8, android.app.Activity p9, java.lang.String p10, android.app.Activity.NonConfigurationInstances p11, android.content.res.Configuration p12, java.lang.String p13, com.android.internal.app.IVoiceInteractor p14, android.view.Window p15, android.view.ViewRootImpl.ActivityConfigCallback p16, android.os.IBinder p17, android.os.IBinder p18) {}
    public final android.os.IBinder getActivityToken() { return null; }
    public final android.os.IBinder getAssistToken() { return null; }
    public final android.os.IBinder getShareableActivityToken() { return null; }
    public final android.app.ActivityThread getActivityThread() { return null; }
    public final android.content.pm.ActivityInfo getActivityInfo() { return null; }
    final void performCreate(android.os.Bundle p0) {}
    final void performCreate(android.os.Bundle p0, android.os.PersistableBundle p1) {}
    final void performNewIntent(android.content.Intent p0) {}
    final void performStart(java.lang.String p0) {}
    final void performRestart(boolean p0) {}
    final void performResume(boolean p0, java.lang.String p1) {}
    final void performPause() {}
    final void performUserLeaving() {}
    final void performStop(boolean p0, java.lang.String p1) {}
    final void performDestroy() {}
    final void dispatchMultiWindowModeChanged(boolean p0, android.content.res.Configuration p1) {}
    final void dispatchPictureInPictureModeChanged(boolean p0, android.content.res.Configuration p1) {}
    public final boolean isResumed() { return false; }
    void dispatchActivityResult(java.lang.String p0, int p1, int p2, android.content.Intent p3, java.lang.String p4) {}
    public void startLockTask() {}
    public void stopLockTask() {}
    public void showLockTaskEscapeMessage() {}
    public boolean isOverlayWithDecorCaptionEnabled() { return false; }
    public void setOverlayWithDecorCaptionEnabled(boolean p0) {}
    public final boolean isVisibleForAutofill() { return false; }
    public void setDisablePreviewScreenshots(boolean p0) {}
    public void setRecentsScreenshotEnabled(boolean p0) {}
    public void setShowWhenLocked(boolean p0) {}
    public void setInheritShowWhenLocked(boolean p0) {}
    public void setTurnScreenOn(boolean p0) {}
    public void setAllowCrossUidActivitySwitchFromBelow(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_REMOTE_APP_TRANSITION_ANIMATIONS")
    public void registerRemoteAnimations(android.view.RemoteAnimationDefinition p0) {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_REMOTE_APP_TRANSITION_ANIMATIONS")
    public void unregisterRemoteAnimations() {}
    public void updateUiTranslationState(int p0, android.view.translation.TranslationSpec p1, android.view.translation.TranslationSpec p2, java.util.List<android.view.autofill.AutofillId> p3, android.view.translation.UiTranslationSpec p4) {}
    public void enableTaskLocaleOverride() {}
    public android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher() { return null; }
    @android.annotation.RequiresPermission("android.permission.DETECT_SCREEN_CAPTURE")
    public void registerScreenCaptureCallback(java.util.concurrent.Executor p0, android.app.Activity.ScreenCaptureCallback p1) {}
    @android.annotation.RequiresPermission("android.permission.DETECT_SCREEN_CAPTURE")
    public void unregisterScreenCaptureCallback(android.app.Activity.ScreenCaptureCallback p0) {}

    public static interface ScreenCaptureCallback {
        public void onScreenCaptured();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ContentCaptureNotificationType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface DefaultKeyMode {
    }

    public static @interface FullscreenModeRequest {
    }

    class HostCallbacks extends android.app.FragmentHostCallback<android.app.Activity> {
        public HostCallbacks(android.app.Activity p0) { super((android.content.Context)null, (android.os.Handler)null, 0); }
        public void onDump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        public boolean onShouldSaveFragmentState(android.app.Fragment p0) { return false; }
        public android.view.LayoutInflater onGetLayoutInflater() { return null; }
        public boolean onUseFragmentManagerInflaterFactory() { return false; }
        public android.app.Activity onGetHost() { return null; }
        public void onInvalidateOptionsMenu() {}
        public void onStartActivityFromFragment(android.app.Fragment p0, android.content.Intent p1, int p2, android.os.Bundle p3) {}
        public void onStartActivityAsUserFromFragment(android.app.Fragment p0, android.content.Intent p1, int p2, android.os.Bundle p3, android.os.UserHandle p4) {}
        public void onStartIntentSenderFromFragment(android.app.Fragment p0, android.content.IntentSender p1, int p2, android.content.Intent p3, int p4, int p5, int p6, android.os.Bundle p7) throws android.content.IntentSender.SendIntentException {}
        public void onRequestPermissionsFromFragment(android.app.Fragment p0, java.lang.String[] p1, int p2) {}
        public boolean onHasWindowAnimations() { return false; }
        public int onGetWindowAnimations() { return 0; }
        public void onAttachFragment(android.app.Fragment p0) {}
        public <T extends android.view.View> T onFindViewById(int p0) { return null; }
        public boolean onHasView() { return false; }
    }

    private static final class ManagedCursor {
        ManagedCursor(android.database.Cursor p0) {}
    }

    private static class ManagedDialog {
        android.app.Dialog mDialog;
        android.os.Bundle mArgs;
    }

    static final class NonConfigurationInstances {
        java.lang.Object activity;
        java.util.HashMap<java.lang.String, java.lang.Object> children;
        android.app.FragmentManagerNonConfig fragments;
        android.util.ArrayMap<java.lang.String, android.app.LoaderManager> loaders;
        android.app.VoiceInteractor voiceInteractor;
        NonConfigurationInstances() {}
    }

    public static @interface OverrideTransition {
    }

    private static final class RequestFinishCallback extends android.app.IRequestFinishCallback.Stub {
        RequestFinishCallback(java.lang.ref.WeakReference<android.app.Activity> p0) { super(); }
        public void requestFinish() {}
    }

    @android.annotation.SystemApi
    public static interface TranslucentConversionListener {
        public void onTranslucentConversionComplete(boolean p0);
    }
}
