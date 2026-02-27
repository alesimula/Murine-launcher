package app.murinelauncher.graphics

import android.view.View
import android.view.ViewRootImpl
import android.view.Window
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

        @JvmStatic var blurType: WorkspaceBlurUtils.DrawerBlurType = DrawerBlurType.GLASS

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
        private var blurDrawableImpl : MutableMap<ViewRootImpl, BackgroundBlurDrawable> = ConcurrentHashMap()
        private val viewRootProvider: View.() -> ViewRootImpl? = if (radius > 0) View::getViewRootImpl else {_: View -> null}
        fun invalidate() = blurDrawableImpl.clear()


        open fun withBlurDrawable(view: View, block: BiConsumer<BackgroundBlurDrawable, Boolean>) {
            val viewRoot: ViewRootImpl? = viewRootProvider(view)
            var isNew = false
            if (viewRoot != null) block.accept(blurDrawableImpl.computeIfAbsent(viewRoot) {
                isNew = true
                val backgroundDrawable = viewRoot.createBackgroundBlurDrawable()
                backgroundDrawable.setBlurRadius(radius)
                backgroundDrawable
            }, isNew)
        }

        @Suppress("RedundantNullableReturnType")
        fun withBlurDrawable(window: Window, block: BiConsumer<BackgroundBlurDrawable, Boolean>) {
            val decorView: View? = window.decorView
            if (decorView != null) withBlurDrawable(decorView, block)
        }

        fun withBlurDrawable(launcher: Launcher, block: BiConsumer<BackgroundBlurDrawable, Boolean>) {
            val window: Window? = launcher.window
            if (window != null) withBlurDrawable(window, block)
        }
    }

    private class DetachedBlurType(radius: Int, blurWorkspace: Boolean): BlurType(radius, blurWorkspace)

    sealed class DrawerBlurType(radius: Int, blurWorkspace: Boolean) : BlurType(radius, blurWorkspace) {
        object NONE : DrawerBlurType(0, false)
        object GLASS : DrawerBlurType(55, true)

        object MICA : DrawerBlurType(75, false)
    }
}