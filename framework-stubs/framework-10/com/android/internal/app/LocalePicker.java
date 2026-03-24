package com.android.internal.app;

public class LocalePicker extends android.app.ListFragment {
    private static final java.lang.String TAG = "LocalePicker";
    private static final boolean DEBUG = false;
    private static final java.lang.String[] pseudoLocales = null;
    com.android.internal.app.LocalePicker.LocaleSelectionListener mListener;
    public LocalePicker() { super(); }
    public static java.lang.String[] getSystemAssetLocales() { return null; }
    public static java.lang.String[] getSupportedLocales(android.content.Context p0) { return null; }
    public static java.util.List<com.android.internal.app.LocalePicker.LocaleInfo> getAllAssetLocales(android.content.Context p0, boolean p1) { return null; }
    public static android.widget.ArrayAdapter<com.android.internal.app.LocalePicker.LocaleInfo> constructAdapter(android.content.Context p0) { return null; }
    public static android.widget.ArrayAdapter<com.android.internal.app.LocalePicker.LocaleInfo> constructAdapter(android.content.Context p0, int p1, int p2) { return null; }
    private static java.lang.String toTitleCase(java.lang.String p0) { return null; }
    private static java.lang.String getDisplayName(java.util.Locale p0, java.lang.String[] p1, java.lang.String[] p2) { return null; }
    public void onActivityCreated(android.os.Bundle p0) {}
    public void setLocaleSelectionListener(com.android.internal.app.LocalePicker.LocaleSelectionListener p0) {}
    public void onResume() {}
    public void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    @android.annotation.UnsupportedAppUsage
    public static void updateLocale(java.util.Locale p0) {}
    @android.annotation.UnsupportedAppUsage
    public static void updateLocales(android.os.LocaleList p0) {}
    @android.annotation.UnsupportedAppUsage
    public static android.os.LocaleList getLocales() { return null; }

    public static interface LocaleSelectionListener {
        public void onLocaleSelected(java.util.Locale p0);
    }

    public static class LocaleInfo implements java.lang.Comparable<com.android.internal.app.LocalePicker.LocaleInfo> {
        static final java.text.Collator sCollator = null;
        java.lang.String label;
        final java.util.Locale locale = null;
        public LocaleInfo(java.lang.String p0, java.util.Locale p1) {}
        public java.lang.String getLabel() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.util.Locale getLocale() { return null; }
        public java.lang.String toString() { return null; }
        public int compareTo(com.android.internal.app.LocalePicker.LocaleInfo p0) { return 0; }
    }
}
