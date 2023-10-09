import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args){
        Integer[] fapai=JueSe.fapai();
//        for(int a:fapai){
//            System.out.println(a);
//        }
        int fp=0;
        JueSe.NvWu nvwu=new JueSe.NvWu();
        nvwu.num=fapai[fp++];
        JueSe.QiShi qishi=new JueSe.QiShi();
        qishi.num=fapai[fp++];
        JueSe.ShouWei shouwei=new JueSe.ShouWei();
        shouwei.num=fapai[fp++];
        JueSe.YvYanJia yvyanjia=new JueSe.YvYanJia();
        yvyanjia.num=fapai[fp++];
        JueSe.Min m1=new JueSe.Min();
        m1.num=fapai[fp++];
        JueSe.Min m2=new JueSe.Min();
        m2.num=fapai[fp++];
        JueSe.Min m3=new JueSe.Min();
        m3.num=fapai[fp++];
        JueSe.Min m4=new JueSe.Min();
        m4.num=fapai[fp++];
        JueSe.LangRen l1=new JueSe.LangRen();
        l1.num=fapai[fp++];
        JueSe.LangRen l2=new JueSe.LangRen();
        l2.num=fapai[fp++];
        JueSe.LangRen l3=new JueSe.LangRen();
        l3.num=fapai[fp++];
        JueSe.LangRen l4=new JueSe.LangRen();
        l4.num=fapai[fp++];
        ArrayList<JueSe.Min> mins=new ArrayList<>(Arrays.asList(m1,m2,m3,m4));
        ArrayList<JueSe.sheng> shengs=new ArrayList<>(Arrays.asList(nvwu,qishi,shouwei,yvyanjia));
        ArrayList<JueSe.LangRen> langs=new ArrayList<>(Arrays.asList(l1,l2,l3,l4));
        ArrayList<Object> xincuns=new ArrayList<>(Arrays.asList(nvwu,shouwei,qishi,yvyanjia,m1,m2,m3,m4,l1,l2,l3,l4));
        System.out.println("天黑请闭眼，狼人请行动");
        System.out.println("狼人为"+l1.num+" "+l2.num+" "+l3.num+" "+l4.num);

        JueSe.LangDui langdui=new JueSe.LangDui();
        System.out.println("狼队选择了"+langdui.langs(langs));

        System.out.println("预言家请行动");
        yvyanjia.chayan((int)(Math.random()*xincuns.size()+1),mins,langs,nvwu,shouwei,yvyanjia,qishi);
        System.out.println("女巫请行动");



    }
}