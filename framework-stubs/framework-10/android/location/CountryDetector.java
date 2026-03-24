package android.location;

public class CountryDetector {
    private static final java.lang.String TAG = "CountryDetector";
    private final android.location.ICountryDetector mService = null;
    private final java.util.HashMap<android.location.CountryListener, android.location.CountryDetector.ListenerTransport> mListeners = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public CountryDetector(android.location.ICountryDetector p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.location.Country detectCountry() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void addCountryListener(android.location.CountryListener p0, android.os.Looper p1) {}
    @android.annotation.UnsupportedAppUsage
    public void removeCountryListener(android.location.CountryListener p0) {}

    private static final class ListenerTransport extends android.location.ICountryListener.Stub {
        private final android.location.CountryListener mListener = null;
        private final android.os.Handler mHandler = null;
        public ListenerTransport(android.location.CountryListener p0, android.os.Looper p1) { super(); }
        public void onCountryDetected(android.location.Country p0) {}
    }
}
