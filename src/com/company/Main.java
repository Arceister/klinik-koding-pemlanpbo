package com.company;

public class Main {

    public static void main(String[] args) {
        Buku buku1 = new Buku("Python for Data Analysis", "O'Reily", "Programming");
        buku1.AddStock(2);

        Buku buku2 = new Buku("Computer Networking", "Rossen", "Network");
        buku2.AddStock(4);

        Buku buku3 = new Buku("Machine Learning", "Tom M. Mitchell", "Programming");
        buku3.AddStock(6);

        Pengunjung[] pengunjungs = new Pengunjung[1000];

        pengunjungs[0] = new Pengunjung("Jagad", "2018-10-20");
        pengunjungs[0].pinjamBuku(buku1);
        pengunjungs[0].pinjamBuku(buku2);
        pengunjungs[0].pinjamBuku(buku3);

        pengunjungs[1] = new Pengunjung("Farrel", "2018-10-21");
        pengunjungs[1].pinjamBuku(buku1);
        pengunjungs[1].pinjamBuku(buku3);

        System.out.println("Total Pengunjung: " + pengunjungs[0].getJumlah());
        for (int i = 0; i < pengunjungs[0].getJumlah(); i++) {
            System.out.println("Pengunjung " + (i + 1) + ":");
            pengunjungs[i].dataPengunjung();
            System.out.println("--Buku Yang Dipinjam:");
            for (int j = 0; j < pengunjungs[i].getStateBuku(); j++) {
                pengunjungs[i].getBukus()[j].keteranganBuku();
            }
        }
    }
}
