package edu.jairo.ramirez.actividades.act1.process;

import edu.jairo.ramirez.actividades.act1.ui.CLI;

public class Starter {
    public static void main(String[] args) {
        CLI cli = new CLI();
        StockManager stockManager = new StockManager();
        String choice;

        try {
            do {
                cli.showMenu();
                choice = cli.getUserInput();
                switch (choice) {
                    case "1":
                        addCar(cli, stockManager);
                        break;
                    case "2":
                        stockManager.showStock();
                        break;
                    case "3":
                        cli.showMessage("Adio");
                        break;
                    default:
                        cli.showMessage("Opción no válida.");
                }
            } while (!choice.equals("3"));
        } catch (Exception e) {
            cli.showMessage("Ocurrió un error: " + e.getMessage());
        } finally {
            cli.closeScanner();
        }
    }

    private static void addCar(CLI cli, StockManager stockManager) {
        System.out.print("Ingrese la marca del carro: ");
        String brand = cli.getUserInput();
        System.out.print("Ingrese el modelo del carro: ");
        String model = cli.getUserInput();
        System.out.print("Ingrese el tipo de carrocería (sedan, suv, coupe, convertible, pick up, wagon): ");
        String bodyType = cli.getUserInput();
        System.out.print("Ingrese el año del carro: ");
        int year = Integer.parseInt(cli.getUserInput());
        System.out.print("Ingrese el color del carro: ");
        String color= cli.getUserInput();

        try {
            stockManager.addCar(brand, model, bodyType, year, color);
        } catch (IllegalArgumentException e) {
            cli.showMessage(e.getMessage());
        }
    }
}