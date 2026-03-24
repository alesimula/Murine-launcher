package android.service.voice;

public class VoiceInteractionSession implements android.view.KeyEvent.Callback, android.content.ComponentCallbacks2 {
    static final java.lang.String TAG = "VoiceInteractionSession";
    static final boolean DEBUG = false;
    public static final int SHOW_WITH_ASSIST = 1;
    public static final int SHOW_WITH_SCREENSHOT = 2;
    public static final int SHOW_SOURCE_ASSIST_GESTURE = 4;
    public static final int SHOW_SOURCE_APPLICATION = 8;
    public static final int SHOW_SOURCE_ACTIVITY = 16;
    public static final int SHOW_SOURCE_PUSH_TO_TALK = 32;
    public static final int SHOW_SOURCE_NOTIFICATION = 64;
    public static final int SHOW_SOURCE_AUTOMOTIVE_SYSTEM_UI = 128;
    public static final int VOICE_INTERACTION_ACTIVITY_EVENT_START = 1;
    public static final int VOICE_INTERACTION_ACTIVITY_EVENT_RESUME = 2;
    public static final int VOICE_INTERACTION_ACTIVITY_EVENT_PAUSE = 3;
    public static final int VOICE_INTERACTION_ACTIVITY_EVENT_STOP = 4;
    final android.content.Context mContext = null;
    final com.android.internal.os.HandlerCaller mHandlerCaller = null;
    final android.view.KeyEvent.DispatcherState mDispatcherState = null;
    com.android.internal.app.IVoiceInteractionManagerService mSystemService;
    android.os.IBinder mToken;
    int mTheme;
    android.view.LayoutInflater mInflater;
    android.content.res.TypedArray mThemeAttrs;
    android.view.View mRootView;
    android.widget.FrameLayout mContentFrame;
    android.service.voice.VoiceInteractionWindow mWindow;
    boolean mUiEnabled;
    boolean mInitialized;
    boolean mWindowAdded;
    boolean mWindowVisible;
    boolean mWindowWasVisible;
    boolean mInShowWindow;
    final android.util.ArrayMap<android.os.IBinder, android.service.voice.VoiceInteractionSession.Request> mActiveRequests = null;
    final android.service.voice.VoiceInteractionSession.Insets mTmpInsets = null;
    final java.lang.ref.WeakReference<android.service.voice.VoiceInteractionSession> mWeakRef = null;
    final java.util.Map<android.service.voice.VoiceInteractionSession.SafeResultListener, java.util.function.Consumer<android.os.Bundle>> mRemoteCallbacks = null;
    android.os.ICancellationSignal mKillCallback;
    final com.android.internal.app.IVoiceInteractor mInteractor = null;
    final android.service.voice.IVoiceInteractionSession mSession = null;
    static final int MSG_START_CONFIRMATION = 1;
    static final int MSG_START_PICK_OPTION = 2;
    static final int MSG_START_COMPLETE_VOICE = 3;
    static final int MSG_START_ABORT_VOICE = 4;
    static final int MSG_START_COMMAND = 5;
    static final int MSG_SUPPORTS_COMMANDS = 6;
    static final int MSG_CANCEL = 7;
    static final int MSG_TASK_STARTED = 100;
    static final int MSG_TASK_FINISHED = 101;
    static final int MSG_CLOSE_SYSTEM_DIALOGS = 102;
    static final int MSG_DESTROY = 103;
    static final int MSG_HANDLE_ASSIST = 104;
    static final int MSG_HANDLE_SCREENSHOT = 105;
    static final int MSG_SHOW = 106;
    static final int MSG_HIDE = 107;
    static final int MSG_ON_LOCKSCREEN_SHOWN = 108;
    static final int MSG_NOTIFY_VISIBLE_ACTIVITY_INFO_CHANGED = 109;
    static final int MSG_REGISTER_VISIBLE_ACTIVITY_CALLBACK = 110;
    static final int MSG_UNREGISTER_VISIBLE_ACTIVITY_CALLBACK = 111;
    final android.service.voice.VoiceInteractionSession.MyCallbacks mCallbacks = null;
    final android.view.ViewTreeObserver.OnComputeInternalInsetsListener mInsetsComputer = null;
    public VoiceInteractionSession(android.content.Context p0) {}
    public VoiceInteractionSession(android.content.Context p0, android.os.Handler p1) {}
    public android.content.Context getContext() { return null; }
    void addRequest(android.service.voice.VoiceInteractionSession.Request p0) {}
    boolean isRequestActive(android.os.IBinder p0) { return false; }
    android.service.voice.VoiceInteractionSession.Request removeRequest(android.os.IBinder p0) { return null; }
    void doCreate(com.android.internal.app.IVoiceInteractionManagerService p0, android.os.IBinder p1) {}
    void doShow(android.os.Bundle p0, int p1, com.android.internal.app.IVoiceInteractionSessionShowCallback p2) {}
    void doHide() {}
    void doDestroy() {}
    void ensureWindowCreated() {}
    void ensureWindowAdded() {}
    void showWindow() {}
    void ensureWindowHidden() {}
    public void setDisabledShowContext(int p0) {}
    public int getDisabledShowContext() { return 0; }
    public int getUserDisabledShowContext() { return 0; }
    public void show(android.os.Bundle p0, int p1) {}
    public void hide() {}
    public void setUiEnabled(boolean p0) {}
    public void setTheme(int p0) {}
    public void startVoiceActivity(android.content.Intent p0) {}
    public void startAssistantActivity(android.content.Intent p0) {}
    public final void requestDirectActions(android.service.voice.VoiceInteractionSession.ActivityId p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.util.List<android.app.DirectAction>> p3) {}
    public void onDirectActionsInvalidated(android.service.voice.VoiceInteractionSession.ActivityId p0) {}
    public final void performDirectAction(android.app.DirectAction p0, android.os.Bundle p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, java.util.function.Consumer<android.os.Bundle> p4) {}
    public void setKeepAwake(boolean p0) {}
    public void closeSystemDialogs() {}
    public android.view.LayoutInflater getLayoutInflater() { return null; }
    public android.app.Dialog getWindow() { return null; }
    public void finish() {}
    public void onCreate() {}
    public void onPrepareShow(android.os.Bundle p0, int p1) {}
    public void onShow(android.os.Bundle p0, int p1) {}
    public void onHide() {}
    public void onDestroy() {}
    public android.view.View onCreateContentView() { return null; }
    public void setContentView(android.view.View p0) {}
    void doOnHandleAssist(int p0, android.os.IBinder p1, android.os.Bundle p2, android.app.assist.AssistStructure p3, java.lang.Throwable p4, android.app.assist.AssistContent p5, int p6, int p7) {}
    public void onAssistStructureFailure(java.lang.Throwable p0) {}
    @java.lang.Deprecated
    public void onHandleAssist(android.os.Bundle p0, android.app.assist.AssistStructure p1, android.app.assist.AssistContent p2) {}
    public void onHandleAssist(android.service.voice.VoiceInteractionSession.AssistState p0) {}
    @java.lang.Deprecated
    public void onHandleAssistSecondary(android.os.Bundle p0, android.app.assist.AssistStructure p1, android.app.assist.AssistContent p2, int p3, int p4) {}
    public void onHandleScreenshot(android.graphics.Bitmap p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public void onBackPressed() {}
    public void onCloseSystemDialogs() {}
    public void onLockscreenShown() {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onLowMemory() {}
    public void onTrimMemory(int p0) {}
    public void onComputeInsets(android.service.voice.VoiceInteractionSession.Insets p0) {}
    public void onTaskStarted(android.content.Intent p0, int p1) {}
    public void onTaskFinished(android.content.Intent p0, int p1) {}
    public boolean[] onGetSupportedCommands(java.lang.String[] p0) { return null; }
    public void onRequestConfirmation(android.service.voice.VoiceInteractionSession.ConfirmationRequest p0) {}
    public void onRequestPickOption(android.service.voice.VoiceInteractionSession.PickOptionRequest p0) {}
    public void onRequestCompleteVoice(android.service.voice.VoiceInteractionSession.CompleteVoiceRequest p0) {}
    public void onRequestAbortVoice(android.service.voice.VoiceInteractionSession.AbortVoiceRequest p0) {}
    public void onRequestCommand(android.service.voice.VoiceInteractionSession.CommandRequest p0) {}
    public void onCancelRequest(android.service.voice.VoiceInteractionSession.Request p0) {}
    public final void registerVisibleActivityCallback(java.util.concurrent.Executor p0, android.service.voice.VoiceInteractionSession.VisibleActivityCallback p1) {}
    public final void unregisterVisibleActivityCallback(android.service.voice.VoiceInteractionSession.VisibleActivityCallback p0) {}
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}

    public static final class AbortVoiceRequest extends android.service.voice.VoiceInteractionSession.Request {
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        AbortVoiceRequest(java.lang.String p0, int p1, com.android.internal.app.IVoiceInteractorCallback p2, android.service.voice.VoiceInteractionSession p3, android.app.VoiceInteractor.Prompt p4, android.os.Bundle p5) { super(null, 0, null, null, null); }
        public android.app.VoiceInteractor.Prompt getVoicePrompt() { return null; }
        @java.lang.Deprecated
        public java.lang.CharSequence getMessage() { return null; }
        public void sendAbortResult(android.os.Bundle p0) {}
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    }

    public static class ActivityId {
        ActivityId(int p0, android.os.IBinder p1) {}
        int getTaskId() { return 0; }
        android.os.IBinder getAssistToken() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static final class AssistState {
        AssistState(android.service.voice.VoiceInteractionSession.ActivityId p0, android.os.Bundle p1, android.app.assist.AssistStructure p2, android.app.assist.AssistContent p3, int p4, int p5) {}
        public boolean isFocused() { return false; }
        public int getIndex() { return 0; }
        public int getCount() { return 0; }
        public android.service.voice.VoiceInteractionSession.ActivityId getActivityId() { return null; }
        public android.os.Bundle getAssistData() { return null; }
        public android.app.assist.AssistStructure getAssistStructure() { return null; }
        public android.app.assist.AssistContent getAssistContent() { return null; }
    }

    public static final class CommandRequest extends android.service.voice.VoiceInteractionSession.Request {
        final java.lang.String mCommand = null;
        CommandRequest(java.lang.String p0, int p1, com.android.internal.app.IVoiceInteractorCallback p2, android.service.voice.VoiceInteractionSession p3, java.lang.String p4, android.os.Bundle p5) { super(null, 0, null, null, null); }
        public java.lang.String getCommand() { return null; }
        void sendCommandResult(boolean p0, android.os.Bundle p1) {}
        public void sendIntermediateResult(android.os.Bundle p0) {}
        public void sendResult(android.os.Bundle p0) {}
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    }

    public static final class CompleteVoiceRequest extends android.service.voice.VoiceInteractionSession.Request {
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        CompleteVoiceRequest(java.lang.String p0, int p1, com.android.internal.app.IVoiceInteractorCallback p2, android.service.voice.VoiceInteractionSession p3, android.app.VoiceInteractor.Prompt p4, android.os.Bundle p5) { super(null, 0, null, null, null); }
        public android.app.VoiceInteractor.Prompt getVoicePrompt() { return null; }
        @java.lang.Deprecated
        public java.lang.CharSequence getMessage() { return null; }
        public void sendCompleteResult(android.os.Bundle p0) {}
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    }

    public static final class ConfirmationRequest extends android.service.voice.VoiceInteractionSession.Request {
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        ConfirmationRequest(java.lang.String p0, int p1, com.android.internal.app.IVoiceInteractorCallback p2, android.service.voice.VoiceInteractionSession p3, android.app.VoiceInteractor.Prompt p4, android.os.Bundle p5) { super(null, 0, null, null, null); }
        public android.app.VoiceInteractor.Prompt getVoicePrompt() { return null; }
        @java.lang.Deprecated
        public java.lang.CharSequence getPrompt() { return null; }
        public void sendConfirmationResult(boolean p0, android.os.Bundle p1) {}
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    }

    public static final class Insets {
        public final android.graphics.Rect contentInsets = null;
        public final android.graphics.Region touchableRegion = null;
        public static final int TOUCHABLE_INSETS_FRAME = 0;
        public static final int TOUCHABLE_INSETS_CONTENT = 1;
        public static final int TOUCHABLE_INSETS_REGION = 3;
        public int touchableInsets;
        public Insets() {}
    }

    class MyCallbacks implements com.android.internal.os.HandlerCaller.Callback, android.service.voice.VoiceInteractionWindow.Callback {
        MyCallbacks(android.service.voice.VoiceInteractionSession p0) {}
        public void executeMessage(android.os.Message p0) {}
        public void onBackPressed() {}
    }

    public static final class PickOptionRequest extends android.service.voice.VoiceInteractionSession.Request {
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        final android.app.VoiceInteractor.PickOptionRequest.Option[] mOptions = null;
        PickOptionRequest(java.lang.String p0, int p1, com.android.internal.app.IVoiceInteractorCallback p2, android.service.voice.VoiceInteractionSession p3, android.app.VoiceInteractor.Prompt p4, android.app.VoiceInteractor.PickOptionRequest.Option[] p5, android.os.Bundle p6) { super(null, 0, null, null, null); }
        public android.app.VoiceInteractor.Prompt getVoicePrompt() { return null; }
        @java.lang.Deprecated
        public java.lang.CharSequence getPrompt() { return null; }
        public android.app.VoiceInteractor.PickOptionRequest.Option[] getOptions() { return null; }
        void sendPickOptionResult(boolean p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) {}
        public void sendIntermediatePickOptionResult(android.app.VoiceInteractor.PickOptionRequest.Option[] p0, android.os.Bundle p1) {}
        public void sendPickOptionResult(android.app.VoiceInteractor.PickOptionRequest.Option[] p0, android.os.Bundle p1) {}
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    }

    public static class Request {
        final com.android.internal.app.IVoiceInteractorRequest mInterface = null;
        final java.lang.String mCallingPackage = null;
        final int mCallingUid = 0;
        final com.android.internal.app.IVoiceInteractorCallback mCallback = null;
        final java.lang.ref.WeakReference<android.service.voice.VoiceInteractionSession> mSession = null;
        final android.os.Bundle mExtras = null;
        Request(java.lang.String p0, int p1, com.android.internal.app.IVoiceInteractorCallback p2, android.service.voice.VoiceInteractionSession p3, android.os.Bundle p4) {}
        public int getCallingUid() { return 0; }
        public java.lang.String getCallingPackage() { return null; }
        public android.os.Bundle getExtras() { return null; }
        public boolean isActive() { return false; }
        void finishRequest() {}
        public void cancel() {}
        public java.lang.String toString() { return null; }
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    }

    private static class SafeResultListener implements android.os.RemoteCallback.OnResultListener {
        SafeResultListener(java.util.function.Consumer<android.os.Bundle> p0, android.service.voice.VoiceInteractionSession p1) {}
        public void onResult(android.os.Bundle p0) {}
    }

    public static interface VisibleActivityCallback {
        default public void onVisible(android.service.voice.VisibleActivityInfo p0) {}
        default public void onInvisible(android.service.voice.VoiceInteractionSession.ActivityId p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VoiceInteractionActivityEventType {
    }
}
