package android.app.appsearch;

public class GenericDocument {
    protected GenericDocument(android.app.appsearch.GenericDocument p0) {}
    public long getCreationTimestampMillis() { return 0L; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    public static int getMaxIndexedProperties() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getNamespace() { return null; }
    @android.annotation.Nullable
    public java.lang.Object getProperty(java.lang.String p0) { return null; }
    public boolean getPropertyBoolean(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public boolean[] getPropertyBooleanArray(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public byte[] getPropertyBytes(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public byte[][] getPropertyBytesArray(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public android.app.appsearch.GenericDocument getPropertyDocument(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public android.app.appsearch.GenericDocument[] getPropertyDocumentArray(java.lang.String p0) { return null; }
    public double getPropertyDouble(java.lang.String p0) { return 0.0; }
    @android.annotation.Nullable
    public double[] getPropertyDoubleArray(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public android.app.appsearch.EmbeddingVector getPropertyEmbedding(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public android.app.appsearch.EmbeddingVector[] getPropertyEmbeddingArray(java.lang.String p0) { return null; }
    public long getPropertyLong(java.lang.String p0) { return 0L; }
    @android.annotation.Nullable
    public long[] getPropertyLongArray(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getPropertyNames() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPropertyString(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String[] getPropertyStringArray(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.lang.String getSchemaType() { return null; }
    public int getScore() { return 0; }
    public long getTtlMillis() { return 0L; }

    public static class Builder<BuilderType extends android.app.appsearch.GenericDocument.Builder> {
        public Builder(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        public Builder(android.app.appsearch.GenericDocument p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.GenericDocument build() { return null; }
        @android.annotation.NonNull
        public BuilderType clearProperty(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public BuilderType setCreationTimestampMillis(long p0) { return null; }
        @android.annotation.NonNull
        public BuilderType setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public BuilderType setNamespace(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public BuilderType setPropertyBoolean(java.lang.String p0, boolean... p1) { return null; }
        @android.annotation.NonNull
        public BuilderType setPropertyBytes(java.lang.String p0, byte[]... p1) { return null; }
        @android.annotation.NonNull
        public BuilderType setPropertyDocument(java.lang.String p0, android.app.appsearch.GenericDocument... p1) { return null; }
        @android.annotation.NonNull
        public BuilderType setPropertyDouble(java.lang.String p0, double... p1) { return null; }
        @android.annotation.NonNull
        public BuilderType setPropertyEmbedding(java.lang.String p0, android.app.appsearch.EmbeddingVector... p1) { return null; }
        @android.annotation.NonNull
        public BuilderType setPropertyLong(java.lang.String p0, long... p1) { return null; }
        @android.annotation.NonNull
        public BuilderType setPropertyString(java.lang.String p0, java.lang.String... p1) { return null; }
        @android.annotation.NonNull
        public BuilderType setSchemaType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public BuilderType setScore(int p0) { return null; }
        @android.annotation.NonNull
        public BuilderType setTtlMillis(long p0) { return null; }
    }
}
