package android.widget;

public abstract class Filter {
    private static final java.lang.String LOG_TAG = "Filter";
    private static final java.lang.String THREAD_NAME = "Filter";
    private static final int FILTER_TOKEN = -791613427;
    private static final int FINISH_TOKEN = -559038737;
    private android.os.Handler mThreadHandler;
    private android.os.Handler mResultHandler;
    private android.widget.Filter.Delayer mDelayer;
    private final java.lang.Object mLock = null;
    public Filter() {}
    @android.annotation.UnsupportedAppUsage
    public void setDelayer(android.widget.Filter.Delayer p0) {}
    public final void filter(java.lang.CharSequence p0) {}
    public final void filter(java.lang.CharSequence p0, android.widget.Filter.FilterListener p1) {}
    protected abstract android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence p0);
    protected abstract void publishResults(java.lang.CharSequence p0, android.widget.Filter.FilterResults p1);
    public java.lang.CharSequence convertResultToString(java.lang.Object p0) { return null; }

    private class ResultsHandler extends android.os.Handler {
        private ResultsHandler(android.widget.Filter p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class RequestHandler extends android.os.Handler {
        public RequestHandler(android.widget.Filter p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private static class RequestArguments {
        java.lang.CharSequence constraint;
        android.widget.Filter.FilterListener listener;
        android.widget.Filter.FilterResults results;
        private RequestArguments() {}
    }

    protected static class FilterResults {
        public java.lang.Object values;
        public int count;
        public FilterResults() {}
    }

    public static interface FilterListener {
        public void onFilterComplete(int p0);
    }

    public static interface Delayer {
        public long getPostingDelay(java.lang.CharSequence p0);
    }
}
