package android.adservices.common;

public class AdServicesCommonManager {
    AdServicesCommonManager() {}
    public void enableAdServices(android.adservices.common.AdServicesStates p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p2) {}
    public void enableAdServices(android.adservices.common.AdServicesStates p0, java.util.concurrent.Executor p1, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Boolean, java.lang.Exception> p2) {}
    @android.annotation.NonNull
    public static android.adservices.common.AdServicesCommonManager get(android.content.Context p0) { return null; }
    public void getAdservicesCommonStates(java.util.concurrent.Executor p0, android.adservices.common.AdServicesOutcomeReceiver<android.adservices.common.AdServicesCommonStatesResponse, java.lang.Exception> p1) {}
    public void isAdServicesEnabled(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p1) {}
    public void isAdServicesEnabled(java.util.concurrent.Executor p0, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Boolean, java.lang.Exception> p1) {}
    public void setAdServicesEnabled(boolean p0, boolean p1) {}
    public void updateAdId(android.adservices.common.UpdateAdIdRequest p0, java.util.concurrent.Executor p1, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Boolean, java.lang.Exception> p2) {}
    public void updateAdId(android.adservices.common.UpdateAdIdRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p2) {}
}
