package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int a,b,c;
    String x="";
String name="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /*************    tarif button ha ******************/
        Button b0=findViewById(R.id.button0);
        Button b1=findViewById(R.id.button);
        Button b2=findViewById(R.id.button2);
        Button b3=findViewById(R.id.button3);
        Button b4=findViewById(R.id.button4);
        Button b5=findViewById(R.id.button5);
        Button b6=findViewById(R.id.button6);
        Button b7=findViewById(R.id.button7);
        Button b8=findViewById(R.id.button8);
        Button b9=findViewById(R.id.button9);

        Button plus=findViewById(R.id.plus);
        Button manfi=findViewById(R.id.mine);
        Button zarb=findViewById(R.id.zarb);
        Button taghsim=findViewById(R.id.taghsim);

        Button mosavi=findViewById(R.id.equal);

        Button acall=findViewById(R.id.ACALL);
        Button del=findViewById(R.id.delete);
        Button ac=findViewById(R.id.ac);



        EditText txt1=findViewById(R.id.editTextNumber);
        txt1.requestFocus();
        txt1.setShowSoftInputOnFocus(false);


        EditText txt2=findViewById(R.id.editTextNumber2);
        txt2.setShowSoftInputOnFocus(false);



        EditText txtname=findViewById(R.id.edittextname);
        txtname.setHintTextColor(Color.BLUE);

        TextView amalgarview=findViewById(R.id.amalgarv);


        /********************delete and ac ***************/

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt2.isFocused()) {
                    txt2.setText("");
                } else if (txt1.isFocused()) {
                    txt1.setText("");
                }


            }
        });

        acall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               txt1.setText("");
                txt2.setText("");
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt2.isFocused()) {
                    String s=txt2.getText().toString();
                    s=s.substring(0,s.length()-1);
                    txt2.setText(s);
                } else if (txt1.isFocused()) {
                    String s=txt1.getText().toString();
                    s=s.substring(0,s.length()-1);
                    txt1.setText(s);
                }

            }
        });

          /************* amalgar *************/

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(txt1.getText().toString());
                txt2.requestFocus();
               x="+";
                amalgarview.setText("+");
                amalgarview.setTextColor(Color.BLUE);

            }
        });

        manfi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(txt1.getText().toString());
                txt2.requestFocus();
                x="-";
                amalgarview.setText("-");
                amalgarview.setTextColor(Color.WHITE);
            }

        });

        zarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(txt1.getText().toString());
                txt2.requestFocus();
                x="*";
                amalgarview.setText("*");
                amalgarview.setTextColor(Color.RED);
            }
        });

        taghsim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    a=Integer.parseInt(txt1.getText().toString());
                    txt2.requestFocus();
                    x="/";
                amalgarview.setText("/");
                amalgarview.setTextColor(Color.YELLOW);
            }
        });

        mosavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x.equals("+")){
                    b=Integer.parseInt(txt2.getText().toString());
                    c=a+b;

                }

                if (x.equals("*")){
                    b=Integer.parseInt(txt2.getText().toString());
                    c=a*b;

                }
                if (x.equals("/")){
                    b=Integer.parseInt(txt2.getText().toString());
                    c=a/b;

                }
                if (x.equals("-")){
                    b=Integer.parseInt(txt2.getText().toString());
                    c=a-b;

                }
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                name =txtname.getText().toString();
                intent.putExtra("natige",c);
                intent.putExtra("name", name);
                //Toast.makeText(MainActivity.this,String.valueOf(name),Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


        /**************** txt 1 click *********************/
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt2.isFocused()) {
                    txt2.setText(txt2.getText().toString() + "0");
                } else if (txt1.isFocused()) {
                    txt1.setText(txt1.getText().toString()+"0");
                }

            }

        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt2.isFocused()) {
                    txt2.setText(txt2.getText().toString() + "1");
                } else if (txt1.isFocused()) {
                    txt1.setText(txt1.getText().toString()+"1");
                }

            }

        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt2.isFocused()) {
                    txt2.setText(txt2.getText().toString() + "2");
                } else if (txt1.isFocused()) {
                    txt1.setText(txt1.getText().toString()+"2");
                }

            }

        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt2.isFocused()) {
                    txt2.setText(txt2.getText().toString() + "3");
                } else if (txt1.isFocused()) {
                    txt1.setText(txt1.getText().toString()+"3");
                }

            }

        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt2.isFocused()) {
                    txt2.setText(txt2.getText().toString() + "4");
                } else if (txt1.isFocused()) {
                    txt1.setText(txt1.getText().toString()+"4");
                }

            }

        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt2.isFocused()) {
                    txt2.setText(txt2.getText().toString() + "5");
                } else if (txt1.isFocused()) {
                    txt1.setText(txt1.getText().toString()+"5");
                }

            }

        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt2.isFocused()) {
                    txt2.setText(txt2.getText().toString() + "6");
                } else if (txt1.isFocused()) {
                    txt1.setText(txt1.getText().toString()+"6");
                }

            }

        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt2.isFocused()) {
                    txt2.setText(txt2.getText().toString() + "7");
                } else if (txt1.isFocused()) {
                    txt1.setText(txt1.getText().toString()+"7");
                }

            }

        });


   b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt2.isFocused()) {
                    txt2.setText(txt2.getText().toString() + "8");
                } else if (txt1.isFocused()) {
                    txt1.setText(txt1.getText().toString()+"8");
                }

            }

        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt2.isFocused()) {
                    txt2.setText(txt2.getText().toString() + "9");
                } else if (txt1.isFocused()) {
                    txt1.setText(txt1.getText().toString()+"9");
                }

            }

        });



    }
}