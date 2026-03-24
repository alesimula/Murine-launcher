package android.adservices.common;

public interface AdServicesOutcomeReceiver<R extends java.lang.Object, E extends java.lang.Throwable> {
    default public void onError(E p0) {}
    public void onResult(R p0);
}
