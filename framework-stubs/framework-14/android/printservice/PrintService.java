package android.printservice;

public abstract class PrintService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.printservice.PrintService";
    public static final java.lang.String SERVICE_META_DATA = "android.printservice";
    public static final java.lang.String EXTRA_PRINT_JOB_INFO = "android.intent.extra.print.PRINT_JOB_INFO";
    public static final java.lang.String EXTRA_PRINTER_INFO = "android.intent.extra.print.EXTRA_PRINTER_INFO";
    public static final java.lang.String EXTRA_PRINT_DOCUMENT_INFO = "android.printservice.extra.PRINT_DOCUMENT_INFO";
    public static final java.lang.String EXTRA_CAN_SELECT_PRINTER = "android.printservice.extra.CAN_SELECT_PRINTER";
    public static final java.lang.String EXTRA_SELECT_PRINTER = "android.printservice.extra.SELECT_PRINTER";
    public PrintService() { super(); }
    protected final void attachBaseContext(android.content.Context p0) {}
    protected void onConnected() {}
    protected void onDisconnected() {}
    protected abstract android.printservice.PrinterDiscoverySession onCreatePrinterDiscoverySession();
    protected abstract void onRequestCancelPrintJob(android.printservice.PrintJob p0);
    protected abstract void onPrintJobQueued(android.printservice.PrintJob p0);
    public final java.util.List<android.printservice.PrintJob> getActivePrintJobs() { return null; }
    public final android.print.PrinterId generatePrinterId(java.lang.String p0) { return null; }
    static void throwIfNotCalledOnMainThread() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }

    private final class ServiceHandler extends android.os.Handler {
        public static final int MSG_CREATE_PRINTER_DISCOVERY_SESSION = 1;
        public static final int MSG_DESTROY_PRINTER_DISCOVERY_SESSION = 2;
        public static final int MSG_START_PRINTER_DISCOVERY = 3;
        public static final int MSG_STOP_PRINTER_DISCOVERY = 4;
        public static final int MSG_VALIDATE_PRINTERS = 5;
        public static final int MSG_START_PRINTER_STATE_TRACKING = 6;
        public static final int MSG_REQUEST_CUSTOM_PRINTER_ICON = 7;
        public static final int MSG_STOP_PRINTER_STATE_TRACKING = 8;
        public static final int MSG_ON_PRINTJOB_QUEUED = 9;
        public static final int MSG_ON_REQUEST_CANCEL_PRINTJOB = 10;
        public static final int MSG_SET_CLIENT = 11;
        public ServiceHandler(android.printservice.PrintService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
