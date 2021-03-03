package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.HashSet;

public class Showmenufromdatabase extends AppCompatActivity {

    ArrayList<String> input = new ArrayList<String>();
    ArrayList<String> nameofmenu = new ArrayList<String>();
    HashSet<String> inputset = new HashSet <String>();
    HashSet <String> conpareset = new HashSet <String>();
    HashSet <String> resultset = new HashSet <String>();

    int [] imgmenu = new int[] {R.id.imgmenu,R.id.imgmenu2,R.id.imgmenu3,R.id.imgmenu4,
                                R.id.imgmenu5,R.id.imgmenu6,R.id.imgmenu7,R.id.imgmenu8,
                                R.id.imgmenu9,R.id.imgmenu10};

    int [] textmenu = new int[] {R.id.textmenu,R.id.textmenu2,R.id.textmenu3,R.id.textmenu4,
                                 R.id.textmenu5,R.id.textmenu6,R.id.textmenu7,R.id.textmenu8,
                                 R.id.textmenu9,R.id.textmenu10};

    int [] menu = new int[] {R.id.menu1,R.id.menu2,R.id.menu3,R.id.menu4, // 0 1 2 3
                             R.id.menu5,R.id.menu6,R.id.menu7,R.id.menu8, // 4 5 6 7
                             R.id.menu9,R.id.menu10}; // 8 9 10 11

    public int index = 0;
    public int count = -1;
    String str = "";
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.showmenufromdatabase);

        String way = "menushow";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                String [] arrstr = Value.split("/");
                for(int i = 0 ; i < arrstr.length ; i++){
                    findName2(arrstr[i]);
                }
            }
            @Override
            public void onCancelled(DatabaseError error) {
            }
        });

        Button bt2 = (Button) findViewById(R.id.button3);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showmenufromdatabase2.class);
                startActivity(i);
            }
        });
        Button bt3 = (Button) findViewById(R.id.button4);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showmenufromdatabase3.class);
                startActivity(i);
            }
        });
        Button bt4 = (Button) findViewById(R.id.button5);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showmenufromdatabase4.class);
                startActivity(i);
            }
        });
        Button bt5 = (Button) findViewById(R.id.button6);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showmenufromdatabase5.class);
                startActivity(i);
            }
        });

        LinearLayout menu1 = (LinearLayout)findViewById(R.id.menu1);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                i.putExtra("name",nameofmenu.get(0));
                startActivity(i);
            }
        });
        LinearLayout menu2 = (LinearLayout)findViewById(R.id.menu2);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                i.putExtra("name",nameofmenu.get(1));
                startActivity(i);
            }
        });
        LinearLayout menu3 = (LinearLayout)findViewById(R.id.menu3);
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                i.putExtra("name",nameofmenu.get(2));

                startActivity(i);
            }
        });
        LinearLayout menu4 = (LinearLayout)findViewById(R.id.menu4);
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                i.putExtra("name",nameofmenu.get(3));

                startActivity(i);
            }
        });
        LinearLayout menu5 = (LinearLayout)findViewById(R.id.menu5);
        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                i.putExtra("name",nameofmenu.get(4));
                startActivity(i);
            }
        });
        LinearLayout menu6 = (LinearLayout)findViewById(R.id.menu6);
        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                i.putExtra("name",nameofmenu.get(5));
                startActivity(i);
            }
        });
        LinearLayout menu7 = (LinearLayout)findViewById(R.id.menu7);
        menu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                i.putExtra("name",nameofmenu.get(6));
                startActivity(i);
            }
        });
        LinearLayout menu8 = (LinearLayout)findViewById(R.id.menu8);
        menu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                i.putExtra("name",nameofmenu.get(7));
                startActivity(i);
            }
        });
        LinearLayout menu9 = (LinearLayout)findViewById(R.id.menu9);
        menu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                i.putExtra("name",nameofmenu.get(8));
                startActivity(i);
            }
        });
        LinearLayout menu10 = (LinearLayout)findViewById(R.id.menu10);
        menu10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                i.putExtra("name",nameofmenu.get(9));
                startActivity(i);
            }
        });
    }
    public void setBoxvisibilityGone(){
        for(int index = nameofmenu.size() ; index < 10 ; index++){
            LinearLayout linearlayout = (LinearLayout) findViewById(menu[index]);
            linearlayout.setVisibility(View.GONE);
        }
    }
    public void setBoxvisibilityVisible(){
        for(int index = 0 ; index < 10 ; index++){
            LinearLayout linearlayout = (LinearLayout) findViewById(menu[index]);
            linearlayout.setVisibility(View.VISIBLE);
        }
    }
    public void getAllingredient(){
        getIngredient("garlic");
        getIngredient("lemongrass");
        getIngredient("tomato");
        getIngredient("chinesecabbage");
        getIngredient("cabbage");
        getIngredient("chile");
        getIngredient("kaffirlimeleaves");
        getIngredient("yardlongbeans");
        getIngredient("carrot");
        getIngredient("lemon");
        getIngredient("babycorn");
        getIngredient("springonion");
        getIngredient("kale");
        getIngredient("onion");
        getIngredient("cucumber");
        getIngredient("ginger");
        getIngredient("galangal");
        getIngredient("blockkerry");
        getIngredient("coriander");
        getIngredient("holybasil");
        getIngredient("waterspinach");
        getIngredient("egg");
        getIngredient("shrimp");
        getIngredient("porkmeat");
        getIngredient("chickenbreast");
    }

    public void getIngredient(final String name){
        String way = "ingredientinput/" + name;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference(way); // "ingredientibput/garlic"

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                if(Value.equals("true")){
                    getInput(name);
                    changIndex();
                }

            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });
    }
    public void getInput(String name){
        input.add(name);
    }
    public void changIndex(){
        index = index+1;
    }
    public void loadInputtoset(){
        for(int i = 0 ; i < input.size() ; i++){
            inputset.add(input.get(i));
        }
    }


    public void compareandgetname(final String name){ // เอา input ที่ต้องการเปรียบเทียบมา
        String way = "menu/"+name+"/input";
        setBoxvisibilityVisible();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference(way); // "ingredientibput/garlic"

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                String[] arr2 = Value.split("/");
                conpareset.clear(); // เคลียร์ค่า
                resultset.clear();
                loadcompare(arr2); //โหลดค่าที่ต้องการเปรียบเทียบกับ input ที่เรามี รายการผักที่อยู่ใน data base
                findName(name); // หาว่าค่าที่มีกับค่าที่ต้องการเปรียบเทียบว่าสามรถเอามาแสดงได้หรือไม้ **เมนูนั้นๆมีวัตถุดิบตรงตามที่เราเลือกครบทุกอัน
            }
            @Override
            public void onCancelled(DatabaseError error) {

            }

        });
    }
    public void findName2(String name){
        setBoxvisibilityVisible();
        nameofmenu.add(name); // ถ้ามี จะต้องแอดชื่อเมนูนั้นๆไปยังอาเรย์ nameofmenu
        count++;
        if(count != -1){
            setImg(count);
        }
    }
    public void findName(String name){
        loadInputtoset();
        resultset = inputset;
        resultset.retainAll(conpareset);
        if(resultset.equals(conpareset)){
            // ************
            nameofmenu.add(name); // ถ้ามี จะต้องแอดชื่อเมนูนั้นๆไปยังอาเรย์ nameofmenu
            count++;
        }
        if(count != -1){
            setImg(count);
        }
    }
    public void loadcompare(String[] arr2){
        for(int i = 0 ; i < arr2.length ; i++){
            conpareset.add(arr2[i]);
        }
    }

    public void setImg(final int index){
        String name = nameofmenu.get(index); // ถ้ามีข้อมูลที่ index 1 ต้องเปลี่ยน
        String way = "menu/"+ name +"/img";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                Img(Value,index);

            }
            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
    }
    public void Img(String urlImg, final int index){
        ImageView imageView = (ImageView) findViewById(imgmenu[index]); // จะต้องเปลี่ยนตาม ช่องปัจจุบัน
        Picasso.with(this).load(urlImg).placeholder(R.mipmap.ic_loading)
                .error(R.mipmap.ic_loading)
                .into(imageView,new com.squareup.picasso.Callback(){

                    @Override
                    public void onSuccess() {
                        String name = nameofmenu.get(index); // ถ้ามีข้อมูลที่ index 1 ต้องเปลี่ยน
                        String way = "menu/"+ name +"/name";
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference(way);
                        myRef.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String Value = dataSnapshot.getValue(String.class);
                                TextView textView = (TextView) findViewById(textmenu[index]); // id จะต้องเปลี่ยนทุกครั้ง
                                textView.setText(Value);
                                setBoxvisibilityGone();

                            }
                            @Override
                            public void onCancelled(DatabaseError error) {

                            }
                        });
                    }

                    @Override
                    public void onError() {
                    }
                });
    }
}
