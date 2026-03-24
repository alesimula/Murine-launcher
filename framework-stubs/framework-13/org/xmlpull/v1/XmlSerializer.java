package org.xmlpull.v1;

public interface XmlSerializer {
    public void setFeature(java.lang.String p0, boolean p1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public boolean getFeature(java.lang.String p0);
    public void setProperty(java.lang.String p0, java.lang.Object p1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public java.lang.Object getProperty(java.lang.String p0);
    public void setOutput(java.io.OutputStream p0, java.lang.String p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void setOutput(java.io.Writer p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void startDocument(java.lang.String p0, java.lang.Boolean p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void endDocument() throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void setPrefix(java.lang.String p0, java.lang.String p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public java.lang.String getPrefix(java.lang.String p0, boolean p1) throws java.lang.IllegalArgumentException;
    public int getDepth();
    public java.lang.String getNamespace();
    public java.lang.String getName();
    public org.xmlpull.v1.XmlSerializer startTag(java.lang.String p0, java.lang.String p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public org.xmlpull.v1.XmlSerializer attribute(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public org.xmlpull.v1.XmlSerializer endTag(java.lang.String p0, java.lang.String p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public org.xmlpull.v1.XmlSerializer text(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public org.xmlpull.v1.XmlSerializer text(char[] p0, int p1, int p2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void cdsect(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void entityRef(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void processingInstruction(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void comment(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void docdecl(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void ignorableWhitespace(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void flush() throws java.io.IOException;
}
