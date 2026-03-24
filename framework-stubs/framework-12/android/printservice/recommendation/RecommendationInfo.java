package android.printservice.recommendation;

@android.annotation.SystemApi
public final class RecommendationInfo implements android.os.Parcelable {
    private final java.lang.CharSequence mPackageName = null;
    private final java.lang.CharSequence mName = null;
    private final java.util.List<java.net.InetAddress> mDiscoveredPrinters = null;
    private final boolean mRecommendsMultiVendorService = false;
    public static final android.os.Parcelable.Creator<android.printservice.recommendation.RecommendationInfo> CREATOR = null;
    public RecommendationInfo(java.lang.CharSequence p0, java.lang.CharSequence p1, java.util.List<java.net.InetAddress> p2, boolean p3) {}
    @java.lang.Deprecated
    public RecommendationInfo(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2, boolean p3) {}
    private static java.util.ArrayList<java.net.InetAddress> readDiscoveredPrinters(android.os.Parcel p0) { return null; }
    private RecommendationInfo(android.os.Parcel p0) {}
    public java.lang.CharSequence getPackageName() { return null; }
    public boolean recommendsMultiVendorService() { return false; }
    public java.util.List<java.net.InetAddress> getDiscoveredPrinters() { return null; }
    public int getNumDiscoveredPrinters() { return 0; }
    public java.lang.CharSequence getName() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
