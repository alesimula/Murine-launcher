package android.adservices.adselection;

public class AdSelectionManager {
    AdSelectionManager() {}
    @android.annotation.NonNull
    public static android.adservices.adselection.AdSelectionManager get(android.content.Context p0) { return null; }
    @android.annotation.NonNull
    public android.adservices.adselection.TestAdSelectionManager getTestAdSelectionManager() { return null; }
    public void selectAds(android.adservices.adselection.AdSelectionConfig p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.adservices.adselection.AdSelectionOutcome, java.lang.Exception> p2) {}
    public void reportImpression(android.adservices.adselection.ReportImpressionRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> p2) {}
}
