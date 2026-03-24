package android.nfc;

public final class Tag implements android.os.Parcelable {
    final byte[] mId = null;
    final int[] mTechList = null;
    final java.lang.String[] mTechStringList = null;
    final android.os.Bundle[] mTechExtras = null;
    final int mServiceHandle = 0;
    final long mCookie = 0L;
    final android.nfc.INfcTag mTagService = null;
    int mConnectedTechnology;
    public static final android.os.Parcelable.Creator<android.nfc.Tag> CREATOR = null;
    public Tag(byte[] p0, int[] p1, android.os.Bundle[] p2, int p3, long p4, android.nfc.INfcTag p5) {}
    public static android.nfc.Tag createMockTag(byte[] p0, int[] p1, android.os.Bundle[] p2, long p3) { return null; }
    static int[] getTechCodesFromStrings(java.lang.String[] p0) throws java.lang.IllegalArgumentException { return null; }
    public int getServiceHandle() { return 0; }
    public int[] getTechCodeList() { return null; }
    public byte[] getId() { return null; }
    public java.lang.String[] getTechList() { return null; }
    public android.nfc.Tag rediscover() throws java.io.IOException { return null; }
    public boolean hasTech(int p0) { return false; }
    public android.os.Bundle getTechExtras(int p0) { return null; }
    public android.nfc.INfcTag getTagService() { return null; }
    public java.lang.String toString() { return null; }
    static byte[] readBytesWithNull(android.os.Parcel p0) { return null; }
    static void writeBytesWithNull(android.os.Parcel p0, byte[] p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public synchronized boolean setConnectedTechnology(int p0) { return false; }
    public int getConnectedTechnology() { return 0; }
    public void setTechnologyDisconnected() {}
}
