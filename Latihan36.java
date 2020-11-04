/**
 * Latihan36
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Target Saldo Tabungan
 */

class SaldoTabungan {
    public void HitungSaldoTabungan(int saldo, double bulan, double bunga){
    int i;
    for(i = 1; saldo<=6000000; i++){
        bulan = bunga * saldo;
        saldo = (int) (saldo + bulan);
        System.out.println("Saldo di Bulan ke-" + i +" Rp." + saldo);
        }

    }   
    
}
