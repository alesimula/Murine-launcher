package android.content.pm.parsing.component;

public class ParsedPermissionGroup extends android.content.pm.parsing.component.ParsedComponent {
    int requestDetailResourceId;
    int backgroundRequestResourceId;
    int backgroundRequestDetailResourceId;
    int requestRes;
    int priority;
    public static final android.os.Parcelable.Creator<android.content.pm.parsing.component.ParsedPermissionGroup> CREATOR = null;
    public void setPriority(int p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public ParsedPermissionGroup() { super((android.content.pm.parsing.component.ParsedComponent)null); }
    protected ParsedPermissionGroup(android.os.Parcel p0) { super((android.content.pm.parsing.component.ParsedComponent)null); }
    public int getRequestDetailResourceId() { return 0; }
    public int getBackgroundRequestResourceId() { return 0; }
    public int getBackgroundRequestDetailResourceId() { return 0; }
    public int getRequestRes() { return 0; }
    public int getPriority() { return 0; }
}
