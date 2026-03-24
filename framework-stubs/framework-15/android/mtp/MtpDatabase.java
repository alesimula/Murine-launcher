package android.mtp;

public class MtpDatabase implements java.lang.AutoCloseable {
    public static android.net.Uri getObjectPropertiesUri(int p0, java.lang.String p1) { return null; }
    public MtpDatabase(android.content.Context p0, java.lang.String[] p1) {}
    public void setServer(android.mtp.MtpServer p0) {}
    public android.content.Context getContext() { return null; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public void addStorage(android.os.storage.StorageVolume p0) {}
    public void removeStorage(android.os.storage.StorageVolume p0) {}
    public int beginSendObject(java.lang.String p0, int p1, int p2, int p3) { return 0; }
    public int getNumObjects(int p0, int p1, int p2) { return 0; }
    public boolean getThumbnailInfo(int p0, long[] p1) { return false; }
    public byte[] getThumbnailData(int p0) { return null; }
}
