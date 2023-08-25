//Faça um programa que leia a placa de um carro e o ano de fabricação. Em seguida,
//        validar a situação do carro:
//        Se o ano for menor que 2010 imprimir: Carro Velho
//        Se o ano estiver entre 2011 e 2021 imprimir: Carro Semi novo
//        Se o ano for igual a 2022 imprimir: Carro Novo
//        O programa deverá substituir as vogais (a, e, i o e u maiúscula e minúscula) da placa
//        pelo caractere *, e posteriormente imprimir a placa

import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        String placa;
        int ano;

        System.out.println("Informe qual a placa? ");
        placa = ler.next();
        System.out.println("Informe o ano: ");
        ano = ler.nextInt();

        if (ano<=2010){
            System.out.println("Carro velho");
        }
        else if (ano<=2022){
            System.out.println("carro semi novo");
        }
        else if (ano==2023){
            System.out.println("Carro novo");
        }
        else {
            System.out.println("invalido");
        }

        placa = placa.toUpperCase();
        for (int i=0; i<placa.length();i++){
            if(placa.charAt(i)=='A' || placa.charAt(i)=='E'|| placa.charAt(i)=='I' || placa.charAt(i)=='O'|| placa.charAt(i)=='U');
             placa = placa.replace(placa.charAt(i), '*');
        }
        System.out.println("Placa alterada: " + placa);
    }
}
