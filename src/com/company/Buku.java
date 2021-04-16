package com.company;

public class Buku {
    private String judul;
    private int stock;
    private String penulis;
    private String genre;

    Buku() {

    }

    Buku(String judul, String penulis, String genre) {
//        stock--;
        this.judul = judul;
        this.penulis = penulis;
        this.genre = genre;
    }

    public void AddStock(int stock) {
        this.stock += stock;
    }

    public int getStock() {
        return this.stock;
    }

    void keteranganBuku() {
        System.out.println("---Judul: " + judul);
        System.out.println("---Penulis: " + penulis);
        System.out.println("---Genre: " + genre);
    }

    void reduceStock() {
        this.stock -= 1;
    }

    public String getJudul() {
        return judul;
    }
}
