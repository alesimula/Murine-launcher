package android.widget;

public class ActivityChooserModel extends android.database.DataSetObservable {
    private static final boolean DEBUG = false;
    private static final java.lang.String LOG_TAG = null;
    private static final java.lang.String TAG_HISTORICAL_RECORDS = "historical-records";
    private static final java.lang.String TAG_HISTORICAL_RECORD = "historical-record";
    private static final java.lang.String ATTRIBUTE_ACTIVITY = "activity";
    private static final java.lang.String ATTRIBUTE_TIME = "time";
    private static final java.lang.String ATTRIBUTE_WEIGHT = "weight";
    public static final java.lang.String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    private static final int DEFAULT_ACTIVITY_INFLATION = 5;
    private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0f;
    private static final java.lang.String HISTORY_FILE_EXTENSION = ".xml";
    private static final int INVALID_INDEX = -1;
    private static final java.lang.Object sRegistryLock = null;
    private static final java.util.Map<java.lang.String, android.widget.ActivityChooserModel> sDataModelRegistry = null;
    private final java.lang.Object mInstanceLock = null;
    private final java.util.List<android.widget.ActivityChooserModel.ActivityResolveInfo> mActivities = null;
    private final java.util.List<android.widget.ActivityChooserModel.HistoricalRecord> mHistoricalRecords = null;
    private final com.android.internal.content.PackageMonitor mPackageMonitor = null;
    private final android.content.Context mContext = null;
    private final java.lang.String mHistoryFileName = null;
    private android.content.Intent mIntent;
    private android.widget.ActivityChooserModel.ActivitySorter mActivitySorter;
    private int mHistoryMaxSize;
    private boolean mCanReadHistoricalData;
    private boolean mReadShareHistoryCalled;
    private boolean mHistoricalRecordsChanged;
    private boolean mReloadActivities;
    private android.widget.ActivityChooserModel.OnChooseActivityListener mActivityChoserModelPolicy;
    public static android.widget.ActivityChooserModel get(android.content.Context p0, java.lang.String p1) { return null; }
    private ActivityChooserModel(android.content.Context p0, java.lang.String p1) { super(); }
    public void setIntent(android.content.Intent p0) {}
    public android.content.Intent getIntent() { return null; }
    public int getActivityCount() { return 0; }
    public android.content.pm.ResolveInfo getActivity(int p0) { return null; }
    public int getActivityIndex(android.content.pm.ResolveInfo p0) { return 0; }
    public android.content.Intent chooseActivity(int p0) { return null; }
    public void setOnChooseActivityListener(android.widget.ActivityChooserModel.OnChooseActivityListener p0) {}
    public android.content.pm.ResolveInfo getDefaultActivity() { return null; }
    public void setDefaultActivity(int p0) {}
    private void persistHistoricalDataIfNeeded() {}
    public void setActivitySorter(android.widget.ActivityChooserModel.ActivitySorter p0) {}
    public void setHistoryMaxSize(int p0) {}
    public int getHistoryMaxSize() { return 0; }
    public int getHistorySize() { return 0; }
    protected void finalize() throws java.lang.Throwable {}
    private void ensureConsistentState() {}
    private boolean sortActivitiesIfNeeded() { return false; }
    private boolean loadActivitiesIfNeeded() { return false; }
    private boolean readHistoricalDataIfNeeded() { return false; }
    private boolean addHisoricalRecord(android.widget.ActivityChooserModel.HistoricalRecord p0) { return false; }
    private void pruneExcessiveHistoricalRecordsIfNeeded() {}
    private void readHistoricalDataImpl() {}

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
        private DataModelPackageMonitor(android.widget.ActivityChooserModel p0) { super(); }
        public void onSomePackagesChanged() {}
    }

    private final class DefaultSorter implements android.widget.ActivityChooserModel.ActivitySorter {
        private static final float WEIGHT_DECAY_COEFFICIENT = 0.949999988079071f;
        private final java.util.Map<android.content.ComponentName, android.widget.ActivityChooserModel.ActivityResolveInfo> mPackageNameToActivityMap = null;
        private DefaultSorter(android.widget.ActivityChooserModel p0) {}
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
        private PersistHistoryAsyncTask(android.widget.ActivityChooserModel p0) { super(); }
        public java.lang.Void doInBackground(java.lang.Object... p0) { return null; }
    }
}
