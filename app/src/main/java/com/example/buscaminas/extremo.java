package com.example.buscaminas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class extremo extends AppCompatActivity {
    ImageButton bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20,bt21,bt22,bt23,bt24,bt25,bt26,bt27,bt28,bt29,bt30,bt31,bt32,bt33,bt34,bt35,bt36,bt37,bt38,bt39,bt40,bt41,bt42,bt43,bt44,bt45,bt46,bt47,bt48,bt49,bt50,bt51,bt52,bt53,bt54,bt55,bt56,bt57,bt58,bt59,bt60,bt61,bt62,bt63,bt64,bt65,bt66,bt67,bt68,bt69,bt70,bt71,bt72,bt73,bt74,bt75,bt76,bt77,bt78,bt79,bt80,bt81,bt82,bt83,bt84,bt85,bt86,bt87,bt88,bt89;
    Button rei,salir;
    ImageButton[] imagenes= new ImageButton[90];
    int[] image;
    int fondo,mina,cuenta,bande;
    ArrayList<Integer> arrayDeCeros;
    ImageButton primero;
    int numero;
    EditText minas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extremo);
        init();
    }
    private void desplegar(int i){
        if (arrayDeCeros.get(i)==0)
            imagenes[i].setImageResource(image[0]);
        else if (arrayDeCeros.get(i)==1)
            imagenes[i].setImageResource(image[1]);
        else if (arrayDeCeros.get(i)==2)
            imagenes[i].setImageResource(image[2]);
        else if (arrayDeCeros.get(i)==3)
            imagenes[i].setImageResource(image[3]);
        else if (arrayDeCeros.get(i)==4)
            imagenes[i].setImageResource(image[4]);
        else if (arrayDeCeros.get(i)==5)
            imagenes[i].setImageResource(image[5]);
        else if (arrayDeCeros.get(i)==6)
            imagenes[i].setImageResource(image[6]);
        else if (arrayDeCeros.get(i)==7)
            imagenes[i].setImageResource(image[7]);
        else if (arrayDeCeros.get(i)==10)
            imagenes[i].setImageResource(mina);
        imagenes[i].setEnabled(false);
    }
    private void verificarColindante(int pos){
        if (pos==0){
            if (arrayDeCeros.get(pos+1)!=10){
                desplegar(pos+1);
                if (arrayDeCeros.get(pos+1)==0){
                    arrayDeCeros.set(pos+1,8);
                    verificarColindante(pos+1);
                }
            }
            if(arrayDeCeros.get(pos+10)!=10){
                desplegar(pos+10);
                if (arrayDeCeros.get(pos+10)==0){
                    arrayDeCeros.set(pos+10,8);
                    verificarColindante(pos+10);
                }
            }
            if (arrayDeCeros.get(pos+11)!=10){
                desplegar(pos+11);
                if (arrayDeCeros.get(pos+11)==0){
                    arrayDeCeros.set(pos+11,8);
                    verificarColindante(pos+11);
                }
            }
        }
        else if(pos==9){
            if (arrayDeCeros.get(pos-1)!=10){
                desplegar(pos-1);
                if (arrayDeCeros.get(pos-1)==0){
                    arrayDeCeros.set(pos-1,8);
                    verificarColindante(pos-1);
                }
            }
            if(arrayDeCeros.get(pos+10)!=10){
                desplegar(pos+10);
                if (arrayDeCeros.get(pos+10)==0){
                    arrayDeCeros.set(pos+10,8);
                    verificarColindante(pos+10);
                }
            }
            if (arrayDeCeros.get(pos+9)!=10){
                desplegar(pos+9);
                if (arrayDeCeros.get(pos+9)==0){
                    arrayDeCeros.set(pos+9,8);
                    verificarColindante(pos+11);
                }
            }
        }
        else if (pos==80){
            if (arrayDeCeros.get(pos+1)!=10){
                desplegar(pos+1);
                if (arrayDeCeros.get(pos+1)==0){
                    arrayDeCeros.set(pos+1,8);
                    verificarColindante(pos+1);
                }
            }
            if(arrayDeCeros.get(pos-10)!=10){
                desplegar(pos-10);
                if (arrayDeCeros.get(pos-10)==0){
                    arrayDeCeros.set(pos-10,8);
                    verificarColindante(pos-10);
                }
            }
            if (arrayDeCeros.get(pos-9)!=10){
                desplegar(pos-9);
                if (arrayDeCeros.get(pos-9)==0){
                    arrayDeCeros.set(pos-9,8);
                    verificarColindante(pos-9);
                }
            }
        }
        else if (pos==89){
            if (arrayDeCeros.get(pos-1)!=10){
                desplegar(pos-1);
                if (arrayDeCeros.get(pos-1)==0){
                    arrayDeCeros.set(pos-1,8);
                    verificarColindante(pos-1);
                }
            }
            if(arrayDeCeros.get(pos-10)!=10){
                desplegar(pos-10);
                if (arrayDeCeros.get(pos-10)==0){
                    arrayDeCeros.set(pos-10,8);
                    verificarColindante(pos-10);
                }
            }
            if (arrayDeCeros.get(pos-11)!=10){
                desplegar(pos-11);
                if (arrayDeCeros.get(pos-11)==0){
                    arrayDeCeros.set(pos-11,8);
                    verificarColindante(pos-11);
                }
            }
        }
        else if(pos%10==0){
            if (arrayDeCeros.get(pos+1)!=10){
                desplegar(pos+1);
                if (arrayDeCeros.get(pos+1)==0){
                    arrayDeCeros.set(pos+1,8);
                    verificarColindante(pos+1);
                }
            }
            if(arrayDeCeros.get(pos-10)!=10){
                desplegar(pos-10);
                if (arrayDeCeros.get(pos-10)==0){
                    arrayDeCeros.set(pos-10,8);
                    verificarColindante(pos-10);
                }
            }
            if (arrayDeCeros.get(pos-9)!=10){
                desplegar(pos-9);
                if (arrayDeCeros.get(pos-9)==0){
                    arrayDeCeros.set(pos-9,8);
                    verificarColindante(pos-9);
                }
            }
            if(arrayDeCeros.get(pos+10)!=10){
                desplegar(pos+10);
                if (arrayDeCeros.get(pos+10)==0){
                    arrayDeCeros.set(pos+10,8);
                    verificarColindante(pos+10);
                }
            }
            if (arrayDeCeros.get(pos+11)!=10){
                desplegar(pos+11);
                if (arrayDeCeros.get(pos+11)==0){
                    arrayDeCeros.set(pos+11,8);
                    verificarColindante(pos+11);
                }
            }
        }
        else if(pos==19 || pos==29 || pos==39 || pos==49 || pos==59 || pos==69 || pos==79){
            if(arrayDeCeros.get(pos-1)!=10){
                desplegar(pos-1);
                if (arrayDeCeros.get(pos-1)==0){
                    arrayDeCeros.set(pos-1,8);
                    verificarColindante(pos-1);
                }
            }
            if (arrayDeCeros.get(pos-10)!=10){
                desplegar(pos-10);
                if (arrayDeCeros.get(pos-10)==0){
                    arrayDeCeros.set(pos-10,8);
                    verificarColindante(pos-10);
                }
            }
            if(arrayDeCeros.get(pos-11)!=10){
                desplegar(pos-11);
                if (arrayDeCeros.get(pos-11)==0){
                    arrayDeCeros.set(pos-11,8);
                    verificarColindante(pos-11);
                }
            }
            if (arrayDeCeros.get(pos+9)!=10){
                desplegar(pos+9);
                if (arrayDeCeros.get(pos+9)==0){
                    arrayDeCeros.set(pos+9,8);
                    verificarColindante(pos+9);
                }
            }
            if (arrayDeCeros.get(pos+10)!=10){
                desplegar(pos+10);
                if (arrayDeCeros.get(pos+10)==0){
                    arrayDeCeros.set(pos+10,8);
                    verificarColindante(pos+10);
                }
            }
        }
        else if(pos<9){
            if(arrayDeCeros.get(pos+1)!=10){
                desplegar(pos+1);
                if (arrayDeCeros.get(pos+1)==0){
                    arrayDeCeros.set(pos+1,8);
                    verificarColindante(pos+1);
                }
            }
            if (arrayDeCeros.get(pos-1)!=10){
                desplegar(pos-1);
                if (arrayDeCeros.get(pos-1)==0){
                    arrayDeCeros.set(pos-1,8);
                    verificarColindante(pos-1);
                }
            }
            if(arrayDeCeros.get(pos+11)!=10){
                desplegar(pos+11);
                if (arrayDeCeros.get(pos+11)==0){
                    arrayDeCeros.set(pos+11,8);
                    verificarColindante(pos+11);
                }
            }
            if (arrayDeCeros.get(pos+9)!=10){
                desplegar(pos+9);
                if (arrayDeCeros.get(pos+9)==0){
                    arrayDeCeros.set(pos+9,8);
                    verificarColindante(pos+9);
                }
            }
            if (arrayDeCeros.get(pos+10)!=10){
                desplegar(pos+10);
                if (arrayDeCeros.get(pos+10)==0){
                    arrayDeCeros.set(pos+10,8);
                    verificarColindante(pos+10);
                }
            }
        }
        else if (pos>80 && pos<89){
            if(arrayDeCeros.get(pos-1)!=10){
                desplegar(pos-1);
                if (arrayDeCeros.get(pos-1)==0){
                    arrayDeCeros.set(pos-1,8);
                    verificarColindante(pos-1);
                }
            }
            if (arrayDeCeros.get(pos-10)!=10){
                desplegar(pos-10);
                if (arrayDeCeros.get(pos-10)==0){
                    arrayDeCeros.set(pos-10,8);
                    verificarColindante(pos-10);
                }
            }
            if(arrayDeCeros.get(pos-1)!=10){
                desplegar(pos-1);
                if (arrayDeCeros.get(pos-1)==0){
                    arrayDeCeros.set(pos-1,8);
                    verificarColindante(pos-1);
                }
            }
            if (arrayDeCeros.get(pos-9)!=10){
                desplegar(pos-9);
                if (arrayDeCeros.get(pos-9)==0){
                    arrayDeCeros.set(pos-9,8);
                    verificarColindante(pos-9);
                }
            }
            if (arrayDeCeros.get(pos-11)!=10){
                desplegar(pos-11);
                if (arrayDeCeros.get(pos-11)==0){
                    arrayDeCeros.set(pos-11,8);
                    verificarColindante(pos-11);
                }
            }
        }
        else{
            if(arrayDeCeros.get(pos-1)!=10){
                desplegar(pos-1);
                if (arrayDeCeros.get(pos-1)==0){
                    arrayDeCeros.set(pos-1,8);
                    verificarColindante(pos-1);
                }
            }
            if (arrayDeCeros.get(pos-10)!=10){
                desplegar(pos-10);
                if (arrayDeCeros.get(pos-10)==0){
                    arrayDeCeros.set(pos-10,8);
                    verificarColindante(pos-10);
                }
            }
            if(arrayDeCeros.get(pos-11)!=10){
                desplegar(pos-11);
                if (arrayDeCeros.get(pos-11)==0){
                    arrayDeCeros.set(pos-11,8);
                    verificarColindante(pos-11);
                }
            }
            if (arrayDeCeros.get(pos+9)!=10){
                desplegar(pos+9);
                if (arrayDeCeros.get(pos+9)==0){
                    arrayDeCeros.set(pos+9,8);
                    verificarColindante(pos+9);
                }
            }
            if (arrayDeCeros.get(pos+10)!=10){
                desplegar(pos+10);
                if (arrayDeCeros.get(pos+10)==0){
                    arrayDeCeros.set(pos+10,8);
                    verificarColindante(pos+10);
                }
            }
            if (arrayDeCeros.get(pos+1)!=10){
                desplegar(pos+1);
                if (arrayDeCeros.get(pos+1)==0){
                    arrayDeCeros.set(pos+1,8);
                    verificarColindante(pos+1);
                }
            }
            if (arrayDeCeros.get(pos-9)!=10){
                desplegar(pos-9);
                if (arrayDeCeros.get(pos-9)==0){
                    arrayDeCeros.set(pos-9,8);
                    verificarColindante(pos-9);
                }
            }
            if (arrayDeCeros.get(pos+11)!=10){
                desplegar(pos+11);
                if (arrayDeCeros.get(pos+11)==0){
                    arrayDeCeros.set(pos+11,8);
                    verificarColindante(pos+11);
                }
            }
        }
    }
    private void cargarTablero(){
        bt0=findViewById(R.id.boton00);imagenes[0]=bt0;
        bt1=findViewById(R.id.boton01);imagenes[1]=bt1;
        bt2=findViewById(R.id.boton02);imagenes[2]=bt2;
        bt3=findViewById(R.id.boton03);imagenes[3]=bt3;
        bt4=findViewById(R.id.boton04);imagenes[4]=bt4;
        bt5=findViewById(R.id.boton05);imagenes[5]=bt5;
        bt6=findViewById(R.id.boton06);imagenes[6]=bt6;
        bt7=findViewById(R.id.boton07);imagenes[7]=bt7;
        bt8=findViewById(R.id.boton08);imagenes[8]=bt8;
        bt9=findViewById(R.id.boton09);imagenes[9]=bt9;
        bt10=findViewById(R.id.boton10);imagenes[10]=bt10;
        bt11=findViewById(R.id.boton11);imagenes[11]=bt11;
        bt12=findViewById(R.id.boton12);imagenes[12]=bt12;
        bt13=findViewById(R.id.boton13);imagenes[13]=bt13;
        bt14=findViewById(R.id.boton14);imagenes[14]=bt14;
        bt15=findViewById(R.id.boton15);imagenes[15]=bt15;
        bt16=findViewById(R.id.boton16);imagenes[16]=bt16;
        bt17=findViewById(R.id.boton17);imagenes[17]=bt17;
        bt18=findViewById(R.id.boton18);imagenes[18]=bt18;
        bt19=findViewById(R.id.boton19);imagenes[19]=bt19;
        bt20=findViewById(R.id.boton20);imagenes[20]=bt20;
        bt21=findViewById(R.id.boton21);imagenes[21]=bt21;
        bt22=findViewById(R.id.boton22);imagenes[22]=bt22;
        bt23=findViewById(R.id.boton23);imagenes[23]=bt23;
        bt24=findViewById(R.id.boton24);imagenes[24]=bt24;
        bt25=findViewById(R.id.boton25);imagenes[25]=bt25;
        bt26=findViewById(R.id.boton26);imagenes[26]=bt26;
        bt27=findViewById(R.id.boton27);imagenes[27]=bt27;
        bt28=findViewById(R.id.boton28);imagenes[28]=bt28;
        bt29=findViewById(R.id.boton29);imagenes[29]=bt29;
        bt30=findViewById(R.id.boton30);imagenes[30]=bt30;
        bt31=findViewById(R.id.boton31);imagenes[31]=bt31;
        bt32=findViewById(R.id.boton32);imagenes[32]=bt32;
        bt33=findViewById(R.id.boton33);imagenes[33]=bt33;
        bt34=findViewById(R.id.boton34);imagenes[34]=bt34;
        bt35=findViewById(R.id.boton35);imagenes[35]=bt35;
        bt36=findViewById(R.id.boton36);imagenes[36]=bt36;
        bt37=findViewById(R.id.boton37);imagenes[37]=bt37;
        bt38=findViewById(R.id.boton38);imagenes[38]=bt38;
        bt39=findViewById(R.id.boton39);imagenes[39]=bt39;
        bt40=findViewById(R.id.boton40);imagenes[40]=bt40;
        bt41=findViewById(R.id.boton41);imagenes[41]=bt41;
        bt42=findViewById(R.id.boton42);imagenes[42]=bt42;
        bt43=findViewById(R.id.boton43);imagenes[43]=bt43;
        bt44=findViewById(R.id.boton44);imagenes[44]=bt44;
        bt45=findViewById(R.id.boton45);imagenes[45]=bt45;
        bt46=findViewById(R.id.boton46);imagenes[46]=bt46;
        bt47=findViewById(R.id.boton47);imagenes[47]=bt47;
        bt48=findViewById(R.id.boton48);imagenes[48]=bt48;
        bt49=findViewById(R.id.boton49);imagenes[49]=bt49;
        bt50=findViewById(R.id.boton50);imagenes[50]=bt50;
        bt51=findViewById(R.id.boton51);imagenes[51]=bt51;
        bt52=findViewById(R.id.boton52);imagenes[52]=bt52;
        bt53=findViewById(R.id.boton53);imagenes[53]=bt53;
        bt54=findViewById(R.id.boton54);imagenes[54]=bt54;
        bt55=findViewById(R.id.boton55);imagenes[55]=bt55;
        bt56=findViewById(R.id.boton56);imagenes[56]=bt56;
        bt57=findViewById(R.id.boton57);imagenes[57]=bt57;
        bt58=findViewById(R.id.boton58);imagenes[58]=bt58;
        bt59=findViewById(R.id.boton59);imagenes[59]=bt59;
        bt60=findViewById(R.id.boton60);imagenes[60]=bt60;
        bt61=findViewById(R.id.boton61);imagenes[61]=bt61;
        bt62=findViewById(R.id.boton62);imagenes[62]=bt62;
        bt63=findViewById(R.id.boton63);imagenes[63]=bt63;
        bt64=findViewById(R.id.boton64);imagenes[64]=bt64;
        bt65=findViewById(R.id.boton65);imagenes[65]=bt65;
        bt66=findViewById(R.id.boton66);imagenes[66]=bt66;
        bt67=findViewById(R.id.boton67);imagenes[67]=bt67;
        bt68=findViewById(R.id.boton68);imagenes[68]=bt68;
        bt69=findViewById(R.id.boton69);imagenes[69]=bt69;
        bt70=findViewById(R.id.boton70);imagenes[70]=bt70;
        bt71=findViewById(R.id.boton71);imagenes[71]=bt71;
        bt72=findViewById(R.id.boton72);imagenes[72]=bt72;
        bt73=findViewById(R.id.boton73);imagenes[73]=bt73;
        bt74=findViewById(R.id.boton74);imagenes[74]=bt74;
        bt75=findViewById(R.id.boton75);imagenes[75]=bt75;
        bt76=findViewById(R.id.boton76);imagenes[76]=bt76;
        bt77=findViewById(R.id.boton77);imagenes[77]=bt77;
        bt78=findViewById(R.id.boton78);imagenes[78]=bt78;
        bt79=findViewById(R.id.boton79);imagenes[79]=bt79;
        bt80=findViewById(R.id.boton80);imagenes[80]=bt80;
        bt81=findViewById(R.id.boton81);imagenes[81]=bt81;
        bt82=findViewById(R.id.boton82);imagenes[82]=bt82;
        bt83=findViewById(R.id.boton83);imagenes[83]=bt83;
        bt84=findViewById(R.id.boton84);imagenes[84]=bt84;
        bt85=findViewById(R.id.boton85);imagenes[85]=bt85;
        bt86=findViewById(R.id.boton86);imagenes[86]=bt86;
        bt87=findViewById(R.id.boton87);imagenes[87]=bt87;
        bt88=findViewById(R.id.boton88);imagenes[88]=bt88;
        bt89=findViewById(R.id.boton89);imagenes[89]=bt89;

    }
    private void cargarBotones(){
        rei = findViewById(R.id.botonJuegoReiniciar);
        salir = findViewById(R.id.botonJuegoSalir);
        minas=findViewById(R.id.minas);
        rei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                init();
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private void cargarImagenes(){
        image=new int[]{
                R.drawable.fondo,
                R.drawable.uno,
                R.drawable.dos,
                R.drawable.tres,
                R.drawable.cuatro,
                R.drawable.cinco,
                R.drawable.seis,
                R.drawable.siete,
                R.drawable.ocho
        };
        fondo=R.drawable.fondo1;
        mina=R.drawable.corona;
        bande=R.drawable.bandera;
    }
    private ArrayList<Integer> tablero() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        List<Integer> orden=new ArrayList<Integer>();
        for (int i=0;i <30;i++){
            int numero=(int)(Math.random() * 90);
            while(orden.contains(numero)){
                numero=(int)(Math.random() * 90);
            }
            orden.add(numero);
        }
        for(int i=0; i<90;i++){
            int no=0;
            for(int j=0; j<orden.size();j++){
                if(i==orden.get(j))
                    no=10;
            }
            if (no==10)
                result.add(10);
            else
                result.add(0);
        }
        for (int i=0;i<result.size();i++){
            int nono=0;
            if (i==0){
                if (result.get(i)==10)
                    nono=10;
                else{
                    if (result.get(i+1)==10)
                        nono+=1;
                    if (result.get(i+10)==10)
                        nono+=1;
                    if (result.get(i+11)==10)
                        nono+=1;
                }
            }
            else if(i==9){
                if (result.get(i)==10)
                    nono = 10;
                else{
                    if (result.get(i-1)==10)
                        nono+=1;
                    if (result.get(i+10)==10)
                        nono+=1;
                    if (result.get(i+9)==10)
                        nono+=1;
                }
            }
            else if (i==80){
                if (result.get(i)==10)
                    nono=10;
                else{
                    if (result.get(i+1)==10)
                        nono+=1;
                    if (result.get(i-10)==10)
                        nono+=1;
                    if (result.get(i-9)==10)
                        nono+=1;
                }
            }
            else if (i==89){
                if (result.get(i)==10)
                    nono=10;
                else{
                    if (result.get(i-1)==10)
                        nono+=1;
                    if (result.get(i-10)==10)
                        nono+=1;
                    if (result.get(i-11)==10)
                        nono+=1;
                }
            }
            else if(i%10==0){
                if (result.get(i)==10)
                    nono=10;
                else{
                    if (result.get(i+1)==10)
                        nono+=1;
                    if (result.get(i-10)==10)
                        nono+=1;
                    if (result.get(i-9)==10)
                        nono+=1;
                    if (result.get(i+10)==10)
                        nono+=1;
                    if (result.get(i+11)==10)
                        nono+=1;
                }
            }
            else if(i==19 || i==29 || i==39 || i==49 || i==59 || i==69 || i==79){
                if (result.get(i)==10)
                    nono=10;
                else{
                    if (result.get(i-1)==10)
                        nono+=1;
                    if (result.get(i-10)==10)
                        nono+=1;
                    if (result.get(i-11)==10)
                        nono+=1;
                    if (result.get(i+10)==10)
                        nono+=1;
                    if (result.get(i+9)==10)
                        nono+=1;
                }
            }
            else if(i<9){
                if (result.get(i)==10)
                    nono=10;
                else{
                    if (result.get(i+1)==10)
                        nono+=1;
                    if (result.get(i+10)==10)
                        nono+=1;
                    if (result.get(i+11)==10)
                        nono+=1;
                    if (result.get(i+9)==10)
                        nono+=1;
                    if (result.get(i-1)==10)
                        nono+=1;
                }
            }
            else if (i>80 && i<89){
                if (result.get(i)==10)
                    nono=10;
                else{
                    if (result.get(i+1)==10)
                        nono+=1;
                    if (result.get(i-10)==10)
                        nono+=1;
                    if (result.get(i-11)==10)
                        nono+=1;
                    if (result.get(i-9)==10)
                        nono+=1;
                    if (result.get(i-1)==10)
                        nono+=1;
                }
            }
            else{
                if (result.get(i)==10)
                    nono=10;
                else{
                    if (result.get(i+1)==10)
                        nono+=1;
                    if (result.get(i-10)==10)
                        nono+=1;
                    if (result.get(i-11)==10)
                        nono+=1;
                    if (result.get(i-9)==10)
                        nono+=1;
                    if (result.get(i-1)==10)
                        nono+=1;
                    if (result.get(i+9)==10)
                        nono+=1;
                    if (result.get(i+10)==10)
                        nono+=1;
                    if (result.get(i+11)==10)
                        nono+=1;
                }
            }
            result.set(i,nono);
        }
        return result;
    }
    private void revisar(int ima, ImageButton imaa){
        primero=imaa;
        numero=ima;
        if (arrayDeCeros.get(numero)==0){
            primero.setImageResource(image[0]);
            verificarColindante(numero);
        }
        else if (arrayDeCeros.get(numero)==1)
            primero.setImageResource(image[1]);
        else if (arrayDeCeros.get(numero)==2)
            primero.setImageResource(image[2]);
        else if (arrayDeCeros.get(numero)==3)
            primero.setImageResource(image[3]);
        else if (arrayDeCeros.get(numero)==4)
            primero.setImageResource(image[4]);
        else if (arrayDeCeros.get(numero)==5)
            primero.setImageResource(image[5]);
        else if (arrayDeCeros.get(numero)==6)
            primero.setImageResource(image[6]);
        else if (arrayDeCeros.get(numero)==7)
            primero.setImageResource(image[7]);
        else if (arrayDeCeros.get(numero)==10){
            primero.setImageResource(mina);
            Toast.makeText(getApplicationContext(),"Perdiste",Toast.LENGTH_LONG).show();
            MediaPlayer mp = MediaPlayer.create(this, R.raw.explosion);
            mp.start();
            for (int i=0;i<imagenes.length;i++) {
                imagenes[i].setScaleType(ImageView.ScaleType.CENTER_CROP);
                if (arrayDeCeros.get(i)==0)
                    imagenes[i].setImageResource(image[0]);
                else if (arrayDeCeros.get(i)==1)
                    imagenes[i].setImageResource(image[1]);
                else if (arrayDeCeros.get(i)==2)
                    imagenes[i].setImageResource(image[2]);
                else if (arrayDeCeros.get(i)==3)
                    imagenes[i].setImageResource(image[3]);
                else if (arrayDeCeros.get(i)==4)
                    imagenes[i].setImageResource(image[4]);
                else if (arrayDeCeros.get(i)==5)
                    imagenes[i].setImageResource(image[5]);
                else if (arrayDeCeros.get(i)==6)
                    imagenes[i].setImageResource(image[6]);
                else if (arrayDeCeros.get(i)==10)
                    imagenes[i].setImageResource(mina);
                imagenes[i].setEnabled(false);

            }
        }
        primero.setEnabled(false);
    }
    private void init(){
        cuenta=0;
        cargarTablero();
        cargarBotones();
        cargarImagenes();
        arrayDeCeros=tablero();
        minas.setText("0");
        for (int i=0;i<arrayDeCeros.size();i++){
            System.out.println(arrayDeCeros.get(i));
        }
        for (int i=0;i<imagenes.length;i++){
            imagenes[i].setScaleType(ImageView.ScaleType.CENTER_CROP);
            imagenes[i].setImageResource(fondo);
            imagenes[i].setEnabled(true);
        }
        for (int i=0;i<imagenes.length;i++){
            final int k=i;
            imagenes[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    revisar(k,imagenes[k]);
                }
            });
            imagenes[i].setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    imagenes[k].setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imagenes[k].setImageResource(bande);
                    Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vibrator.vibrate(50);
                    if(arrayDeCeros.get(k)==10){
                        cuenta+=1;
                        minas.setText(String.valueOf(cuenta));
                    }
                    if (cuenta==30){
                        Toast.makeText(getApplicationContext(),"Ganaste",Toast.LENGTH_LONG).show();
                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.aplauso);
                        mp.start();
                        for (int i=0;i<imagenes.length;i++) {
                            imagenes[i].setScaleType(ImageView.ScaleType.CENTER_CROP);
                            if (arrayDeCeros.get(i)==10)
                                imagenes[i].setImageResource(mina);
                        }
                    }
                    return false;
                }
            });
        }

    }
}