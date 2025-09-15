package Exercicio;

public class AgrupaTimes {

    public static void main(String[] args) {
            String time = "Palmeiras";

            switch (time) {
                case "Flamengo":
                case "Vasco":
                    System.out.println("Estado: Rio de Janeiro (RJ)");
                    break;

                case "Palmeiras":
                case "Santos":
                    System.out.println("Estado: São Paulo (SP)");
                    break;

                default:
                    System.out.println("Estado desconhecido");
            }
        }
    }

