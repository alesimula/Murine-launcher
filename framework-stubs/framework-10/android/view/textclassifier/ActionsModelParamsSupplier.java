package android.view.textclassifier;

public final class ActionsModelParamsSupplier implements java.util.function.Supplier<android.view.textclassifier.ActionsModelParamsSupplier.ActionsModelParams> {
    private static final java.lang.String TAG = "androidtc";
    static final java.lang.String KEY_REQUIRED_MODEL_VERSION = "required_model_version";
    static final java.lang.String KEY_REQUIRED_LOCALES = "required_locales";
    static final java.lang.String KEY_SERIALIZED_PRECONDITIONS = "serialized_preconditions";
    private final android.content.Context mAppContext = null;
    private final android.view.textclassifier.ActionsModelParamsSupplier.SettingsObserver mSettingsObserver = null;
    private final java.lang.Object mLock = null;
    private final java.lang.Runnable mOnChangedListener = null;
    private android.view.textclassifier.ActionsModelParamsSupplier.ActionsModelParams mActionsModelParams;
    private boolean mParsed;
    public ActionsModelParamsSupplier(android.content.Context p0, java.lang.Runnable p1) {}
    public android.view.textclassifier.ActionsModelParamsSupplier.ActionsModelParams get() { return null; }
    private android.view.textclassifier.ActionsModelParamsSupplier.ActionsModelParams parse(android.content.ContentResolver p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}

    private static final class SettingsObserver extends android.database.ContentObserver {
        private final java.lang.ref.WeakReference<java.lang.Runnable> mOnChangedListener = null;
        SettingsObserver(android.content.Context p0, java.lang.Runnable p1) { super(null); }
        public void onChange(boolean p0) {}
    }

    public static final class ActionsModelParams {
        public static final android.view.textclassifier.ActionsModelParamsSupplier.ActionsModelParams INVALID = null;
        private final int mRequiredModelVersion = 0;
        private final java.lang.String mRequiredModelLocales = null;
        private final byte[] mSerializedPreconditions = null;
        public ActionsModelParams(int p0, java.lang.String p1, byte[] p2) {}
        public byte[] getSerializedPreconditions(android.view.textclassifier.ModelFileManager.ModelFile p0) { return null; }
    }
}
