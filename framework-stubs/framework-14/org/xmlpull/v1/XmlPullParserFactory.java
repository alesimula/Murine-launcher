package org.xmlpull.v1;

public class XmlPullParserFactory {
    public static final java.lang.String PROPERTY_NAME = "org.xmlpull.v1.XmlPullParserFactory";
    protected java.lang.String classNamesLocation;
    protected java.util.HashMap<java.lang.String, java.lang.Boolean> features;
    protected java.util.ArrayList parserClasses;
    protected java.util.ArrayList serializerClasses;
    protected XmlPullParserFactory() {}
    public void setFeature(java.lang.String p0, boolean p1) throws org.xmlpull.v1.XmlPullParserException {}
    public boolean getFeature(java.lang.String p0) { return false; }
    public void setNamespaceAware(boolean p0) {}
    public boolean isNamespaceAware() { return false; }
    public void setValidating(boolean p0) {}
    public boolean isValidating() { return false; }
    public org.xmlpull.v1.XmlPullParser newPullParser() throws org.xmlpull.v1.XmlPullParserException { return null; }
    public org.xmlpull.v1.XmlSerializer newSerializer() throws org.xmlpull.v1.XmlPullParserException { return null; }
    public static org.xmlpull.v1.XmlPullParserFactory newInstance() throws org.xmlpull.v1.XmlPullParserException { return null; }
    public static org.xmlpull.v1.XmlPullParserFactory newInstance(java.lang.String p0, java.lang.Class p1) throws org.xmlpull.v1.XmlPullParserException { return null; }
}
