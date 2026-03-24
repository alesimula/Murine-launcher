package android.opengl;

abstract class GLWrapperBase implements javax.microedition.khronos.opengles.GL, javax.microedition.khronos.opengles.GL10, javax.microedition.khronos.opengles.GL10Ext, javax.microedition.khronos.opengles.GL11, javax.microedition.khronos.opengles.GL11Ext, javax.microedition.khronos.opengles.GL11ExtensionPack {
    protected javax.microedition.khronos.opengles.GL10 mgl;
    protected javax.microedition.khronos.opengles.GL10Ext mgl10Ext;
    protected javax.microedition.khronos.opengles.GL11 mgl11;
    protected javax.microedition.khronos.opengles.GL11Ext mgl11Ext;
    protected javax.microedition.khronos.opengles.GL11ExtensionPack mgl11ExtensionPack;
    public GLWrapperBase(javax.microedition.khronos.opengles.GL p0) {}
}
