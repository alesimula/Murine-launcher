package android.content.pm;

public interface XmlSerializerAndParser<T extends java.lang.Object> {
    public void writeAsXml(T p0, android.util.TypedXmlSerializer p1) throws java.io.IOException;
    public T createFromXml(android.util.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException;
    default public void writeAsXml(T p0, org.xmlpull.v1.XmlSerializer p1) throws java.io.IOException {}
    default public T createFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
}
