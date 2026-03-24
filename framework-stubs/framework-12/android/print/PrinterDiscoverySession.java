package android.print;

public final class PrinterDiscoverySession {
    private static final java.lang.String LOG_TAG = "PrinterDiscoverySession";
    private static final int MSG_PRINTERS_ADDED = 1;
    private static final int MSG_PRINTERS_REMOVED = 2;
    private final java.util.LinkedHashMap<android.print.PrinterId, android.print.PrinterInfo> mPrinters = null;
    private final android.print.IPrintManager mPrintManager = null;
    private final int mUserId = 0;
    private final android.os.Handler mHandler = null;
    private android.print.IPrinterDiscoveryObserver mObserver;
    private android.print.PrinterDiscoverySession.OnPrintersChangeListener mListener;
    private boolean mIsPrinterDiscoveryStarted;
    PrinterDiscoverySession(android.print.IPrintManager p0, android.content.Context p1, int p2) {}
    public final void startPrinterDiscovery(java.util.List<android.print.PrinterId> p0) {}
    public final void stopPrinterDiscovery() {}
    public final void startPrinterStateTracking(android.print.PrinterId p0) {}
    public final void stopPrinterStateTracking(android.print.PrinterId p0) {}
    public final void validatePrinters(java.util.List<android.print.PrinterId> p0) {}
    public final void destroy() {}
    public final java.util.List<android.print.PrinterInfo> getPrinters() { return null; }
    public final boolean isDestroyed() { return false; }
    public final boolean isPrinterDiscoveryStarted() { return false; }
    public final void setOnPrintersChangeListener(android.print.PrinterDiscoverySession.OnPrintersChangeListener p0) {}
    protected final void finalize() throws java.lang.Throwable {}
    private boolean isDestroyedNoCheck() { return false; }
    private void destroyNoCheck() {}
    private void handlePrintersAdded(java.util.List<android.print.PrinterInfo> p0) {}
    private void handlePrintersRemoved(java.util.List<android.print.PrinterId> p0) {}
    private void notifyOnPrintersChanged() {}
    private static void throwIfNotCalledOnMainThread() {}

    public static interface OnPrintersChangeListener {
        public void onPrintersChanged();
    }

    public static final class PrinterDiscoveryObserver extends android.print.IPrinterDiscoveryObserver.Stub {
        private final java.lang.ref.WeakReference<android.print.PrinterDiscoverySession> mWeakSession = null;
        public PrinterDiscoveryObserver(android.print.PrinterDiscoverySession p0) { super(); }
        public void onPrintersAdded(android.content.pm.ParceledListSlice p0) {}
        public void onPrintersRemoved(android.content.pm.ParceledListSlice p0) {}
    }

    private final class SessionHandler extends android.os.Handler {
        public SessionHandler(android.print.PrinterDiscoverySession p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
