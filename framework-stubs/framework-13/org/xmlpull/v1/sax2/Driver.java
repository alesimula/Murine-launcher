package org.xmlpull.v1.sax2;

public class Driver implements org.xml.sax.Locator, org.xml.sax.XMLReader, org.xml.sax.Attributes {
    protected static final java.lang.String APACHE_DYNAMIC_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/dynamic";
    protected static final java.lang.String APACHE_SCHEMA_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/schema";
    protected static final java.lang.String DECLARATION_HANDLER_PROPERTY = "http://xml.org/sax/properties/declaration-handler";
    protected static final java.lang.String LEXICAL_HANDLER_PROPERTY = "http://xml.org/sax/properties/lexical-handler";
    protected static final java.lang.String NAMESPACES_FEATURE = "http://xml.org/sax/features/namespaces";
    protected static final java.lang.String NAMESPACE_PREFIXES_FEATURE = "http://xml.org/sax/features/namespace-prefixes";
    protected static final java.lang.String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";
    protected org.xml.sax.ContentHandler contentHandler;
    protected org.xml.sax.ErrorHandler errorHandler;
    protected org.xmlpull.v1.XmlPullParser pp;
    protected java.lang.String systemId;
    public Driver() throws org.xmlpull.v1.XmlPullParserException {}
    public Driver(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException {}
    public int getLength() { return 0; }
    public java.lang.String getURI(int p0) { return null; }
    public java.lang.String getLocalName(int p0) { return null; }
    public java.lang.String getQName(int p0) { return null; }
    public java.lang.String getType(int p0) { return null; }
    public java.lang.String getValue(int p0) { return null; }
    public int getIndex(java.lang.String p0, java.lang.String p1) { return 0; }
    public int getIndex(java.lang.String p0) { return 0; }
    public java.lang.String getType(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getType(java.lang.String p0) { return null; }
    public java.lang.String getValue(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getValue(java.lang.String p0) { return null; }
    public java.lang.String getPublicId() { return null; }
    public java.lang.String getSystemId() { return null; }
    public int getLineNumber() { return 0; }
    public int getColumnNumber() { return 0; }
    public boolean getFeature(java.lang.String p0) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { return false; }
    public void setFeature(java.lang.String p0, boolean p1) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException {}
    public java.lang.Object getProperty(java.lang.String p0) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { return null; }
    public void setProperty(java.lang.String p0, java.lang.Object p1) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException {}
    public void setEntityResolver(org.xml.sax.EntityResolver p0) {}
    public org.xml.sax.EntityResolver getEntityResolver() { return null; }
    public void setDTDHandler(org.xml.sax.DTDHandler p0) {}
    public org.xml.sax.DTDHandler getDTDHandler() { return null; }
    public void setContentHandler(org.xml.sax.ContentHandler p0) {}
    public org.xml.sax.ContentHandler getContentHandler() { return null; }
    public void setErrorHandler(org.xml.sax.ErrorHandler p0) {}
    public org.xml.sax.ErrorHandler getErrorHandler() { return null; }
    public void parse(org.xml.sax.InputSource p0) throws java.io.IOException, org.xml.sax.SAXException {}
    public void parse(java.lang.String p0) throws java.io.IOException, org.xml.sax.SAXException {}
    public void parseSubTree(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xml.sax.SAXException {}
    protected void startElement(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws org.xml.sax.SAXException {}
}
