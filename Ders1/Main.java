package intro;

import java.util.*;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {	
		
	
		String internetSubeButonu = "Ýnternet Þubeye Gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.10;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun < dolarDun) {
			System.out.println("Dolar Düþtü!");
		}else if(dolarBugun > dolarDun) {
			System.out.println("Dolar Yükseldi!");
		}		
		else {
			System.out.println("Dolar Deðiþmedi!");
		}
	
		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Emekli Kredisi";
		String kredi3 = "Taþýt Kredisi";
		String kredi4 = "Konut Kredisi";
		String kredi5 = "Çiftçi Kredisi";
		
		String[] krediler = {
			"Hýzlý Kredi",
			"Emekli Kredisi",
			"Taþýt Kredisi",
			"Konut Kredisi",
			"Çiftçi Kredisi"
		};
		
		String[] krediler2 = {
				kredi1,
				kredi2,
				kredi3,
				kredi4,
				kredi5
			};
		
		
		
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		//foreach döngüsü
		for(String krediTipi : krediler) {
			System.out.println(krediTipi);
		}
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		//for döngüsü
		
		for(int i = 0 ; i < krediler2.length ; i++) {
			System.out.println(krediler2[i]);
		}
		
		
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

		
		
		/*
		 * -> Deðiþkenler 2 tipte tutulur; Value-type (Deðer Tip) ve Reference-Type (Referans Tip)
		 * -> Deðer tipler Stack kýsýmda tutulur. Referans tipler ise Heap kýsýmda tutulur.
		 * -> Integer,String vs. gibi deðiþken tipleri Deðer Tip olarak tutulur. Array'ler ise Referans Tip olarak tutulur.
		 * -> Stack ve Heap (Array) örneði olarak C:\FurkanAkar\JavaKamp klasörü altýnda "StackveHeap" ekran görüntüsü oluþturulmuþtur.
		 * -> Fakat String tipi ise istisna bir tiptir. String'ler arka planda charArray'leri olarak yani Referans Tip olarak tutar.
		 * Fakat her ne kadar referans tip olsa da yeni nesil kodlamada ön planda atama yaparken Deðer Tip gibi davranýr. (String'lere özel bir durum!!)
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
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2 ;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);
		
		
	

		
		
	
		
		
	}
	}


