package esfugiblog.esy.httpfugiblog.olapos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    Context context;
    public void calcuaIMC(View view) {
        EditText ep=(EditText)findViewById(R.id.etPeso);
        EditText ea=(EditText)findViewById(R.id.etAltura);


        double peso=Double.parseDouble(ep.getText().toString());
        double altura=Double.parseDouble(ea.getText().toString());

        double imc=peso/(altura * altura);

        TextView ti=(TextView)findViewById(R.id.tvImc);
        //ti.setText(""+imc);


        if(imc<=15){
            //Toast toast= Toast.makeText(context, "Extremamente abaixo do peso!",Toast.LENGTH_SHORT);
            ti.setText("Extremamente abaixo do peso!"+imc);
                Toast.makeText(getApplicationContext(),"IMC Calculado",Toast.LENGTH_SHORT).show();
        }else if(imc>15 &&imc <=19){
            //Toast toast= Toast.makeText(context, "Abaixo do peso",Toast.LENGTH_SHORT);
            ti.setText("Abaixo do peso!"+imc);
        }else if((imc>19 &&imc <=25)){
            //Toast toast= Toast.makeText(context, "Seu peso esta na faixa ideal",Toast.LENGTH_SHORT);
            ti.setText("Peso ideal!"+imc);
        }else if(imc>25 &&imc <=35){
            //Toast toast= Toast.makeText(context, "Acima do peso",Toast.LENGTH_SHORT);
            ti.setText("Acima do peso!"+imc);
        }
    }
}
