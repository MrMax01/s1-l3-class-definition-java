import entities.Rettangolo;

public class Main {
    public static void main(String[] args) {
        Rettangolo ret1 = new Rettangolo(2,4);
        Rettangolo ret2 = new Rettangolo(1,3);

        stampaRettangolo(ret1);
stampaDueRettangoli(ret1, ret2);
    }

public static void stampaRettangolo(Rettangolo x){
    System.out.println("il perimetro del triangolo è:"+x.getPerimeter());
    System.out.println("l'area del triangolo è:"+x.getArea());
}
public static void stampaDueRettangoli (Rettangolo x, Rettangolo y){
    System.out.println("La somma dei perimetri dei due rettangoli è:"+(x.getPerimeter()+y.getPerimeter()));
    System.out.println("la somma dell'area dei due rettangoli è:"+(x.getArea()+ x.getArea()));
}
}
