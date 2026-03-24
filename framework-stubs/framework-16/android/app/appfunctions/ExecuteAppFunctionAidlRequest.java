package android.app.appfunctions;

@android.annotation.FlaggedApi("android.app.appfunctions.flags.enable_app_function_manager")
public final class ExecuteAppFunctionAidlRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.appfunctions.ExecuteAppFunctionAidlRequest> CREATOR = null;
    public ExecuteAppFunctionAidlRequest(android.app.appfunctions.ExecuteAppFunctionRequest p0, android.os.UserHandle p1, java.lang.String p2, long p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public android.app.appfunctions.ExecuteAppFunctionRequest getClientRequest() { return null; }
    @android.annotation.NonNull
    public android.os.UserHandle getUserHandle() { return null; }
    @android.annotation.NonNull
    public java.lang.String getCallingPackage() { return null; }
    public long getRequestTime() { return 0L; }
}
