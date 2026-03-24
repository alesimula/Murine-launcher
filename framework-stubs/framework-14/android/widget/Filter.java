package android.widget;

public abstract class Filter {
    public Filter() {}
    public void setDelayer(android.widget.Filter.Delayer p0) {}
    public final void filter(java.lang.CharSequence p0) {}
    public final void filter(java.lang.CharSequence p0, android.widget.Filter.FilterListener p1) {}
    protected abstract android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence p0);
    protected abstract void publishResults(java.lang.CharSequence p0, android.widget.Filter.FilterResults p1);
    public java.lang.CharSequence convertResultToString(java.lang.Object p0) { return null; }

    public static interface FilterListener {
        public void onFilterComplete(int p0);
    }

    protected static class FilterResults {
        public java.lang.Object values;
        public int count;
        public FilterResults() {}
    }

    public static interface Delayer {
        public long getPostingDelay(java.lang.CharSequence p0);
    }

    private static class RequestArguments {
        java.lang.CharSequence constraint;
        android.widget.Filter.FilterListener listener;
        android.widget.Filter.FilterResults results;
    }

    private class RequestHandler extends android.os.Handler {
        public RequestHandler(android.widget.Filter p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class ResultsHandler extends android.os.Handler {
        public void handleMessage(android.os.Message p0) {}
    }
}
