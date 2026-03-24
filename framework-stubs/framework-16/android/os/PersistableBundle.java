package android.os;

public final class PersistableBundle extends android.os.BaseBundle implements java.lang.Cloneable, android.os.Parcelable, com.android.internal.util.XmlUtils.WriteMapCallback {
    public static final android.os.PersistableBundle EMPTY = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.PersistableBundle> CREATOR = null;
    public static boolean isValidType(java.lang.Object p0) { return false; }
    public PersistableBundle() { super(); }
    public PersistableBundle(int p0) { super(); }
    public PersistableBundle(android.os.PersistableBundle p0) { super(); }
    public PersistableBundle(android.os.Bundle p0) { super(); }
    PersistableBundle(android.os.Parcel p0, int p1) { super(); }
    PersistableBundle(android.os.PersistableBundle p0, boolean p1) { super(); }
    public static android.os.PersistableBundle forPair(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.Object clone() { return null; }
    public android.os.PersistableBundle deepCopy() { return null; }
    public void putPersistableBundle(java.lang.String p0, android.os.PersistableBundle p1) {}
    @android.annotation.Nullable
    public android.os.PersistableBundle getPersistableBundle(java.lang.String p0) { return null; }
    public void writeUnknownObject(java.lang.Object p0, java.lang.String p1, com.android.modules.utils.TypedXmlSerializer p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void saveToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public void saveToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public boolean isBundleContentsWithinLengthLimit(int p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.os.PersistableBundle restoreFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public static android.os.PersistableBundle restoreFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public synchronized java.lang.String toString() { return null; }
    public synchronized java.lang.String toShortString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void writeToStream(java.io.OutputStream p0) throws java.io.IOException {}
    @android.annotation.NonNull
    public static android.os.PersistableBundle readFromStream(java.io.InputStream p0) throws java.io.IOException { return null; }

    static class MyReadMapCallback implements com.android.internal.util.XmlUtils.ReadMapCallback {
        MyReadMapCallback() {}
        public java.lang.Object readThisUnknownObjectXml(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    }
}
