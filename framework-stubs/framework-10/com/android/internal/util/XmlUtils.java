package com.android.internal.util;

public class XmlUtils {
    private static final java.lang.String STRING_ARRAY_SEPARATOR = ":";
    public XmlUtils() {}
    @android.annotation.UnsupportedAppUsage
    public static void skipCurrentTag(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final int convertValueToList(java.lang.CharSequence p0, java.lang.String[] p1, int p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static final boolean convertValueToBoolean(java.lang.CharSequence p0, boolean p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static final int convertValueToInt(java.lang.CharSequence p0, int p1) { return 0; }
    public static int convertValueToUnsignedInt(java.lang.String p0, int p1) { return 0; }
    public static int parseUnsignedIntAttribute(java.lang.CharSequence p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static final void writeMapXml(java.util.Map p0, java.io.OutputStream p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeListXml(java.util.List p0, java.io.OutputStream p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeMapXml(java.util.Map p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeMapXml(java.util.Map p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2, com.android.internal.util.XmlUtils.WriteMapCallback p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeMapXml(java.util.Map p0, org.xmlpull.v1.XmlSerializer p1, com.android.internal.util.XmlUtils.WriteMapCallback p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeListXml(java.util.List p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeSetXml(java.util.Set p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeByteArrayXml(byte[] p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeIntArrayXml(int[] p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeLongArrayXml(long[] p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeDoubleArrayXml(double[] p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeStringArrayXml(java.lang.String[] p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeBooleanArrayXml(boolean[] p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static final void writeValueXml(java.lang.Object p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private static final void writeValueXml(java.lang.Object p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2, com.android.internal.util.XmlUtils.WriteMapCallback p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    @android.annotation.UnsupportedAppUsage
    public static final java.util.HashMap<java.lang.String, ?> readMapXml(java.io.InputStream p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final java.util.ArrayList readListXml(java.io.InputStream p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final java.util.HashSet readSetXml(java.io.InputStream p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final java.util.HashMap<java.lang.String, ?> readThisMapXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final java.util.HashMap<java.lang.String, ?> readThisMapXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2, com.android.internal.util.XmlUtils.ReadMapCallback p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final android.util.ArrayMap<java.lang.String, ?> readThisArrayMapXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2, com.android.internal.util.XmlUtils.ReadMapCallback p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final java.util.ArrayList readThisListXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static final java.util.ArrayList readThisListXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2, com.android.internal.util.XmlUtils.ReadMapCallback p3, boolean p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final java.util.HashSet readThisSetXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static final java.util.HashSet readThisSetXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2, com.android.internal.util.XmlUtils.ReadMapCallback p3, boolean p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final byte[] readThisByteArrayXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final int[] readThisIntArrayXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final long[] readThisLongArrayXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final double[] readThisDoubleArrayXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final java.lang.String[] readThisStringArrayXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final boolean[] readThisBooleanArrayXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.String[] p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static final java.lang.Object readValueXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String[] p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static final java.lang.Object readThisValueXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String[] p1, com.android.internal.util.XmlUtils.ReadMapCallback p2, boolean p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static final java.lang.Object readThisPrimitiveValueXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    @android.annotation.UnsupportedAppUsage
    public static final void beginDocument(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    @android.annotation.UnsupportedAppUsage
    public static final void nextElement(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static boolean nextElementWithin(org.xmlpull.v1.XmlPullParser p0, int p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return false; }
    public static int readIntAttribute(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, int p2) { return 0; }
    public static int readIntAttribute(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) throws java.io.IOException { return 0; }
    public static void writeIntAttribute(org.xmlpull.v1.XmlSerializer p0, java.lang.String p1, int p2) throws java.io.IOException {}
    public static long readLongAttribute(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, long p2) { return 0L; }
    public static long readLongAttribute(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) throws java.io.IOException { return 0L; }
    public static void writeLongAttribute(org.xmlpull.v1.XmlSerializer p0, java.lang.String p1, long p2) throws java.io.IOException {}
    public static float readFloatAttribute(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) throws java.io.IOException { return 0.0f; }
    public static void writeFloatAttribute(org.xmlpull.v1.XmlSerializer p0, java.lang.String p1, float p2) throws java.io.IOException {}
    public static boolean readBooleanAttribute(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) { return false; }
    public static boolean readBooleanAttribute(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, boolean p2) { return false; }
    public static void writeBooleanAttribute(org.xmlpull.v1.XmlSerializer p0, java.lang.String p1, boolean p2) throws java.io.IOException {}
    public static android.net.Uri readUriAttribute(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) { return null; }
    public static void writeUriAttribute(org.xmlpull.v1.XmlSerializer p0, java.lang.String p1, android.net.Uri p2) throws java.io.IOException {}
    public static java.lang.String readStringAttribute(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) { return null; }
    public static void writeStringAttribute(org.xmlpull.v1.XmlSerializer p0, java.lang.String p1, java.lang.CharSequence p2) throws java.io.IOException {}
    public static byte[] readByteArrayAttribute(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) { return null; }
    public static void writeByteArrayAttribute(org.xmlpull.v1.XmlSerializer p0, java.lang.String p1, byte[] p2) throws java.io.IOException {}
    public static android.graphics.Bitmap readBitmapAttribute(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) { return null; }
    @java.lang.Deprecated
    public static void writeBitmapAttribute(org.xmlpull.v1.XmlSerializer p0, java.lang.String p1, android.graphics.Bitmap p2) throws java.io.IOException {}

    public static interface WriteMapCallback {
        public void writeUnknownObject(java.lang.Object p0, java.lang.String p1, org.xmlpull.v1.XmlSerializer p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException;
    }

    public static interface ReadMapCallback {
        public java.lang.Object readThisUnknownObjectXml(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException;
    }
}
