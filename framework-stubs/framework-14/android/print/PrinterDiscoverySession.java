package android.print;

public final class PrinterDiscoverySession {
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

    public static interface OnPrintersChangeListener {
        public void onPrintersChanged();
    }

    public static final class PrinterDiscoveryObserver extends android.print.IPrinterDiscoveryObserver.Stub {
        public PrinterDiscoveryObserver(android.print.PrinterDiscoverySession p0) { super(); }
        public void onPrintersAdded(android.content.pm.ParceledListSlice p0) {}
        public void onPrintersRemoved(android.content.pm.ParceledListSlice p0) {}
    }

    private final class SessionHandler extends android.os.Handler {
        public SessionHandler(android.print.PrinterDiscoverySession p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
