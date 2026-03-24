package android.app.appfunctions;

@android.annotation.FlaggedApi("android.app.appfunctions.flags.enable_app_function_manager")
public final class AppFunctionException extends java.lang.Exception implements android.os.Parcelable {
    public static final int ERROR_DENIED = 1000;
    public static final int ERROR_INVALID_ARGUMENT = 1001;
    public static final int ERROR_DISABLED = 1002;
    public static final int ERROR_FUNCTION_NOT_FOUND = 1003;
    public static final int ERROR_SYSTEM_ERROR = 2000;
    public static final int ERROR_CANCELLED = 2001;
    public static final int ERROR_ENTERPRISE_POLICY_DISALLOWED = 2002;
    public static final int ERROR_APP_UNKNOWN_ERROR = 3000;
    public static final int ERROR_CATEGORY_UNKNOWN = 0;
    public static final int ERROR_CATEGORY_REQUEST_ERROR = 1;
    public static final int ERROR_CATEGORY_SYSTEM = 2;
    public static final int ERROR_CATEGORY_APP = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appfunctions.AppFunctionException> CREATOR = null;
    public AppFunctionException(int p0, java.lang.String p1) { super(); }
    public AppFunctionException(int p0, java.lang.String p1, android.os.Bundle p2) { super(); }
    public int getErrorCode() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getErrorMessage() { return null; }
    public int getErrorCategory() { return 0; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCategory {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }
}
