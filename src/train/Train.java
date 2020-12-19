package train;


import java.util.Scanner;

public class Train {
    int sayi ;
    int tahmin;
    int count;

    public void message(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1-10 arasında bir vagon numarasi giriniz: ");
        tahmin = input.nextInt();
        sayi = (1+(int)(Math.random()*9));  //1 ile 10 arasi rastgele sayi uretiriz.
        count = 1;

        // Tahmin edilen sayiyi while dongusu ile karsilastiriyor.
        while (tahmin != sayi){

            if(tahmin < 1 || tahmin > 10){
                System.out.println("Lütfen 1-10 arasında bir vagon numarasi giriniz: ");
                tahmin = input.nextInt();
                count ++;
            }else if(tahmin < sayi){
                    System.out.println("Zanli Arka vagonlarda");
            tahmin = input.nextInt();
            count ++;

            }else{
                System.out.println("Zanli On vagonlarda");
                tahmin = input.nextInt();
                count ++;
            }

            if (count > 4){
                System.out.println("Deneme hakkiniz kalmadi!");
                break;
            }
        }

    }
        // Switch case ile kacin denemede bildigini hesapliyor.
    public void setCount(){
        switch (count){
            case 1 :
                System.out.println(count + ". denemede bildiniz");
                System.out.println("tebrikler 100 puan ");
                break;
            case 2 :
                System.out.println(count + ". denemede bildiniz");
                System.out.println("tebrikler 75 puan ");
                break;
            case 3 :
                System.out.println(count + ". denemede bildiniz");
                System.out.println("tebrikler 50 puan ");
                break;
            case 4 :
                System.out.println(count + ". denemede bildiniz");
                System.out.println("tebrikler 25 puan ");
                break;

        }
    }




}
