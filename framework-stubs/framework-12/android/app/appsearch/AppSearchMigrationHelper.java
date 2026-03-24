package android.app.appsearch;

public class AppSearchMigrationHelper implements java.io.Closeable {
    private final android.app.appsearch.aidl.IAppSearchManager mService = null;
    private final java.lang.String mPackageName = null;
    private final java.lang.String mDatabaseName = null;
    private final android.os.UserHandle mUserHandle = null;
    private final java.io.File mMigratedFile = null;
    private final java.util.Set<java.lang.String> mDestinationTypes = null;
    private boolean mAreDocumentsMigrated;
    AppSearchMigrationHelper(android.app.appsearch.aidl.IAppSearchManager p0, android.os.UserHandle p1, java.lang.String p2, java.lang.String p3, java.util.Set<android.app.appsearch.AppSearchSchema> p4) throws java.io.IOException {}
    public void queryAndTransform(java.lang.String p0, android.app.appsearch.Migrator p1, int p2, int p3) throws java.io.IOException, android.app.appsearch.exceptions.AppSearchException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {}
    android.app.appsearch.AppSearchResult<android.app.appsearch.SetSchemaResponse> putMigratedDocuments(android.app.appsearch.SetSchemaResponse.Builder p0) { return null; }
    private void readAndTransform(java.io.File p0, android.app.appsearch.Migrator p1, int p2, int p3) throws java.io.IOException, android.app.appsearch.exceptions.AppSearchException {}
    public static android.app.appsearch.GenericDocument readDocumentFromInputStream(java.io.DataInputStream p0) throws java.io.IOException { return null; }
    public static void writeBundleToOutputStream(java.io.DataOutputStream p0, android.os.Bundle p1) throws java.io.IOException {}
    public void close() throws java.io.IOException {}
}
