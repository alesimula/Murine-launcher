package android.printservice;

public abstract class PrinterDiscoverySession {
    public PrinterDiscoverySession() {}
    void setObserver(android.printservice.IPrintServiceClient p0) {}
    int getId() { return 0; }
    @android.annotation.NonNull
    public final java.util.List<android.print.PrinterInfo> getPrinters() { return null; }
    public final void addPrinters(java.util.List<android.print.PrinterInfo> p0) {}
    public final void removePrinters(java.util.List<android.print.PrinterId> p0) {}
    public abstract void onStartPrinterDiscovery(java.util.List<android.print.PrinterId> p0);
    public abstract void onStopPrinterDiscovery();
    public abstract void onValidatePrinters(java.util.List<android.print.PrinterId> p0);
    public abstract void onStartPrinterStateTracking(android.print.PrinterId p0);
    public void onRequestCustomPrinterIcon(android.print.PrinterId p0, android.os.CancellationSignal p1, android.printservice.CustomPrinterIconCallback p2) {}
    public abstract void onStopPrinterStateTracking(android.print.PrinterId p0);
    @android.annotation.NonNull
    public final java.util.List<android.print.PrinterId> getTrackedPrinters() { return null; }
    public abstract void onDestroy();
    public final boolean isDestroyed() { return false; }
    public final boolean isPrinterDiscoveryStarted() { return false; }
    void startPrinterDiscovery(java.util.List<android.print.PrinterId> p0) {}
    void stopPrinterDiscovery() {}
    void validatePrinters(java.util.List<android.print.PrinterId> p0) {}
    void startPrinterStateTracking(android.print.PrinterId p0) {}
    void requestCustomPrinterIcon(android.print.PrinterId p0) {}
    void stopPrinterStateTracking(android.print.PrinterId p0) {}
    void destroy() {}
}
