package android.location;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
public class CountryDetector {
    public CountryDetector(android.location.ICountryDetector p0) {}
    public android.location.Country detectCountry() { return null; }
    @java.lang.Deprecated
    public void addCountryListener(android.location.CountryListener p0, android.os.Looper p1) {}
    @java.lang.Deprecated
    public void removeCountryListener(android.location.CountryListener p0) {}
    public void registerCountryDetectorCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<android.location.Country> p1) {}
    public void unregisterCountryDetectorCallback(java.util.function.Consumer<android.location.Country> p0) {}

    private static final class ListenerTransport extends android.location.ICountryListener.Stub {
        ListenerTransport(java.util.function.Consumer<android.location.Country> p0, java.util.concurrent.Executor p1) { super(); }
        public void onCountryDetected(android.location.Country p0) {}
    }
}
