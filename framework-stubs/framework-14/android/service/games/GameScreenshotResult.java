package android.service.games;

public final class GameScreenshotResult implements android.os.Parcelable {
    public static final int GAME_SCREENSHOT_SUCCESS = 0;
    public static final int GAME_SCREENSHOT_ERROR_INTERNAL_ERROR = 1;
    public static final android.os.Parcelable.Creator<android.service.games.GameScreenshotResult> CREATOR = null;
    public static android.service.games.GameScreenshotResult createSuccessResult() { return null; }
    public static android.service.games.GameScreenshotResult createInternalErrorResult() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getStatus() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GameScreenshotStatus {
    }
}
