package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Ingredient extends AppCompatActivity {
    int [] Img = new int[] {    R.drawable.garlic,R.drawable.tomato,R.drawable.lemongrass,R.drawable.chinesecabbage,
                                R.drawable.cabbage,R.drawable.chile,R.drawable.kaffirlimeleaves,R.drawable.yardlongbeans,
                                R.drawable.carrot,R.drawable.lemon,R.drawable.babycorn,R.drawable.springonion,
                                R.drawable.kale,R.drawable.onion,R.drawable.cucumber,R.drawable.ginger,
                                R.drawable.galangal,R.drawable.blockkerry,R.drawable.coriander,R.drawable.holybasil,
                                R.drawable.waterspinach,R.drawable.egg,R.drawable.shrimp,R.drawable.porkmeat,
                                R.drawable.chickenbreast};
    public int index = 1;
    public String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingredient);


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
        getStatus("broccoli");
        getStatus("coriander");
        getStatus("holybasil");
        getStatus("waterspinach");
        getStatus("egg");
        getStatus("shrimp");
        getStatus("porkmeat");
        getStatus("chickenbreast");

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("setBT");
                myRef.setValue(str);

                Intent i = new Intent(getApplicationContext(), Chooseingredient.class);
                startActivity(i);
            }
        });
    }


    public String chooseName(final String To){
        switch (To){
            case "garlic":              return "กระเทียม";
            case "tomato":              return "มะเขือเทศ";
            case "lemongrass":          return "ตะไคร้";
            case "chinesecabbage":      return "ผักกาดขาว";
            case "cabbage":             return "กะหล่ำปลี";
            case "chile":               return "พริก";
            case "kaffirlimeleaves":    return "ใบมะกรูด";
            case "yardlongbeans":       return "ถั่วฝักยาว";
            case "carrot":              return "แครอท";
            case "lemon":               return "มะนาว";
            case "babycorn":            return "ข้าวโพดอ่อน";
            case "springonion":         return "ต้นหอม";
            case "kale":                return "คะน้า";
            case "onion":               return "หัวหอมใหญ่";
            case "cucumber":            return "แตงกวา";
            case "ginger":              return "ขิง";
            case "galangal":            return "ข่า";
            case "broccoli":            return "บร็อคโคลี่";
            case "coriander":           return "ผักชี";
            case "holybasil":           return "ใบกะเพรา";
            case "waterspinach":        return "ผักบุ้ง";
            case "egg":                 return "ไข่ไก่";
            case "shrimp":              return "กุ้งสด";
            case "porkmeat":            return "เนื้อหมู";
            case "chickenbreast":       return "เนื้อไก่";
            default:
                // code block
        }
        return "";
    }

    public int chooseImg(final String To){
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
            case "broccoli":            return 17;
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
        final String selectName;
        final int selectIMG;

        selectIMG = chooseImg(To);
        selectName = chooseName(To);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                if(Value.equals("true")) {
                    str = str + To + "/";
                    switch(index) {
                        case 1:
                            ImageView imageView1 = (ImageView) findViewById(R.id.img1);
                            imageView1.setImageResource(Img[selectIMG]);
                            TextView textView1 = (TextView) findViewById(R.id.box1);
                            textView1.setText(selectName);
                            incIndex();
                            break;
                        case 2:
                            ImageView imageView2 = (ImageView) findViewById(R.id.img2);
                            imageView2.setImageResource(Img[selectIMG]);
                            TextView textView2 = (TextView) findViewById(R.id.box2);
                            textView2.setText(selectName);
                            incIndex();
                            break;
                        case 3:
                            ImageView imageView3 = (ImageView) findViewById(R.id.img3);
                            imageView3.setImageResource(Img[selectIMG]);
                            TextView textView3 = (TextView) findViewById(R.id.box3);
                            textView3.setText(selectName);
                            incIndex();
                            break;
                        case 4:
                            ImageView imageView4 = (ImageView) findViewById(R.id.img4);
                            imageView4.setImageResource(Img[selectIMG]);
                            TextView textView4 = (TextView) findViewById(R.id.box4);
                            textView4.setText(selectName);
                            incIndex();
                            break;
                        case 5:
                            ImageView imageView5 = (ImageView) findViewById(R.id.img5);
                            imageView5.setImageResource(Img[selectIMG]);
                            TextView textView5 = (TextView) findViewById(R.id.box5);
                            textView5.setText(selectName);
                            incIndex();
                            break;
                        case 6:
                            ImageView imageView6 = (ImageView) findViewById(R.id.img6);
                            imageView6.setImageResource(Img[selectIMG]);
                            TextView textView6 = (TextView) findViewById(R.id.box6);
                            textView6.setText(selectName);

                            incIndex();
                            break;
                        case 7:
                            ImageView imageView7 = (ImageView) findViewById(R.id.img7);
                            imageView7.setImageResource(Img[selectIMG]);
                            TextView textView7 = (TextView) findViewById(R.id.box7);
                            textView7.setText(selectName);
                            incIndex();
                            break;
                        case 8:
                            ImageView imageView8 = (ImageView) findViewById(R.id.img8);
                            imageView8.setImageResource(Img[selectIMG]);
                            TextView textView8 = (TextView) findViewById(R.id.box8);
                            textView8.setText(selectName);
                            incIndex();
                            break;
                        case 9:
                            ImageView imageView9 = (ImageView) findViewById(R.id.img9);
                            imageView9.setImageResource(Img[selectIMG]);
                            TextView textView9 = (TextView) findViewById(R.id.box9);
                            textView9.setText(selectName);
                            incIndex();
                            break;
                        case 10:
                            ImageView imageView10 = (ImageView) findViewById(R.id.img10);
                            imageView10.setImageResource(Img[selectIMG]);
                            TextView textView10 = (TextView) findViewById(R.id.box10);
                            textView10.setText(selectName);
                            incIndex();
                            break;
                        case 11:
                            ImageView imageView11 = (ImageView) findViewById(R.id.img11);
                            imageView11.setImageResource(Img[selectIMG]);
                            TextView textView11 = (TextView) findViewById(R.id.box11);
                            textView11.setText(selectName);
                            incIndex();
                            break;
                        case 12:
                            ImageView imageView12 = (ImageView) findViewById(R.id.img12);
                            imageView12.setImageResource(Img[selectIMG]);
                            TextView textView12 = (TextView) findViewById(R.id.box12);
                            textView12.setText(selectName);
                            incIndex();
                            break;
                        case 13:
                            ImageView imageView13 = (ImageView) findViewById(R.id.img13);
                            imageView13.setImageResource(Img[selectIMG]);
                            TextView textView13 = (TextView) findViewById(R.id.box13);
                            textView13.setText(selectName);
                            incIndex();
                            break;
                        case 14:
                            ImageView imageView14 = (ImageView) findViewById(R.id.img14);
                            imageView14.setImageResource(Img[selectIMG]);
                            TextView textView14 = (TextView) findViewById(R.id.box14);
                            textView14.setText(selectName);
                            incIndex();
                            break;
                        case 15:
                            ImageView imageView15 = (ImageView) findViewById(R.id.img15);
                            imageView15.setImageResource(Img[selectIMG]);
                            TextView textView15 = (TextView) findViewById(R.id.box15);
                            textView15.setText(selectName);
                            incIndex();
                            break;
                        case 16:
                            ImageView imageView16 = (ImageView) findViewById(R.id.img16);
                            imageView16.setImageResource(Img[selectIMG]);
                            TextView textView16 = (TextView) findViewById(R.id.box16);
                            textView16.setText(selectName);
                            incIndex();
                            break;
                        case 17:
                            ImageView imageView17 = (ImageView) findViewById(R.id.img17);
                            imageView17.setImageResource(Img[selectIMG]);
                            TextView textView17 = (TextView) findViewById(R.id.box17);
                            textView17.setText(selectName);
                            incIndex();
                            break;
                        case 18:
                            ImageView imageView18 = (ImageView) findViewById(R.id.img18);
                            imageView18.setImageResource(Img[selectIMG]);
                            TextView textView18 = (TextView) findViewById(R.id.box18);
                            textView18.setText(selectName);
                            incIndex();
                            break;
                        case 19:
                            ImageView imageView19 = (ImageView) findViewById(R.id.img19);
                            imageView19.setImageResource(Img[selectIMG]);
                            TextView textView19 = (TextView) findViewById(R.id.box19);
                            textView19.setText(selectName);
                            incIndex();
                            break;
                        case 20:
                            ImageView imageView20 = (ImageView) findViewById(R.id.img20);
                            imageView20.setImageResource(Img[selectIMG]);
                            TextView textView20 = (TextView) findViewById(R.id.box20);
                            textView20.setText(selectName);
                            incIndex();
                            break;
                        case 21:
                            ImageView imageView21 = (ImageView) findViewById(R.id.img21);
                            imageView21.setImageResource(Img[selectIMG]);
                            TextView textView21 = (TextView) findViewById(R.id.box21);
                            textView21.setText(selectName);
                            incIndex();
                            break;
                        case 22:
                            ImageView imageView22 = (ImageView) findViewById(R.id.img22);
                            imageView22.setImageResource(Img[selectIMG]);
                            TextView textView22 = (TextView) findViewById(R.id.box22);
                            textView22.setText(selectName);
                            incIndex();
                            break;
                        case 23:
                            ImageView imageView23 = (ImageView) findViewById(R.id.img23);
                            imageView23.setImageResource(Img[selectIMG]);
                            TextView textView23 = (TextView) findViewById(R.id.box23);
                            textView23.setText(selectName);
                            incIndex();
                            break;
                        case 24:
                            ImageView imageView24 = (ImageView) findViewById(R.id.img24);
                            imageView24.setImageResource(Img[selectIMG]);
                            TextView textView24 = (TextView) findViewById(R.id.box24);
                            textView24.setText(selectName);
                            incIndex();
                            break;
                        case 25:
                            ImageView imageView25 = (ImageView) findViewById(R.id.img25);
                            imageView25.setImageResource(Img[selectIMG]);
                            TextView textView25 = (TextView) findViewById(R.id.box25);
                            textView25.setText(selectName);
                            incIndex();
                            break;
                        default:
                    }
                }
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });

    }
    public static String[] Sort_by_Name_AtoZ(String[] b){
        Arrays.sort(b);
        return b;
    }
    public static String[] Sort_by_Name_ZtoA(String[] b){
        Arrays.sort(b, Collections.reverseOrder());
        return b;
    }

    CalculatorStandardEuclideanDistance cal = new CalculatorStandardEuclideanDistance();

    public double Calculator_Similarity_meaure(double n,double[] X,double[] Y){
        double result = 0;
        result = 1/(1+cal.Calculator_Standard_Euclidean_Distance(n,X,Y));
        return result;
    }
    public void incIndex() {
        index = index + 1;
    }
}
