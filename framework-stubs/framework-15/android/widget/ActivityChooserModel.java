package android.widget;

public class ActivityChooserModel extends android.database.DataSetObservable {
    public static final java.lang.String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    public static android.widget.ActivityChooserModel get(android.content.Context p0, java.lang.String p1) { return null; }
    public void setIntent(android.content.Intent p0) {}
    public android.content.Intent getIntent() { return null; }
    public int getActivityCount() { return 0; }
    public android.content.pm.ResolveInfo getActivity(int p0) { return null; }
    public int getActivityIndex(android.content.pm.ResolveInfo p0) { return 0; }
    public android.content.Intent chooseActivity(int p0) { return null; }
    public void setOnChooseActivityListener(android.widget.ActivityChooserModel.OnChooseActivityListener p0) {}
    public android.content.pm.ResolveInfo getDefaultActivity() { return null; }
    public void setDefaultActivity(int p0) {}
    public void setActivitySorter(android.widget.ActivityChooserModel.ActivitySorter p0) {}
    public void setHistoryMaxSize(int p0) {}
    public int getHistoryMaxSize() { return 0; }
    public int getHistorySize() { return 0; }
    protected void finalize() throws java.lang.Throwable {}

    public static interface ActivityChooserModelClient {
        public void setActivityChooserModel(android.widget.ActivityChooserModel p0);
    }

    public final class ActivityResolveInfo implements java.lang.Comparable<android.widget.ActivityChooserModel.ActivityResolveInfo> {
        public final android.content.pm.ResolveInfo resolveInfo = null;
        public float weight;
        public ActivityResolveInfo(android.widget.ActivityChooserModel p0, android.content.pm.ResolveInfo p1) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int compareTo(android.widget.ActivityChooserModel.ActivityResolveInfo p0) { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static interface ActivitySorter {
        public void sort(android.content.Intent p0, java.util.List<android.widget.ActivityChooserModel.ActivityResolveInfo> p1, java.util.List<android.widget.ActivityChooserModel.HistoricalRecord> p2);
    }

    private final class DataModelPackageMonitor extends com.android.internal.content.PackageMonitor {
        public void onSomePackagesChanged() {}
    }

    private final class DefaultSorter implements android.widget.ActivityChooserModel.ActivitySorter {
        public void sort(android.content.Intent p0, java.util.List<android.widget.ActivityChooserModel.ActivityResolveInfo> p1, java.util.List<android.widget.ActivityChooserModel.HistoricalRecord> p2) {}
    }

    public static final class HistoricalRecord {
        public final android.content.ComponentName activity = null;
        public final long time = 0L;
        public final float weight = 0.0f;
        public HistoricalRecord(java.lang.String p0, long p1, float p2) {}
        public HistoricalRecord(android.content.ComponentName p0, long p1, float p2) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static interface OnChooseActivityListener {
        public boolean onChooseActivity(android.widget.ActivityChooserModel p0, android.content.Intent p1);
    }

    private final class PersistHistoryAsyncTask extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.Void> {
        public java.lang.Void doInBackground(java.lang.Object... p0) { return null; }
    }
}
