package android.adservices.ondevicepersonalization;

public interface IsolatedWorker {
    default public void onDownloadCompleted(android.adservices.ondevicepersonalization.DownloadCompletedInput p0, android.os.OutcomeReceiver<android.adservices.ondevicepersonalization.DownloadCompletedOutput, android.adservices.ondevicepersonalization.IsolatedServiceException> p1) {}
    default public void onEvent(android.adservices.ondevicepersonalization.EventInput p0, android.os.OutcomeReceiver<android.adservices.ondevicepersonalization.EventOutput, android.adservices.ondevicepersonalization.IsolatedServiceException> p1) {}
    default public void onExecute(android.adservices.ondevicepersonalization.ExecuteInput p0, android.os.OutcomeReceiver<android.adservices.ondevicepersonalization.ExecuteOutput, android.adservices.ondevicepersonalization.IsolatedServiceException> p1) {}
    default public void onRender(android.adservices.ondevicepersonalization.RenderInput p0, android.os.OutcomeReceiver<android.adservices.ondevicepersonalization.RenderOutput, android.adservices.ondevicepersonalization.IsolatedServiceException> p1) {}
    default public void onTrainingExamples(android.adservices.ondevicepersonalization.TrainingExamplesInput p0, android.os.OutcomeReceiver<android.adservices.ondevicepersonalization.TrainingExamplesOutput, android.adservices.ondevicepersonalization.IsolatedServiceException> p1) {}
    default public void onWebTrigger(android.adservices.ondevicepersonalization.WebTriggerInput p0, android.os.OutcomeReceiver<android.adservices.ondevicepersonalization.WebTriggerOutput, android.adservices.ondevicepersonalization.IsolatedServiceException> p1) {}
}
