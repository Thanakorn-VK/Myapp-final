package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Food implements Comparable<Food>{
    int value;
    String name;
    public void setData(int c,String d){
        value=c;
        name=d;
    }
    public int getvalue() {
        return value;
    }
    public String getName() {
        return name;
    }
    public void showData(){
        System.out.print("Value = "+value + "  " + " Food Name = "+name);
        System.out.println();
    }
    public int compareTo(Food compareFood) {
        int comparevalue = ((Food) compareFood).getvalue();
        return this.value - comparevalue;
    }
}



public class popup_priority extends Activity {

    ArrayList<String> input = new ArrayList<String>();
    public int index = 0;
    int[] parameterinput = {0,0,0};
    int parameter_ingredient=5,parameter_type=5,parameter_time=5,parameter_level=5;
    String[] menu = {"chickenbreast/chile/garlic/holybasil",
            "chickenbreast/coriander/cucumber/garlic/ginger",
            "coriander/garlic/porkmeat/springonion",
            "porkmeat/coriander",
            "chile/chinesecabbage/egg/garlic/lemon/shrimp",
            "waterspinach/chile",
            "chile/garlic/holybasil/porkmeat",
            "carrot/egg/garlic/springonion",
            "shrimp/chile/egg/carrot/kale/garlic",
            "porkmeat/kaffirlimeleaves/lemongrass/chile/garlic"};

    String[] name = {"Chickenbasilfriedrice",   //  กระเพราไก่
            "Chickenrice",                      //  ข้าวมันไก่
            "MincedPorkBoiledRice",             //  ข้าวต้มหมู
            "Friedporkbelly",                   //หมูทอด
            "Padthaiwithshrimp",                //ผัดไทยกุ้งสด
            "Stirfriedmorningglory",            //ผัดผักบุ้ง
            "Porkbasilfriedrice",               //กระเพราหมู
            "eggfriedrice",                     //ข้างผัดไข่
            "Shrimp PasteFriedRice",            //ผัดน้ำพริกกุ้งเสียบ
            "SouthernStirFriedPork"};           //คั่วกิ้งหมู

    int[] time =     {1,2,2,1,2,1,1,1,1,2}; // 1 น้อยกว่า 30 : 2 ระหว่าง 30 กับ 60 : 3 มากกว่า 60
                   //{1,2,2,1,2,1,1,1,1,1};
    int[] category = {1,3,2,1,1,1,1,1,1,1}; // 1 ผัด : 2 ต้ม : 3 นึ่ง
                   //{1,2,2,1,2,1,1,1,1,1};
    int[] level =    {1,2,2,1,3,1,1,1,1,2}; // 1 ง่าย : 2 ปานกลาง : 3 ยาก


    Set<String> hash_Set1 = new HashSet<String>();
    Set<String> hash_Set2 = new HashSet<String>();


    boolean state1 = false;
    boolean state2 = false;
    boolean state3 = false;
    boolean state4 = false;
    boolean state_1 = true;
    boolean state_2 = true;
    boolean state_3 = true;
    boolean state_4 = true;
    boolean state_5 = true;
    boolean state_6 = true;
    boolean state_7 = true;
    boolean state_8 = true;
    boolean state_9 = true;

    RadioGroup radioGrouptype;
    RadioGroup radioGroupingre;
    RadioGroup radioGrouptime;
    RadioGroup radioGrouplevel;

    RadioButton radioButtontype;
    RadioButton radioButtoningre;
    RadioButton radioButtontime;
    RadioButton radioButtonlevel;



    public static int Calcurate(double Weight_Ingredient,double Weight_Time,double Weight_Category,double Weight_Level
            ,int Amount_Ingredient,boolean Check_Time,boolean Check_Category,boolean Check_Level){
        int Result;
        double Value = 0;
        double sum = Weight_Level + Weight_Category + Weight_Time + Weight_Ingredient;
        double Level = Weight_Level/sum;
        double Category = Weight_Category/sum;
        double Time = Weight_Time/sum;
        double Ingredient = Weight_Ingredient/sum;

        for(int i = 0 ; i < Amount_Ingredient ; i++){
            Value = Value + (Ingredient*Ingredient);
        }
        if (Check_Level) Value = Value + (Level*Level);

        if (Check_Category) Value = Value + (Category*Category);

        if (Check_Time) Value = Value + (Time*Time);
        Value = Math.sqrt(Value);
        Value = 1/(1+Value);
        Value = Value*10000;
        Result = (int)Value;
        Result = 10000 - Result;
        return Result;
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
    public void getMenustr(){
        Food[] obj = new Food[10];
        for(int i = 0 ; i < name.length ; i++){
            obj[i] = new Food();
        }
        int size;
        boolean a=false,b=false,c=false;
        for(int i = 0 ; i < name.length ; i++){
            a = true;
            b = true;
            c = true;
            for(int k = 0 ; k < input.size() ; k++){
                hash_Set1.add(input.get(k));
            }
            String[] arr = menu[i].split("/");
            for(int j = 0 ; j < arr.length ; j++){
                hash_Set2.add(arr[j]);
            }
            hash_Set1.removeAll(hash_Set2);
            if(time[i] == parameterinput[0]) a = false;
            if(category[i] == parameterinput[1]) b = false;
            if(level[i] == parameterinput[2]) c = false;
            size = hash_Set1.size();
            obj[i].setData(Calcurate(parameter_ingredient,parameter_time,parameter_type,parameter_level,size,a,b,c),name[i]);
            hash_Set2.clear();
            hash_Set1.clear();
        }
        Arrays.sort(obj);
        String str = "";

        // แบ่ง array เป็น 5 ชุด ชุดล่ะ 10 เมนูไปยัง menushow1 - menushow5
        for(Food i : obj){
            str = str + i.getName() + "/";
        }

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("menushow");
        myRef.setValue(str);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_priority);

        getAllingredient();

        Button button2 = (Button) findViewById(R.id.confirm);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMenustr();
                Intent i = new Intent(getApplicationContext(), Showmenufromdatabase.class);
                startActivity(i);
            }
        });
        /*------- กำหนดค่าต่างๆของเมนูที่ต้องการคำนวณ ----------*/


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        radioGrouptype = findViewById(R.id.type);

        radioGroupingre = findViewById(R.id.ingre);

        radioGrouptime = findViewById(R.id.time);

        radioGrouplevel = findViewById(R.id.level);


        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .9), (int) (height * .9));
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);


        Button popup_type = (Button) findViewById(R.id.popup2);
        popup_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state2) setBoxvisibilityGone2();
                else setBoxvisibility2();

                setBoxvisibilityGone1();
                setBoxvisibilityGone3();
                setBoxvisibilityGone4();
                state1 = false;
                state3 = false;
                state4 = false;
            }
        });
        Button popup_time = (Button) findViewById(R.id.popup3);
        popup_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state3) setBoxvisibilityGone3();
                else setBoxvisibility3();

                setBoxvisibilityGone2();
                setBoxvisibilityGone1();
                setBoxvisibilityGone4();
                state2 = false;
                state1 = false;
                state4 = false;
            }
        });
        Button popup_level = (Button) findViewById(R.id.popup4);
        popup_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state4) setBoxvisibilityGone4();
                else setBoxvisibility4();

                setBoxvisibilityGone2();
                setBoxvisibilityGone3();
                setBoxvisibilityGone1();
                state2 = false;
                state3 = false;
                state1 = false;
            }
        });

        /*................................................................................*/
        Button b_puff = (Button) findViewById(R.id.puff);
        Button b_boiled = (Button) findViewById(R.id.boiled);
        Button b_fried = (Button) findViewById(R.id.fried);

        Button b_min30 = (Button) findViewById(R.id.min30);
        Button b_min3060 = (Button) findViewById(R.id.min3060);
        Button b_min60 = (Button) findViewById(R.id.min60);

        Button b_easy = (Button) findViewById(R.id.easy);
        Button b_moderate = (Button) findViewById(R.id.moderate);
        Button b_difficult = (Button) findViewById(R.id.difficult);

        b_puff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state_1) {
                    parameterinput[1] = 1;
                }
            }
        });

        b_boiled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state_2) {
                    parameterinput[1] = 2;
                }
            }
        });

        b_fried.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state_3) {
                    parameterinput[1] = 3;
                }
            }
        });

        b_min30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state_4) {
                    parameterinput[0] = 1;
                }
            }
        });

        b_min3060.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state_5) {
                    parameterinput[0] = 2;
                }
            }
        });

        b_min60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state_6) {
                    parameterinput[0] = 3;
                }
            }
        });

        b_easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state_7) {
                    parameterinput[2] = 1;
                }
            }
        });

        b_moderate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state_8) {
                    parameterinput[2] = 2;
                }
            }
        });

        b_difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state_9) {
                    parameterinput[2] = 3;
                }
            }
        });
    }

    public void setBoxvisibilityGone1() {
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page1);
        linearlayout.setVisibility(View.GONE);
        state1 = false;
    }

    public void setBoxvisibility1() {
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page1);
        linearlayout.setVisibility(View.VISIBLE);
        state1 = true;
    }

    public void setBoxvisibilityGone2() {
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page2);
        linearlayout.setVisibility(View.GONE);
        state2 = false;
    }

    public void setBoxvisibility2() {
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page2);
        linearlayout.setVisibility(View.VISIBLE);
        state2 = true;
    }

    public void setBoxvisibilityGone3() {
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page3);
        linearlayout.setVisibility(View.GONE);
        state3 = false;
    }

    public void setBoxvisibility3() {
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page3);
        linearlayout.setVisibility(View.VISIBLE);
        state3 = true;
    }

    public void setBoxvisibilityGone4() {
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page4);
        linearlayout.setVisibility(View.GONE);
        state4 = false;
    }

    public void setBoxvisibility4() {
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page4);
        linearlayout.setVisibility(View.VISIBLE);
        state4 = true;
    }

    public void checkButton(View v) {
        int radioIdtype = radioGrouptype.getCheckedRadioButtonId();
        radioButtontype = findViewById(radioIdtype);
        if(radioButtontype.getText().equals("1")) parameter_type = 1;

        if(radioButtontype.getText().equals("2")) parameter_type = 2;

        if(radioButtontype.getText().equals("3")) parameter_type = 3;

        if(radioButtontype.getText().equals("4")) parameter_type = 4;

        if(radioButtontype.getText().equals("5")) parameter_type = 5;
    }
    public void checkButton2(View v) {

        int radioIdingre = radioGroupingre.getCheckedRadioButtonId();
        radioButtoningre = findViewById(radioIdingre);
        if(radioButtoningre.getText().equals("1")) parameter_ingredient = 1;

        if(radioButtoningre.getText().equals("2")) parameter_ingredient = 2;

        if(radioButtoningre.getText().equals("3")) parameter_ingredient = 3;

        if(radioButtoningre.getText().equals("4")) parameter_ingredient = 4;

        if(radioButtoningre.getText().equals("5")) parameter_ingredient = 5;
    }
    public void checkButton3(View v) {

        int radioIdtime = radioGrouptime.getCheckedRadioButtonId();
        radioButtontime = findViewById(radioIdtime);
        if(radioButtontime.getText().equals("1")) parameter_time = 1;

        if(radioButtontime.getText().equals("2")) parameter_time = 2;

        if(radioButtontime.getText().equals("3")) parameter_time = 3;

        if(radioButtontime.getText().equals("4")) parameter_time = 4;

        if(radioButtontime.getText().equals("5")) parameter_time = 5;
    }
    public void checkButton4(View v) {

        int radioIdlevel = radioGrouplevel.getCheckedRadioButtonId();
        radioButtonlevel = findViewById(radioIdlevel);
        if(radioButtonlevel.getText().equals("1")) parameter_level = 1;

        if(radioButtonlevel.getText().equals("2")) parameter_level = 2;

        if(radioButtonlevel.getText().equals("3")) parameter_level = 3;

        if(radioButtonlevel.getText().equals("4")) parameter_level = 4;

        if(radioButtonlevel.getText().equals("5")) parameter_level = 5;
    }

}
