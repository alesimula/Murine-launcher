package android.print;

public class PrintServicesLoader extends android.content.Loader<java.util.List<android.printservice.PrintServiceInfo>> {
    private final int mSelectionFlags = 0;
    private final android.print.PrintManager mPrintManager = null;
    private final android.os.Handler mHandler = null;
    private android.print.PrintManager.PrintServicesChangeListener mListener;
    public PrintServicesLoader(android.print.PrintManager p0, android.content.Context p1, int p2) { super(null); }
    protected void onForceLoad() {}
    private void queueNewResult() {}
    protected void onStartLoading() {}
    protected void onStopLoading() {}
    protected void onReset() {}

    private class MyHandler extends android.os.Handler {
        public MyHandler(android.print.PrintServicesLoader p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
