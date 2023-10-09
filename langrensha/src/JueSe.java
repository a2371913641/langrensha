import java.util.*;

//import  java.math.*;
public class JueSe {

    public final static Integer[] suoyouwanjia={1,2,3,4,5,6,7,8,9,10,11,12};
//    public static ArrayList<Integer> langs=new ArrayList<>();
    public class SuoYouJueSe{

    }
    public static interface sheng{

    }
    static  class NvWu implements sheng {
        int num;
        public void jiuren(int num, ArrayList<Min> mins, AbstractList<LangRen> langs, ShouWei shouwei, YvYanJia yvyanjia, QiShi qishi) {
            if (
                    num != num) {
                System.out.println("女巫救起了" + num + "号");
            } else {
                System.out.println("女巫中刀，无法自救");
            }
        }

        public void duren(int num,ArrayList<Min> mins,AbstractList<LangRen> langs,NvWu nvwu,ShouWei shouwei,YvYanJia yvyanjia,QiShi qishi){
            System.out.println("女巫毒走了"+num+"号");
            System.out.println(num+"号出局");
        }
    }
    static class YvYanJia implements sheng{
        int num;
        public void chayan(int num,ArrayList<Min> mins,AbstractList<LangRen> langs,NvWu nvwu,ShouWei shouwei,YvYanJia yvyanjia,QiShi qishi){
            System.out.println("预言家选择了"+num+"号");
            for(int i=0;i<mins.size();i++){
                if(num==mins.get(i).num){
                    System.out.println(num+"号是民");
                    return;
                }
            }
            for(int i=0;i<langs.size();i++){
                if(num==langs.get(i).num){
                    System.out.println(num+"号是狼");
                }
            }
            if(num==nvwu.num){
                System.out.println(num+"号是女巫");
            }
            if(num==shouwei.num){
                System.out.println(num+"号是守卫");
            }
            if(num==yvyanjia.num){
                System.out.println(num+"号是预言家");
            }
            if(num==qishi.num){
                System.out.println(num+"号是骑士");
            }
        }
    }

    static class ShouWei implements sheng{
        int num;
    }

    static class QiShi implements sheng{
        int num;
    }

    public static Integer qvchubufanghui(Integer[] array){
        while(true) {
            Integer i = (int)(Math.random() * 13);
            for (Integer o : array) {
                if (i==o) {
                    return o;
                }
            }
        }
    }

    public static Integer[]  fapai(){
        Integer[] copy1=new Integer[12];
        for(int i=0;i<suoyouwanjia.length;i++){
            copy1[i]=suoyouwanjia[i];
        }
        Integer[] copy2={0,0,0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<copy2.length;i++){
            copy2[i]=qvchubufanghui(copy1);
            copy1[copy2[i]-1]=100;
        }

        return copy2;
    }
    public static int gerenxuanze(){
        int i = (int) (Math.random() * (suoyouwanjia.length));
//        System.out.println("狼"+i);
        return suoyouwanjia[i];
    }

    public static int jiti(ArrayList<LangRen> renshu){
        //jiti[i][0]为玩家
        //集体[i][1]为玩家[i][0]获得的票数
        int[][] jiti=new int[renshu.size()][2];
        int sta=1;
        for(int i=0;i<jiti.length;i++){
            jiti[i][0]=renshu.get(i).sharen(renshu.get(i).num);
        }
        for(int i=0;i<jiti.length-1;i++){
            sta=1;
            for(int j=i+1;j<jiti.length;j++){
                if(jiti[i][0]==jiti[j][0]){
                    sta++;
                }
                System.out.println(jiti[i][0]+"获得"+sta+"票");
                jiti[i][1]=sta;
            }
        }
        int max=1;
        for(int i=0;i<jiti.length;i++){
            if(jiti[i][1]>max){
                max=jiti[i][1];
            }
        }
        for(int i=0;i<jiti.length;i++){
            if(max==jiti[i][1]){
                return jiti[i][0];
            }
        }
        return 0;
    }



    static class LangRen {
        int num;
        public int sharen(int num) {
            int sha = (int) gerenxuanze();
            System.out.println(num + "号狼人选择了" + sha + "号");
            return sha;
        }
        public static int jingzhangtoupiao(){
            int i=(int)gerenxuanze();
            return i;
        }
    }

    static public class LangDui{

        void langduisharen(int num,ArrayList<Min> mins,AbstractList<LangRen> langs,NvWu nvwu,ShouWei shouwei,YvYanJia yvyanjia,QiShi qishi){

            for(int i=0;i<mins.size();i++){
                if(num==mins.get(i).num){
                    mins.remove(i);
                    return;
                }
            }
            for(int i=0;i<langs.size();i++){
                if(num==langs.get(i).num){
                    langs.remove(i);
                    return;
                }
            }
            if(num== nvwu.num){
                
            }
        }
        int langs(ArrayList<LangRen> langs){
           return jiti(langs);
        }


    }


    static public class  Min{
        int num;
        public static int toupiao(){
            return gerenxuanze();
        }
    }
//    static public class JiTiTouPiao{
//        public static int jititoupiao(ArrayList<> renshu){
//            return jiti(renshu);
//        }
//    }


}
