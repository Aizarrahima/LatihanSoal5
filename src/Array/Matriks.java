package Array;

/**
 *
 * @author Aizar
 */
public class Matriks {

    public static void main(String[] args) {
        // untuk membentuk matriks dengan ordo yang diinginkan (Matriks A)
        int matriksA[][] = new int[2][2]; // untuk menentukan matriks dengan ordo 2 * 2
        matriksA[0][0] = -5; // sebagai nilai pada baris pertama dan kolom pertama
        matriksA[0][1] = 3; // sebagai nilai pada baris pertaama dan kolom kedua
        matriksA[1][0] = 7; // sebagai nilai pada baris kedua dan kolom pertama
        matriksA[1][1] = 6; // sebagai nilai pada baris kedua dan kolom kedua
        //untuk menampilkan matriks A
        System.out.println("Matriks A = ");
        for (int a = 0; a < matriksA.length; a++) {
            for (int b = 0; b < matriksA[0].length; b++) {
                System.out.print(matriksA[a][b] + " ");
            }
            System.out.println();
        }

        // untuk membentuk matriks dengan ordo yang diinginkan (Matriks B)
        int matriksB[][] = new int[2][2]; // untuk menentukan matriks dengan ordo 2 * 2
        matriksB[0][0] = 3; // sebagai nilai pada baris pertama dan kolom pertama
        matriksB[0][1] = 1; // sebagai nilai pada baris pertama dan kolom kedua
        matriksB[1][0] = 5; // sebagai nilai pada baris kedua dan kolom pertama
        matriksB[1][1] = -2; // sebagai nilai pada baris kedua dan kolom kedua
        // untuk menampilkan matriks B
        System.out.println();
        System.out.println("Matriks B = ");
        for (int m = 0; m < matriksB.length; m++) {
            for (int n = 0; n < matriksB[0].length; n++) {
                System.out.print(matriksB[m][n] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Hasil Pengurangan Matriks A - B ="); // untuk mencetak teks
        // Perulangan untuk membentuk pola matriks
        for (int x = 0; x < matriksA.length; x++) {
            for (int y = 0; y < matriksA[0].length; y++) {
                int hasil = matriksA[x][y] - matriksB[x][y]; // untuk operator pengurangan dari kedua matriks yang diketahui
                System.out.print(hasil + " "); // untuk mencetak hasil ke samping
            }
            System.out.println(); // untuk membentuk pola kebawah
        }
    }
}
