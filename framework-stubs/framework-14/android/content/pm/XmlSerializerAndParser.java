package android.content.pm;

public interface XmlSerializerAndParser<T extends java.lang.Object> {
    public void writeAsXml(T p0, com.android.modules.utils.TypedXmlSerializer p1) throws java.io.IOException;
    public T createFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException;
    default public void writeAsXml(T p0, org.xmlpull.v1.XmlSerializer p1) throws java.io.IOException {}
    default public T createFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
}
