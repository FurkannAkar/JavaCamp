package intro;

import java.util.*;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
	
	 public static void nToKGroups(int n, int k) {
			if(n < k) {
				System.out.println("Return 0");
				//return 0;
			}
			int[][] dp = new int[k+1][n+1];
			for(int i = 1; i <= k; i++) {
				for(int j = i; j <= n; j++) {
	                if(i==j) {
	                    dp[i][j] = 1;
	                    System.out.print(dp[i][j] + " ");
	                } else {
	                    dp[i][j] = dp[i-1][j-1] + dp[i][j-i];
	                    System.out.print(dp[i][j] + " ");
	                }
				}
				System.out.println();
			}
			//return dp[k][n];
		}


	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static long swapCount(String s)
	 {
	      
	     // Keep track of '['
	     Vector<Integer> pos = new Vector<Integer>();
	     for(int i = 0; i < s.length(); ++i)
	         if (s.charAt(i) == '[')
	             pos.add(i);
	              
	     // To count number of encountered '['
	     int count = 0;
	      
	     // To track position of next '[' in pos
	     int p = 0; 
	      
	     // To store result
	     long sum = 0;
	      
	     char[] S = s.toCharArray();
	      
	     for(int i = 0; i < s.length(); ++i)
	     {
	          
	         // Increment count and move p
	         // to next position
	         if (S[i] == '[')
	         {
	             ++count;
	             ++p;
	         }
	         else if (S[i] == ']')
	             --count;
	   
	         // We have encountered an
	         // unbalanced part of string
	         if (count < 0)
	         {
	              
	             // Increment sum by number of
	             // swaps required i.e. position
	             // of next '[' - current position
	             sum += pos.get(p) - i;
	             char temp = S[i];
	             S[i] = S[pos.get(p)];
	             S[pos.get(p)] = temp;
	             ++p;
	   
	             // Reset count to 1
	             count = 1;
	         }
	     }
	     return sum;
	 }
	 
	 
	 
	 
	 
	 
static int calculate(int pos, int prev,
             int left, int k)
{

if (pos == k)
{
if (left == 0)
    return 1;
else
    return 0;
}

if (left == 0)
return 0;

int answer = 0;



for(int i = prev; i <= left; i++)
{
answer += calculate(pos + 1, i,left - i, k);

}
return answer;
}


static int countWaystoDivide(int n, int k)
{
return calculate(0, 1, n, k);
}

	public static void main(String[] args) {	
		int N = 4;
	    int K = 2;
	    System.out.print(countWaystoDivide(N, K));
	    
	    
	    
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		/*
		
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

		*/
		
		/*
		 * -> Deðiþkenler 2 tipte tutulur; Value-type (Deðer Tip) ve Reference-Type (Referans Tip)
		 * -> Deðer tipler Stack kýsýmda tutulur. Referans tipler ise Heap kýsýmda tutulur.
		 * -> Integer,String vs. gibi deðiþken tipleri Deðer Tip olarak tutulur. Array'ler ise Referans Tip olarak tutulur.
		 * -> Stack ve Heap (Array) örneði olarak C:\FurkanAkar\JavaKamp klasörü altýnda "StackveHeap" ekran görüntüsü oluþturulmuþtur.
		 * -> Fakat String tipi ise istisna bir tiptir. String'ler arka planda charArray'leri olarak yani Referans Tip olarak tutar.
		 * Fakat her ne kadar referans tip olsa da yeni nesil kodlamada ön planda atama yaparken Deðer Tip gibi davranýr. (String'lere özel bir durum!!)
		 */
		/*
		
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
		
		*/
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


