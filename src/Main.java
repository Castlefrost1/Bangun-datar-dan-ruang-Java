import java.util.Scanner;

//import Default.Bola;
//import Default.Lingkaran;
//import Default.RuangAlasEmpat;
//import Default.RuangAlasTiga;
//import Default.SegiEmpat;
//import Default.SegiTiga;
//import Default.Tabung;

public class Main {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        Triangle segitiga = new Triangle();
        Pyramid prismaSegitiga = new Pyramid();
        Square segiempat = new Square();
        Cube balok = new Cube();
        Circle lingkaran = new Circle();
        Ball bola = new Ball();

        int choice;
        double userVariable;

        //menu list
        do {
            System.out.println("Bangun Datar & Ruang");
            System.out.println("1. Segitiga");
            System.out.println("2. Segiempat");
            System.out.println("3. Lingkaran");
            System.out.println("4. Piramid segitiga");
            System.out.println("5. Kubus");
            System.out.println("6. Bola");
            System.out.println("7. Exit");
            System.out.print("Pilih Menu (1 - 7) : ");
            choice = userIn.nextInt();

            switch (choice){
                case 1:
                    System.out.println(" ");
                    System.out.println("Segitiga");
                    System.out.print("Masukkan Alas: ");
                    userVariable = userIn.nextDouble();
                    segitiga.setBottom(userVariable);
                    System.out.print("Masukkan Tinggi: ");
                    userVariable = userIn.nextDouble();
                    segitiga.setHeight(userVariable);
                    System.out.println("Luas : " + segitiga.Face());
                    System.out.println("Keliling : " + segitiga.Surround());
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("Segiempat");
                    System.out.print("Masukkan Sisi 1: ");
                    userVariable = userIn.nextDouble();
                    segiempat.setS1(userVariable);
                    System.out.print("Masukkan Sisi 2: ");
                    userVariable = userIn.nextDouble();
                    segiempat.setS2(userVariable);
                    System.out.println("Luas: " + segiempat.Face());
                    System.out.println("Keliling: " + segiempat.Surround());
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("Lingkaran");
                    System.out.print("Masukkan Jari - jari: ");
                    userVariable = userIn.nextDouble();
                    lingkaran.setR(userVariable);
                    System.out.println("Luas: " + lingkaran.Face());
                    System.out.println("Keliling: " + lingkaran.Surround());
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("Prisma Segi Tiga");
                    System.out.print("Masukkan Alas: ");
                    userVariable = userIn.nextDouble();
                    prismaSegitiga.setBottom(userVariable);
                    System.out.print("Masukkan Tinggi: ");
                    userVariable = userIn.nextDouble();
                    prismaSegitiga.setHeight(userVariable);
                    System.out.print("Masukkan Tinggi Prisma: ");
                    userVariable = userIn.nextDouble();
                    prismaSegitiga.setT(userVariable);
                    System.out.println("Volume : " + prismaSegitiga.Volume());
                    System.out.println("Luas Permukaan : " + prismaSegitiga.Faces());
                    break;
                case 5:
                    System.out.println(" ");
                    System.out.println("Balok");
                    System.out.print("Masukkan Sisi 1: ");
                    userVariable = userIn.nextDouble();
                    balok.setS1(userVariable);
                    System.out.print("Masukkan Sisi 2: ");
                    userVariable = userIn.nextDouble();
                    balok.setS2(userVariable);
                    System.out.print("Masukkan Tinggi Balok: ");
                    userVariable = userIn.nextDouble();
                    balok.setT(userVariable);
                    System.out.println("Volume : " + balok.Volume());
                    System.out.println("Luas Permukaan : " + balok.Faces());
                    break;
                case 6:
                    System.out.println(" ");
                    System.out.println("Bola");
                    System.out.print("Masukkan Jari - jari: ");
                    userVariable = userIn.nextDouble();
                    bola.setR(userVariable);
                    System.out.println("Volume : " + bola.Volume());
                    System.out.println("Luas Permukaan : " + bola.Faces());
                    break;
            }
        } while(choice != 7);
    }
}