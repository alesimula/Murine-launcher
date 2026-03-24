package org.xmlpull.v1;

public class XmlPullParserException extends java.lang.Exception {
    protected int column;
    protected java.lang.Throwable detail;
    protected int row;
    public XmlPullParserException(java.lang.String p0) { super(); }
    public XmlPullParserException(java.lang.String p0, org.xmlpull.v1.XmlPullParser p1, java.lang.Throwable p2) { super(); }
    public java.lang.Throwable getDetail() { return null; }
    public int getLineNumber() { return 0; }
    public int getColumnNumber() { return 0; }
    public void printStackTrace() {}
}
