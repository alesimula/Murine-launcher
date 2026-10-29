package app.murinelauncher.widget.smartspace

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable
import android.graphics.Color
import kotlin.math.cos
import kotlin.math.sin

/**
 * Flat weather icons drawn in code, so they do not depend on any emoji font or image file.
 * [kind] is one of: clear_day, clear_night, partly_day, partly_night, cloudy, fog, rain,
 * snow, storm. Everything is laid out on a 24x24 grid and scaled to the drawable bounds.
 */
class WeatherIconDrawable(private val kind: String) : Drawable() {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var alphaValue = 255

    override fun draw(canvas: Canvas) {
        val b = bounds
        if (b.isEmpty) return
        val save = canvas.save()
        canvas.translate(b.left.toFloat(), b.top.toFloat())
        val scale = minOf(b.width(), b.height()) / 24f
        canvas.scale(scale, scale)
        when (kind) {
            "clear_day" -> sun(canvas, 12f, 12f, 4.8f, 7.0f, 10.4f)
            "clear_night" -> moon(canvas, 12f, 12f, 8f)
            "partly_day" -> {
                sun(canvas, 9f, 9f, 3.6f, 5.4f, 7.4f)
                cloudAt(canvas, 3.2f, 4.2f, 0.82f, CLOUD)
            }
            "partly_night" -> {
                moon(canvas, 9f, 9f, 5.2f)
                cloudAt(canvas, 3.2f, 4.2f, 0.82f, CLOUD)
            }
            "cloudy" -> {
                cloudAt(canvas, 6.2f, 1.2f, 0.62f, CLOUD_BACK)
                cloudAt(canvas, 1.6f, 4f, 0.88f, CLOUD)
            }
            "fog" -> {
                cloudAt(canvas, 2.4f, 0f, 0.8f, CLOUD)
                line(canvas, 5f, 18.2f, 19f, 18.2f, 1.7f, FOG)
                line(canvas, 7f, 21f, 17f, 21f, 1.7f, FOG)
            }
            "rain" -> {
                cloudAt(canvas, 2.4f, 0f, 0.8f, CLOUD)
                line(canvas, 8.6f, 17.3f, 7.4f, 20.8f, 1.7f, DROP)
                line(canvas, 12.6f, 17.3f, 11.4f, 20.8f, 1.7f, DROP)
                line(canvas, 16.6f, 17.3f, 15.4f, 20.8f, 1.7f, DROP)
            }
            "snow" -> {
                cloudAt(canvas, 2.4f, 0f, 0.8f, CLOUD)
                circle(canvas, 8.6f, 18.2f, 1.2f, Color.WHITE)
                circle(canvas, 12.6f, 20.8f, 1.2f, Color.WHITE)
                circle(canvas, 16.6f, 18.2f, 1.2f, Color.WHITE)
            }
            "storm" -> {
                cloudAt(canvas, 2.4f, 0f, 0.8f, CLOUD_BACK)
                val bolt = Path().apply {
                    moveTo(13.4f, 15.6f)
                    lineTo(9.8f, 19.9f)
                    lineTo(12.2f, 19.9f)
                    lineTo(10.8f, 23.2f)
                    lineTo(15.2f, 18.6f)
                    lineTo(12.7f, 18.6f)
                    close()
                }
                setColor(BOLT)
                paint.style = Paint.Style.FILL
                canvas.drawPath(bolt, paint)
            }
            else -> {
                cloudAt(canvas, 6.2f, 1.2f, 0.62f, CLOUD_BACK)
                cloudAt(canvas, 1.6f, 4f, 0.88f, CLOUD)
            }
        }
        canvas.restoreToCount(save)
    }

    private fun setColor(color: Int) {
        paint.color = color
        paint.alpha = Color.alpha(color) * alphaValue / 255
    }

    private fun circle(canvas: Canvas, cx: Float, cy: Float, r: Float, color: Int) {
        setColor(color)
        paint.style = Paint.Style.FILL
        canvas.drawCircle(cx, cy, r, paint)
    }

    private fun line(
        canvas: Canvas, x1: Float, y1: Float, x2: Float, y2: Float, width: Float, color: Int
    ) {
        setColor(color)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = width
        paint.strokeCap = Paint.Cap.ROUND
        canvas.drawLine(x1, y1, x2, y2, paint)
    }

    private fun sun(canvas: Canvas, cx: Float, cy: Float, r: Float, rayIn: Float, rayOut: Float) {
        circle(canvas, cx, cy, r, SUN)
        for (i in 0 until 8) {
            val a = Math.toRadians(i * 45.0)
            val c = cos(a).toFloat()
            val s = sin(a).toFloat()
            line(
                canvas,
                cx + rayIn * c, cy + rayIn * s,
                cx + rayOut * c, cy + rayOut * s,
                1.8f, SUN
            )
        }
    }

    private fun moon(canvas: Canvas, cx: Float, cy: Float, r: Float) {
        val path = Path().apply { addCircle(cx, cy, r, Path.Direction.CW) }
        val cut = Path().apply {
            addCircle(cx + r * 0.55f, cy - r * 0.4f, r * 0.82f, Path.Direction.CW)
        }
        path.op(cut, Path.Op.DIFFERENCE)
        setColor(MOON)
        paint.style = Paint.Style.FILL
        canvas.drawPath(path, paint)
    }

    private fun cloudAt(canvas: Canvas, dx: Float, dy: Float, scale: Float, color: Int) {
        val save = canvas.save()
        canvas.translate(dx, dy)
        canvas.scale(scale, scale)
        circle(canvas, 8f, 15.2f, 4.3f, color)
        circle(canvas, 12.8f, 11.8f, 5.0f, color)
        circle(canvas, 17.2f, 15.4f, 4.0f, color)
        setColor(color)
        paint.style = Paint.Style.FILL
        canvas.drawRect(8f, 15.2f, 17.2f, 19.5f, paint)
        canvas.restoreToCount(save)
    }

    override fun setAlpha(alpha: Int) {
        alphaValue = alpha
        invalidateSelf()
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        paint.colorFilter = colorFilter
    }

    @Deprecated("Deprecated in Java")
    override fun getOpacity(): Int = PixelFormat.TRANSLUCENT

    override fun getIntrinsicWidth(): Int = 48

    override fun getIntrinsicHeight(): Int = 48

    private companion object {
        val SUN = 0xFFFFC21A.toInt()
        val MOON = 0xFFFFE6A0.toInt()
        val CLOUD = 0xFFE9EEF2.toInt()
        val CLOUD_BACK = 0xFFA9B7C0.toInt()
        val DROP = 0xFF4FC3F7.toInt()
        val BOLT = 0xFFFFD60A.toInt()
        val FOG = 0xCCE9EEF2.toInt()
    }
}
