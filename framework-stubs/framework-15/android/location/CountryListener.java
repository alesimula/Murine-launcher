package android.location;

public interface CountryListener extends java.util.function.Consumer<android.location.Country> {
    public void onCountryDetected(android.location.Country p0);
    default public void accept(android.location.Country p0) {}
}
