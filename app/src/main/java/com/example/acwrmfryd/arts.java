package com.example.acwrmfryd;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ExpandableListView;
import android.os.Bundle;

public class arts extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private ArtsExpendAdapter artsExpendAdapter;
    private String[] artsName = new String[]{"优美的名画","伟大的雕塑","似曾相识的雕塑","俊俏的名画","充满母爱的雕塑","光线的名画","出乎意料的雕塑","动人的名画","勇敢的名画","厉害的名画","名贵的名画","和煦的名画","婀娜的名画","学术性的名画","常见的名画","平静的名画","强健的名画","强壮的雕塑","很好的名画","惊人的名画","有名的名画","有趣的名画","武士的雕刻","沉默的名画","漂亮的名画","热闹的名画","珍贵的名画","石头颅雕塑","磅礴的名画","神圣的雕塑","神秘的名画","神秘的雕塑","端庄的名画","粗野的名画右半边","粗野的名画左半边","线索的雕塑","细致的名画","美丽的雕塑","肃穆的名画","舒适的名画","英挺的雕塑","远古的雕塑","闪烁的名画"};
    private int[] artsPic = new int[]{R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10,R.drawable.a11,R.drawable.a12,R.drawable.a13,R.drawable.a14,R.drawable.a15,R.drawable.a16,R.drawable.a17,R.drawable.a18,R.drawable.a19,R.drawable.a20,
            R.drawable.a21,R.drawable.a22,R.drawable.a23,R.drawable.a24,R.drawable.a25,R.drawable.a26,R.drawable.a27,R.drawable.a28,R.drawable.a29,R.drawable.a30,R.drawable.a31,R.drawable.a32,R.drawable.a33,R.drawable.a34,R.drawable.a35,R.drawable.a36,R.drawable.a37,R.drawable.a38,R.drawable.a39,R.drawable.a40,
            R.drawable.a41,R.drawable.a42,R.drawable.a43};

    private String[][] artsdetail = new String[][]{{"尺寸：2x2","类型：壁挂物","价格：4980"},
            {"尺寸：2x2","类型：无","价格：4980"},
            {"尺寸：1x1","类型：无","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：2x1","类型：无","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：2x1","类型：无","价格：4980"},
            {"尺寸：2x2","类型：壁挂物","价格：4980"},
            {"尺寸：2x1.5","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：2x2","类型：壁挂物","价格：4980"},
            {"尺寸：2x2","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：2x1","类型：无","价格：4980"},
            {"尺寸：2x1.5","类型：壁挂物","价格：4980"},
            {"尺寸：1x2","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：无","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：2x1","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：2x2","类型：无","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"},
            {"尺寸：2x2","类型：无","价格：4980"},
            {"尺寸：2x1","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：小物件","价格：4980"},
            {"尺寸：2x1.5","类型：壁挂物","价格：4980"},
            {"尺寸：2x1","类型：无","价格：4980"},
            {"尺寸：2x1","类型：无","价格：4980"},
            {"尺寸：2x1","类型：无","价格：4980"},
            {"尺寸：1x1","类型：无","价格：4980"},
            {"尺寸：2x1.5","类型：壁挂物","价格：4980"},
            {"尺寸：1x1","类型：无","价格：4980"},
            {"尺寸：1x2","类型：壁挂物","价格：4980"},
            {"尺寸：2x1","类型：壁挂物","价格：4980"},
            {"尺寸：2x2","类型：无","价格：4980"},
            {"尺寸：1x1","类型：小物件","价格：4980"},
            {"尺寸：1x1","类型：壁挂物","价格：4980"}
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts);
        expandableListView = findViewById(R.id.elvarts);
        artsExpendAdapter = new ArtsExpendAdapter(this, artsName,artsdetail,artsPic);
        expandableListView.setAdapter(artsExpendAdapter);

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
