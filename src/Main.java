import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з іменем Price, що містить такі поля:
 *  назву товару;
 *  назву магазину, в якому продається товару
 *  вартість товару у гривнях.
 * Написати програму, яка виконує такі дії:
 *  введення з клавіатури даних до масиву, що складається з двох елементів типу Price (записи мають бути впорядковані в алфавітному порядку за назвами магазинів);
 *  виведення на екран інформації про товари, що продаються в магазині, назва якого введена з клавіатури (якщо такого магазину немає, вивести виняток).
 */

public class Main {
    public static Scanner scannerInputData = new Scanner(System.in);
    private static int numberElements = 2;
    private static ArrayList<Price> ListPrices = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter data for" + numberElements + " products:");
        for (int i = 0; i < numberElements; i++) {
            System.out.println("product " + (i + 1) + ":");
            System.out.print("Name of product: ");
            String productName = scannerInputData.nextLine();
            System.out.print("Name of store: ");
            String storeName = scannerInputData.nextLine();
            System.out.print("Price of product: ");
            double priceValue = scannerInputData.nextDouble();
            scannerInputData.nextLine();
            Price newPrice = new Price(productName, storeName, priceValue);
            ListPrices.add(newPrice);
        }

        Collections.sort(ListPrices, Comparator.comparing(Price::getStoreName));
        System.out.print("Enter the store name to search: ");
        String searchStore = scannerInputData.nextLine();
        System.out.println(searchStore);
        getInfoProductByStore(searchStore);

    }
    public static void getInfoProductByStore(String searchStore) {
        for (int i = 0; i < ListPrices.size(); i++) {
            if (ListPrices.get(i).getStoreName().equalsIgnoreCase(searchStore)) {
                System.out.println("Product: " + ListPrices.get(i).getProductName());
                System.out.println("Store: " + ListPrices.get(i).getStoreName());
                System.out.println("Price: " + ListPrices.get(i).getProductPrice());
                break;
            }else{
                throw new RuntimeException("No such store found");
            }
        }
    }
}









