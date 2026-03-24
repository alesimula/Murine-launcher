package com.android.internal.util;

public class XmlSerializerWrapper implements org.xmlpull.v1.XmlSerializer {
    public XmlSerializerWrapper(org.xmlpull.v1.XmlSerializer p0) {}
    public void setFeature(java.lang.String p0, boolean p1) {}
    public boolean getFeature(java.lang.String p0) { return false; }
    public void setProperty(java.lang.String p0, java.lang.Object p1) {}
    public java.lang.Object getProperty(java.lang.String p0) { return null; }
    public void setOutput(java.io.OutputStream p0, java.lang.String p1) throws java.io.IOException {}
    public void setOutput(java.io.Writer p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void startDocument(java.lang.String p0, java.lang.Boolean p1) throws java.io.IOException {}
    public void endDocument() throws java.io.IOException {}
    public void setPrefix(java.lang.String p0, java.lang.String p1) throws java.io.IOException {}
    public java.lang.String getPrefix(java.lang.String p0, boolean p1) { return null; }
    public int getDepth() { return 0; }
    public java.lang.String getNamespace() { return null; }
    public java.lang.String getName() { return null; }
    public org.xmlpull.v1.XmlSerializer startTag(java.lang.String p0, java.lang.String p1) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer attribute(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer endTag(java.lang.String p0, java.lang.String p1) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer text(java.lang.String p0) throws java.io.IOException { return null; }
    public org.xmlpull.v1.XmlSerializer text(char[] p0, int p1, int p2) throws java.io.IOException { return null; }
    public void cdsect(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void entityRef(java.lang.String p0) throws java.io.IOException {}
    public void processingInstruction(java.lang.String p0) throws java.io.IOException {}
    public void comment(java.lang.String p0) throws java.io.IOException {}
    public void docdecl(java.lang.String p0) throws java.io.IOException {}
    public void ignorableWhitespace(java.lang.String p0) throws java.io.IOException {}
    public void flush() throws java.io.IOException {}
}
