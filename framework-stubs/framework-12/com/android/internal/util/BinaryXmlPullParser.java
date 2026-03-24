package com.android.internal.util;

public final class BinaryXmlPullParser implements android.util.TypedXmlPullParser {
    private static final int BUFFER_SIZE = 32768;
    private com.android.internal.util.FastDataInput mIn;
    private int mCurrentToken;
    private int mCurrentDepth;
    private java.lang.String mCurrentName;
    private java.lang.String mCurrentText;
    private int mAttributeCount;
    private com.android.internal.util.BinaryXmlPullParser.Attribute[] mAttributes;
    private static final char[] HEX_DIGITS = null;
    public BinaryXmlPullParser() {}
    public void setInput(java.io.InputStream p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException {}
    public void setInput(java.io.Reader p0) throws org.xmlpull.v1.XmlPullParserException {}
    public int next() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
    public int nextToken() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
    private int peekNextExternalToken() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return 0; }
    private int peekNextToken() throws java.io.IOException { return 0; }
    private void consumeToken() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    private void consumeAdditionalText() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    static java.lang.String resolveEntity(java.lang.String p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
    public void require(int p0, java.lang.String p1, java.lang.String p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public java.lang.String nextText() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public int nextTag() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
    private com.android.internal.util.BinaryXmlPullParser.Attribute obtainAttribute() { return null; }
    private void resetAttributes() {}
    public int getAttributeIndex(java.lang.String p0, java.lang.String p1) { return 0; }
    public java.lang.String getAttributeValue(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getAttributeValue(int p0) { return null; }
    public byte[] getAttributeBytesHex(int p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
    public byte[] getAttributeBytesBase64(int p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
    public int getAttributeInt(int p0) throws org.xmlpull.v1.XmlPullParserException { return 0; }
    public int getAttributeIntHex(int p0) throws org.xmlpull.v1.XmlPullParserException { return 0; }
    public long getAttributeLong(int p0) throws org.xmlpull.v1.XmlPullParserException { return 0L; }
    public long getAttributeLongHex(int p0) throws org.xmlpull.v1.XmlPullParserException { return 0L; }
    public float getAttributeFloat(int p0) throws org.xmlpull.v1.XmlPullParserException { return 0.0f; }
    public double getAttributeDouble(int p0) throws org.xmlpull.v1.XmlPullParserException { return 0.0; }
    public boolean getAttributeBoolean(int p0) throws org.xmlpull.v1.XmlPullParserException { return false; }
    public java.lang.String getText() { return null; }
    public char[] getTextCharacters(int[] p0) { return null; }
    public java.lang.String getInputEncoding() { return null; }
    public int getDepth() { return 0; }
    public java.lang.String getPositionDescription() { return null; }
    public int getLineNumber() { return 0; }
    public int getColumnNumber() { return 0; }
    public boolean isWhitespace() throws org.xmlpull.v1.XmlPullParserException { return false; }
    public java.lang.String getNamespace() { return null; }
    public java.lang.String getName() { return null; }
    public java.lang.String getPrefix() { return null; }
    public boolean isEmptyElementTag() throws org.xmlpull.v1.XmlPullParserException { return false; }
    public int getAttributeCount() { return 0; }
    public java.lang.String getAttributeNamespace(int p0) { return null; }
    public java.lang.String getAttributeName(int p0) { return null; }
    public java.lang.String getAttributePrefix(int p0) { return null; }
    public java.lang.String getAttributeType(int p0) { return null; }
    public boolean isAttributeDefault(int p0) { return false; }
    public int getEventType() throws org.xmlpull.v1.XmlPullParserException { return 0; }
    public int getNamespaceCount(int p0) throws org.xmlpull.v1.XmlPullParserException { return 0; }
    public java.lang.String getNamespacePrefix(int p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
    public java.lang.String getNamespaceUri(int p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
    public java.lang.String getNamespace(java.lang.String p0) { return null; }
    public void defineEntityReplacementText(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException {}
    public void setFeature(java.lang.String p0, boolean p1) throws org.xmlpull.v1.XmlPullParserException {}
    public boolean getFeature(java.lang.String p0) { return false; }
    public void setProperty(java.lang.String p0, java.lang.Object p1) throws org.xmlpull.v1.XmlPullParserException {}
    public java.lang.Object getProperty(java.lang.String p0) { return null; }
    private static java.lang.IllegalArgumentException illegalNamespace() { return null; }
    private static int toByte(char p0) { return 0; }
    static java.lang.String bytesToHexString(byte[] p0) { return null; }
    static byte[] hexStringToBytes(java.lang.String p0) { return null; }

    private static class Attribute {
        public java.lang.String name;
        public int type;
        public java.lang.String valueString;
        public byte[] valueBytes;
        public int valueInt;
        public long valueLong;
        public float valueFloat;
        public double valueDouble;
        private Attribute() {}
        public void reset() {}
        public java.lang.String getValueString() { return null; }
        public byte[] getValueBytesHex() throws org.xmlpull.v1.XmlPullParserException { return null; }
        public byte[] getValueBytesBase64() throws org.xmlpull.v1.XmlPullParserException { return null; }
        public int getValueInt() throws org.xmlpull.v1.XmlPullParserException { return 0; }
        public int getValueIntHex() throws org.xmlpull.v1.XmlPullParserException { return 0; }
        public long getValueLong() throws org.xmlpull.v1.XmlPullParserException { return 0L; }
        public long getValueLongHex() throws org.xmlpull.v1.XmlPullParserException { return 0L; }
        public float getValueFloat() throws org.xmlpull.v1.XmlPullParserException { return 0.0f; }
        public double getValueDouble() throws org.xmlpull.v1.XmlPullParserException { return 0.0; }
        public boolean getValueBoolean() throws org.xmlpull.v1.XmlPullParserException { return false; }
    }
}
