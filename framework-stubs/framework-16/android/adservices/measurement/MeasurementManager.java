package android.adservices.measurement;

public class MeasurementManager {
    public static final int MEASUREMENT_API_STATE_DISABLED = 0;
    public static final int MEASUREMENT_API_STATE_ENABLED = 1;
    MeasurementManager() {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_outcomereceiver_r_api_deprecated")
    public void deleteRegistrations(android.adservices.measurement.DeletionRequest p0, java.util.concurrent.Executor p1, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
    public void deleteRegistrations(android.adservices.measurement.DeletionRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
    @android.annotation.NonNull
    public static android.adservices.measurement.MeasurementManager get(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_outcomereceiver_r_api_deprecated")
    public void getMeasurementApiStatus(java.util.concurrent.Executor p0, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Integer, java.lang.Exception> p1) {}
    public void getMeasurementApiStatus(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Integer, java.lang.Exception> p1) {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_outcomereceiver_r_api_deprecated")
    public void registerSource(android.adservices.measurement.SourceRegistrationRequest p0, java.util.concurrent.Executor p1, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
    public void registerSource(android.adservices.measurement.SourceRegistrationRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_outcomereceiver_r_api_deprecated")
    public void registerSource(android.net.Uri p0, android.view.InputEvent p1, java.util.concurrent.Executor p2, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Object, java.lang.Exception> p3) {}
    public void registerSource(android.net.Uri p0, android.view.InputEvent p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> p3) {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_outcomereceiver_r_api_deprecated")
    public void registerTrigger(android.net.Uri p0, java.util.concurrent.Executor p1, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
    public void registerTrigger(android.net.Uri p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_outcomereceiver_r_api_deprecated")
    public void registerWebSource(android.adservices.measurement.WebSourceRegistrationRequest p0, java.util.concurrent.Executor p1, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
    public void registerWebSource(android.adservices.measurement.WebSourceRegistrationRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_outcomereceiver_r_api_deprecated")
    public void registerWebTrigger(android.adservices.measurement.WebTriggerRegistrationRequest p0, java.util.concurrent.Executor p1, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
    public void registerWebTrigger(android.adservices.measurement.WebTriggerRegistrationRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
}
