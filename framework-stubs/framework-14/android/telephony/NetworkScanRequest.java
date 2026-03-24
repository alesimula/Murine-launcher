package android.telephony;

public final class NetworkScanRequest implements android.os.Parcelable {
    public static final int MAX_RADIO_ACCESS_NETWORKS = 8;
    public static final int MAX_BANDS = 8;
    public static final int MAX_CHANNELS = 32;
    public static final int MAX_MCC_MNC_LIST_SIZE = 20;
    public static final int MIN_SEARCH_PERIODICITY_SEC = 5;
    public static final int MAX_SEARCH_PERIODICITY_SEC = 300;
    public static final int MIN_SEARCH_MAX_SEC = 60;
    public static final int MAX_SEARCH_MAX_SEC = 3600;
    public static final int MIN_INCREMENTAL_PERIODICITY_SEC = 1;
    public static final int MAX_INCREMENTAL_PERIODICITY_SEC = 10;
    public static final int SCAN_TYPE_ONE_SHOT = 0;
    public static final int SCAN_TYPE_PERIODIC = 1;
    public static final android.os.Parcelable.Creator<android.telephony.NetworkScanRequest> CREATOR = null;
    public NetworkScanRequest(int p0, android.telephony.RadioAccessSpecifier[] p1, int p2, int p3, boolean p4, int p5, java.util.ArrayList<java.lang.String> p6) {}
    public int getScanType() { return 0; }
    public int getSearchPeriodicity() { return 0; }
    public int getMaxSearchTime() { return 0; }
    public boolean getIncrementalResults() { return false; }
    public int getIncrementalResultsPeriodicity() { return 0; }
    public android.telephony.RadioAccessSpecifier[] getSpecifiers() { return null; }
    public java.util.ArrayList<java.lang.String> getPlmns() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScanType {
    }
}
