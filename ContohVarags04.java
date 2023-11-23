public class ContohVarags04{
    static void Tampil(String str, int... a){
        System.out.println("String : " + str);
        System.out.println("Jumlah argumen/parameter : " + a.length);

        for(int i : a){
            System.out.println(i + " ");
        }
        System.out.println();
    }
    static void Tampil(String str, double... b){
        System.out.println("String : " +str);
        System.out.println("Jumlah argumen/parameter : " + b.length);

        for(double i : b){
            System.out.println(i + " ");
        }
        System.out.println();
    }
     public static void main(String args[]){
        Tampil("Daspro 2019", 100, 200);
        Tampil("Teknologi Informasi", 1.4, 2.4, 3.4, 4.4, 5.5);
        Tampil("Polinema");
    }
}