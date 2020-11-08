package br.com.sg2l2.pizzou

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

object NotificationUtil {

    val CHANNEL_ID = "1"

    fun createChannel() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            val context = PizzouApplication.getInstance().applicationContext

            val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            val appName = context.getString(R.string.app_name)

            val c = NotificationChannel(CHANNEL_ID, appName, NotificationManager.IMPORTANCE_HIGH)
            manager.createNotificationChannel(c)
        }
    }

    fun create(id: Int, intent: Intent, titulo: String, texto: String) {
        createChannel()

        val context = PizzouApplication.getInstance().applicationContext

        val p = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        val builder = NotificationCompat.Builder(context, CHANNEL_ID)
            .setContentIntent(p)
            .setContentTitle(titulo)
            .setContentText(texto)
            .setSmallIcon(R.drawable.di_vitto_pizzaria)
            .setAutoCancel(true)
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)


        with(NotificationManagerCompat.from(PizzouApplication.getInstance())) {
            val n = builder.build()
            notify(id, n)
        }
    }
}