package android.content;

public class DefaultDataHandler implements android.content.ContentInsertHandler {
    private static final java.lang.String ROW = "row";
    private static final java.lang.String COL = "col";
    private static final java.lang.String URI_STR = "uri";
    private static final java.lang.String POSTFIX = "postfix";
    private static final java.lang.String DEL = "del";
    private static final java.lang.String SELECT = "select";
    private static final java.lang.String ARG = "arg";
    private java.util.Stack<android.net.Uri> mUris;
    private android.content.ContentValues mValues;
    private android.content.ContentResolver mContentResolver;
    public DefaultDataHandler() {}
    public void insert(android.content.ContentResolver p0, java.io.InputStream p1) throws java.io.IOException, org.xml.sax.SAXException {}
    public void insert(android.content.ContentResolver p0, java.lang.String p1) throws org.xml.sax.SAXException {}
    private void parseRow(org.xml.sax.Attributes p0) throws org.xml.sax.SAXException {}
    private android.net.Uri insertRow() { return null; }
    public void startElement(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3) throws org.xml.sax.SAXException {}
    public void endElement(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws org.xml.sax.SAXException {}
    public void characters(char[] p0, int p1, int p2) throws org.xml.sax.SAXException {}
    public void endDocument() throws org.xml.sax.SAXException {}
    public void endPrefixMapping(java.lang.String p0) throws org.xml.sax.SAXException {}
    public void ignorableWhitespace(char[] p0, int p1, int p2) throws org.xml.sax.SAXException {}
    public void processingInstruction(java.lang.String p0, java.lang.String p1) throws org.xml.sax.SAXException {}
    public void setDocumentLocator(org.xml.sax.Locator p0) {}
    public void skippedEntity(java.lang.String p0) throws org.xml.sax.SAXException {}
    public void startDocument() throws org.xml.sax.SAXException {}
    public void startPrefixMapping(java.lang.String p0, java.lang.String p1) throws org.xml.sax.SAXException {}
}
