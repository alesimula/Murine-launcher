package android.app;

public final class VoiceInteractor {
    static final java.lang.String TAG = "VoiceInteractor";
    static final boolean DEBUG = false;
    static final android.app.VoiceInteractor.Request[] NO_REQUESTS = null;
    public static final java.lang.String KEY_CANCELLATION_SIGNAL = "key_cancellation_signal";
    @android.annotation.Nullable
    com.android.internal.app.IVoiceInteractor mInteractor;
    @android.annotation.Nullable
    android.content.Context mContext;
    @android.annotation.Nullable
    android.app.Activity mActivity;
    boolean mRetaining;
    final com.android.internal.os.HandlerCaller mHandlerCaller = null;
    final com.android.internal.os.HandlerCaller.Callback mHandlerCallerCallback = null;
    final com.android.internal.app.IVoiceInteractorCallback.Stub mCallback = null;
    final android.util.ArrayMap<android.os.IBinder, android.app.VoiceInteractor.Request> mActiveRequests = null;
    final android.util.ArrayMap<java.lang.Runnable, java.util.concurrent.Executor> mOnDestroyCallbacks = null;
    static final int MSG_CONFIRMATION_RESULT = 1;
    static final int MSG_PICK_OPTION_RESULT = 2;
    static final int MSG_COMPLETE_VOICE_RESULT = 3;
    static final int MSG_ABORT_VOICE_RESULT = 4;
    static final int MSG_COMMAND_RESULT = 5;
    static final int MSG_CANCEL_RESULT = 6;
    VoiceInteractor(com.android.internal.app.IVoiceInteractor p0, android.content.Context p1, android.app.Activity p2, android.os.Looper p3) {}
    android.app.VoiceInteractor.Request pullRequest(com.android.internal.app.IVoiceInteractorRequest p0, boolean p1) { return null; }
    void attachActivity(android.app.Activity p0) {}
    void retainInstance() {}
    void detachActivity() {}
    void destroy() {}
    public boolean submitRequest(android.app.VoiceInteractor.Request p0) { return false; }
    public boolean submitRequest(android.app.VoiceInteractor.Request p0, java.lang.String p1) { return false; }
    public android.app.VoiceInteractor.Request[] getActiveRequests() { return null; }
    public android.app.VoiceInteractor.Request getActiveRequest(java.lang.String p0) { return null; }
    public boolean[] supportsCommands(java.lang.String[] p0) { return null; }
    public boolean isDestroyed() { return false; }
    public boolean registerOnDestroyedCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) { return false; }
    public boolean unregisterOnDestroyedCallback(java.lang.Runnable p0) { return false; }
    public void notifyDirectActionsChanged() {}
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}

    public static class AbortVoiceRequest extends android.app.VoiceInteractor.Request {
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        final android.os.Bundle mExtras = null;
        public AbortVoiceRequest(android.app.VoiceInteractor.Prompt p0, android.os.Bundle p1) { super(); }
        public AbortVoiceRequest(java.lang.CharSequence p0, android.os.Bundle p1) { super(); }
        public void onAbortResult(android.os.Bundle p0) {}
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        java.lang.String getRequestTypeName() { return null; }
        com.android.internal.app.IVoiceInteractorRequest submit(com.android.internal.app.IVoiceInteractor p0, java.lang.String p1, com.android.internal.app.IVoiceInteractorCallback p2) throws android.os.RemoteException { return null; }
    }

    public static class CommandRequest extends android.app.VoiceInteractor.Request {
        final java.lang.String mCommand = null;
        final android.os.Bundle mArgs = null;
        public CommandRequest(java.lang.String p0, android.os.Bundle p1) { super(); }
        public void onCommandResult(boolean p0, android.os.Bundle p1) {}
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        java.lang.String getRequestTypeName() { return null; }
        com.android.internal.app.IVoiceInteractorRequest submit(com.android.internal.app.IVoiceInteractor p0, java.lang.String p1, com.android.internal.app.IVoiceInteractorCallback p2) throws android.os.RemoteException { return null; }
    }

    public static class CompleteVoiceRequest extends android.app.VoiceInteractor.Request {
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        final android.os.Bundle mExtras = null;
        public CompleteVoiceRequest(android.app.VoiceInteractor.Prompt p0, android.os.Bundle p1) { super(); }
        public CompleteVoiceRequest(java.lang.CharSequence p0, android.os.Bundle p1) { super(); }
        public void onCompleteResult(android.os.Bundle p0) {}
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        java.lang.String getRequestTypeName() { return null; }
        com.android.internal.app.IVoiceInteractorRequest submit(com.android.internal.app.IVoiceInteractor p0, java.lang.String p1, com.android.internal.app.IVoiceInteractorCallback p2) throws android.os.RemoteException { return null; }
    }

    public static class ConfirmationRequest extends android.app.VoiceInteractor.Request {
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        final android.os.Bundle mExtras = null;
        public ConfirmationRequest(android.app.VoiceInteractor.Prompt p0, android.os.Bundle p1) { super(); }
        public ConfirmationRequest(java.lang.CharSequence p0, android.os.Bundle p1) { super(); }
        public void onConfirmationResult(boolean p0, android.os.Bundle p1) {}
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        java.lang.String getRequestTypeName() { return null; }
        com.android.internal.app.IVoiceInteractorRequest submit(com.android.internal.app.IVoiceInteractor p0, java.lang.String p1, com.android.internal.app.IVoiceInteractorCallback p2) throws android.os.RemoteException { return null; }
    }

    private static final class KillCallback extends android.os.ICancellationSignal.Stub {
        KillCallback(android.app.VoiceInteractor p0) { super(); }
        public void cancel() {}
    }

    public static class PickOptionRequest extends android.app.VoiceInteractor.Request {
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        final android.app.VoiceInteractor.PickOptionRequest.Option[] mOptions = null;
        final android.os.Bundle mExtras = null;
        public PickOptionRequest(android.app.VoiceInteractor.Prompt p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) { super(); }
        public PickOptionRequest(java.lang.CharSequence p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) { super(); }
        public void onPickOptionResult(boolean p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) {}
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        java.lang.String getRequestTypeName() { return null; }
        com.android.internal.app.IVoiceInteractorRequest submit(com.android.internal.app.IVoiceInteractor p0, java.lang.String p1, com.android.internal.app.IVoiceInteractorCallback p2) throws android.os.RemoteException { return null; }

        public static final class Option implements android.os.Parcelable {
            final java.lang.CharSequence mLabel = null;
            final int mIndex = 0;
            java.util.ArrayList<java.lang.CharSequence> mSynonyms;
            android.os.Bundle mExtras;
            @android.annotation.NonNull
            public static final android.os.Parcelable.Creator<android.app.VoiceInteractor.PickOptionRequest.Option> CREATOR = null;
            public Option(java.lang.CharSequence p0) {}
            public Option(java.lang.CharSequence p0, int p1) {}
            public android.app.VoiceInteractor.PickOptionRequest.Option addSynonym(java.lang.CharSequence p0) { return null; }
            public java.lang.CharSequence getLabel() { return null; }
            public int getIndex() { return 0; }
            public int countSynonyms() { return 0; }
            public java.lang.CharSequence getSynonymAt(int p0) { return null; }
            public void setExtras(android.os.Bundle p0) {}
            public android.os.Bundle getExtras() { return null; }
            Option(android.os.Parcel p0) {}
            public int describeContents() { return 0; }
            public void writeToParcel(android.os.Parcel p0, int p1) {}
        }
    }

    public static class Prompt implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.app.VoiceInteractor.Prompt> CREATOR = null;
        public Prompt(java.lang.CharSequence[] p0, java.lang.CharSequence p1) {}
        public Prompt(java.lang.CharSequence p0) {}
        @android.annotation.NonNull
        public java.lang.CharSequence getVoicePromptAt(int p0) { return null; }
        public int countVoicePrompts() { return 0; }
        @android.annotation.NonNull
        public java.lang.CharSequence getVisualPrompt() { return null; }
        public java.lang.String toString() { return null; }
        Prompt(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static abstract class Request {
        com.android.internal.app.IVoiceInteractorRequest mRequestInterface;
        android.content.Context mContext;
        android.app.Activity mActivity;
        java.lang.String mName;
        Request() {}
        public java.lang.String getName() { return null; }
        public void cancel() {}
        public android.content.Context getContext() { return null; }
        public android.app.Activity getActivity() { return null; }
        public void onCancel() {}
        public void onAttached(android.app.Activity p0) {}
        public void onDetached() {}
        public java.lang.String toString() { return null; }
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        java.lang.String getRequestTypeName() { return null; }
        void clear() {}
        abstract com.android.internal.app.IVoiceInteractorRequest submit(com.android.internal.app.IVoiceInteractor p0, java.lang.String p1, com.android.internal.app.IVoiceInteractorCallback p2) throws android.os.RemoteException;
    }
}
