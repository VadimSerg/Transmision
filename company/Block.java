/*

  Created by  VadimSerg (in accordance with references Shildt's book). Some methods was added for the experiments

*/
package  company;
public class Block {
    private int a, b, c;
    private int volume;

    Block(int a,  int b, int c) {// constructor
        this.a = a;
        this.b = b;
        this.c = c;
        this.volume = a * b* c; }

    public boolean sameBox(Block ob){//method for determine similarity boxes-.The object is used for
        if ((ob.a==a)&&(ob.b ==b)&&(ob.c==c)) return true;
        else return  false;
    }

    public boolean sameVolume(Block ob){// for similarity the volume
        if (ob.volume == volume) return  true;
        return  false;
    }

    public   byte compareVolume(Block ob){//this method returns 3 values:2,1,0
        if (ob.volume > volume) return 2;
        else if (ob.volume < volume) return 1;
        else return 0;
    }
    public void resComparVolume(Block ob){//here,this method prints message about results in depend on method compareVolume

        if (compareVolume(ob)==0) System.out.println("Block equal another block (Volume)");
        else if  ((compareVolume(ob)==2)) System.out.println("Block greater then another block");
        else System.out.println("Block smaller then another one");
    }
    public  int getVolume(){
        return  volume;
    }
}




