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

        public static int sortowaniep (int d, int e, int f, int porownanie){
            if (d > e) {
                porownanie = d;
            }
            else{
                    porownanie = e;
                }
            if (porownanie > e) {
                porownanie = porownanie;
            }
                else{
                    porownanie = e;
                }
            if (porownanie > f) {
                porownanie = porownanie;
            }
                else{
                    porownanie = f;
                }
                return porownanie;
            }


        }


