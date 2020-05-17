package com.example.hppavilion.faisdilemma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button id1Gray;
    Button id2Gray;
    Button id3Gray;
    Button id4Gray;
    Button id5Gray;
    Button id6Gray;
    Button id7Gray;
    Button id8Gray;
    Button id9Gray;
    Button id10Gray;
    Button id11Gray;
    Button id12Gray;
    Button id13Gray;
    Button id14Gray;
    Button id15Gray;
    Button id16Gray;
    Button id17Gray;
    Button id18Gray;
    Button id19Gray;
    Button id20Gray;
    Button id21Gray;
    Button id22Gray;
    Button id23Gray;
    Button id24Gray;
    Button id25Gray;
    Button id26Gray;
    Button id27Gray;
    Button id28Gray;
    Button id29Gray;
    Button id30Gray;

    //RED
    Button id1Red;
    Button id2Red;
    Button id3Red;
    Button id4Red;
    Button id5Red;
    Button id6Red;
    Button id7Red;
    Button id8Red;
    Button id9Red;
    Button id10Red;
    Button id11Red;
    Button id12Red;
    Button id13Red;
    Button id14Red;
    Button id15Red;
    Button id16Red;
    Button id17Red;
    Button id18Red;
    Button id19Red;
    Button id20Red;
    Button id21Red;
    Button id22Red;
    Button id23Red;
    Button id24Red;
    Button id25Red;
    Button id26Red;
    Button id27Red;
    Button id28Red;
    Button id29Red;
    Button id30Red;


    Button send;
    Button refresh;
    static int variable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        variable=0;
        //INITIALIZING GRAY BUTTONS
        id1Gray= (Button) findViewById(R.id.id1);
        id2Gray= (Button) findViewById(R.id.id2);
        id3Gray= (Button) findViewById(R.id.id3);
        id4Gray= (Button) findViewById(R.id.id4);
        id5Gray= (Button) findViewById(R.id.id5);
        id6Gray= (Button) findViewById(R.id.id6);
        id7Gray= (Button) findViewById(R.id.id7);
        id8Gray= (Button) findViewById(R.id.id8);
        id9Gray= (Button) findViewById(R.id.id9);
        id10Gray= (Button) findViewById(R.id.id10);
        id11Gray= (Button) findViewById(R.id.id11);
        id12Gray= (Button) findViewById(R.id.id12);
        id13Gray= (Button) findViewById(R.id.id13);
        id14Gray= (Button) findViewById(R.id.id14);
        id15Gray= (Button) findViewById(R.id.id15);
        id16Gray= (Button) findViewById(R.id.id16);
        id17Gray= (Button) findViewById(R.id.id17);
        id18Gray= (Button) findViewById(R.id.id18);
        id19Gray= (Button) findViewById(R.id.id19);
        id20Gray= (Button) findViewById(R.id.id20);
        id21Gray= (Button) findViewById(R.id.id21);
        id22Gray= (Button) findViewById(R.id.id22);
        id23Gray= (Button) findViewById(R.id.id23);
        id24Gray= (Button) findViewById(R.id.id24);
        id25Gray= (Button) findViewById(R.id.id25);
        id26Gray= (Button) findViewById(R.id.id26);
        id27Gray= (Button) findViewById(R.id.id27);
        id28Gray= (Button) findViewById(R.id.id28);
        id29Gray= (Button) findViewById(R.id.id29);
        id30Gray= (Button) findViewById(R.id.id30);

        //INITIALIZING RED BUTTONS
        id1Red= (Button) findViewById(R.id.id1red);
        id2Red= (Button) findViewById(R.id.id2red);
        id3Red= (Button) findViewById(R.id.id3red);
        id4Red= (Button) findViewById(R.id.id4red);
        id5Red= (Button) findViewById(R.id.id5red);
        id6Red= (Button) findViewById(R.id.id6red);
        id7Red= (Button) findViewById(R.id.id7red);
        id8Red= (Button) findViewById(R.id.id8red);
        id9Red= (Button) findViewById(R.id.id9red);
        id10Red= (Button) findViewById(R.id.id10red);
        id11Red= (Button) findViewById(R.id.id11red);
        id12Red= (Button) findViewById(R.id.id12red);
        id13Red= (Button) findViewById(R.id.id13red);
        id14Red= (Button) findViewById(R.id.id14red);
        id15Red= (Button) findViewById(R.id.id15red);
        id16Red= (Button) findViewById(R.id.id16red);
        id17Red= (Button) findViewById(R.id.id17red);
        id18Red= (Button) findViewById(R.id.id18red);
        id19Red= (Button) findViewById(R.id.id19red);
        id20Red= (Button) findViewById(R.id.id20red);
        id21Red= (Button) findViewById(R.id.id21red);
        id22Red= (Button) findViewById(R.id.id22red);
        id23Red= (Button) findViewById(R.id.id23red);
        id24Red= (Button) findViewById(R.id.id24red);
        id25Red= (Button) findViewById(R.id.id25red);
        id26Red= (Button) findViewById(R.id.id26red);
        id27Red= (Button) findViewById(R.id.id27red);
        id28Red= (Button) findViewById(R.id.id28red);
        id29Red= (Button) findViewById(R.id.id29red);
        id30Red= (Button) findViewById(R.id.id30red);


        send= (Button) findViewById(R.id.sendButton);
        refresh=(Button) findViewById(R.id.refreshButton);




        SetVisible();
        ClickingButton();
        SendButtonAction();
        RefreshButtonAction();


    }
    private void  SetVisible()
    {
        //SETTING INITIAL VISIBILITY
        id1Red.setVisibility(View.INVISIBLE);
        id2Red.setVisibility(View.INVISIBLE);
        id3Red.setVisibility(View.INVISIBLE);
        id4Red.setVisibility(View.INVISIBLE);
        id5Red.setVisibility(View.INVISIBLE);
        id6Red.setVisibility(View.INVISIBLE);
        id7Red.setVisibility(View.INVISIBLE);
        id8Red.setVisibility(View.INVISIBLE);
        id9Red.setVisibility(View.INVISIBLE);
        id10Red.setVisibility(View.INVISIBLE);
        id11Red.setVisibility(View.INVISIBLE);
        id12Red.setVisibility(View.INVISIBLE);
        id13Red.setVisibility(View.INVISIBLE);
        id14Red.setVisibility(View.INVISIBLE);
        id15Red.setVisibility(View.INVISIBLE);
        id16Red.setVisibility(View.INVISIBLE);
        id17Red.setVisibility(View.INVISIBLE);
        id18Red.setVisibility(View.INVISIBLE);
        id19Red.setVisibility(View.INVISIBLE);
        id20Red.setVisibility(View.INVISIBLE);
        id21Red.setVisibility(View.INVISIBLE);
        id22Red.setVisibility(View.INVISIBLE);
        id23Red.setVisibility(View.INVISIBLE);
        id24Red.setVisibility(View.INVISIBLE);
        id25Red.setVisibility(View.INVISIBLE);
        id26Red.setVisibility(View.INVISIBLE);
        id27Red.setVisibility(View.INVISIBLE);
        id28Red.setVisibility(View.INVISIBLE);
        id29Red.setVisibility(View.INVISIBLE);
        id30Red.setVisibility(View.INVISIBLE);




    }

    private void ClickingButton()
    {
        id1Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id1Gray.getVisibility()==View.VISIBLE)
                {
                    id1Red.setVisibility(View.VISIBLE);
                    id1Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id1Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id1Red.getVisibility()==View.VISIBLE)
                {
                    id1Red.setVisibility(View.INVISIBLE);
                    id1Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id2Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id2Gray.getVisibility()==View.VISIBLE)
                {
                    id2Red.setVisibility(View.VISIBLE);
                    id2Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id2Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id2Red.getVisibility()==View.VISIBLE)
                {
                    id2Red.setVisibility(View.INVISIBLE);
                    id2Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id3Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id3Gray.getVisibility()==View.VISIBLE)
                {
                    id3Red.setVisibility(View.VISIBLE);
                    id3Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id3Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id3Red.getVisibility()==View.VISIBLE)
                {
                    id3Red.setVisibility(View.INVISIBLE);
                    id3Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id4Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id4Gray.getVisibility()==View.VISIBLE)
                {
                    id4Red.setVisibility(View.VISIBLE);
                    id4Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id4Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id4Red.getVisibility()==View.VISIBLE)
                {
                    id4Red.setVisibility(View.INVISIBLE);
                    id4Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id5Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id5Gray.getVisibility()==View.VISIBLE)
                {
                    id5Red.setVisibility(View.VISIBLE);
                    id5Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id5Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id5Red.getVisibility()==View.VISIBLE)
                {
                    id5Red.setVisibility(View.INVISIBLE);
                    id5Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id6Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id6Gray.getVisibility()==View.VISIBLE)
                {
                    id6Red.setVisibility(View.VISIBLE);
                    id6Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id6Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id6Red.getVisibility()==View.VISIBLE)
                {
                    id6Red.setVisibility(View.INVISIBLE);
                    id6Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id7Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id7Gray.getVisibility()==View.VISIBLE)
                {
                    id7Red.setVisibility(View.VISIBLE);
                    id7Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id7Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id7Red.getVisibility()==View.VISIBLE)
                {
                    id7Red.setVisibility(View.INVISIBLE);
                    id7Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id8Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id8Gray.getVisibility()==View.VISIBLE)
                {
                    id8Red.setVisibility(View.VISIBLE);
                    id8Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id8Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id8Red.getVisibility()==View.VISIBLE)
                {
                    id8Red.setVisibility(View.INVISIBLE);
                    id8Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id9Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id9Gray.getVisibility()==View.VISIBLE)
                {
                    id9Red.setVisibility(View.VISIBLE);
                    id9Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id9Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id9Red.getVisibility()==View.VISIBLE)
                {
                    id9Red.setVisibility(View.INVISIBLE);
                    id9Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id10Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id10Gray.getVisibility()==View.VISIBLE)
                {
                    id10Red.setVisibility(View.VISIBLE);
                    id10Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id10Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id10Red.getVisibility()==View.VISIBLE)
                {
                    id10Red.setVisibility(View.INVISIBLE);
                    id10Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id11Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id11Gray.getVisibility()==View.VISIBLE)
                {
                    id11Red.setVisibility(View.VISIBLE);
                    id11Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id11Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id11Red.getVisibility()==View.VISIBLE)
                {
                    id11Red.setVisibility(View.INVISIBLE);
                    id11Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id12Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id12Gray.getVisibility()==View.VISIBLE)
                {
                    id12Red.setVisibility(View.VISIBLE);
                    id12Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id12Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id12Red.getVisibility()==View.VISIBLE)
                {
                    id12Red.setVisibility(View.INVISIBLE);
                    id12Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id13Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id13Gray.getVisibility()==View.VISIBLE)
                {
                    id13Red.setVisibility(View.VISIBLE);
                    id13Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id13Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id13Red.getVisibility()==View.VISIBLE)
                {
                    id13Red.setVisibility(View.INVISIBLE);
                    id13Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id14Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id14Gray.getVisibility()==View.VISIBLE)
                {
                    id14Red.setVisibility(View.VISIBLE);
                    id14Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id14Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id14Red.getVisibility()==View.VISIBLE)
                {
                    id14Red.setVisibility(View.INVISIBLE);
                    id14Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id15Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id15Gray.getVisibility()==View.VISIBLE)
                {
                    id15Red.setVisibility(View.VISIBLE);
                    id15Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id15Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id15Red.getVisibility()==View.VISIBLE)
                {
                    id15Red.setVisibility(View.INVISIBLE);
                    id15Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id16Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id16Gray.getVisibility()==View.VISIBLE)
                {
                    id16Red.setVisibility(View.VISIBLE);
                    id16Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id16Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id16Red.getVisibility()==View.VISIBLE)
                {
                    id16Red.setVisibility(View.INVISIBLE);
                    id16Gray.setVisibility(View.VISIBLE);
                }
            }
        });

        id17Gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id17Gray.getVisibility()==View.VISIBLE)
                {
                    id17Red.setVisibility(View.VISIBLE);
                    id17Gray.setVisibility(View.INVISIBLE);
                }
            }
        });
        id17Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id17Red.getVisibility()==View.VISIBLE)
                {
                    id17Red.setVisibility(View.INVISIBLE);
                    id17Gray.setVisibility(View.VISIBLE);
                }
            }
        });









    }

    private void SendButtonAction()
    {
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog();
                variable=1;
            }
        });
    }

    private void RefreshButtonAction()
    {
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog();
                variable=2;
            }
        });

    }
    private void OpenDialog()
    {
         Dialog dialog= new Dialog();
         dialog.show(getSupportFragmentManager(),"dialog");
    }

    public void OnBackPressedCallback() {
        super.onBackPressed();
        Intent intent = new Intent(this, SelectionPanel.class);
        startActivity(intent);

    }
}
