package jp.techacademy.yuuya.aisatuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View


class MainActivity :
    AppCompatActivity(),
    View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        button.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        showTimePikerDialog()           //TimePikerDialogを生成する。時間設定
    }

    private fun showTimePikerDialog(){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{view, hour, minute ->
                greetingTool("$hour","$minute")

            } ,13,0,true)

        timePickerDialog.show()

    }

    private fun greetingTool(hour:String,minute:String){
        var hourOfTime:Int = Integer.parseInt(hour)

        if(hourOfTime>=2 && hourOfTime<10){
            textView.text="おはよう！"
        }else if(hourOfTime>=10&&hourOfTime<18){
            textView.text="こんにちわ！"
        }else{
            textView.text="こんばんわ！"
        }

    }
    
}