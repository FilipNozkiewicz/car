import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

          Sprzeglo sp0 =  new Sprzeglo("sprzeglo1" , 4.4 , 7.8 , true);
          Sprzeglo sp1 = new Sprzeglo("sprzeglo1" , 4.4 , 7.8 , true);
        Sprzeglo sp01 = new Sprzeglo("sprzeglo1" , 4.4 , 7.8 , true);
        Sprzeglo sp2 = new Sprzeglo("sprzeglo2" , 6.4 , 7.8 , true);
        Sprzeglo sp3 = new Sprzeglo("sprzeglo3" , 7.4 , 7.8 , false);
        Sprzeglo sp4 = new Sprzeglo("sprzeglo4" , 8.4 , 7.8 , true);
        Skrzynia sk1 = new Skrzynia("sk1", "automatyczna" ,5.55 , 6.78 ,2,8,3,sp1);
        Skrzynia sk2 = new Skrzynia("sk2","manualna" ,7.55 , 6.78 ,2,8,3,sp1);
        Skrzynia sk3 = new Skrzynia("sk3","sportowa" ,9.55 , 6.78 ,2,8,3,sp1);
        Skrzynia sk4 = new Skrzynia("sk4","polautomatyczna" ,8.55 , 6.78 ,2,8,3,sp1);
        Silnik si1 = new Silnik("diesel" , 8.5 , 6.7 , 7000,2000,false);
        Silnik si2 = new Silnik("biturbo" , 11.5 , 6.7 , 7000,2000,false);
        Silnik si3 = new Silnik("twinturbo" , 13.5 , 6.7 , 7000,2000,false);
        Silnik si4 = new Silnik("boxxer" , 4.5 , 6.7 , 7000,2000,false);

        Samochod car1 = new Samochod(sk1,si1,"Blue" , 223456 , "Seria_5" ,"BMW" , 270 );
        Samochod car2 = new Samochod(sk2,si2,"Red" , 224566 , "Mondeo" ,"Ford" , 200 );
        Samochod car3 = new Samochod(sk3,si3,"Green" , 224566 , "Punto" ,"Fiat" , 180 );
        Samochod car4 = new Samochod(sk4,si4,"Yellow" , 224566 , "Leon" ,"Seat" , 250 );



        ArrayList<Skrzynia> Skrzynie = new ArrayList<Skrzynia>();





    }

}
