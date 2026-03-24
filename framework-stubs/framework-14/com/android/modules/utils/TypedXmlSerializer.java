package com.android.modules.utils;

public interface TypedXmlSerializer extends org.xmlpull.v1.XmlSerializer {
    public org.xmlpull.v1.XmlSerializer attributeInterned(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException;
    public org.xmlpull.v1.XmlSerializer attributeBytesHex(java.lang.String p0, java.lang.String p1, byte[] p2) throws java.io.IOException;
    public org.xmlpull.v1.XmlSerializer attributeBytesBase64(java.lang.String p0, java.lang.String p1, byte[] p2) throws java.io.IOException;
    public org.xmlpull.v1.XmlSerializer attributeInt(java.lang.String p0, java.lang.String p1, int p2) throws java.io.IOException;
    public org.xmlpull.v1.XmlSerializer attributeIntHex(java.lang.String p0, java.lang.String p1, int p2) throws java.io.IOException;
    public org.xmlpull.v1.XmlSerializer attributeLong(java.lang.String p0, java.lang.String p1, long p2) throws java.io.IOException;
    public org.xmlpull.v1.XmlSerializer attributeLongHex(java.lang.String p0, java.lang.String p1, long p2) throws java.io.IOException;
    public org.xmlpull.v1.XmlSerializer attributeFloat(java.lang.String p0, java.lang.String p1, float p2) throws java.io.IOException;
    public org.xmlpull.v1.XmlSerializer attributeDouble(java.lang.String p0, java.lang.String p1, double p2) throws java.io.IOException;
    public org.xmlpull.v1.XmlSerializer attributeBoolean(java.lang.String p0, java.lang.String p1, boolean p2) throws java.io.IOException;
}
