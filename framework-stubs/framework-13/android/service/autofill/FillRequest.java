package android.service.autofill;

public final class FillRequest implements android.os.Parcelable {
    public static final int FLAG_MANUAL_REQUEST = 1;
    public static final int FLAG_COMPATIBILITY_MODE_REQUEST = 2;
    public static final int FLAG_PASSWORD_INPUT_TYPE = 4;
    public static final int FLAG_VIEW_NOT_FOCUSED = 16;
    public static final int FLAG_SUPPORTS_FILL_DIALOG = 64;
    public static final int FLAG_IME_SHOWING = 128;
    public static final int FLAG_RESET_FILL_DIALOG_STATE = 256;
    public static final int INVALID_REQUEST_ID = -2147483648;
    public static final android.os.Parcelable.Creator<android.service.autofill.FillRequest> CREATOR = null;
    public static java.lang.String requestFlagsToString(int p0) { return null; }
    static java.lang.String singleRequestFlagsToString(int p0) { return null; }
    public FillRequest(int p0, java.util.List<android.service.autofill.FillContext> p1, android.os.Bundle p2, int p3, android.view.inputmethod.InlineSuggestionsRequest p4, android.content.IntentSender p5) {}
    public int getId() { return 0; }
    public java.util.List<android.service.autofill.FillContext> getFillContexts() { return null; }
    public android.os.Bundle getClientState() { return null; }
    public int getFlags() { return 0; }
    public android.view.inputmethod.InlineSuggestionsRequest getInlineSuggestionsRequest() { return null; }
    public android.content.IntentSender getDelayedFillIntentSender() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    FillRequest(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestFlags {
    }
}
