package android.location;

public class CountryDetector {
    public CountryDetector(android.location.ICountryDetector p0) {}
    public android.location.Country detectCountry() { return null; }
    public void addCountryListener(android.location.CountryListener p0, android.os.Looper p1) {}
    public void removeCountryListener(android.location.CountryListener p0) {}

    private static final class ListenerTransport extends android.location.ICountryListener.Stub {
        public ListenerTransport(android.location.CountryListener p0, android.os.Looper p1) { super(); }
        public void onCountryDetected(android.location.Country p0) {}
    }
}
