package android.telecom;

public class CallerInfoAsyncQuery {
    static android.content.ContentResolver getCurrentProfileContentResolver(android.content.Context p0) { return null; }
    public static android.telecom.CallerInfoAsyncQuery startQuery(int p0, android.content.Context p1, android.net.Uri p2, android.telecom.CallerInfoAsyncQuery.OnQueryCompleteListener p3, java.lang.Object p4) { return null; }
    public static android.telecom.CallerInfoAsyncQuery startQuery(int p0, android.content.Context p1, java.lang.String p2, android.telecom.CallerInfoAsyncQuery.OnQueryCompleteListener p3, java.lang.Object p4) { return null; }
    public static android.telecom.CallerInfoAsyncQuery startQuery(int p0, android.content.Context p1, java.lang.String p2, android.telecom.CallerInfoAsyncQuery.OnQueryCompleteListener p3, java.lang.Object p4, int p5) { return null; }
    public void addQueryListener(int p0, android.telecom.CallerInfoAsyncQuery.OnQueryCompleteListener p1, java.lang.Object p2) {}

    private class CallerInfoAsyncQueryHandler extends android.content.AsyncQueryHandler {
        CallerInfoAsyncQueryHandler() { super(null); }
        protected android.os.Handler createHandler(android.os.Looper p0) { return null; }
        protected void onQueryComplete(int p0, java.lang.Object p1, android.database.Cursor p2) {}

        protected class CallerInfoWorkerHandler extends android.content.AsyncQueryHandler.WorkerHandler {
            public CallerInfoWorkerHandler(android.telecom.CallerInfoAsyncQuery.CallerInfoAsyncQueryHandler p0, android.os.Looper p1) { super(null, null); }
            public void handleMessage(android.os.Message p0) {}
        }
    }

    private static final class CookieWrapper {
        public android.telecom.CallerInfoAsyncQuery.OnQueryCompleteListener listener;
        public java.lang.Object cookie;
        public int event;
        public java.lang.String number;
        public java.lang.String geoDescription;
        public int subId;
    }

    public static interface OnQueryCompleteListener {
        public void onQueryComplete(int p0, java.lang.Object p1, android.telecom.CallerInfo p2);
    }

    public static class QueryPoolException extends android.database.SQLException {
        public QueryPoolException(java.lang.String p0) { super(); }
    }
}
