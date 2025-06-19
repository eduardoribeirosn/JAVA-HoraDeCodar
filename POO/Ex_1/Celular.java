package POO.Ex_1;

import java.util.Scanner;

public class Celular {
    
    private String marca;
    private String modelo;
    private int bateria = 100;
    private boolean on;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void showInfos() {
        System.out.println("\nCelular: " + modelo +
        "\nMarca: " + marca +
        "\nBateria: " + bateria +
        "\nLigado: " + on + "\n");
    }

    public void ligarCelular(Scanner scanner) {
        if(on) {
            System.out.println("O Celular já está ligado.");
        } else {
            System.out.println("Ligando o Celular...");
            on = true;
            System.out.println("Celular Ligado.");
            reduceGroup(scanner);
        }
    }

    private void desligarCelular() {
        if(!on) {
            System.out.println("O Celular já está desligado.");
        } else {
            System.out.println("\nDesligando o Celular...");
            on = false;
            System.out.println("Celular Desligado.");
        }
    }

    private void reduceGroup(Scanner scanner) {
        while (bateria >= 1) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bateria--;
            if (bateria <= 0) {
                desligarCelular();
                showInfos();
                break;
            }
            if (bateria % 5 == 0) {
                // System.out.println("Sua bateria é: " + bateria);
                showInfos();
                System.out.println("Deseja desligar seu Celular? (S/N)");
                String resp = scanner.next().trim().substring(0, 1);
                if (resp.equalsIgnoreCase("S")) {
                    desligarCelular();
                    break;
                }
            }
        }
    }

}
