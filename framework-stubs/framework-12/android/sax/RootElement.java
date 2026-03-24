package android.sax;

public class RootElement extends android.sax.Element {
    final android.sax.RootElement.Handler handler = null;
    public RootElement(java.lang.String p0, java.lang.String p1) { super(null, null, null, 0); }
    public RootElement(java.lang.String p0) { super(null, null, null, 0); }
    public org.xml.sax.ContentHandler getContentHandler() { return null; }

    class Handler {
        int depth;
        android.sax.Element current;
        java.lang.StringBuilder bodyBuilder;
        Handler(android.sax.RootElement p0) {}
        public void setDocumentLocator(org.xml.sax.Locator p0) {}
        public void startElement(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3) throws org.xml.sax.SAXException {}
        void startRoot(java.lang.String p0, java.lang.String p1, org.xml.sax.Attributes p2) throws org.xml.sax.SAXException {}
        void start(android.sax.Element p0, org.xml.sax.Attributes p1) {}
        public void characters(char[] p0, int p1, int p2) throws org.xml.sax.SAXException {}
        public void endElement(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws org.xml.sax.SAXException {}
    }
}
