package android.content.pm;

public interface XmlSerializerAndParser<T extends java.lang.Object> {
    @android.annotation.UnsupportedAppUsage
    public void writeAsXml(T p0, org.xmlpull.v1.XmlSerializer p1) throws java.io.IOException;
    @android.annotation.UnsupportedAppUsage
    public T createFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException;
}
