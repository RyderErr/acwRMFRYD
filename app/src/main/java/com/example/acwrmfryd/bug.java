package com.example.acwrmfryd;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ExpandableListView;
import android.os.Bundle;

public class bug extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private BugExpendAdapter bugExpendAdapter;
    private String[] bugName = new String[]{"白粉蝶","斑缘点粉蝶","凤蝶","乌鸦凤蝶","青带凤蝶","大白斑蝶","大紫蛱蝶","大桦斑蝶","大蓝闪蝶","彩袄蛱蝶","红颈凤蝶","亚历山大凤蝶","飞蛾","皇蛾","日落蛾","中华剑角蝗","飞蝗","稻蝗","蚱蜢","蟋蟀","铃虫","螳螂","兰花螳螂","蜜蜂","黄蜂","油蝉","斑透翅蝉","熊蝉","寒蝉","暮蝉","蝉蜕","红蜻蜓","绿胸晏蜓","无霸勾蜓","豆娘","萤火虫","蝼蛄","水黾","龙虱","田鳖","椿象","人面椿象","瓢虫","虎甲虫","吉丁虫","提琴虫","星天牛","琉璃星天牛","宝石象鼻虫","蜣螂","雪隐金龟","宝石金龟","日铜锣花金龟","歌利亚大角金龟","锯锹形虫","深山锹形虫","大锹形虫","彩虹锹形虫","细身赤锹形虫","黄金鬼锹形虫","长颈鹿锯锹形虫","独角仙","高卡萨斯南洋大兜虫","象兜虫","长戟大兜虫","竹节虫","叶竹节虫","蓑衣虫","蚂蚁","寄居蟹","海蟑螂","苍蝇","蚊子","跳蚤","蜗牛","鼠妇","蜈蚣","蜘蛛","狼蛛","蝎子"};
    private int[] bugPic = new int[]{R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6,R.drawable.b7,R.drawable.b8,R.drawable.b9,R.drawable.b10,R.drawable.b11,R.drawable.b12,R.drawable.b13,R.drawable.b14,R.drawable.b15,R.drawable.b16,R.drawable.b17,R.drawable.b18,R.drawable.b19,R.drawable.b20,
            R.drawable.b21,R.drawable.b22,R.drawable.b23,R.drawable.b24,R.drawable.b25,R.drawable.b26,R.drawable.b27,R.drawable.b29,R.drawable.b30,R.drawable.b31,R.drawable.b32,R.drawable.b33,R.drawable.b34,R.drawable.b35,R.drawable.b36,R.drawable.b37,R.drawable.b38,R.drawable.b39,R.drawable.b40,
            R.drawable.b41,R.drawable.b42,R.drawable.b43,R.drawable.b44,R.drawable.b45,R.drawable.b46,R.drawable.b47,R.drawable.b48,R.drawable.b49,R.drawable.b50,R.drawable.b51,R.drawable.b52,R.drawable.b53,R.drawable.b54,R.drawable.b55,R.drawable.b56,R.drawable.b57,R.drawable.b58,R.drawable.b59,R.drawable.b60,
            R.drawable.b61,R.drawable.b62,R.drawable.b63,R.drawable.b64,R.drawable.b65,R.drawable.b66,R.drawable.b67,R.drawable.b68,R.drawable.b69,R.drawable.b70,R.drawable.b71,R.drawable.b72,R.drawable.b73,R.drawable.b74,R.drawable.b75,R.drawable.b76,R.drawable.b77,R.drawable.b78,R.drawable.b79,R.drawable.b80,R.drawable.b81};

    private String[][] bugdetail = new String[][]{{"出现场所：绿地（飞行）","天气：雨雪天除外","北半球月份：1，2，3，4，5，6，9，10，11，12","南半球月份：3，4，5，6，7，8，9，10，11，12","出现时间：4点至19点","出售价格：160"},
            {"出现场所：绿地（飞行）","天气：雨雪天除外","北半球月份：3，4，5，6，9，10","南半球月份：9，10，11，12，3，4","出现时间：4点至19点","出售价格：160"},
            {"出现场所：绿地（飞行）","天气：雨雪天除外","北半球月份：3，4，5，6，7，8，9","南半球月份：9，8，7，6，5，4，3","出现时间：4点至19点","出售价格：240"},
            {"出现场所：绿地（飞行）异色花","天气：雨雪天除外","北半球月份：3，4，5，6","南半球月份：9，10，11，12","出现时间：4点至20点","出售价格：2500"},
            {"出现场所：绿地（飞行）","天气：雨雪天除外","北半球月份：4，5，6，7，8","南半球月份：10，11，12，1，2","出现时间：4点至20点","出售价格：300"},
            {"出现场所：绿地（飞行）","天气：雨雪天除外","北半球月份：全年","南半球月份：全年","出现时间：8点至19点","出售价格：1000"},
            {"出现场所：绿地（飞行）","天气：无","北半球月份：5，6，7，8","南半球月份：11，12，1，2","出现时间：4点至19点","出售价格：3000"},
            {"出现场所：绿地（飞行）","天气：雨雪天除外","北半球月份：9，10，11","南半球月份：3，4，5","出现时间：4点至17点","出售价格：140"},
            {"出现场所：绿地（飞行）","天气：雨雪天除外","北半球月份：1，2，3，4，5，6，7，8，9，12","南半球月份：6，7，8，9，12，1，2，3","出现时间：19点至次日8点","出售价格：4000"},
            {"出现场所：绿地（飞行）","天气：雨雪天除外","北半球月份：4，5，6，7，8，9","南半球月份：1，2，3，10，11，12","出现时间：8点至17点","出售价格：3000"},
            {"出现场所：绿地（飞行）","天气：雨雪天除外","北半球月份：12，1，2，4，5，6，7，8，9","南半球月份：6，7，8，10，11，12，1，2，3","出现时间：8点至17点","出售价格：2500"},
            {"出现场所：绿地（飞行）","天气：雨雪天除外","北半球月份：5，6，7，8，9","南半球月份：11，12，1，2，3","出现时间：8点至16点","出售价格：4000"},
            {"出现场所：户外灯光附近飞行","天气：雨雪天除外","北半球月份：全年","南半球月份：全年","出现时间：19点至次日4点","出售价格130："},
            {"出现场所：树干","天气：无","北半球月份：4，5，6，7，8，9","南半球月份：10，11，12，1，2，3","出现时间：19点至次日4点","出售价格：3000"},
            {"出现场所：绿地（飞行）","天气：雨雪天除外","北半球月份：4，5，6，7，8，9","南半球月份：10，11，12，1，2，3","出现时间：8点至16点","出售价格：2500"},
            {"出现场所：草地（地面跳跃）","天气：无","北半球月份：4，5，6，7，8，9，10，11","南半球月份：10，11，12，1，2，3，4，5","出现时间：8点至19点","出售价格：200"},
            {"出现场所：草地（地面跳跃）","天气：雨雪天除外","北半球月份：8，9，10，11","南半球月份：2，3，4，5","出现时间：8点至19点","出售价格：600"},
            {"出现场所：草地（地面跳跃）","天气：雨雪天除外","北半球月份：8，9，10，11","南半球月份：2，3，4，5","出现时间：8点至19点","出售价格：400"},
            {"出现场所：草地（地面跳跃）","天气：雨雪天除外","北半球月份：7，8，9，","南半球月份：1，2，3","出现时间：8点至17点","出售价格：160"},
            {"出现场所：草地（地面跳跃）","天气：雨雪天除外","北半球月份：9，10，11","南半球月份：3，4，5","出现时间：17点至次日8点","出售价格：130"},
            {"出现场所：草地（地面跳跃）","天气：雨雪天除外","北半球月份：9，10","南半球月份：3，4","出现时间：17点至次日8点","出售价格：430"},
            {"出现场所：花朵上（会逃走）","天气：雨雪天除外","北半球月份：3，4，5，6，7，8，9，10，11","南半球月份：9，10，11，12，1，2，3，4，5","出现时间：8点至17点","出售价格：430"},
            {"出现场所：白色花朵上（会逃走）","天气：雨雪天除外","北半球月份：3，4，5，6，7，8，9，10，11","南半球月份：9，10，11，12，1，2，3，4，5","出现时间：8点至17点","出售价格：2400"},
            {"出现场所：花丛附近（飞行）","天气：雨雪天除外","北半球月份：3，4，5，6，7","南半球月份：9，10，11，12，1","出现时间：8点至17点","出售价格：200"},
            {"出现场所：摇晃或敲击树干","天气：无","北半球月份：全年","南半球月份：全年","出现时间：全天","出售价格：2500"},
            {"出现场所：树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：8点至17点","出售价格：250"},
            {"出现场所：树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：8点至17点","出售价格：300"},
            {"出现场所：树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：8点至17点","出售价格：500"},
            {"出现场所：树干","天气：无","北半球月份：8，9","南半球月份：2，3","出现时间：8点至17点","出售价格：400"},
            {"出现场所：树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：4点至19点","出售价格：550"},
            {"出现场所：树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：全天","出售价格：10"},
            {"出现场所：水边（飞行）","天气：雨雪天除外","北半球月份：9，10","南半球月份：3，4","出现时间：8点至19点","出售价格：180"},
            {"出现场所：水边（飞行）","天气：雨雪天除外","北半球月份：4，5，6，7，8，9，10","南半球月份：10，11，12，1，2，3，4","出现时间：8点至17点","出售价格：230"},
            {"出现场所：水边（飞行）","天气：雨雪天除外","北半球月份：5，6，7，8，9，10","南半球月份：11，12，1，2，3，4","出现时间：8点至17点","出售价格：4500"},
            {"出现场所：水边（飞行）","天气：雨雪天除外","北半球月份：11，12，1，2","南半球月份：5，6，7，8","出现时间：全天","出售价格：500"},
            {"出现场所：淡水附近","天气：雨雪天除外","北半球月份：6","南半球月份：12","出现时间：19点至次日4点","出售价格：300"},
            {"出现场所：地面下","天气：无","北半球月份：11，12，1，2，3，4，5","南半球月份：5，6，7，8，9，10，11","出现时间：全天","出售价格：500"},
            {"出现场所：池塘","天气：雪天除外","北半球月份：5，6，7，8，9","南半球月份：11，12，1，2，3","出现时间：8点至19点","出售价格：130"},
            {"出现场所：河流或池塘","天气：无","北半球月份：5，6，7，8，9","南半球月份：11，12，1，2，3","出现时间：8点至19点","出售价格：800"},
            {"出现场所：河流或池塘","天气：无","北半球月份：4，5，6，7，8，9","南半球月份：10，11，12，1，2，3","出现时间：19点至次日8点","出售价格：2000"},
            {"出现场所：花朵上（会逃走）","天气：无","北半球月份：3，4，5，6，7，8，9，10","南半球月份：9，10，11，12，1，2，3，4","出现时间：全天","出售价格：120"},
            {"出现场所：花朵上（会逃走）","天气：无","北半球月份：3，4，5，6，7，8，9，10","南半球月份：9，10，11，12，1，2，3，4","出现时间：19点至次日8点","出售价格：1000"},
            {"出现场所：花朵上（会逃走）","天气：雨雪天除外","北半球月份：3，4，5，6，10","南半球月份：9，10，11，12，4","出现时间：8点至17点","出售价格：200"},
            {"出现场所：草地（地面爬行）","天气：雨雪天除外","北半球月份：2，3，4，5，6，7，8，9，10","南半球月份：8，9，10，11，12，1，2，3，4","出现时间：全天","出售价格：1500"},
            {"出现场所：树桩","天气：无","北半球月份：4，5，6，7，8","南半球月份：10，11，12，1，2","出现时间：全天","出售价格：2400"},
            {"出现场所：树桩","天气：雨雪天除外","北半球月份：5，6，9，10，11","南半球月份：11，12，3，4，5","出现时间：全天","出售价格：450"},
            {"出现场所：树桩","天气：无","北半球月份：全年","南半球月份：全年","出现时间：全天","出售价格：350"},
            {"出现场所：树桩","天气：无","北半球月份：5，6，7，8，9","南半球月份：11，12，1，2，3","出现时间：全天","出售价格：3000"},
            {"出现场所：树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：全天","出售价格：800"},
            {"出现场所：雪球附近","天气：无","北半球月份：12，1，2","南半球月份：6，7，8","出现时间：全天","出售价格：3000"},
            {"出现场所：草地（地面爬行）","天气：无","北半球月份：7，8，9","南半球月份：1，2，3","出现时间：全天","出售价格：300"},
            {"出现场所：树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：23点至次日8点","出售价格：10000"},
            {"出现场所：树干","天气：无","北半球月份：6，7，8","南半球月份：1，2，3","出现时间：全天","出售价格：200"},
            {"出现场所：椰子树树干","天气：无","北半球月份：6，7，8，9","南半球月份：12，1，2，3","出现时间：17点至次日8点","出售价格：8000"},
            {"出现场所：树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：全天","出售价格：2000"},
            {"出现场所：树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：全天","出售价格：1000"},
            {"出现场所：树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：23点至次日8点","出售价格：10000"},
            {"出现场所：树干","天气：无","北半球月份：6，7，8，9","南半球月份：12，1，2，3","出现时间：19点至次日8点","出售价格：6000"},
            {"出现场所：椰子树树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：17点至次日8点","出售价格：8000"},
            {"出现场所：椰子树树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：17点至次日8点","出售价格：12000"},
            {"出现场所：树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：17点至次日8点","出售价格：12000"},
            {"出现场所：树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：17点至次日8点","出售价格：1350"},
            {"出现场所：椰子树树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：17点至次日8点","出售价格：8000"},
            {"出现场所：椰子树树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：17点至次日8点","出售价格：8000"},
            {"出现场所：椰子树树干","天气：无","北半球月份：7，8","南半球月份：1，2","出现时间：17点至次日8点","出售价格：12000"},
            {"出现场所：树干","天气：无","北半球月份：7，8，9，10，11","南半球月份：1，2，3，4，5","出现时间：4点至19点","出售价格：600"},
            {"出现场所：树下拟态叶片","天气：无","北半球月份：7，8，9","南半球月份：1，2，3","出现时间：全天","出售价格：600"},
            {"出现场所：树干（摇晃敲击）","天气：无","北半球月份：全年","南半球月份：全年","出现时间：全天","出售价格：600"},
            {"出现场所：地面（下雨或腐烂大头菜）","天气：无","北半球月份：全年","南半球月份：全年","出现时间：全天","出售价格：80"},
            {"出现场所：沙滩（贝壳）","天气：无","北半球月份：全年","南半球月份：全年","出现时间：19点至次日8点","出售价格：1000"},
            {"出现场所：沙滩","天气：无","北半球月份：全年","南半球月份：全年","出现时间：全天","出售价格：200"},
            {"出现场所：飞行（垃圾或腐烂大头菜）","天气：无","北半球月份：全年","南半球月份：全年","出现时间：全天","出售价格：60"},
            {"出现场所：随机","天气：雨雪天除外","北半球月份：6，7，8，9","南半球月份：12，1，2，3","出现时间：17点至次日4点","出售价格：130"},
            {"出现场所：居民身上","天气：无","北半球月份：4，5，6，7，8，9，10，11","南半球月份：9，10，11，12，1，2，3，4，5","出现时间：全天","出售价格：70"},
            {"出现场所：岩石上","天气：无","北半球月份：全年","南半球月份：全年","出现时间：全天","出售价格：250"},
            {"出现场所：岩石（敲击）","天气：无","北半球月份：1，2，3，4，5，6，9，10，11，12","南半球月份：3，4，5，6，7，8，9，10，11，12","出现时间：23点至次日16点","出售价格：250"},
            {"出现场所：岩石（敲击）","天气：无","北半球月份：1，2，3，4，5，6，9，10，11，12","南半球月份：3，4，5，6，7，8，9，10，11，12","出现时间：16点至23点","出售价格：300"},
            {"出现场所：树干（敲击摇晃）","天气：无","北半球月份：全年","南半球月份：全年","出现时间：19点至次日8点","出售价格：600"},
            {"出现场所：草地和普通地面（会攻击）","天气：无","北半球月份：1，2，3，4，11，12","南半球月份：5，6，7，8，9，10","出现时间：19点至次日4点","出售价格：8000"},
            {"出现场所：草地和普通地面（会攻击）","天气：无","北半球月份：5，6，7，8，9，10","南半球月份：11，12，1，2，3，4","出现时间：19点至次日4点","出售价格：8000"}
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug);
        expandableListView = findViewById(R.id.elvbug);
        bugExpendAdapter = new BugExpendAdapter(this, bugName,bugdetail,bugPic);
        expandableListView.setAdapter(bugExpendAdapter);

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