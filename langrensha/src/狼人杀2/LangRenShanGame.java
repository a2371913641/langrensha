package 狼人杀2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LangRenShanGame {
    ArrayList<JueSe> people=new ArrayList<JueSe>(Arrays.asList(
            new Min(0),new Min(0),new Min(0),new Min(0),
            new Lang(1),new Lang(1),new Lang(1),new BaiLangWang(1),
            new NvWu(2),new YvYanJia(2),new ShouWei(2),new QiShi(2)
    ));
    void fapai(ArrayList<JueSe> people){

    }
    int SuiJiShu(){
        return 0;
    }

    JueSe relevantJS(ArrayList<JueSe> people,int i){
        for(JueSe j:people){
            if(j.HaoMa==i){
                return j;
            }
        }
        return new QiShi(2);//删
    }
    void useJiNen(ArrayList<JueSe> people,int time){
       for(JueSe j:people){
           if(j.useTime==time){
               j.JiNen(relevantJS(people,SuiJiShu()));
           }
       }
    }

    int staVote(ArrayList<JueSe> people){
        return 1;
    }

    int sta(ArrayList<JueSe> people,boolean zhuangtai){
        //统计该状态的人数；
        int i=0;
        for(JueSe j:people){
            if(j.ZhuangTai==zhuangtai){
                i++;
                System.out.print(j.HaoMa+" ");
            }
        }
        return i;
    }
    public static void main(String[] args){

        LangRenShanGame lrsgame=new LangRenShanGame();
        for(int i=0;i<lrsgame.people.size();i++){
            System.out.println(lrsgame.people.get(i).Camp);
        }
        lrsgame.fapai(lrsgame.people);
        while (true){
            System.out.println("天黑请闭眼");
            lrsgame.useJiNen(lrsgame.people,1);
            System.out.println("天亮了");
            System.out.println("昨夜"+lrsgame.sta(lrsgame.people,false)+"死亡");
            lrsgame.useJiNen(lrsgame.people,2);

            }


        }

}
