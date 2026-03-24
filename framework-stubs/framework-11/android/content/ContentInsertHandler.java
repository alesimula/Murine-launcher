package android.content;

public interface ContentInsertHandler {
    public void insert(android.content.ContentResolver p0, java.io.InputStream p1) throws java.io.IOException, org.xml.sax.SAXException;
    public void insert(android.content.ContentResolver p0, java.lang.String p1) throws org.xml.sax.SAXException;
}
