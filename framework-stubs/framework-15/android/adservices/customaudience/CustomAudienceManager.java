package android.adservices.customaudience;

public class CustomAudienceManager {
    CustomAudienceManager() {}
    public void fetchAndJoinCustomAudience(android.adservices.customaudience.FetchAndJoinCustomAudienceRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
    @android.annotation.NonNull
    public static android.adservices.customaudience.CustomAudienceManager get(android.content.Context p0) { return null; }
    @android.annotation.NonNull
    public android.adservices.customaudience.TestCustomAudienceManager getTestCustomAudienceManager() { return null; }
    public void joinCustomAudience(android.adservices.customaudience.JoinCustomAudienceRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
    public void leaveCustomAudience(android.adservices.customaudience.LeaveCustomAudienceRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
    public void scheduleCustomAudienceUpdate(android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest p0, java.util.concurrent.Executor p1, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
}
