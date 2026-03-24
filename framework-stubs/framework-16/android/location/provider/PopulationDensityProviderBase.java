package android.location.provider;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.population_density_provider")
public abstract class PopulationDensityProviderBase {
    final java.lang.String mTag = null;
    @android.annotation.Nullable
    final java.lang.String mAttributionTag = null;
    final android.os.IBinder mBinder = null;
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_POPULATION_DENSITY_PROVIDER = "com.android.location.service.PopulationDensityProvider";
    public PopulationDensityProviderBase(android.content.Context p0, java.lang.String p1) {}
    @android.annotation.Nullable
    public final android.os.IBinder getBinder() { return null; }
    public abstract void onGetDefaultCoarseningLevel(android.os.OutcomeReceiver<java.lang.Integer, java.lang.Throwable> p0);
    public abstract void onGetCoarsenedS2Cells(double p0, double p1, int p2, android.os.OutcomeReceiver<long[], java.lang.Throwable> p3);

    private final class Service extends android.location.provider.IPopulationDensityProvider.Stub {
        public void getDefaultCoarseningLevel(android.location.provider.IS2LevelCallback p0) {}
        public void getCoarsenedS2Cells(double p0, double p1, int p2, android.location.provider.IS2CellIdsCallback p3) {}
    }

    private static class SingleUseS2CellIdsCallback implements android.os.OutcomeReceiver<long[], java.lang.Throwable> {
        SingleUseS2CellIdsCallback(android.location.provider.IS2CellIdsCallback p0) {}
        public void onResult(long[] p0) {}
        public void onError(java.lang.Throwable p0) {}
    }

    private static class SingleUseS2LevelCallback implements android.os.OutcomeReceiver<java.lang.Integer, java.lang.Throwable> {
        SingleUseS2LevelCallback(android.location.provider.IS2LevelCallback p0) {}
        public void onResult(java.lang.Integer p0) {}
        public void onError(java.lang.Throwable p0) {}
    }
}
