package android.content.om;

public interface CriticalOverlayInfo {
    @android.annotation.NonNull
    public java.lang.String getPackageName();
    @android.annotation.Nullable
    public java.lang.String getOverlayName();
    @android.annotation.NonNull
    public java.lang.String getTargetPackageName();
    @android.annotation.Nullable
    public java.lang.String getTargetOverlayableName();
    @android.annotation.NonNull
    public android.content.om.OverlayIdentifier getOverlayIdentifier();
    public boolean isFabricated();
}
