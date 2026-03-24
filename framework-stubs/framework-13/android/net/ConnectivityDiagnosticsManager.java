package android.net;

public class ConnectivityDiagnosticsManager {
    ConnectivityDiagnosticsManager() {}
    public void registerConnectivityDiagnosticsCallback(android.net.NetworkRequest p0, java.util.concurrent.Executor p1, android.net.ConnectivityDiagnosticsManager.ConnectivityDiagnosticsCallback p2) {}
    public void unregisterConnectivityDiagnosticsCallback(android.net.ConnectivityDiagnosticsManager.ConnectivityDiagnosticsCallback p0) {}

    public static abstract class ConnectivityDiagnosticsCallback {
        public ConnectivityDiagnosticsCallback() {}
        public void onConnectivityReportAvailable(android.net.ConnectivityDiagnosticsManager.ConnectivityReport p0) {}
        public void onDataStallSuspected(android.net.ConnectivityDiagnosticsManager.DataStallReport p0) {}
        public void onNetworkConnectivityReported(android.net.Network p0, boolean p1) {}
    }

    public static final class ConnectivityReport implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.ConnectivityDiagnosticsManager.ConnectivityReport> CREATOR = null;
        public static final java.lang.String KEY_NETWORK_PROBES_ATTEMPTED_BITMASK = "networkProbesAttempted";
        public static final java.lang.String KEY_NETWORK_PROBES_SUCCEEDED_BITMASK = "networkProbesSucceeded";
        public static final java.lang.String KEY_NETWORK_VALIDATION_RESULT = "networkValidationResult";
        public static final int NETWORK_PROBE_DNS = 4;
        public static final int NETWORK_PROBE_FALLBACK = 32;
        public static final int NETWORK_PROBE_HTTP = 8;
        public static final int NETWORK_PROBE_HTTPS = 16;
        public static final int NETWORK_PROBE_PRIVATE_DNS = 64;
        public static final int NETWORK_VALIDATION_RESULT_INVALID = 0;
        public static final int NETWORK_VALIDATION_RESULT_PARTIALLY_VALID = 2;
        public static final int NETWORK_VALIDATION_RESULT_SKIPPED = 3;
        public static final int NETWORK_VALIDATION_RESULT_VALID = 1;
        public ConnectivityReport(android.net.Network p0, long p1, android.net.LinkProperties p2, android.net.NetworkCapabilities p3, android.os.PersistableBundle p4) {}
        @android.annotation.NonNull
        public android.net.Network getNetwork() { return null; }
        public long getReportTimestamp() { return 0L; }
        @android.annotation.NonNull
        public android.net.LinkProperties getLinkProperties() { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities getNetworkCapabilities() { return null; }
        @android.annotation.NonNull
        public android.os.PersistableBundle getAdditionalInfo() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class DataStallReport implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.ConnectivityDiagnosticsManager.DataStallReport> CREATOR = null;
        public static final int DETECTION_METHOD_DNS_EVENTS = 1;
        public static final int DETECTION_METHOD_TCP_METRICS = 2;
        public static final java.lang.String KEY_DNS_CONSECUTIVE_TIMEOUTS = "dnsConsecutiveTimeouts";
        public static final java.lang.String KEY_TCP_METRICS_COLLECTION_PERIOD_MILLIS = "tcpMetricsCollectionPeriodMillis";
        public static final java.lang.String KEY_TCP_PACKET_FAIL_RATE = "tcpPacketFailRate";
        public DataStallReport(android.net.Network p0, long p1, int p2, android.net.LinkProperties p3, android.net.NetworkCapabilities p4, android.os.PersistableBundle p5) {}
        @android.annotation.NonNull
        public android.net.Network getNetwork() { return null; }
        public long getReportTimestamp() { return 0L; }
        public int getDetectionMethod() { return 0; }
        @android.annotation.NonNull
        public android.net.LinkProperties getLinkProperties() { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities getNetworkCapabilities() { return null; }
        @android.annotation.NonNull
        public android.os.PersistableBundle getStallDetails() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
