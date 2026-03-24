package android.print;

public class PrintServiceRecommendationsLoader extends android.content.Loader<java.util.List<android.printservice.recommendation.RecommendationInfo>> {
    private final android.print.PrintManager mPrintManager = null;
    private final android.os.Handler mHandler = null;
    private android.print.PrintManager.PrintServiceRecommendationsChangeListener mListener;
    public PrintServiceRecommendationsLoader(android.print.PrintManager p0, android.content.Context p1) { super(null); }
    protected void onForceLoad() {}
    private void queueNewResult() {}
    protected void onStartLoading() {}
    protected void onStopLoading() {}
    protected void onReset() {}

    private class MyHandler extends android.os.Handler {
        public MyHandler(android.print.PrintServiceRecommendationsLoader p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
