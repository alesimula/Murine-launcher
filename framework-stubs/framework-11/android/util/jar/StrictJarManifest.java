package android.util.jar;

public class StrictJarManifest implements java.lang.Cloneable {
    static final int LINE_LENGTH_LIMIT = 72;
    private static final byte[] LINE_SEPARATOR = null;
    private static final byte[] VALUE_SEPARATOR = null;
    static final java.util.jar.Attributes.Name ATTRIBUTE_NAME_NAME = null;
    private final java.util.jar.Attributes mainAttributes = null;
    private final java.util.HashMap<java.lang.String, java.util.jar.Attributes> entries = null;
    private java.util.HashMap<java.lang.String, android.util.jar.StrictJarManifest.Chunk> chunks;
    private int mainEnd;
    public StrictJarManifest() {}
    public StrictJarManifest(java.io.InputStream p0) throws java.io.IOException {}
    public StrictJarManifest(android.util.jar.StrictJarManifest p0) {}
    StrictJarManifest(byte[] p0, boolean p1) throws java.io.IOException {}
    public void clear() {}
    public java.util.jar.Attributes getAttributes(java.lang.String p0) { return null; }
    public java.util.Map<java.lang.String, java.util.jar.Attributes> getEntries() { return null; }
    public java.util.jar.Attributes getMainAttributes() { return null; }
    public java.lang.Object clone() { return null; }
    public void write(java.io.OutputStream p0) throws java.io.IOException {}
    public void read(java.io.InputStream p0) throws java.io.IOException {}
    private void read(byte[] p0) throws java.io.IOException {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    android.util.jar.StrictJarManifest.Chunk getChunk(java.lang.String p0) { return null; }
    void removeChunks() {}
    int getMainAttributesEnd() { return 0; }
    static void write(android.util.jar.StrictJarManifest p0, java.io.OutputStream p1) throws java.io.IOException {}
    private static void writeEntry(java.io.OutputStream p0, java.util.jar.Attributes.Name p1, java.lang.String p2, java.nio.charset.CharsetEncoder p3, java.nio.ByteBuffer p4) throws java.io.IOException {}

    static final class Chunk {
        final int start = 0;
        final int end = 0;
        Chunk(int p0, int p1) {}
    }
}
