package th.co.toei.exprogressbar

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Shader
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat

class GaugeVolume : View {

    constructor(context: Context?) : super(context) {
        initPaint()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        initPaint()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initPaint()
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        initPaint()
    }

    private lateinit var paintBackground: Paint
    private lateinit var paintStroke: Paint
    private lateinit var paintGauge: Paint
    private var isDrawGauge: Boolean = false


    val paintStroke1 = Paint().apply {
        color = ContextCompat.getColor(context, R.color.color1)
        style = Paint.Style.STROKE
        strokeWidth = 40f
        isAntiAlias = true
        strokeCap = Paint.Cap.ROUND
    }

    val paintStroke2 = Paint().apply {
        color = ContextCompat.getColor(context, R.color.color2)
        style = Paint.Style.STROKE
        strokeWidth = 40f
        isAntiAlias = true
        strokeCap = Paint.Cap.ROUND
    }

    val paintStroke3 = Paint().apply {
        color = ContextCompat.getColor(context, R.color.color3)
        style = Paint.Style.STROKE
        strokeWidth = 40f
        isAntiAlias = true
        strokeCap = Paint.Cap.ROUND
    }

    val paintStroke4 = Paint().apply {
        color = ContextCompat.getColor(context, R.color.color4)
        style = Paint.Style.STROKE
        strokeWidth = 40f
        isAntiAlias = true
        strokeCap = Paint.Cap.ROUND
    }

    private fun initPaint() {
        paintStroke = Paint().apply {
            color = ContextCompat.getColor(context, R.color.colorGraysLightGray2)
            style = Paint.Style.STROKE
            strokeWidth = 40f
            isAntiAlias = true
            strokeCap = Paint.Cap.ROUND
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.let {
            drawStroke(it)
//            drawBackground(it)
//            if (isDrawGauge) {
//                drawGauge(it)
//            }
        }
    }

    private fun drawStroke(canvas: Canvas) {
        val width1 = ((canvas.width * 85f) / 100) - 28f
        val width2 = ((canvas.width * 5f) / 100) - 28f
        val width3 = ((canvas.width * 5f) / 100) - 28f
        val width4 = ((canvas.width * 5f) / 100) - 28f

        canvas.drawLine(
            20f,
            canvas.height / 2f,
            width1,
            canvas.height / 2f,
            paintStroke1
        )


        canvas.translate(width1 + 30f, 0f)

        canvas.drawLine(
            20f,
            canvas.height / 2f,
            width2,
            canvas.height / 2f,
            paintStroke2
        )

        canvas.translate(width2 + 30f, 0f)

        canvas.drawLine(
            20f,
            canvas.height / 2f,
            width3,
            canvas.height / 2f,
            paintStroke3
        )

        canvas.translate(width3 + 30f, 0f)

        canvas.drawLine(
            20f,
            canvas.height / 2f,
            width4,
            canvas.height / 2f,
            paintStroke4
        )
    }

//    private fun drawBackground(canvas: Canvas) {
//        paintBackground = Paint().apply {
//            color = Color.parseColor(backgroundColor)
//            style = Paint.Style.FILL
//            isAntiAlias = true
//            strokeWidth = 39f
//            strokeCap = Paint.Cap.ROUND
//        }
//        canvas.drawLine(
//            0f + 20f,
//            canvas.height / 2f,
//            canvas.width - 20f,
//            canvas.height / 2f,
//            paintBackground
//        )
//    }
//
//    private fun drawGauge(canvas: Canvas) {
//        paintGauge = Paint().apply {
//            style = Paint.Style.FILL
//            strokeWidth = 40f
//            isAntiAlias = true
//            strokeCap = Paint.Cap.ROUND
//            shader =
//                LinearGradient(
//                    0f,
//                    0f,
//                    ((canvas.width * indicator) / 100) - 20f,
//                    0f,
//                    Color.parseColor(startColor),
//                    Color.parseColor(endColor),
//                    Shader.TileMode.CLAMP
//                )
//        }
//        canvas.drawLine(
//            0f + 20f,
//            canvas.height / 2f,
//            ((canvas.width * indicator) / 100) - 20f,
//            canvas.height / 2f,
//            paintGauge
//        )
//    }

    private var indicator: Float = 0f
    private var backgroundColor: String = "#F5F5F5"
    private var startColor: String = "#8DDB90"
    private var endColor: String = "#49AD68"

    fun drawGauge(
        indicator: Int,
        backgroundColor: String?,
        startColor: String?,
        endColor: String?
    ) {
//        this.backgroundColor = if (backgroundColor.isNullOrBlank()) "#F5F5F5" else backgroundColor
//        this.startColor = if (startColor.isNullOrBlank()) "#8DDB90" else startColor
//        this.endColor = if (endColor.isNullOrBlank()) "#49AD68" else endColor
//        if (indicator > 0) {
//            isDrawGauge = true
//            val valueAnimator: ValueAnimator = ValueAnimator.ofFloat(1f, indicator.toFloat())
//            valueAnimator.duration = 1000
//            valueAnimator.addUpdateListener { value ->
//                this.indicator = value.animatedValue as Float
//                invalidate()
//            }
//            valueAnimator.start()
//        }
    }
}