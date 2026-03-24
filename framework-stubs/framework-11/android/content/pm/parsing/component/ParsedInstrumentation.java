package android.content.pm.parsing.component;

public class ParsedInstrumentation extends android.content.pm.parsing.component.ParsedComponent {
    private java.lang.String targetPackage;
    private java.lang.String targetProcesses;
    boolean handleProfiling;
    boolean functionalTest;
    public static final android.os.Parcelable.Creator<android.content.pm.parsing.component.ParsedInstrumentation> CREATOR = null;
    public ParsedInstrumentation() { super((android.content.pm.parsing.component.ParsedComponent)null); }
    public void setTargetPackage(java.lang.String p0) {}
    public void setTargetProcesses(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected ParsedInstrumentation(android.os.Parcel p0) { super((android.content.pm.parsing.component.ParsedComponent)null); }
    public java.lang.String getTargetPackage() { return null; }
    public java.lang.String getTargetProcesses() { return null; }
    public boolean isHandleProfiling() { return false; }
    public boolean isFunctionalTest() { return false; }
}
