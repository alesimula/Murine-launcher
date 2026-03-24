package com.android.internal.app;

public class LocalePickerWithRegion extends android.app.ListFragment implements android.widget.SearchView.OnQueryTextListener {
    public LocalePickerWithRegion() { super(); }
    public static com.android.internal.app.LocalePickerWithRegion createLanguagePicker(android.content.Context p0, com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener p1, boolean p2) { return null; }
    public static com.android.internal.app.LocalePickerWithRegion createLanguagePicker(android.content.Context p0, com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener p1, boolean p2, android.os.LocaleList p3) { return null; }
    public static com.android.internal.app.LocalePickerWithRegion createLanguagePicker(android.content.Context p0, com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener p1, boolean p2, android.os.LocaleList p3, java.lang.String p4, android.view.MenuItem.OnActionExpandListener p5) { return null; }
    public void onCreate(android.os.Bundle p0) {}
    public void onViewCreated(android.view.View p0, android.os.Bundle p1) {}
    public boolean onOptionsItemSelected(android.view.MenuItem p0) { return false; }
    public void onResume() {}
    public void onPause() {}
    public void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    public void onCreateOptionsMenu(android.view.Menu p0, android.view.MenuInflater p1) {}
    public boolean onQueryTextSubmit(java.lang.String p0) { return false; }
    public boolean onQueryTextChange(java.lang.String p0) { return false; }
    public void setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener p0) {}

    static interface LocaleCollectorBase {
        public java.util.HashSet<java.lang.String> getIgnoredLocaleList(boolean p0);
        public java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getSupportedLocaleList(com.android.internal.app.LocaleStore.LocaleInfo p0, boolean p1, boolean p2);
        public boolean hasSpecificPackageName();
    }

    public static interface LocaleSelectedListener {
        public void onLocaleSelected(com.android.internal.app.LocaleStore.LocaleInfo p0);
    }
}
