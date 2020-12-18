package com.example.myapplication.bean;

import com.example.myapplication.R;

import java.util.ArrayList;

public class GoodsInfo2 {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo2() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "女士细皮带石英手表", "简约气质时尚小绿表", "小清新文艺表", "满天星手表","复古森系小宅表", "复古小方盘表","独角兽防水电子表","迪士尼简约防水手表"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "聚利时手表女时尚女学生简约气质小表盘女士细皮带石英手表ins风",
            "斯诺威登十大品牌女士手表女款全自动机械表女简约气质时尚小绿表",
            "手表女孩初中学生可爱高中ins风简约气质韩版时尚防水小清新文艺",
            "夏洛特手表cr满天星手表女ins风法国小众品牌星空正品名牌女表",
            "ins手表女学生简约韩版潮流ulzzang复古森系文艺小清新林小宅同款",
            "Lola Rose小绿表手表女ins风轻奢女表复古小方盘",
            "手表女迪士尼ins风中学生运动联名简约气质独角兽防水女生电子表",
            "正港迪士尼手表女联名限量款ins风潮流正品简约防水高中学生"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {139, 78, 168, 53,18, 39,19,49};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.xcr, R.drawable.xjls, R.drawable.xjy,
            R.drawable.xk, R.drawable.xlolarose, R.drawable.xslwd,
            R.drawable.xzgo, R.drawable.dsn
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.cr, R.drawable.jls, R.drawable.jy,
            R.drawable.xk, R.drawable.lolarose, R.drawable.slwd,
            R.drawable.zgo, R.drawable.ddsn
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo2> getDefaultList() {
        ArrayList<GoodsInfo2> goodsList = new ArrayList<GoodsInfo2>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo2 info = new GoodsInfo2();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}