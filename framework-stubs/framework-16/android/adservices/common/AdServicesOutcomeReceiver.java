package android.adservices.common;

@java.lang.Deprecated
@android.annotation.FlaggedApi("com.android.adservices.flags.adservices_outcomereceiver_r_api_deprecated")
public interface AdServicesOutcomeReceiver<R extends java.lang.Object, E extends java.lang.Throwable> {
    @java.lang.Deprecated
    default public void onError(E p0) {}
    @java.lang.Deprecated
    public void onResult(R p0);
}
