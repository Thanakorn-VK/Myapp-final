package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



public class Ingredient extends AppCompatActivity {
    int [] Img = new int[] {    R.drawable.garlic,R.drawable.tomato,R.drawable.lemongrass,R.drawable.chinesecabbage,
                                R.drawable.cabbage,R.drawable.chile,R.drawable.kaffirlimeleaves,R.drawable.yardlongbeans,
                                R.drawable.carrot,R.drawable.lemon,R.drawable.babycorn,R.drawable.springonion,
                                R.drawable.kale,R.drawable.onion,R.drawable.cucumber,R.drawable.ginger,
                                R.drawable.galangal,R.drawable.blockkerry,R.drawable.coriander,R.drawable.holybasil,
                                R.drawable.waterspinach,R.drawable.egg,R.drawable.shrimp,R.drawable.porkmeat,
                                R.drawable.chickenbreast};
    public int index = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingredient);
        Toast.makeText(getApplicationContext(), "read data", Toast.LENGTH_LONG).show();
        //getStatus("ใบมะกรูด");
        getStatus("garlic");
        getStatus("lemongrass");
        getStatus("tomato");
        getStatus("chinesecabbage");
        getStatus("cabbage");
        getStatus("chile");
        getStatus("kaffirlimeleaves");
        getStatus("yardlongbeans");
        getStatus("carrot");
        getStatus("lemon");
        getStatus("babycorn");
        getStatus("springonion");
        getStatus("kale");
        getStatus("onion");
        getStatus("cucumber");
        getStatus("ginger");
        getStatus("galangal");
        getStatus("blockkerry");
        getStatus("coriander");
        getStatus("holybasil");
        getStatus("waterspinach");
        getStatus("egg");
        getStatus("shrimp");
        getStatus("porkmeat");
        getStatus("chickenbreast");

        Button buttonNextChoose = (Button) findViewById(R.id.testtochoose);
        buttonNextChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Chooseingredient.class);
                startActivity(i);
            }
        });
    }



    public int chooseName(final String To){
        switch (To){
            case "garlic":              return 0;
            case "tomato":              return 1;
            case "lemongrass":          return 2;
            case "chinesecabbage":      return 3;
            case "cabbage":             return 4;
            case "chile":               return 5;
            case "kaffirlimeleaves":    return 6;
            case "yardlongbeans":       return 7;
            case "carrot":              return 8;
            case "lemon":               return 9;
            case "babycorn":            return 10;
            case "springonion":         return 11;
            case "kale":                return 12;
            case "onion":               return 13;
            case "cucumber":            return 14;
            case "ginger":              return 15;
            case "galangal":            return 16;
            case "blockkerry":          return 17;
            case "coriander":           return 18;
            case "holybasil":           return 19;
            case "waterspinach":        return 20;
            case "egg":                 return 21;
            case "shrimp":              return 22;
            case "porkmeat":            return 23;
            case "chickenbreast":       return 24;
            default:
                // code block
        }
        return 1;
    }
    public void getStatus(final String To){
        String way = "ingredient/"+To+"/status";
        final int selectIMG;
        selectIMG = chooseName(To);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                if(Value.equals("yes")) {
                    switch(index) {
                        case 1:
                            ImageView imageView1 = (ImageView) findViewById(R.id.img1);
                            imageView1.setImageResource(Img[selectIMG]);
                            TextView textView1 = (TextView) findViewById(R.id.box1);
                            textView1.setText(To);
                            incIndex();
                            break;
                        case 2:
                            ImageView imageView2 = (ImageView) findViewById(R.id.img2);
                            imageView2.setImageResource(Img[selectIMG]);
                            TextView textView2 = (TextView) findViewById(R.id.box2);
                            textView2.setText(To);
                            incIndex();
                            break;
                        case 3:
                            ImageView imageView3 = (ImageView) findViewById(R.id.img3);
                            imageView3.setImageResource(Img[selectIMG]);
                            TextView textView3 = (TextView) findViewById(R.id.box3);
                            textView3.setText(To);
                            incIndex();
                            break;
                        case 4:
                            ImageView imageView4 = (ImageView) findViewById(R.id.img4);
                            imageView4.setImageResource(Img[selectIMG]);
                            TextView textView4 = (TextView) findViewById(R.id.box4);
                            textView4.setText(To);
                            incIndex();
                            break;
                        case 5:
                            ImageView imageView5 = (ImageView) findViewById(R.id.img5);
                            imageView5.setImageResource(Img[selectIMG]);
                            TextView textView5 = (TextView) findViewById(R.id.box5);
                            textView5.setText(To);
                            incIndex();
                            break;
                        case 6:
                            ImageView imageView6 = (ImageView) findViewById(R.id.img6);
                            imageView6.setImageResource(Img[selectIMG]);
                            TextView textView6 = (TextView) findViewById(R.id.box6);
                            textView6.setText(To);

                            incIndex();
                            break;
                        case 7:
                            ImageView imageView7 = (ImageView) findViewById(R.id.img7);
                            imageView7.setImageResource(Img[selectIMG]);
                            TextView textView7 = (TextView) findViewById(R.id.box7);
                            textView7.setText(To);
                            incIndex();
                            break;
                        case 8:
                            ImageView imageView8 = (ImageView) findViewById(R.id.img8);
                            imageView8.setImageResource(Img[selectIMG]);
                            TextView textView8 = (TextView) findViewById(R.id.box8);
                            textView8.setText(To);
                            incIndex();
                            break;
                        case 9:
                            ImageView imageView9 = (ImageView) findViewById(R.id.img9);
                            imageView9.setImageResource(Img[selectIMG]);
                            TextView textView9 = (TextView) findViewById(R.id.box9);
                            textView9.setText(To);
                            incIndex();
                            break;
                        case 10:
                            ImageView imageView10 = (ImageView) findViewById(R.id.img10);
                            imageView10.setImageResource(Img[selectIMG]);
                            TextView textView10 = (TextView) findViewById(R.id.box10);
                            textView10.setText(To);
                            incIndex();
                            break;
                        case 11:
                            ImageView imageView11 = (ImageView) findViewById(R.id.img11);
                            imageView11.setImageResource(Img[selectIMG]);
                            TextView textView11 = (TextView) findViewById(R.id.box11);
                            textView11.setText(To);
                            incIndex();
                            break;
                        case 12:
                            ImageView imageView12 = (ImageView) findViewById(R.id.img12);
                            imageView12.setImageResource(Img[selectIMG]);
                            TextView textView12 = (TextView) findViewById(R.id.box12);
                            textView12.setText(To);
                            incIndex();
                            break;
                        case 13:
                            ImageView imageView13 = (ImageView) findViewById(R.id.img13);
                            imageView13.setImageResource(Img[selectIMG]);
                            TextView textView13 = (TextView) findViewById(R.id.box13);
                            textView13.setText(To);
                            incIndex();
                            break;
                        case 14:
                            ImageView imageView14 = (ImageView) findViewById(R.id.img14);
                            imageView14.setImageResource(Img[selectIMG]);
                            TextView textView14 = (TextView) findViewById(R.id.box14);
                            textView14.setText(To);
                            incIndex();
                            break;
                        case 15:
                            ImageView imageView15 = (ImageView) findViewById(R.id.img15);
                            imageView15.setImageResource(Img[selectIMG]);
                            TextView textView15 = (TextView) findViewById(R.id.box15);
                            textView15.setText(To);
                            incIndex();
                            break;
                        case 16:
                            ImageView imageView16 = (ImageView) findViewById(R.id.img16);
                            imageView16.setImageResource(Img[selectIMG]);
                            TextView textView16 = (TextView) findViewById(R.id.box16);
                            textView16.setText(To);
                            incIndex();
                            break;
                        case 17:
                            ImageView imageView17 = (ImageView) findViewById(R.id.img17);
                            imageView17.setImageResource(Img[selectIMG]);
                            TextView textView17 = (TextView) findViewById(R.id.box17);
                            textView17.setText(To);
                            incIndex();
                            break;
                        case 18:
                            ImageView imageView18 = (ImageView) findViewById(R.id.img18);
                            imageView18.setImageResource(Img[selectIMG]);
                            TextView textView18 = (TextView) findViewById(R.id.box18);
                            textView18.setText(To);
                            incIndex();
                            break;
                        case 19:
                            ImageView imageView19 = (ImageView) findViewById(R.id.img19);
                            imageView19.setImageResource(Img[selectIMG]);
                            TextView textView19 = (TextView) findViewById(R.id.box19);
                            textView19.setText(To);
                            incIndex();
                            break;
                        case 20:
                            ImageView imageView20 = (ImageView) findViewById(R.id.img20);
                            imageView20.setImageResource(Img[selectIMG]);
                            TextView textView20 = (TextView) findViewById(R.id.box20);
                            textView20.setText(To);
                            incIndex();
                            break;
                        case 21:
                            ImageView imageView21 = (ImageView) findViewById(R.id.img21);
                            imageView21.setImageResource(Img[selectIMG]);
                            TextView textView21 = (TextView) findViewById(R.id.box21);
                            textView21.setText(To);
                            incIndex();
                            break;
                        case 22:
                            ImageView imageView22 = (ImageView) findViewById(R.id.img22);
                            imageView22.setImageResource(Img[selectIMG]);
                            TextView textView22 = (TextView) findViewById(R.id.box22);
                            textView22.setText(To);
                            incIndex();
                            break;
                        case 23:
                            ImageView imageView23 = (ImageView) findViewById(R.id.img23);
                            imageView23.setImageResource(Img[selectIMG]);
                            TextView textView23 = (TextView) findViewById(R.id.box23);
                            textView23.setText(To);
                            incIndex();
                            break;
                        case 24:
                            ImageView imageView24 = (ImageView) findViewById(R.id.img24);
                            imageView24.setImageResource(Img[selectIMG]);
                            TextView textView24 = (TextView) findViewById(R.id.box24);
                            textView24.setText(To);
                            incIndex();
                            break;
                        case 25:
                            ImageView imageView25 = (ImageView) findViewById(R.id.img25);
                            imageView25.setImageResource(Img[selectIMG]);
                            TextView textView25 = (TextView) findViewById(R.id.box25);
                            textView25.setText(To);
                            incIndex();
                            break;
                        default:
                            // code block
                    }
                }
                else {
                    return;
                }
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });

    }
    public void setImg(final String To) { // function is worked !!
        String way = "ingredient/"+To+"/status";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                if(Value.equals("yes")) {
                    switch(index) {
                        case 1:
                            TextView textView1 = (TextView) findViewById(R.id.box1);
                            textView1.setText(To);
                            incIndex();
                            break;
                        case 2:
                            TextView textView2 = (TextView) findViewById(R.id.box2);
                            textView2.setText(To);
                            incIndex();
                            break;
                        case 3:
                            TextView textView3 = (TextView) findViewById(R.id.box3);
                            textView3.setText(To);
                            incIndex();
                            break;
                        case 4:
                            TextView textView4 = (TextView) findViewById(R.id.box4);
                            textView4.setText(To);
                            incIndex();
                            break;
                        case 5:
                            TextView textView5 = (TextView) findViewById(R.id.box5);
                            textView5.setText(To);
                            incIndex();
                            break;
                        case 6:
                            TextView textView6 = (TextView) findViewById(R.id.box6);
                            textView6.setText(To);
                            incIndex();
                            break;
                        case 7:
                            TextView textView7 = (TextView) findViewById(R.id.box7);
                            textView7.setText(To);
                            incIndex();
                            break;
                        case 8:
                            TextView textView8 = (TextView) findViewById(R.id.box8);
                            textView8.setText(To);
                            incIndex();
                            break;
                        case 9:
                            TextView textView9 = (TextView) findViewById(R.id.box9);
                            textView9.setText(To);
                            incIndex();
                            break;
                        case 10:
                            TextView textView10 = (TextView) findViewById(R.id.box10);
                            textView10.setText(To);
                            incIndex();
                            break;
                        case 11:
                            TextView textView11 = (TextView) findViewById(R.id.box11);
                            textView11.setText(To);
                            incIndex();
                            break;
                        case 12:
                            TextView textView12 = (TextView) findViewById(R.id.box12);
                            textView12.setText(To);
                            incIndex();
                            break;
                        case 13:
                            TextView textView13 = (TextView) findViewById(R.id.box13);
                            textView13.setText(To);
                            incIndex();
                            break;
                        case 14:
                            TextView textView14 = (TextView) findViewById(R.id.box14);
                            textView14.setText(To);
                            incIndex();
                            break;
                        case 15:
                            TextView textView15 = (TextView) findViewById(R.id.box15);
                            textView15.setText(To);
                            incIndex();
                            break;
                        case 16:
                            TextView textView16 = (TextView) findViewById(R.id.box16);
                            textView16.setText(To);
                            incIndex();
                            break;
                        case 17:
                            TextView textView17 = (TextView) findViewById(R.id.box17);
                            textView17.setText(To);
                            incIndex();
                            break;
                        case 18:
                            TextView textView18 = (TextView) findViewById(R.id.box18);
                            textView18.setText(To);
                            incIndex();
                            break;
                        case 19:
                            TextView textView19 = (TextView) findViewById(R.id.box19);
                            textView19.setText(To);
                            incIndex();
                            break;
                        case 20:
                            TextView textView20 = (TextView) findViewById(R.id.box20);
                            textView20.setText(To);
                            incIndex();
                            break;
                        case 21:
                            TextView textView21 = (TextView) findViewById(R.id.box21);
                            textView21.setText(To);
                            incIndex();
                            break;
                        case 22:
                            TextView textView22 = (TextView) findViewById(R.id.box22);
                            textView22.setText(To);
                            incIndex();
                            break;
                        case 23:
                            TextView textView23 = (TextView) findViewById(R.id.box23);
                            textView23.setText(To);
                            incIndex();
                            break;
                        case 24:
                            TextView textView24 = (TextView) findViewById(R.id.box24);
                            textView24.setText(To);
                            incIndex();
                            break;
                        default:
                            // code block
                    }
                }
                else {
                    return;
                }
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });

    }
    public void incIndex() {
        index = index + 1;
    }

}
