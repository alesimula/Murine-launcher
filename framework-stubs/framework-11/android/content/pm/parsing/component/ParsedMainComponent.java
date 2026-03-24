package android.content.pm.parsing.component;

public class ParsedMainComponent extends android.content.pm.parsing.component.ParsedComponent {
    private java.lang.String processName;
    boolean directBootAware;
    boolean enabled;
    boolean exported;
    int order;
    java.lang.String splitName;
    public static final android.os.Parcelable.Creator<android.content.pm.parsing.component.ParsedMainComponent> CREATOR = null;
    public ParsedMainComponent() { super((android.content.pm.parsing.component.ParsedComponent)null); }
    public ParsedMainComponent(android.content.pm.parsing.component.ParsedMainComponent p0) { super((android.content.pm.parsing.component.ParsedComponent)null); }
    public android.content.pm.parsing.component.ParsedMainComponent setProcessName(java.lang.String p0) { return null; }
    public android.content.pm.parsing.component.ParsedMainComponent setEnabled(boolean p0) { return null; }
    public java.lang.String getClassName() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected ParsedMainComponent(android.os.Parcel p0) { super((android.content.pm.parsing.component.ParsedComponent)null); }
    public java.lang.String getProcessName() { return null; }
    public boolean isDirectBootAware() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isExported() { return false; }
    public int getOrder() { return 0; }
    public java.lang.String getSplitName() { return null; }
    public android.content.pm.parsing.component.ParsedMainComponent setDirectBootAware(boolean p0) { return null; }
    public android.content.pm.parsing.component.ParsedMainComponent setExported(boolean p0) { return null; }
    public android.content.pm.parsing.component.ParsedMainComponent setSplitName(java.lang.String p0) { return null; }
}
