package com.example.user.calculadorajo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import static com.example.user.calculadorajo.R.id.btnpunto;

public class MainActivity extends ActionBarActivity implements OnClickListener{
    boolean decimal= false;
    boolean mas=false;
    boolean menos=false;
    boolean por=false;
    boolean division=false;
    boolean seno=false;
    boolean coseno=false;
    boolean tangente=false;
    boolean raiz=false;

    Double[] numero= new Double [20];
    Double resultado;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CREACION DE BOTONES

        Button seno=(Button)findViewById(R.id.btnseno);
        seno.setOnClickListener(this);
        Button coseno=(Button)findViewById(R.id.btncoseno);
        coseno.setOnClickListener(this);
        Button tangente=(Button)findViewById(R.id.btntangente);
        tangente.setOnClickListener(this);
        Button borrar=(Button)findViewById(R.id.btnborrar);
        borrar.setOnClickListener(this);

        Button n1=(Button)findViewById(R.id.btn1);
        n1.setOnClickListener(this);
        Button n2=(Button)findViewById(R.id.btn2);
        n2.setOnClickListener(this);
        Button n3=(Button)findViewById(R.id.btn3);
        n3.setOnClickListener(this);
        Button n4=(Button)findViewById(R.id.btn4);
        n4.setOnClickListener(this);
        Button n5=(Button)findViewById(R.id.btn5);
        n5.setOnClickListener(this);
        Button n6=(Button)findViewById(R.id.btn6);
        n6.setOnClickListener(this);
        Button n7=(Button)findViewById(R.id.btn7);
        n7.setOnClickListener(this);
        Button n8=(Button)findViewById(R.id.btn8);
        n8.setOnClickListener(this);
        Button n9=(Button)findViewById(R.id.btn9);
        n9.setOnClickListener(this);
        Button n0=(Button)findViewById(R.id.btn0);
        n0.setOnClickListener(this);

        Button mas=(Button)findViewById(R.id.btnmas);
        mas.setOnClickListener(this);
        Button menos=(Button)findViewById(R.id.btnmenos);
        menos.setOnClickListener(this);
        Button por=(Button)findViewById(R.id.btnpor);
        por.setOnClickListener(this);
        Button division=(Button)findViewById(R.id.btndivision);
        division.setOnClickListener(this);
        Button igual=(Button)findViewById(R.id.btnigual);
        igual.setOnClickListener(this);
        Button punto=(Button)findViewById(btnpunto);
        punto.setOnClickListener(this);
        Button raiz=(Button)findViewById(R.id.btnraiz);
        raiz.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        TextView pantalla= (TextView)findViewById(R.id.texto);
        int seleccion= v.getId();
        String a= pantalla.getText().toString();

        //ACCION DEL BOTON

        try {
        switch (seleccion) {
            case R.id.btn0:
                pantalla.setText(a+"0");
                break;
            case R.id.btn1:
                pantalla.setText(a+"1");
                break;
            case R.id.btn2:
                pantalla.setText(a+"2");
                break;
            case R.id.btn3:
                pantalla.setText(a+"3");
                break;
            case R.id.btn4:
                pantalla.setText(a+"4");
                break;
            case R.id.btn5:
                pantalla.setText(a+"5");
                break;
            case R.id.btn6:
                pantalla.setText(a+"6");
                break;
            case R.id.btn7:
                pantalla.setText(a+"7");
                break;
            case R.id.btn8:
                pantalla.setText(a+"8");
                break;
            case R.id.btn9:
                pantalla.setText(a+"9");
                break;
            case R.id.btnpunto:
                if (decimal==false) {
                    pantalla.setText(a + ".");
                    decimal=true;
                }
                else{
                    return;
                }
                break;
            case R.id.btnseno:
                seno=true;
                pantalla.setText("");
                break;
            case R.id.btncoseno:
                coseno=true;
                pantalla.setText("");
                break;
            case R.id.btntangente:
                tangente=true;
                pantalla.setText("");
                break;
            case R.id.btnmas:
                mas=true;
                numero [0]=Double.parseDouble(a);
                pantalla.setText("");
                decimal=false;
                break;
            case R.id.btnmenos:
                menos=true;
                numero [0]=Double.parseDouble(a);
                pantalla.setText("");
                decimal=false;
                break;
            case R.id.btnpor:
                por=true;
                numero [0]=Double.parseDouble(a);
                pantalla.setText("");
                decimal=false;
                break;
            case R.id.btndivision:
                division=true;
                numero [0]=Double.parseDouble(a);
                pantalla.setText("");
                decimal=false;
                break;
            case R.id.btnraiz:
                raiz=true;
                pantalla.setText("");
                break;
            case R.id.btnigual:
                numero [1]=Double.parseDouble(a);
                if (mas==true){
                    resultado=numero[0]+numero[1];
                    pantalla.setText(String.valueOf(numero[0]+" + "+numero[1]+": "+resultado));
                }
                else if (menos==true){
                    resultado=numero[0]-numero[1];
                    pantalla.setText(String.valueOf(numero[0]+" - "+numero[1]+": "+resultado));
                }
                else if (por==true){
                    resultado=numero[0]*numero[1];
                    pantalla.setText(String.valueOf(numero[0]+" * "+numero[1]+": "+resultado));
                }
                else if (division==true){
                    resultado=numero[0]/numero[1];
                    pantalla.setText(String.valueOf(numero[0]+" / "+numero[1]+": "+resultado));
                }
                else if (seno==true){

                    pantalla.setText(""+Trigonometricas.seno(a));
                }
                else if (coseno==true){
                    pantalla.setText(""+Trigonometricas.coseno(a));
                }
                else if (tangente==true){
                    pantalla.setText(""+Trigonometricas.tangente(a));
                }
                else if (raiz==true) {
                    pantalla.setText("" + Trigonometricas.raiz(a));
                }
                decimal=false;
                mas=false;
                menos=false;
                por=false;
                division=false;
                seno=false;
                coseno=false;
                tangente=false;
                raiz=false;
                break;
            case R.id.btnborrar:
                pantalla.setText("");
                decimal=false;
                break;
        }
          }
            catch (Exception e){
              pantalla.setText("Error, vuelve a intentarlo");
          }

        }
    }

   //Realizado por Jonatan García, Maria Alejandra Villa y Oscar Pastor.