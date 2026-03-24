package android.content.res;

final class XmlBlock implements java.lang.AutoCloseable {
    private static final boolean DEBUG = false;
    private final android.content.res.AssetManager mAssets = null;
    private final long mNative = 0L;
    final android.content.res.StringBlock mStrings = null;
    private boolean mOpen;
    private int mOpenCount;
    public XmlBlock(byte[] p0) {}
    public XmlBlock(byte[] p0, int p1, int p2) {}
    public void close() {}
    private void decOpenCountLocked() {}
    public android.content.res.XmlResourceParser newParser() { return null; }
    public android.content.res.XmlResourceParser newParser(int p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    XmlBlock(android.content.res.AssetManager p0, long p1) {}
    private static final native long nativeCreate(byte[] p0, int p1, int p2);
    private static final native long nativeGetStringBlock(long p0);
    private static final native long nativeCreateParseState(long p0, int p1);
    private static final native void nativeDestroyParseState(long p0);
    private static final native void nativeDestroy(long p0);
    static final native int nativeNext(long p0);
    private static final native int nativeGetNamespace(long p0);
    static final native int nativeGetName(long p0);
    private static final native int nativeGetText(long p0);
    private static final native int nativeGetLineNumber(long p0);
    private static final native int nativeGetAttributeCount(long p0);
    private static final native int nativeGetAttributeNamespace(long p0, int p1);
    private static final native int nativeGetAttributeName(long p0, int p1);
    private static final native int nativeGetAttributeResource(long p0, int p1);
    private static final native int nativeGetAttributeDataType(long p0, int p1);
    private static final native int nativeGetAttributeData(long p0, int p1);
    private static final native int nativeGetAttributeStringValue(long p0, int p1);
    private static final native int nativeGetIdAttribute(long p0);
    private static final native int nativeGetClassAttribute(long p0);
    private static final native int nativeGetStyleAttribute(long p0);
    private static final native int nativeGetAttributeIndex(long p0, java.lang.String p1, java.lang.String p2);
    private static final native int nativeGetSourceResId(long p0);

    final class Parser implements android.content.res.XmlResourceParser {
        long mParseState;
        private final android.content.res.XmlBlock mBlock = null;
        private boolean mStarted;
        private boolean mDecNextDepth;
        private int mDepth;
        private int mEventType;
        Parser(android.content.res.XmlBlock p0, long p1, android.content.res.XmlBlock p2) {}
        public int getSourceResId() { return 0; }
        public void setFeature(java.lang.String p0, boolean p1) throws org.xmlpull.v1.XmlPullParserException {}
        public boolean getFeature(java.lang.String p0) { return false; }
        public void setProperty(java.lang.String p0, java.lang.Object p1) throws org.xmlpull.v1.XmlPullParserException {}
        public java.lang.Object getProperty(java.lang.String p0) { return null; }
        public void setInput(java.io.Reader p0) throws org.xmlpull.v1.XmlPullParserException {}
        public void setInput(java.io.InputStream p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException {}
        public void defineEntityReplacementText(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException {}
        public java.lang.String getNamespacePrefix(int p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
        public java.lang.String getInputEncoding() { return null; }
        public java.lang.String getNamespace(java.lang.String p0) { return null; }
        public int getNamespaceCount(int p0) throws org.xmlpull.v1.XmlPullParserException { return 0; }
        public java.lang.String getPositionDescription() { return null; }
        public java.lang.String getNamespaceUri(int p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
        public int getColumnNumber() { return 0; }
        public int getDepth() { return 0; }
        public java.lang.String getText() { return null; }
        public int getLineNumber() { return 0; }
        public int getEventType() throws org.xmlpull.v1.XmlPullParserException { return 0; }
        public boolean isWhitespace() throws org.xmlpull.v1.XmlPullParserException { return false; }
        public java.lang.String getPrefix() { return null; }
        public char[] getTextCharacters(int[] p0) { return null; }
        public java.lang.String getNamespace() { return null; }
        public java.lang.String getName() { return null; }
        public java.lang.String getAttributeNamespace(int p0) { return null; }
        public java.lang.String getAttributeName(int p0) { return null; }
        public java.lang.String getAttributePrefix(int p0) { return null; }
        public boolean isEmptyElementTag() throws org.xmlpull.v1.XmlPullParserException { return false; }
        public int getAttributeCount() { return 0; }
        public java.lang.String getAttributeValue(int p0) { return null; }
        public java.lang.String getAttributeType(int p0) { return null; }
        public boolean isAttributeDefault(int p0) { return false; }
        public int nextToken() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
        public java.lang.String getAttributeValue(java.lang.String p0, java.lang.String p1) { return null; }
        public int next() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
        public void require(int p0, java.lang.String p1, java.lang.String p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
        public java.lang.String nextText() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
        public int nextTag() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
        public int getAttributeNameResource(int p0) { return 0; }
        public int getAttributeListValue(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, int p3) { return 0; }
        public boolean getAttributeBooleanValue(java.lang.String p0, java.lang.String p1, boolean p2) { return false; }
        public int getAttributeResourceValue(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
        public int getAttributeIntValue(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
        public int getAttributeUnsignedIntValue(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
        public float getAttributeFloatValue(java.lang.String p0, java.lang.String p1, float p2) { return 0.0f; }
        public int getAttributeListValue(int p0, java.lang.String[] p1, int p2) { return 0; }
        public boolean getAttributeBooleanValue(int p0, boolean p1) { return false; }
        public int getAttributeResourceValue(int p0, int p1) { return 0; }
        public int getAttributeIntValue(int p0, int p1) { return 0; }
        public int getAttributeUnsignedIntValue(int p0, int p1) { return 0; }
        public float getAttributeFloatValue(int p0, float p1) { return 0.0f; }
        public java.lang.String getIdAttribute() { return null; }
        public java.lang.String getClassAttribute() { return null; }
        public int getIdAttributeResourceValue(int p0) { return 0; }
        public int getStyleAttribute() { return 0; }
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
        final java.lang.CharSequence getPooledString(int p0) { return null; }
    }
}
