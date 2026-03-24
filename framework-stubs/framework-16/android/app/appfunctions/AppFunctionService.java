package android.app.appfunctions;

@android.annotation.FlaggedApi("android.app.appfunctions.flags.enable_app_function_manager")
public abstract class AppFunctionService extends android.app.Service {
    @android.annotation.NonNull
    public static final java.lang.String SERVICE_INTERFACE = "android.app.appfunctions.AppFunctionService";
    public AppFunctionService() { super(); }
    @android.annotation.NonNull
    public static android.os.Binder createBinder(android.content.Context p0, android.app.appfunctions.AppFunctionService.OnExecuteFunction p1) { return null; }
    @android.annotation.NonNull
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onExecuteFunction(android.app.appfunctions.ExecuteAppFunctionRequest p0, java.lang.String p1, android.content.pm.SigningInfo p2, android.os.CancellationSignal p3, android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse, android.app.appfunctions.AppFunctionException> p4);

    @java.lang.FunctionalInterface
    public static interface OnExecuteFunction {
        public void perform(android.app.appfunctions.ExecuteAppFunctionRequest p0, java.lang.String p1, android.content.pm.SigningInfo p2, android.os.CancellationSignal p3, android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse, android.app.appfunctions.AppFunctionException> p4);
    }
}
