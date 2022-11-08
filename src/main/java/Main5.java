public class Main5 {
    public static void main(String[] args){
//        nomer1();
//        nomer2();
//        nomer3();
       nomer4();

    }
    private static void nomer1(){
        int [] mas = new int[12];
        int maxNumber = -16;
        int maxIndex = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*31)-15;
            System.out.println(mas[i]);
            if(maxNumber <= mas[i]){
                maxNumber = mas[i];
                maxIndex = i;
            }
        }

        System.out.println("Max - "+ maxNumber + " index - " + maxIndex);
    }
    private static void nomer2(){
        int[] Mas = new int[8];
        for(int i=0;i<Mas.length;i++){
            Mas[i]=(int)(Math.random()*9+1);
            System.out.print(Mas[i] + " ");
        }
        System.out.println();
        for(int i=0;i<Mas.length;i++) {
            if (Mas[i] % 2 != 0) Mas[i] = 0;
            System.out.print(Mas[i] + " ");
        }
    }
    private static void nomer3(){
        int[] Mas = new int[4];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = (int) (Math.random() * 91 + 10);
            System.out.print(Mas[i] + " ");
        }
        String result = "Up";
        for (int i = 0; i < Mas.length; i++) {
            if (i > 0 && Mas[i - 1] >= Mas[i]) {
                result = "not up";
                break;
            }
        }
        System.out.print(result);
    }
    private static void nomer4(){
        double sumMas1=0,sumMas2=0;
        int[] Mas1 = new int[5];
        for(int i=0;i<Mas1.length;i++){
            Mas1[i]=(int)(Math.random()*6);
            System.out.print(Mas1[i] +" ");
            sumMas1+=(double)Mas1[i]/Mas1.length;
        }
        System.out.println(" ");
        int[] Mas2=new int[5];
        for(int i=0;i<Mas2.length;i++){
            Mas2[i] =(int)(Math.random()*6);
            System.out.print(Mas2[i] +" ");
            sumMas2+=(double)Mas2[i]/Mas2.length;
        }
        System.out.println(" ");
        if(sumMas1==sumMas2)System.out.println("znacheniya dvukh massivov ravny");
        else {if(sumMas1>sumMas2)
            System.out.println("pervogo massiva bol'she i ravno "+ sumMas1);
        else System.out.println("vtorogo massiva bol'she i ravno "+ sumMas2);
        }
    }
    }


