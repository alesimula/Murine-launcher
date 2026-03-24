package android.service.autofill.augmented;

@android.annotation.SystemApi
public abstract class AugmentedAutofillService extends android.app.Service {
    private static final java.lang.String TAG = null;
    static boolean sDebug;
    static boolean sVerbose;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.autofill.augmented.AugmentedAutofillService";
    private android.os.Handler mHandler;
    private android.util.SparseArray<android.service.autofill.augmented.AugmentedAutofillService.AutofillProxy> mAutofillProxies;
    private android.service.autofill.augmented.AugmentedAutofillService.AutofillProxy mAutofillProxyForLastRequest;
    private android.content.ComponentName mServiceComponentName;
    public AugmentedAutofillService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public void onConnected() {}
    public final boolean requestAutofill(android.content.ComponentName p0, android.view.autofill.AutofillId p1) { return false; }
    public void onFillRequest(android.service.autofill.augmented.FillRequest p0, android.os.CancellationSignal p1, android.service.autofill.augmented.FillController p2, android.service.autofill.augmented.FillCallback p3) {}
    public void onDisconnected() {}
    private void handleOnConnected(boolean p0, boolean p1) {}
    private void handleOnDisconnected() {}
    private void handleOnFillRequest(int p0, android.os.IBinder p1, int p2, android.content.ComponentName p3, android.view.autofill.AutofillId p4, android.view.autofill.AutofillValue p5, long p6, android.view.inputmethod.InlineSuggestionsRequest p7, android.service.autofill.augmented.IFillCallback p8) {}
    private void handleOnDestroyAllFillWindowsRequest() {}
    private void handleOnUnbind() {}
    protected final void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    protected void dump(java.io.PrintWriter p0, java.lang.String[] p1) {}
    public final android.service.autofill.FillEventHistory getFillEventHistory() { return null; }

    private final class AugmentedAutofillServiceImpl extends android.service.autofill.augmented.IAugmentedAutofillService.Stub {
        private AugmentedAutofillServiceImpl(android.service.autofill.augmented.AugmentedAutofillService p0) { super(); }
        public void onConnected(boolean p0, boolean p1) {}
        public void onDisconnected() {}
        public void onFillRequest(int p0, android.os.IBinder p1, int p2, android.content.ComponentName p3, android.view.autofill.AutofillId p4, android.view.autofill.AutofillValue p5, long p6, android.view.inputmethod.InlineSuggestionsRequest p7, android.service.autofill.augmented.IFillCallback p8) {}
        public void onDestroyAllFillWindowsRequest() {}
    }

    static final class AutofillProxy {
        static final int REPORT_EVENT_NO_RESPONSE = 1;
        static final int REPORT_EVENT_UI_SHOWN = 2;
        static final int REPORT_EVENT_UI_DESTROYED = 3;
        static final int REPORT_EVENT_INLINE_RESPONSE = 4;
        private final java.lang.Object mLock = null;
        private final android.view.autofill.IAugmentedAutofillManagerClient mClient = null;
        private final int mSessionId = 0;
        public final int mTaskId = 0;
        public final android.content.ComponentName mComponentName = null;
        private java.lang.String mServicePackageName;
        private android.view.autofill.AutofillId mFocusedId;
        private android.view.autofill.AutofillValue mFocusedValue;
        private android.app.assist.AssistStructure.ViewNode mFocusedViewNode;
        private android.service.autofill.augmented.IFillCallback mCallback;
        private android.view.autofill.AutofillId mLastShownId;
        private final long mFirstRequestTime = 0L;
        private long mFirstOnSuccessTime;
        private long mUiFirstShownTime;
        private long mUiFirstDestroyedTime;
        private android.service.autofill.augmented.PresentationParams.SystemPopupPresentationParams mSmartSuggestion;
        private android.service.autofill.augmented.FillWindow mFillWindow;
        private android.os.CancellationSignal mCancellationSignal;
        private AutofillProxy(int p0, android.os.IBinder p1, int p2, android.content.ComponentName p3, android.content.ComponentName p4, android.view.autofill.AutofillId p5, android.view.autofill.AutofillValue p6, long p7, android.service.autofill.augmented.IFillCallback p8, android.os.CancellationSignal p9) {}
        public android.service.autofill.augmented.PresentationParams.SystemPopupPresentationParams getSmartSuggestionParams() { return null; }
        public void autofill(java.util.List<android.util.Pair<android.view.autofill.AutofillId, android.view.autofill.AutofillValue>> p0) throws android.os.RemoteException {}
        public void setFillWindow(android.service.autofill.augmented.FillWindow p0) {}
        public android.service.autofill.augmented.FillWindow getFillWindow() { return null; }
        public void requestShowFillUi(int p0, int p1, android.graphics.Rect p2, android.view.autofill.IAutofillWindowPresenter p3) throws android.os.RemoteException {}
        public void requestHideFillUi() throws android.os.RemoteException {}
        private boolean requestAutofill() throws android.os.RemoteException { return false; }
        private void update(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.service.autofill.augmented.IFillCallback p2, android.os.CancellationSignal p3) {}
        public android.view.autofill.AutofillId getFocusedId() { return null; }
        public android.view.autofill.AutofillValue getFocusedValue() { return null; }
        void reportResult(java.util.List<android.service.autofill.Dataset> p0, android.os.Bundle p1, boolean p2) {}
        public android.app.assist.AssistStructure.ViewNode getFocusedViewNode() { return null; }
        void logEvent(int p0) {}
        public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
        private void destroy() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface ReportEvent {
        }
    }
}
