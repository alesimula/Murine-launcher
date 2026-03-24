package android.view.inputmethod;

public interface ImeTracker {
    public static final java.lang.String TAG = "ImeTracker";
    public static final boolean DEBUG_IME_VISIBILITY = Boolean.valueOf(false);
    public static final java.lang.String TOKEN_NONE = "TOKEN_NONE";
    public static final int TYPE_SHOW = 1;
    public static final int TYPE_HIDE = 2;
    public static final int TYPE_USER = 3;
    public static final int STATUS_RUN = 1;
    public static final int STATUS_CANCEL = 2;
    public static final int STATUS_FAIL = 3;
    public static final int STATUS_SUCCESS = 4;
    public static final int STATUS_TIMEOUT = 5;
    public static final int ORIGIN_CLIENT = 5;
    public static final int ORIGIN_SERVER = 6;
    public static final int ORIGIN_IME = 7;
    public static final int ORIGIN_WM_SHELL = 8;
    public static final int PHASE_NOT_SET = 0;
    public static final int PHASE_CLIENT_VIEW_SERVED = 1;
    public static final int PHASE_SERVER_CLIENT_KNOWN = 2;
    public static final int PHASE_SERVER_CLIENT_FOCUSED = 3;
    public static final int PHASE_SERVER_ACCESSIBILITY = 4;
    public static final int PHASE_SERVER_SYSTEM_READY = 5;
    public static final int PHASE_SERVER_HIDE_IMPLICIT = 6;
    public static final int PHASE_SERVER_HIDE_NOT_ALWAYS = 7;
    public static final int PHASE_SERVER_WAIT_IME = 8;
    public static final int PHASE_SERVER_HAS_IME = 9;
    public static final int PHASE_SERVER_SHOULD_HIDE = 10;
    public static final int PHASE_IME_WRAPPER = 11;
    public static final int PHASE_IME_WRAPPER_DISPATCH = 12;
    public static final int PHASE_IME_SHOW_SOFT_INPUT = 13;
    public static final int PHASE_IME_HIDE_SOFT_INPUT = 14;
    public static final int PHASE_IME_ON_SHOW_SOFT_INPUT_TRUE = 15;
    public static final int PHASE_SERVER_APPLY_IME_VISIBILITY = 17;
    public static final int PHASE_WM_SHOW_IME_RUNNER = 18;
    public static final int PHASE_WM_SHOW_IME_READY = 19;
    public static final int PHASE_WM_HAS_IME_INSETS_CONTROL_TARGET = 20;
    public static final int PHASE_WM_WINDOW_INSETS_CONTROL_TARGET_SHOW_INSETS = 21;
    public static final int PHASE_WM_WINDOW_INSETS_CONTROL_TARGET_HIDE_INSETS = 22;
    public static final int PHASE_WM_REMOTE_INSETS_CONTROL_TARGET_SHOW_INSETS = 23;
    public static final int PHASE_WM_REMOTE_INSETS_CONTROL_TARGET_HIDE_INSETS = 24;
    public static final int PHASE_WM_REMOTE_INSETS_CONTROLLER = 25;
    public static final int PHASE_WM_ANIMATION_CREATE = 26;
    public static final int PHASE_WM_ANIMATION_RUNNING = 27;
    public static final int PHASE_CLIENT_SHOW_INSETS = 28;
    public static final int PHASE_CLIENT_HIDE_INSETS = 29;
    public static final int PHASE_CLIENT_HANDLE_SHOW_INSETS = 30;
    public static final int PHASE_CLIENT_HANDLE_HIDE_INSETS = 31;
    public static final int PHASE_CLIENT_APPLY_ANIMATION = 32;
    public static final int PHASE_CLIENT_CONTROL_ANIMATION = 33;
    public static final int PHASE_CLIENT_COLLECT_SOURCE_CONTROLS = 35;
    public static final int PHASE_CLIENT_INSETS_CONSUMER_REQUEST_SHOW = 36;
    public static final int PHASE_CLIENT_REQUEST_IME_SHOW = 37;
    public static final int PHASE_CLIENT_INSETS_CONSUMER_NOTIFY_HIDDEN = 38;
    public static final int PHASE_CLIENT_ANIMATION_RUNNING = 39;
    public static final int PHASE_CLIENT_ANIMATION_CANCEL = 40;
    public static final int PHASE_CLIENT_ANIMATION_FINISHED_SHOW = 41;
    public static final int PHASE_CLIENT_ANIMATION_FINISHED_HIDE = 42;
    public static final int PHASE_WM_ABORT_SHOW_IME_POST_LAYOUT = 43;
    public static final int PHASE_IME_SHOW_WINDOW = 44;
    public static final int PHASE_IME_HIDE_WINDOW = 45;
    public static final int PHASE_IME_PRIVILEGED_OPERATIONS = 46;
    public static final int PHASE_SERVER_CURRENT_ACTIVE_IME = 47;
    @android.annotation.NonNull
    public static final android.view.inputmethod.ImeTracker LOGGER = null;
    public static final android.view.inputmethod.ImeTracker.ImeJankTracker JANK_TRACKER = null;
    public static final android.view.inputmethod.ImeTracker.ImeLatencyTracker LATENCY_TRACKER = null;
    @android.annotation.NonNull
    public android.view.inputmethod.ImeTracker.Token onStart(java.lang.String p0, int p1, int p2, int p3, int p4, boolean p5);
    @android.annotation.NonNull
    default public android.view.inputmethod.ImeTracker.Token onStart(int p0, int p1, int p2, boolean p3) { return null; }
    public void onProgress(android.view.inputmethod.ImeTracker.Token p0, int p1);
    public void onFailed(android.view.inputmethod.ImeTracker.Token p0, int p1);
    public void onTodo(android.view.inputmethod.ImeTracker.Token p0, int p1);
    public void onCancelled(android.view.inputmethod.ImeTracker.Token p0, int p1);
    public void onShown(android.view.inputmethod.ImeTracker.Token p0);
    public void onHidden(android.view.inputmethod.ImeTracker.Token p0);
    public void onDispatched(android.view.inputmethod.ImeTracker.Token p0);
    public void onUserFinished(android.view.inputmethod.ImeTracker.Token p0, boolean p1);
    public static boolean isFromUser(android.view.View p0) { return false; }
    @android.annotation.NonNull
    public static android.view.inputmethod.ImeTracker forLogging() { return null; }
    @android.annotation.NonNull
    public static android.view.inputmethod.ImeTracker.ImeJankTracker forJank() { return null; }
    @android.annotation.NonNull
    public static android.view.inputmethod.ImeTracker.ImeLatencyTracker forLatency() { return null; }

    public static final class Debug {
        public Debug() {}
        @android.annotation.NonNull
        public static java.lang.String typeToString(int p0) { return null; }
        @android.annotation.NonNull
        public static java.lang.String statusToString(int p0) { return null; }
        @android.annotation.NonNull
        public static java.lang.String originToString(int p0) { return null; }
        @android.annotation.NonNull
        public static java.lang.String phaseToString(int p0) { return null; }
    }

    public static final class ImeJankTracker {
        public void onRequestAnimation(android.view.inputmethod.ImeTracker.InputMethodJankContext p0, int p1, boolean p2) {}
        public void onCancelAnimation(int p0) {}
        public void onFinishAnimation(int p0) {}
    }

    public static final class ImeLatencyTracker {
        public void onRequestShow(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2, android.view.inputmethod.ImeTracker.InputMethodLatencyContext p3) {}
        public void onRequestHide(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2, android.view.inputmethod.ImeTracker.InputMethodLatencyContext p3) {}
        public void onShowFailed(android.view.inputmethod.ImeTracker.Token p0, int p1, android.view.inputmethod.ImeTracker.InputMethodLatencyContext p2) {}
        public void onHideFailed(android.view.inputmethod.ImeTracker.Token p0, int p1, android.view.inputmethod.ImeTracker.InputMethodLatencyContext p2) {}
        public void onShowCancelled(android.view.inputmethod.ImeTracker.Token p0, int p1, android.view.inputmethod.ImeTracker.InputMethodLatencyContext p2) {}
        public void onHideCancelled(android.view.inputmethod.ImeTracker.Token p0, int p1, android.view.inputmethod.ImeTracker.InputMethodLatencyContext p2) {}
        public void onShown(android.view.inputmethod.ImeTracker.Token p0, android.view.inputmethod.ImeTracker.InputMethodLatencyContext p1) {}
        public void onHidden(android.view.inputmethod.ImeTracker.Token p0, android.view.inputmethod.ImeTracker.InputMethodLatencyContext p1) {}
    }

    public static interface InputMethodJankContext {
        public android.content.Context getDisplayContext();
        public android.view.SurfaceControl getTargetSurfaceControl();
        public java.lang.String getHostPackageName();
    }

    public static interface InputMethodLatencyContext {
        public android.content.Context getAppContext();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Origin {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Phase {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }

    public static final class Token implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.view.inputmethod.ImeTracker.Token> CREATOR = null;
        public Token(android.os.IBinder p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.os.IBinder getBinder() { return null; }
        @android.annotation.NonNull
        public java.lang.String getTag() { return null; }
        @android.annotation.NonNull
        public static android.view.inputmethod.ImeTracker.Token empty() { return null; }
        @android.annotation.NonNull
        static android.view.inputmethod.ImeTracker.Token empty(java.lang.String p0) { return null; }
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
