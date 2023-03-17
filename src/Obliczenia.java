import java.util.stream.Stream;

public class Obliczenia {

    public static int dodaj(int a, int b) {
        return a + b;
    }

    public static void wynik(int a, int b) {
        System.out.println(dodaj(a, b));
    }

    public static int sortowanie(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int sortowaniep(int d, int e, int f, int porownanie) {
        if (d > e) {
            porownanie = d;
        } else {
            porownanie = e;
        }
        if (porownanie > e) {

        } else {
            porownanie = e;
        }
        if (porownanie > f) {

        } else {
            porownanie = f;
        }
        return porownanie;
    }

    public static int sortprosty(int a, int b, int c, int naj) {
       naj = Stream.of(a,b,c).max(Integer::compareTo).get();
        return naj ;
    }
}

