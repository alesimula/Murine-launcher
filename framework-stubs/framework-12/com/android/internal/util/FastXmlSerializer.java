package com.android.internal.util;

public class FastXmlSerializer implements org.xmlpull.v1.XmlSerializer {
    private static final java.lang.String[] ESCAPE_TABLE = null;
    private static final int DEFAULT_BUFFER_LEN = 32768;
    private static java.lang.String sSpace;
    private final int mBufferLen = 0;
    private final char[] mText = null;
    private int mPos;
    private java.io.Writer mWriter;
    private java.io.OutputStream mOutputStream;
    private java.nio.charset.CharsetEncoder mCharset;
    private java.nio.ByteBuffer mBytes;
    private boolean mIndent;
    private boolean mInTag;
    private int mNesting;
    private boolean mLineStart;
    public FastXmlSerializer() {}
    public FastXmlSerializer(int p0) {}
    private void append(char p0) throws java.io.IOException {}
    private void append(java.lang.String p0, int p1, int p2) throws java.io.IOException {}
    private void append(char[] p0, int p1, int p2) throws java.io.IOException {}
    private void append(java.lang.String p0) throws java.io.IOException {}
    private void appendIndent(int p0) throws java.io.IOException {}
    private void escapeAndAppendString(java.lang.String p0) throws java.io.IOException {}
    private void escapeAndAppendString(char[] p0, int p1, int p2) throws java.io.IOException {}
    public org.xmlpull.v1.XmlSerializer attribute(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException { return null; }
    public void cdsect(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void comment(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void docdecl(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void endDocument() throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public org.xmlpull.v1.XmlSerializer endTag(java.lang.String p0, java.lang.String p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException { return null; }
    public void entityRef(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    private void flushBytes() throws java.io.IOException {}
    public void flush() throws java.io.IOException {}
    public int getDepth() { return 0; }
    public boolean getFeature(java.lang.String p0) { return false; }
    public java.lang.String getName() { return null; }
    public java.lang.String getNamespace() { return null; }
    public java.lang.String getPrefix(java.lang.String p0, boolean p1) throws java.lang.IllegalArgumentException { return null; }
    public java.lang.Object getProperty(java.lang.String p0) { return null; }
    public void ignorableWhitespace(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void processingInstruction(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void setFeature(java.lang.String p0, boolean p1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void setOutput(java.io.OutputStream p0, java.lang.String p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void setOutput(java.io.Writer p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void setPrefix(java.lang.String p0, java.lang.String p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void setProperty(java.lang.String p0, java.lang.Object p1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void startDocument(java.lang.String p0, java.lang.Boolean p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public org.xmlpull.v1.XmlSerializer startTag(java.lang.String p0, java.lang.String p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException { return null; }
    public org.xmlpull.v1.XmlSerializer text(char[] p0, int p1, int p2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException { return null; }
    public org.xmlpull.v1.XmlSerializer text(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException { return null; }
}
