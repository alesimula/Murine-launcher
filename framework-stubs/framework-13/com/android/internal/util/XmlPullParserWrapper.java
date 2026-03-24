package com.android.internal.util;

public class XmlPullParserWrapper implements org.xmlpull.v1.XmlPullParser {
    public XmlPullParserWrapper(org.xmlpull.v1.XmlPullParser p0) {}
    public void setFeature(java.lang.String p0, boolean p1) throws org.xmlpull.v1.XmlPullParserException {}
    public boolean getFeature(java.lang.String p0) { return false; }
    public void setProperty(java.lang.String p0, java.lang.Object p1) throws org.xmlpull.v1.XmlPullParserException {}
    public java.lang.Object getProperty(java.lang.String p0) { return null; }
    public void setInput(java.io.Reader p0) throws org.xmlpull.v1.XmlPullParserException {}
    public void setInput(java.io.InputStream p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException {}
    public java.lang.String getInputEncoding() { return null; }
    public void defineEntityReplacementText(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException {}
    public int getNamespaceCount(int p0) throws org.xmlpull.v1.XmlPullParserException { return 0; }
    public java.lang.String getNamespacePrefix(int p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
    public java.lang.String getNamespaceUri(int p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
    public java.lang.String getNamespace(java.lang.String p0) { return null; }
    public int getDepth() { return 0; }
    public java.lang.String getPositionDescription() { return null; }
    public int getLineNumber() { return 0; }
    public int getColumnNumber() { return 0; }
    public boolean isWhitespace() throws org.xmlpull.v1.XmlPullParserException { return false; }
    public java.lang.String getText() { return null; }
    public char[] getTextCharacters(int[] p0) { return null; }
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
    public java.lang.String getAttributeValue(int p0) { return null; }
    public java.lang.String getAttributeValue(java.lang.String p0, java.lang.String p1) { return null; }
    public int getEventType() throws org.xmlpull.v1.XmlPullParserException { return 0; }
    public int next() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
    public int nextToken() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
    public void require(int p0, java.lang.String p1, java.lang.String p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public java.lang.String nextText() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public int nextTag() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
}
