package company;

public class Transmission {

    public static void main(String[] args) {



        //creating 4 objects

        Block ob1 = new Block(5,6,8); //240  the object1 has the same volume and the sizes as the object2
        Block ob2 = new Block(5, 6,8); //240 look at the comment upper
        Block ob3 = new Block(5, 12,6);//360
        Block ob4 = new Block(7, 12,30);//2520

        System.out.println("Object 1 has the same parameters with the Object 2 : "+(ob1.sameBox(ob2)));//the result will be true
        System.out.println("Oject 1 has the same parameters with the Object 3 : "+(ob1.sameBox(ob3)));//it will return false

        System.out.println("Object 1 has the same Volume as Object 2: "+(ob1.sameVolume(ob2)));//
        System.out.println("Object 1 has the same Volume as Object 3 : "+(ob1.sameVolume(ob3)));//


        System.out.println(ob1.compareVolume(ob2));//it will return 0,because  the volumes are equal obj1 and 2
        System.out.println(ob1.compareVolume(ob3));//it'll return 2, because the volume of the 3rd object(as shown as "ob3
        // included within brackets)greater than obj3
        System.out.println(ob4.compareVolume(ob1));//it'll return 1, because the obj1 smaller than obj4(comparing  obj4 within brackets  with obj1)
        ob1.resComparVolume(ob2);// 0- the volume obj2 equal obj1
        ob1.resComparVolume(ob3);//2- the volume obj3 greater than obj1
        ob4.resComparVolume(ob1);//1-the volume obj1 smaller than obj4

       System.out.println("The volume of object1 is: "+ ob1.getVolume());
       System.out.println("The volume of object2 is: "+ ob2.getVolume());
       System.out.println("The volume of object3 is: "+ ob3.getVolume());
       System.out.println("The volume of object1 is : "+ ob4.getVolume());

    }
}

