package intro;

import java.util.*;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {	
		
	
		String internetSubeButonu = "�nternet �ubeye Gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.10;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun < dolarDun) {
			System.out.println("Dolar D��t�!");
		}else if(dolarBugun > dolarDun) {
			System.out.println("Dolar Y�kseldi!");
		}		
		else {
			System.out.println("Dolar De�i�medi!");
		}
	
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Emekli Kredisi";
		String kredi3 = "Ta��t Kredisi";
		String kredi4 = "Konut Kredisi";
		String kredi5 = "�ift�i Kredisi";
		
		String[] krediler = {
			"H�zl� Kredi",
			"Emekli Kredisi",
			"Ta��t Kredisi",
			"Konut Kredisi",
			"�ift�i Kredisi"
		};
		
		String[] krediler2 = {
				kredi1,
				kredi2,
				kredi3,
				kredi4,
				kredi5
			};
		
		
		
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		//foreach d�ng�s�
		for(String krediTipi : krediler) {
			System.out.println(krediTipi);
		}
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		//for d�ng�s�
		
		for(int i = 0 ; i < krediler2.length ; i++) {
			System.out.println(krediler2[i]);
		}
		
		
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

		
		
		/*
		 * -> De�i�kenler 2 tipte tutulur; Value-type (De�er Tip) ve Reference-Type (Referans Tip)
		 * -> De�er tipler Stack k�s�mda tutulur. Referans tipler ise Heap k�s�mda tutulur.
		 * -> Integer,String vs. gibi de�i�ken tipleri De�er Tip olarak tutulur. Array'ler ise Referans Tip olarak tutulur.
		 * -> Stack ve Heap (Array) �rne�i olarak C:\FurkanAkar\JavaKamp klas�r� alt�nda "StackveHeap" ekran g�r�nt�s� olu�turulmu�tur.
		 * -> Fakat String tipi ise istisna bir tiptir. String'ler arka planda charArray'leri olarak yani Referans Tip olarak tutar.
		 * Fakat her ne kadar referans tip olsa da yeni nesil kodlamada �n planda atama yaparken De�er Tip gibi davran�r. (String'lere �zel bir durum!!)
		 */
		
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2 ;
		sehir2 = "�zmir";
		System.out.println(sehir1);
		
		
	

		
		
	
		
		
	}
	}


