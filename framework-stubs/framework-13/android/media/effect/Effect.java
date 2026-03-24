package android.media.effect;

public abstract class Effect {
    public Effect() {}
    public abstract java.lang.String getName();
    public abstract void apply(int p0, int p1, int p2, int p3);
    public abstract void setParameter(java.lang.String p0, java.lang.Object p1);
    public void setUpdateListener(android.media.effect.EffectUpdateListener p0) {}
    public abstract void release();
}
