package android.adservices.ondevicepersonalization;

public class FederatedComputeScheduler {
    FederatedComputeScheduler() {}
    public void cancel(android.adservices.ondevicepersonalization.FederatedComputeInput p0) {}
    public void schedule(android.adservices.ondevicepersonalization.FederatedComputeScheduler.Params p0, android.adservices.ondevicepersonalization.FederatedComputeInput p1) {}
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.fcp_schedule_with_outcome_receiver_enabled")
    public void schedule(android.adservices.ondevicepersonalization.FederatedComputeScheduleRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.adservices.ondevicepersonalization.FederatedComputeScheduleResponse, java.lang.Exception> p2) {}

    public static class Params {
        public Params(android.adservices.ondevicepersonalization.TrainingInterval p0) {}
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.TrainingInterval getTrainingInterval() { return null; }
    }
}
