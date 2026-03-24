package android.app.appfunctions;

@android.annotation.FlaggedApi("android.app.appfunctions.flags.enable_app_function_manager")
public final class ExecuteAppFunctionResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appfunctions.ExecuteAppFunctionResponse> CREATOR = null;
    public static final java.lang.String PROPERTY_RETURN_VALUE = "androidAppfunctionsReturnValue";
    public ExecuteAppFunctionResponse(android.app.appsearch.GenericDocument p0) {}
    public ExecuteAppFunctionResponse(android.app.appsearch.GenericDocument p0, android.os.Bundle p1) {}
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
    public ExecuteAppFunctionResponse(android.app.appsearch.GenericDocument p0, android.os.Bundle p1, java.util.List<android.app.appfunctions.AppFunctionUriGrant> p2) {}
    @android.annotation.NonNull
    public android.app.appsearch.GenericDocument getResultDocument() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
    @android.annotation.NonNull
    public java.util.List<android.app.appfunctions.AppFunctionUriGrant> getUriGrants() { return null; }
    public int getResponseDataSize() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
