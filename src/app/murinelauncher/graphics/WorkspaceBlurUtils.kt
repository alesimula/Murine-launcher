package app.murinelauncher.graphics

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.graphics.drawable.PaintDrawable
import android.view.View
import android.view.ViewRootImpl
import android.view.Window
import androidx.core.util.Consumer
import com.android.internal.graphics.drawable.BackgroundBlurDrawable
import com.android.launcher3.Launcher
import com.android.launcher3.R
import com.android.launcher3.Utilities
import com.android.launcher3.Utilities.getSystemProperty
import java.util.concurrent.ConcurrentHashMap
import java.util.function.BiConsumer

class WorkspaceBlurUtils {
    companion object {
        // Must be the first declaration
        @JvmStatic private val BLUR_TYPES: MutableList<BlurType> = mutableListOf<BlurType>()
        @JvmStatic val PREVIEW : BlurType = DetachedBlurType(20, false)
        @JvmStatic val NONE : BlurType = DetachedBlurType(0, false)

        enum class DRAWER_TYPES(val type: DrawerBlurType, val label: Int, val icon: Int) {
            GLASS(DrawerBlurType.GLASS, R.string.pref_category_general_title, R.drawable.ic_setting),
            MICA(DrawerBlurType.MICA, R.string.pref_category_general_title, R.drawable.ic_setting),
            NONE(DrawerBlurType.NONE, R.string.pref_category_general_title, R.drawable.ic_setting);
        }

        /**
         * This must be called when the app is resumed in order for the drawables to be recreated.
         * TODO is this really needed?
         */
        @JvmStatic fun invalidate() {
            for (blurType in BLUR_TYPES) blurType.invalidate()
        }

        @JvmStatic var blurType: DrawerBlurType = DrawerBlurType.GLASS

        /**
         * Returns configured blur type for app drawer.
         */
        @JvmStatic fun getDrawerBlur(): DrawerBlurType {
            return blurType;
        }

        @JvmStatic val isBlurSupportedOEM: Boolean by lazy {
            getSystemProperty("ro.surface_flinger.supports_background_blur", "0") == "1" &&
                    getSystemProperty("persist.sys.sf.disable_blurs", "0") == "1"
        }

        @JvmStatic val isBlurSupportedSDK get() = Utilities.ATLEAST_S

        @JvmStatic val isBlurSupported get() = isBlurSupportedSDK && isBlurSupportedOEM
    }

    abstract class BlurType(val radius: Int, val blurWorkspace: Boolean) {
        init {BLUR_TYPES.add(this)}
        private var blurDrawableImpl : MutableMap<Int, BackgroundBlurDrawable> = ConcurrentHashMap()
        private var fallbackDrawableImpl : MutableMap<Int, MurineLayerDrawable> = ConcurrentHashMap()
        private val viewRootProvider: View.() -> ViewRootImpl? = if (radius > 0) View::getViewRootImpl else {_: View -> null}
        fun invalidate() = blurDrawableImpl.clear()


        open fun withBlurDrawable(view: View, block: BiConsumer<BackgroundBlurDrawable, Boolean>): Boolean {
            val viewRoot: ViewRootImpl? = viewRootProvider(view)
            var isNew = false
            if (viewRoot != null) block.accept(blurDrawableImpl.computeIfAbsent(System.identityHashCode(viewRoot)) {
                isNew = true
                val backgroundDrawable = viewRoot.createBackgroundBlurDrawable()
                backgroundDrawable.setBlurRadius(radius)
                backgroundDrawable
            }, isNew)
            //else if (fallback != null) fallbackDrawableImpl.computeIfAbsent(viewRoot, {PaintDrawable()});
            return viewRoot != null
        }

        @Suppress("RedundantNullableReturnType")
        fun withBlurDrawable(window: Window, block: BiConsumer<BackgroundBlurDrawable, Boolean>): Boolean {
            val decorView: View? = window.decorView
            return if (decorView != null) withBlurDrawable(decorView, block) else false
        }

        fun withBlurDrawable(launcher: Launcher, block: BiConsumer<BackgroundBlurDrawable, Boolean>): Boolean {
            val window: Window? = launcher.window
            return if (window != null) withBlurDrawable(window, block) else false
        }

        @Suppress("RedundantNullableReturnType")
        fun fallbackDrawable(window: Window): MurineLayerDrawable {
            return fallbackDrawableImpl.computeIfAbsent(System.identityHashCode(window), {MurineLayerDrawable()})
        }
    }

    private class DetachedBlurType(radius: Int, blurWorkspace: Boolean): BlurType(radius, blurWorkspace)

    sealed class DrawerBlurType(radius: Int, blurWorkspace: Boolean, val sheetOnly: Boolean, val color: Int, val scrimColor: Int) : BlurType(radius, blurWorkspace) {
        object NONE : DrawerBlurType(0, false, false,
            R.color.drawer_sheet_color_none, R.color.drawer_scrim_color_none)
        object GLASS : DrawerBlurType(55, true, false,
            R.color.drawer_sheet_color_glass, R.color.drawer_scrim_color_glass)

        object MICA : DrawerBlurType(88, false, true,
            R.color.drawer_sheet_color_mica, android.R.color.transparent)
    }

    class MurineLayerDrawable(private val topLayer: PaintDrawable = PaintDrawable()) : LayerDrawable(arrayOf(NO_OP_DRAWABLE, topLayer)) {
        companion object {
            const val BLUR_ID = 0
            const val TINT_ID = 1
            val NO_OP_DRAWABLE = object : Drawable() {
                override fun draw(canvas: Canvas) = Unit
                override fun setAlpha(alpha: Int) = Unit
                override fun setColorFilter(colorFilter: ColorFilter?) = Unit

                @Deprecated("Deprecated in API 29")
                override fun getOpacity(): Int = PixelFormat.TRANSPARENT
            }.apply {setVisible(false, false)}
        }

        init {
            setId(0, BLUR_ID)
            setId(1, TINT_ID)
        }

        /**
         * Sets the bottom layer.
         * If null is passed, NO_OP_DRAWABLE is used.
         * If the same instance is already set, nothing happens.
         */
        fun <E: Drawable> setBottomLayer(bottomLayer: E?, onApplyNew: Consumer<E>? = null) {
            val newBottom = bottomLayer ?: NO_OP_DRAWABLE.apply {setVisible(false, false)}
            val currentBottom = getDrawable(0)
            if (currentBottom === newBottom) return
            if (bottomLayer != null) onApplyNew?.accept(bottomLayer)
            setDrawable(0, newBottom)
            newBottom.setVisible(newBottom !== NO_OP_DRAWABLE, false)
            invalidateSelf()
        }

        /**
         * Returns the current bottom layer, or null if NO_OP is active.
         */
        fun getBottomLayer(): Drawable? {
            val current = getDrawable(0)
            return if (current === NO_OP_DRAWABLE) null else current
        }

        /**
         * Returns the current bottom layer, or null if NO_OP is active.
         */
        fun getTopLayer(): PaintDrawable {
            return getDrawable(1) as PaintDrawable
        }
    }
}