package android.security.keymaster;

public class KeymasterArguments implements android.os.Parcelable {
    public static final long UINT32_MAX_VALUE = 4294967295L;
    public static final java.math.BigInteger UINT64_MAX_VALUE = null;
    public static final android.os.Parcelable.Creator<android.security.keymaster.KeymasterArguments> CREATOR = null;
    public KeymasterArguments() {}
    public void addEnum(int p0, int p1) {}
    public void addEnums(int p0, int... p1) {}
    public int getEnum(int p0, int p1) { return 0; }
    public java.util.List<java.lang.Integer> getEnums(int p0) { return null; }
    public void addUnsignedInt(int p0, long p1) {}
    public long getUnsignedInt(int p0, long p1) { return 0L; }
    public void addUnsignedLong(int p0, java.math.BigInteger p1) {}
    public java.util.List<java.math.BigInteger> getUnsignedLongs(int p0) { return null; }
    public void addBoolean(int p0) {}
    public boolean getBoolean(int p0) { return false; }
    public void addBytes(int p0, byte[] p1) {}
    public byte[] getBytes(int p0, byte[] p1) { return null; }
    public void addDate(int p0, java.util.Date p1) {}
    public void addDateIfNotNull(int p0, java.util.Date p1) {}
    public java.util.Date getDate(int p0, java.util.Date p1) { return null; }
    public boolean containsTag(int p0) { return false; }
    public int size() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public static java.math.BigInteger toUint64(long p0) { return null; }
}
