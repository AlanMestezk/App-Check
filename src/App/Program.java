package App;

import java.util.Locale;
import java.util.Scanner;

import Entities.InfoRoom;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println();
		System.out.println("		     ꧁Hotel Pousada꧂");
		System.out.println("		     ❆❆❆❆❆❆❆❆❆❆❆❆");
		System.out.println();
		
		InfoRoom[] rooms = new InfoRoom[10];
		
		System.out.print("		Digite o numero de quarto(s): ");
		int numberRoom = sc.nextInt();
		System.out.println("		Será reservado "+numberRoom + " quarto(s)");
		System.out.println("		Digite as informações abaixo");
		System.out.println("		♦♢♦♢♦♢♦♢♦♢♦♢♦♢♦♢♦♢♦♢♦♢♦♢♦♢♦");
		System.out.println();
		
		for(int i = 1; i <= numberRoom; i++) {
			System.out.println("		Registro numero #"+ i+": ");
			System.out.print("		Nome: ");
			String name = sc.next();
			System.out.print("		E-mail: ");	
			String email = sc.next();
			System.out.print("		Numero do quarto: ");
			int roomNumber = sc.nextInt();
			
			rooms[roomNumber] = new InfoRoom(name, email);
			System.out.println("			≔≑≑≑≑≑≕");
		}
		
		System.out.println();
		System.out.println("		  ✯✯✯✯✯✯✯✯✯✯✯✯✯✯");
		System.out.println("		Quarto(s) reservado(s) hoje: ");
		System.out.println();
		
		for(int i = 0; i < 10; i ++) {
			if(rooms[i]!=null) {
				System.out.println("		Quarto: "+ i);
				System.out.println("		Dados hóspede:");
				System.out.println("		Nome: "+rooms[i].getName());
				System.out.println("		E-mail: "+rooms[i].getEmail());
				System.out.println("		  ༺༻༺༻༺༻༺༻༺༻༺༻༺༻༺༻༺༻");
			}
		}
		
	}

}
