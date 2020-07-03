package com.example.acwrmfryd;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ExpandableListView;
import android.os.Bundle;

public class people extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private PeopleExpendAdapter peopleExpendAdapter;
    private String[] peopleName = new String[]{"阳明","阿诚","贵妃","丽婷","恰咪","铁熊","喳喳","妮雅","小雅","李彻","熊大叔","朝阳","凤尾","穆穆","安东尼","小酒窝","熊战士","巴克思","佩希","叽叽","茶茶丸"};
    private int[] peoplePic = new int[]{R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9,R.drawable.p10,R.drawable.p11,R.drawable.p12,R.drawable.p13,R.drawable.p14,R.drawable.p15,R.drawable.p16,R.drawable.p17,R.drawable.p18,R.drawable.p19,R.drawable.p20,
            R.drawable.p21};

    private String[][] peopledetail = new String[][]{{"性别：♂","性格：暴躁B型","种族：食蚁兽","生日：3月9日","口头禅：有的"},
            {"性别：♂","性格：运动B型","种族：食蚁兽","生日：10月20日","口头禅：真诚"},
            {"性别：♀","性格：成熟A型","种族：食蚁兽","生日：10月24日","口头禅：麻烦了"},
            {"性别：♀","性格：元气A型","种族：鸟","生日：4月18日","口头禅：山雀"},
            {"性别：♀","性格：大姐姐B型","种族：熊","生日：4月17日","口头禅：唷咻"},
            {"性别：♂","性格：暴躁A型","种族：熊","生日：7月1日","口头禅：嗯唔"},
            {"性别：♀","性格：成熟B型","种族：鸟","生日：12月4日","口头禅：喳"},
            {"性别：♀","性格：大姐姐A型","种族：熊","生日：1月16日","口头禅：呀呐"},
            {"性别：♀","性格：普通A型","种族：食蚁兽","生日：2月6日","口头禅：优雅"},
            {"性别：♂","性格：暴躁A型","种族：鸟","生日：1月27日","口头禅：贯彻"},
            {"性别：♂","性格：自恋A型","种族：熊","生日：9月27日","口头禅：咳咳"},
            {"性别：♂","性格：暴躁B型","种族：熊","生日：7月22日","口头禅：有喔"},
            {"性别：♂","性格：悠闲B型","种族：鸟","生日：3月4日","口头禅：如斯"},
            {"性别：♂","性格：暴躁B型","种族：熊","生日：7月31日","口头禅：熊熊"},
            {"性别：♂","性格：自恋A型","种族：食蚁兽","生日：5月19日","口头禅：欧啦"},
            {"性别：♀","性格：普通B型","种族：鸟","生日：3月12日","口头禅：脸红"},
            {"性别：♂","性格：自恋A型","种族：熊","生日：3月31日","口头禅：over"},
            {"性别：♂","性格：悠闲B型","种族：熊","生日：8月16日","口头禅：嗯是"},
            {"性别：♀","性格：元气B型","种族：食蚁兽","生日：11月9日","口头禅：希希"},
            {"性别：♀","性格：元气B型","种族：鸟","生日：7月13日","口头禅：叽"},
            {"性别：♂","性格：运动A型","种族：绵羊","生日：3月18日","口头禅：哇耶"}
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        expandableListView = findViewById(R.id.elvpeople);
        peopleExpendAdapter = new PeopleExpendAdapter(this, peopleName,peopledetail,peoplePic);
        expandableListView.setAdapter(peopleExpendAdapter);

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                int count = expandableListView.getExpandableListAdapter().getGroupCount();
                for(int j = 0; j < count; j++){
                    if(j != groupPosition){
                        expandableListView.collapseGroup(j);
                    }
                }
            }
        });
    }
}
