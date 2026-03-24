package android.view;

public abstract class SurfaceControlActivePictureListener {
    public SurfaceControlActivePictureListener() {}
    public abstract void onActivePicturesChanged(android.view.SurfaceControlActivePicture[] p0);
    @android.annotation.RequiresPermission("android.permission.OBSERVE_PICTURE_PROFILES")
    public void startListening() {}
    @android.annotation.RequiresPermission("android.permission.OBSERVE_PICTURE_PROFILES")
    public void stopListening() {}
}
