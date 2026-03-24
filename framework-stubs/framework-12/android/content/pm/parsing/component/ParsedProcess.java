package android.content.pm.parsing.component;

public class ParsedProcess implements android.os.Parcelable {
    protected java.lang.String name;
    protected java.util.Set<java.lang.String> deniedPermissions;
    protected int gwpAsanMode;
    protected int memtagMode;
    protected int nativeHeapZeroInitialized;
    static com.android.internal.util.Parcelling<java.util.Set<java.lang.String>> sParcellingForDeniedPermissions;
    public static final android.os.Parcelable.Creator<android.content.pm.parsing.component.ParsedProcess> CREATOR = null;
    public ParsedProcess() {}
    public ParsedProcess(android.content.pm.parsing.component.ParsedProcess p0) {}
    public void addStateFrom(android.content.pm.parsing.component.ParsedProcess p0) {}
    public ParsedProcess(java.lang.String p0, java.util.Set<java.lang.String> p1, int p2, int p3, int p4) {}
    public java.lang.String getName() { return null; }
    public java.util.Set<java.lang.String> getDeniedPermissions() { return null; }
    public int getGwpAsanMode() { return 0; }
    public int getMemtagMode() { return 0; }
    public int getNativeHeapZeroInitialized() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    protected ParsedProcess(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
}
