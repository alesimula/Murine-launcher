package android.view.textclassifier;

public final class TextClassificationManager {
    private static final java.lang.String LOG_TAG = "TextClassificationManager";
    private static final android.view.textclassifier.TextClassificationConstants sDefaultSettings = null;
    private final java.lang.Object mLock = null;
    private final android.view.textclassifier.TextClassificationSessionFactory mDefaultSessionFactory = null;
    private final android.content.Context mContext = null;
    private final android.view.textclassifier.TextClassificationManager.SettingsObserver mSettingsObserver = null;
    private android.view.textclassifier.TextClassifier mCustomTextClassifier;
    private android.view.textclassifier.TextClassifier mLocalTextClassifier;
    private android.view.textclassifier.TextClassifier mSystemTextClassifier;
    private android.view.textclassifier.TextClassificationSessionFactory mSessionFactory;
    private android.view.textclassifier.TextClassificationConstants mSettings;
    public TextClassificationManager(android.content.Context p0) {}
    public android.view.textclassifier.TextClassifier getTextClassifier() { return null; }
    public void setTextClassifier(android.view.textclassifier.TextClassifier p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.view.textclassifier.TextClassifier getTextClassifier(int p0) { return null; }
    private android.view.textclassifier.TextClassificationConstants getSettings() { return null; }
    public android.view.textclassifier.TextClassifier createTextClassificationSession(android.view.textclassifier.TextClassificationContext p0) { return null; }
    public android.view.textclassifier.TextClassifier createTextClassificationSession(android.view.textclassifier.TextClassificationContext p0, android.view.textclassifier.TextClassifier p1) { return null; }
    public void setTextClassificationSessionFactory(android.view.textclassifier.TextClassificationSessionFactory p0) {}
    protected void finalize() throws java.lang.Throwable {}
    private android.view.textclassifier.TextClassifier getSystemTextClassifier() { return null; }
    private android.view.textclassifier.TextClassifier getLocalTextClassifier() { return null; }
    private boolean isSystemTextClassifierEnabled() { return false; }
    public void invalidateForTesting() {}
    private void invalidate() {}
    android.content.Context getApplicationContext() { return null; }
    public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
    public static android.view.textclassifier.TextClassificationConstants getSettings(android.content.Context p0) { return null; }

    private static final class SettingsObserver extends android.database.ContentObserver implements android.provider.DeviceConfig.OnPropertiesChangedListener {
        private final java.lang.ref.WeakReference<android.view.textclassifier.TextClassificationManager> mTcm = null;
        SettingsObserver(android.view.textclassifier.TextClassificationManager p0) { super(null); }
        public void onChange(boolean p0) {}
        public void onPropertiesChanged(android.provider.DeviceConfig.Properties p0) {}
        private void invalidateSettings() {}
    }
}
