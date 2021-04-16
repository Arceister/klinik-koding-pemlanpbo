package com.company;

import java.time.LocalDate;

public class Pengunjung {
    private String nama;
    private LocalDate tanggal;
    private static int jumlah;
    private Buku[] bukus = new Buku[1000];
    private int stateBuku = 0;

    Pengunjung(String nama, String tanggal) {
        jumlah++;
        this.nama = nama;
        LocalDate tanggalan = LocalDate.parse(tanggal);
        this.tanggal = tanggalan;
    }

    void pinjamBuku(Buku buku) {
        if (buku.getStock() <= 0) {
            System.out.println("Stock buku " + buku.getJudul() + " habis!");
        } else {
            bukus[stateBuku] = buku;
            stateBuku += 1;
            buku.reduceStock();
        }
    }

    void dataPengunjung() {
        System.out.println("-Nama: " + this.nama);
        System.out.println("-Tanggal: " + this.tanggal);
    }

    public int getJumlah() {
       return jumlah;
    }

    public Buku[] getBukus() {
        return bukus;
    }

    public int getStateBuku() {
        return stateBuku;
    }
}
