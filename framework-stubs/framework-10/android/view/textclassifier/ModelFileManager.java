package android.view.textclassifier;

public final class ModelFileManager {
    private final java.lang.Object mLock = null;
    private final java.util.function.Supplier<java.util.List<android.view.textclassifier.ModelFileManager.ModelFile>> mModelFileSupplier = null;
    private java.util.List<android.view.textclassifier.ModelFileManager.ModelFile> mModelFiles;
    public ModelFileManager(java.util.function.Supplier<java.util.List<android.view.textclassifier.ModelFileManager.ModelFile>> p0) {}
    public java.util.List<android.view.textclassifier.ModelFileManager.ModelFile> listModelFiles() { return null; }
    public android.view.textclassifier.ModelFileManager.ModelFile findBestModelFile(android.os.LocaleList p0) { return null; }

    public static final class ModelFileSupplierImpl implements java.util.function.Supplier<java.util.List<android.view.textclassifier.ModelFileManager.ModelFile>> {
        private final java.io.File mUpdatedModelFile = null;
        private final java.io.File mFactoryModelDir = null;
        private final java.util.regex.Pattern mModelFilenamePattern = null;
        private final java.util.function.Function<java.lang.Integer, java.lang.Integer> mVersionSupplier = null;
        private final java.util.function.Function<java.lang.Integer, java.lang.String> mSupportedLocalesSupplier = null;
        public ModelFileSupplierImpl(java.io.File p0, java.lang.String p1, java.io.File p2, java.util.function.Function<java.lang.Integer, java.lang.Integer> p3, java.util.function.Function<java.lang.Integer, java.lang.String> p4) {}
        public java.util.List<android.view.textclassifier.ModelFileManager.ModelFile> get() { return null; }
        private android.view.textclassifier.ModelFileManager.ModelFile createModelFile(java.io.File p0) { return null; }
        private static void maybeCloseAndLogError(android.os.ParcelFileDescriptor p0) {}
    }

    public static final class ModelFile {
        public static final java.lang.String LANGUAGE_INDEPENDENT = "*";
        private final java.io.File mFile = null;
        private final int mVersion = 0;
        private final java.util.List<java.util.Locale> mSupportedLocales = null;
        private final java.lang.String mSupportedLocalesStr = null;
        private final boolean mLanguageIndependent = false;
        public ModelFile(java.io.File p0, int p1, java.util.List<java.util.Locale> p2, java.lang.String p3, boolean p4) {}
        public java.lang.String getPath() { return null; }
        public java.lang.String getName() { return null; }
        public int getVersion() { return 0; }
        public boolean isAnyLanguageSupported(java.util.List<java.util.Locale.LanguageRange> p0) { return false; }
        public java.util.List<java.util.Locale> getSupportedLocales() { return null; }
        public java.lang.String getSupportedLocalesStr() { return null; }
        public boolean isPreferredTo(android.view.textclassifier.ModelFileManager.ModelFile p0) { return false; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }
}
