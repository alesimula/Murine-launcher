package android.app.appsearch;

public class GenericDocument {
    private static final java.lang.String TAG = "AppSearchGenericDocumen";
    private static final int MAX_INDEXED_PROPERTIES = 16;
    private static final int DEFAULT_SCORE = 0;
    private static final long DEFAULT_TTL_MILLIS = 0L;
    private static final java.lang.String PROPERTIES_FIELD = "properties";
    private static final java.lang.String BYTE_ARRAY_FIELD = "byteArray";
    private static final java.lang.String SCHEMA_TYPE_FIELD = "schemaType";
    private static final java.lang.String ID_FIELD = "id";
    private static final java.lang.String SCORE_FIELD = "score";
    private static final java.lang.String TTL_MILLIS_FIELD = "ttlMillis";
    private static final java.lang.String CREATION_TIMESTAMP_MILLIS_FIELD = "creationTimestampMillis";
    private static final java.lang.String NAMESPACE_FIELD = "namespace";
    final android.os.Bundle mBundle = null;
    private final android.os.Bundle mProperties = null;
    private final java.lang.String mId = null;
    private final java.lang.String mSchemaType = null;
    private final long mCreationTimestampMillis = 0L;
    private java.lang.Integer mHashCode;
    public static int getMaxIndexedProperties() { return 0; }
    public GenericDocument(android.os.Bundle p0) {}
    protected GenericDocument(android.app.appsearch.GenericDocument p0) {}
    public android.os.Bundle getBundle() { return null; }
    public java.lang.String getId() { return null; }
    public java.lang.String getNamespace() { return null; }
    public java.lang.String getSchemaType() { return null; }
    public long getCreationTimestampMillis() { return 0L; }
    public long getTtlMillis() { return 0L; }
    public int getScore() { return 0; }
    public java.util.Set<java.lang.String> getPropertyNames() { return null; }
    public java.lang.Object getProperty(java.lang.String p0) { return null; }
    private static java.lang.Object getRawPropertyFromRawDocument(java.lang.String p0, android.os.Bundle p1) { return null; }
    private static java.lang.Object flattenAccumulator(java.util.List<java.lang.Object> p0) { return null; }
    public java.lang.String getPropertyString(java.lang.String p0) { return null; }
    public long getPropertyLong(java.lang.String p0) { return 0L; }
    public double getPropertyDouble(java.lang.String p0) { return 0.0; }
    public boolean getPropertyBoolean(java.lang.String p0) { return false; }
    public byte[] getPropertyBytes(java.lang.String p0) { return null; }
    public android.app.appsearch.GenericDocument getPropertyDocument(java.lang.String p0) { return null; }
    private static void warnIfSinglePropertyTooLong(java.lang.String p0, java.lang.String p1, int p2) {}
    public java.lang.String[] getPropertyStringArray(java.lang.String p0) { return null; }
    public long[] getPropertyLongArray(java.lang.String p0) { return null; }
    public double[] getPropertyDoubleArray(java.lang.String p0) { return null; }
    public boolean[] getPropertyBooleanArray(java.lang.String p0) { return null; }
    @android.annotation.SuppressLint("ArrayReturn")
    public byte[][] getPropertyBytesArray(java.lang.String p0) { return null; }
    @android.annotation.SuppressLint("ArrayReturn")
    public android.app.appsearch.GenericDocument[] getPropertyDocumentArray(java.lang.String p0) { return null; }
    private static <T extends java.lang.Object> T safeCastProperty(java.lang.String p0, java.lang.Object p1, java.lang.Class<T> p2) { return null; }
    public android.app.appsearch.GenericDocument.Builder<android.app.appsearch.GenericDocument.Builder<?>> toBuilder() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    void appendGenericDocumentString(android.app.appsearch.util.IndentingStringBuilder p0) {}
    private void appendPropertyString(java.lang.String p0, java.lang.Object p1, android.app.appsearch.util.IndentingStringBuilder p2) {}

    @android.annotation.SuppressLint("StaticFinalBuilder")
    public static class Builder<BuilderType extends android.app.appsearch.GenericDocument.Builder> {
        private android.os.Bundle mBundle;
        private android.os.Bundle mProperties;
        private boolean mBuilt;
        public Builder(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        Builder(android.os.Bundle p0) {}
        public BuilderType setNamespace(java.lang.String p0) { return null; }
        public BuilderType setId(java.lang.String p0) { return null; }
        public BuilderType setSchemaType(java.lang.String p0) { return null; }
        public BuilderType setScore(int p0) { return null; }
        public BuilderType setCreationTimestampMillis(long p0) { return null; }
        public BuilderType setTtlMillis(long p0) { return null; }
        public BuilderType setPropertyString(java.lang.String p0, java.lang.String... p1) { return null; }
        public BuilderType setPropertyBoolean(java.lang.String p0, boolean... p1) { return null; }
        public BuilderType setPropertyLong(java.lang.String p0, long... p1) { return null; }
        public BuilderType setPropertyDouble(java.lang.String p0, double... p1) { return null; }
        public BuilderType setPropertyBytes(java.lang.String p0, byte[]... p1) { return null; }
        public BuilderType setPropertyDocument(java.lang.String p0, android.app.appsearch.GenericDocument... p1) { return null; }
        public BuilderType clearProperty(java.lang.String p0) { return null; }
        private void putInPropertyBundle(java.lang.String p0, java.lang.String[] p1) throws java.lang.IllegalArgumentException {}
        private void putInPropertyBundle(java.lang.String p0, boolean[] p1) {}
        private void putInPropertyBundle(java.lang.String p0, double[] p1) {}
        private void putInPropertyBundle(java.lang.String p0, long[] p1) {}
        private void putInPropertyBundle(java.lang.String p0, byte[][] p1) {}
        private void putInPropertyBundle(java.lang.String p0, android.app.appsearch.GenericDocument[] p1) {}
        public android.app.appsearch.GenericDocument build() { return null; }
        private void resetIfBuilt() {}
    }
}
