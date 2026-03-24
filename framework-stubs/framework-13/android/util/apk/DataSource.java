package android.util.apk;

interface DataSource {
    public long size();
    public void feedIntoDataDigester(android.util.apk.DataDigester p0, long p1, int p2) throws java.io.IOException, java.security.DigestException;
    public static android.util.apk.DataSource create(java.io.FileDescriptor p0, long p1, long p2) { return null; }
}
