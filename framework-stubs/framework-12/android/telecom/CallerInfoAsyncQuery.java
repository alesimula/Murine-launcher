package android.telecom;

public class CallerInfoAsyncQuery {
    private static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "CallerInfoAsyncQuery";
    private static final int EVENT_NEW_QUERY = 1;
    private static final int EVENT_ADD_LISTENER = 2;
    private static final int EVENT_END_OF_QUEUE = 3;
    private static final int EVENT_EMERGENCY_NUMBER = 4;
    private static final int EVENT_VOICEMAIL_NUMBER = 5;
    private static final int EVENT_GET_GEO_DESCRIPTION = 6;
    private android.telecom.CallerInfoAsyncQuery.CallerInfoAsyncQueryHandler mHandler;
    private static final boolean ENABLE_UNKNOWN_NUMBER_GEO_DESCRIPTION = true;
    static android.content.ContentResolver getCurrentProfileContentResolver(android.content.Context p0) { return null; }
    private CallerInfoAsyncQuery() {}
    public static android.telecom.CallerInfoAsyncQuery startQuery(int p0, android.content.Context p1, android.net.Uri p2, android.telecom.CallerInfoAsyncQuery.OnQueryCompleteListener p3, java.lang.Object p4) { return null; }
    public static android.telecom.CallerInfoAsyncQuery startQuery(int p0, android.content.Context p1, java.lang.String p2, android.telecom.CallerInfoAsyncQuery.OnQueryCompleteListener p3, java.lang.Object p4) { return null; }
    public static android.telecom.CallerInfoAsyncQuery startQuery(int p0, android.content.Context p1, java.lang.String p2, android.telecom.CallerInfoAsyncQuery.OnQueryCompleteListener p3, java.lang.Object p4, int p5) { return null; }
    public void addQueryListener(int p0, android.telecom.CallerInfoAsyncQuery.OnQueryCompleteListener p1, java.lang.Object p2) {}
    private void allocate(android.content.Context p0, android.net.Uri p1) {}
    private void release() {}
    private static java.lang.String sanitizeUriToString(android.net.Uri p0) { return null; }

    private class CallerInfoAsyncQueryHandler extends android.content.AsyncQueryHandler {
        private android.content.Context mContext;
        private android.net.Uri mQueryUri;
        private android.telecom.CallerInfo mCallerInfo;
        private java.util.List<java.lang.Runnable> mPendingListenerCallbacks;
        private CallerInfoAsyncQueryHandler(android.telecom.CallerInfoAsyncQuery p0, android.content.Context p1) { super(null); }
        protected android.os.Handler createHandler(android.os.Looper p0) { return null; }
        protected void onQueryComplete(int p0, java.lang.Object p1, android.database.Cursor p2) {}

        protected class CallerInfoWorkerHandler extends android.content.AsyncQueryHandler.WorkerHandler {
            public CallerInfoWorkerHandler(android.telecom.CallerInfoAsyncQuery.CallerInfoAsyncQueryHandler p0, android.os.Looper p1) { super(null, null); }
            public void handleMessage(android.os.Message p0) {}
            private void handleGeoDescription(android.os.Message p0) {}
        }
    }

    private static final class CookieWrapper {
        public android.telecom.CallerInfoAsyncQuery.OnQueryCompleteListener listener;
        public java.lang.Object cookie;
        public int event;
        public java.lang.String number;
        public java.lang.String geoDescription;
        public int subId;
        private CookieWrapper() {}
    }

    public static interface OnQueryCompleteListener {
        public void onQueryComplete(int p0, java.lang.Object p1, android.telecom.CallerInfo p2);
    }

    public static class QueryPoolException extends android.database.SQLException {
        public QueryPoolException(java.lang.String p0) { super(); }
    }
}
