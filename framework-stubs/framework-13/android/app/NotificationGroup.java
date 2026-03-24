package android.app;

public class NotificationGroup implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.NotificationGroup> CREATOR = null;
    public NotificationGroup(java.lang.String p0) {}
    public NotificationGroup(java.lang.String p0, int p1, java.util.UUID p2) {}
    public java.lang.String toString() { return null; }
    public java.lang.String getName() { return null; }
    public void setName(java.lang.String p0) {}
    public java.util.UUID getUuid() { return null; }
    public void addPackage(java.lang.String p0) {}
    public java.lang.String[] getPackages() { return null; }
    public void removePackage(java.lang.String p0) {}
    public boolean hasPackage(java.lang.String p0) { return false; }
    public boolean isDirty() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public void getXmlString(java.lang.StringBuilder p0, android.content.Context p1) {}
    public static android.app.NotificationGroup fromXml(org.xmlpull.v1.XmlPullParser p0, android.content.Context p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
}
