package android.filterfw.io;

public abstract class GraphReader {
    protected android.filterfw.core.KeyValueMap mReferences;
    public GraphReader() {}
    public abstract android.filterfw.core.FilterGraph readGraphString(java.lang.String p0) throws android.filterfw.io.GraphIOException;
    public abstract android.filterfw.core.KeyValueMap readKeyValueAssignments(java.lang.String p0) throws android.filterfw.io.GraphIOException;
    public android.filterfw.core.FilterGraph readGraphResource(android.content.Context p0, int p1) throws android.filterfw.io.GraphIOException { return null; }
    public void addReference(java.lang.String p0, java.lang.Object p1) {}
    public void addReferencesByMap(android.filterfw.core.KeyValueMap p0) {}
    public void addReferencesByKeysAndValues(java.lang.Object... p0) {}
}
