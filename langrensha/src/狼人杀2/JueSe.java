package 狼人杀2;

public abstract class JueSe {
    public int HaoMa;
    public int Camp;//狼==1，神==2，民==0；
    public boolean ZhuangTai=true;
    public int useTime;
    //1--夜晚行动    2--白天行动  0--不发动技能

    abstract void JiNen(JueSe j);
    public JueSe(int i){
        this.Camp=i;
    }

}
