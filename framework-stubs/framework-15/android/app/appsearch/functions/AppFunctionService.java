package android.app.appsearch.functions;

public abstract class AppFunctionService extends android.app.Service {
    @android.annotation.NonNull
    public static final java.lang.String SERVICE_INTERFACE = "android.app.appsearch.functions.AppFunctionService";
    public AppFunctionService() { super(); }
    @android.annotation.NonNull
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onExecuteFunction(android.app.appsearch.functions.ExecuteAppFunctionRequest p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.functions.ExecuteAppFunctionResponse>> p1);
}
