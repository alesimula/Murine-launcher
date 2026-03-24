package android.widget;

class CursorFilter extends android.widget.Filter {
    android.widget.CursorFilter.CursorFilterClient mClient;
    CursorFilter(android.widget.CursorFilter.CursorFilterClient p0) { super(); }
    public java.lang.CharSequence convertResultToString(java.lang.Object p0) { return null; }
    protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence p0) { return null; }
    protected void publishResults(java.lang.CharSequence p0, android.widget.Filter.FilterResults p1) {}

    static interface CursorFilterClient {
        public java.lang.CharSequence convertToString(android.database.Cursor p0);
        public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence p0);
        public android.database.Cursor getCursor();
        public void changeCursor(android.database.Cursor p0);
    }
}
