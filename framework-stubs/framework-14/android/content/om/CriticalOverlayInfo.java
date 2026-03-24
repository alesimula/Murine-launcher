package android.content.om;

public interface CriticalOverlayInfo {
    public java.lang.String getPackageName();
    public java.lang.String getOverlayName();
    public java.lang.String getTargetPackageName();
    public java.lang.String getTargetOverlayableName();
    public android.content.om.OverlayIdentifier getOverlayIdentifier();
    public boolean isFabricated();
}
