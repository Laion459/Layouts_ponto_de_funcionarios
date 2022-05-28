package programacao.mobile.atividade5layoutsm1;

import static programacao.mobile.atividade5layoutsm1.R.id.editTextTextFuncao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    public static int hours(String fullhour)
    {
        String[] parts = fullhour.split(":");

        int hour = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);

        return (hour * 60) + min;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = findViewById(R.id.layout);

        Button button = findViewById(R.id.button);
        EditText matricula = findViewById(R.id.editTextTextMatricula);
        EditText nome = findViewById(R.id.editTextTextNome);
        EditText lotacao = findViewById(R.id.editTextTextLotacao);
        EditText funcao = findViewById(editTextTextFuncao);

        EditText et = new EditText(this);
        LinearLayout.LayoutParams p = new
                LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        et.setLayoutParams(p);

        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
        String hora = formatoHora.format(new Date());

        System.out.println(hora);
        System.out.println(hours(hora));

        if (hours(hora) > (9 * 60) && hours(hora) <( 10 * 60)){
            EditText tv = new EditText(this);
            tv.setText(hora);
            layout.addView(tv);
        }
//
        if (hours(hora) > (10 * 60) && hours(hora) < (11 * 60)){
            EditText tv = new EditText(this);
            tv.setText(hora);
            layout.addView(tv);
//
            EditText tv1 = new EditText(this);
            tv1.setText(hora);
            layout.addView(tv1);
        }
//
        if (hours(hora) > (11 * 60) && hours(hora) < (12 * 60)){
            EditText tv = new EditText(this);
            tv.setText(hora);
            layout.addView(tv);
//
            EditText tv1 = new EditText(this);
            tv1.setText(hora);
            layout.addView(tv1);
//
            EditText tv2 = new EditText(this);
            tv2.setText(hora);
            layout.addView(tv2);
        }
//
        if (hours(hora) > (13 * 60) && hours(hora) < (14 * 60)){
            EditText tv = new EditText(this);
            tv.setText(hora);
            layout.addView(tv);
//
            EditText tv1 = new EditText(this);
            tv1.setText(hora);
            layout.addView(tv1);
//
            EditText tv2 = new EditText(this);
            tv2.setText(hora);
            layout.addView(tv2);
//
            EditText tv3 = new EditText(this);
            tv3.setText(hora);
            layout.addView(tv3);
        }

        if (hours(hora) > (14 * 60) && hours(hora) < (15 * 60)){
            EditText tv = new EditText(this);
            tv.setText(hora);
            layout.addView(tv);
//
            EditText tv1 = new EditText(this);
            tv1.setText(hora);
            layout.addView(tv1);
//
            EditText tv2 = new EditText(this);
            tv2.setText(hora);
            layout.addView(tv2);
//
            EditText tv3 = new EditText(this);
            tv3.setText(hora);
            layout.addView(tv3);

            EditText tv4 = new EditText(this);
            tv4.setText(hora);
            layout.addView(tv4);
        }

        if (hours(hora) > (15 * 60) && hours(hora) < (16 * 60)){
            EditText tv = new EditText(this);
            tv.setText(hora);
            layout.addView(tv);
//
            EditText tv1 = new EditText(this);
            tv1.setText(hora);
            layout.addView(tv1);
//
            EditText tv2 = new EditText(this);
            tv2.setText(hora);
            layout.addView(tv2);
//
            EditText tv3 = new EditText(this);
            tv3.setText(hora);
            layout.addView(tv3);

            EditText tv4 = new EditText(this);
            tv4.setText(hora);
            layout.addView(tv4);

            EditText tv5 = new EditText(this);
            tv5.setText(hora);
            layout.addView(tv5);
        }

        if (hours(hora) > (16 * 60) && hours(hora) < (17 * 60)){
            EditText tv = new EditText(this);
            tv.setText(hora);
            layout.addView(tv);
//
            EditText tv1 = new EditText(this);
            tv1.setText(hora);
            layout.addView(tv1);
//
            EditText tv2 = new EditText(this);
            tv2.setText(hora);
            layout.addView(tv2);
//
            EditText tv3 = new EditText(this);
            tv3.setText(hora);
            layout.addView(tv3);

            EditText tv4 = new EditText(this);
            tv4.setText(hora);
            layout.addView(tv4);
//
            EditText tv5 = new EditText(this);
            tv5.setText(hora);
            layout.addView(tv5);
//
            EditText tv6 = new EditText(this);
            tv6.setText(hora);
            layout.addView(tv6);
        }

        if (hours(hora) > (17 * 60) && hours(hora) < (24 * 60)){
            EditText tv = new EditText(this);
            tv.setText(hora);
            layout.addView(tv);
//
            EditText tv1 = new EditText(this);
            tv1.setText(hora);
            layout.addView(tv1);
//
            EditText tv2 = new EditText(this);
            tv2.setText(hora);
            layout.addView(tv2);
//
            EditText tv3 = new EditText(this);
            tv3.setText(hora);
            layout.addView(tv3);

            EditText tv4 = new EditText(this);
            tv4.setText(hora);
            layout.addView(tv4);
//
            EditText tv5 = new EditText(this);
            tv5.setText(hora);
            layout.addView(tv5);

            EditText tv6 = new EditText(this);
            tv6.setText(hora);
            layout.addView(tv6);

            EditText tv7 = new EditText(this);
            tv7.setText(hora);
            layout.addView(tv7);
        }



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context contexto = getApplicationContext();
                String texto = "CONFIRMADO";
                int duracao = Toast.LENGTH_SHORT;

                if (hours(hora) < (9 * 60) || hours(hora) > (24 * 60)){
                    texto = "FORA DA HORA";

                }


                Toast toast = Toast.makeText(contexto, texto,duracao);
                toast.show();
            }
        });

    }
}