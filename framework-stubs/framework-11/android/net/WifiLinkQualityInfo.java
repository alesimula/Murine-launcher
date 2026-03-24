package android.net;

public class WifiLinkQualityInfo extends android.net.LinkQualityInfo {
    private int mType;
    private java.lang.String mBssid;
    private int mRssi;
    private long mTxGood;
    private long mTxBad;
    public WifiLinkQualityInfo() { super(); }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.net.WifiLinkQualityInfo createFromParcelBody(android.os.Parcel p0) { return null; }
    public int getType() { return 0; }
    public void setType(int p0) {}
    public java.lang.String getBssid() { return null; }
    public void setBssid(java.lang.String p0) {}
    public int getRssi() { return 0; }
    public void setRssi(int p0) {}
    public long getTxGood() { return 0L; }
    public void setTxGood(long p0) {}
    public long getTxBad() { return 0L; }
    public void setTxBad(long p0) {}
}
