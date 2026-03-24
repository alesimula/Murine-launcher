package com.android.modules.utils;

public class BinaryXmlSerializer implements com.android.modules.utils.TypedXmlSerializer {
    public static final byte[] PROTOCOL_MAGIC_VERSION_0 = null;
    static final int ATTRIBUTE = 15;
    static final int TYPE_NULL = 16;
    static final int TYPE_STRING = 32;
    static final int TYPE_STRING_INTERNED = 48;
    static final int TYPE_BYTES_HEX = 64;
    static final int TYPE_BYTES_BASE64 = 80;
    static final int TYPE_INT = 96;
    static final int TYPE_INT_HEX = 112;
    static final int TYPE_LONG = 128;
    static final int TYPE_LONG_HEX = 144;
    static final int TYPE_FLOAT = 160;
    static final int TYPE_DOUBLE = 176;
    static final int TYPE_BOOLEAN_TRUE = 192;
    static final int TYPE_BOOLEAN_FALSE = 208;
    public BinaryXmlSerializer() {}
    public void setOutput(java.io.OutputStream p0, java.lang.String p1) throws java.io.IOException {}
    protected com.android.modules.utils.FastDataOutput obtainFastDataOutput(java.io.OutputStream p0) { return null; }
    public void setOutput(java.io.Writer p0) {}
    public void flush() throws java.io.IOException {}
    public void startDocument(java.lang.String p0, java.lang.Boolean p1) throws java.io.IOException {}
    public void endDocument() throws java.io.IOException {}
    public int getDepth() { return 0; }
    public java.lang.String getNamespace() { return null; }
    public java.lang.String getName() { return null; }
    public org.xmlpull.v1.XmlSerializer startTag(java.lang.String p0, java.lang.String p1) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer endTag(java.lang.String p0, java.lang.String p1) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer attribute(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer attributeInterned(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer attributeBytesHex(java.lang.String p0, java.lang.String p1, byte[] p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer attributeBytesBase64(java.lang.String p0, java.lang.String p1, byte[] p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer attributeInt(java.lang.String p0, java.lang.String p1, int p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer attributeIntHex(java.lang.String p0, java.lang.String p1, int p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer attributeLong(java.lang.String p0, java.lang.String p1, long p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer attributeLongHex(java.lang.String p0, java.lang.String p1, long p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer attributeFloat(java.lang.String p0, java.lang.String p1, float p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer attributeDouble(java.lang.String p0, java.lang.String p1, double p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer attributeBoolean(java.lang.String p0, java.lang.String p1, boolean p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer text(char[] p0, int p1, int p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer text(java.lang.String p0) throws java.io.IOException { return null; }
    public void cdsect(java.lang.String p0) throws java.io.IOException {}
    public void entityRef(java.lang.String p0) throws java.io.IOException {}
    public void processingInstruction(java.lang.String p0) throws java.io.IOException {}
    public void comment(java.lang.String p0) throws java.io.IOException {}
    public void docdecl(java.lang.String p0) throws java.io.IOException {}
    public void ignorableWhitespace(java.lang.String p0) throws java.io.IOException {}
    public void setFeature(java.lang.String p0, boolean p1) {}
    public boolean getFeature(java.lang.String p0) { return false; }
    public void setProperty(java.lang.String p0, java.lang.Object p1) {}
    public java.lang.Object getProperty(java.lang.String p0) { return null; }
    public void setPrefix(java.lang.String p0, java.lang.String p1) {}
    public java.lang.String getPrefix(java.lang.String p0, boolean p1) { return null; }
}
