package android.media.tv;

public final class CommandRequest extends android.media.tv.BroadcastInfoRequest implements android.os.Parcelable {
    public static final java.lang.String ARGUMENT_TYPE_XML = "xml";
    public static final java.lang.String ARGUMENT_TYPE_JSON = "json";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.tv.CommandRequest> CREATOR = null;
    static android.media.tv.CommandRequest createFromParcelBody(android.os.Parcel p0) { return null; }
    public CommandRequest(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) { super(0, (android.os.Parcel)null); }
    CommandRequest(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
    @android.annotation.NonNull
    public java.lang.String getNamespace() { return null; }
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getArguments() { return null; }
    @android.annotation.NonNull
    public java.lang.String getArgumentType() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
