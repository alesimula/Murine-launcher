package android.hardware.radio.network;

public class NetworkScanRequest implements android.os.Parcelable {
    public int type;
    public int interval;
    public android.hardware.radio.network.RadioAccessSpecifier[] specifiers;
    public int maxSearchTime;
    public boolean incrementalResults;
    public int incrementalResultsPeriodicity;
    public java.lang.String[] mccMncs;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.NetworkScanRequest> CREATOR = null;
    public static final int RADIO_ACCESS_SPECIFIER_MAX_SIZE = 8;
    public static final int INCREMENTAL_RESULTS_PREIODICITY_RANGE_MIN = 1;
    public static final int INCREMENTAL_RESULTS_PREIODICITY_RANGE_MAX = 10;
    public static final int MAX_SEARCH_TIME_RANGE_MIN = 60;
    public static final int MAX_SEARCH_TIME_RANGE_MAX = 3600;
    public static final int SCAN_INTERVAL_RANGE_MIN = 5;
    public static final int SCAN_INTERVAL_RANGE_MAX = 300;
    public static final int SCAN_TYPE_ONE_SHOT = 0;
    public static final int SCAN_TYPE_PERIODIC = 1;
    public NetworkScanRequest() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
