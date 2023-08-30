package Inventory;

 

import java.util.Scanner;

 

public class ProductMenu {

    private static ProductJsbcDao dao;

    static {

        try {

            dao = new ProductJsbcDao();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

 

    public static void main(String[] args) {

        

        Scanner scan = new Scanner(System.in);

        while(true) {    

        System.out.println("Main Menu");

        System.out.println("1- Add Product\n2- Find Product\n3- List Product\n4-Delete Product\n5- Exit");

        System.out.println("Enter Choise: ");

        int choice = scan.nextInt();

        switch(choice) {

        case 1 :

            addProduct();

            break;

        case 2 : findProduct(); break;

        case 3 : listProduct(); break;

        case 4 : delProduct(); break;

        case 5 : System.exit(0); break;

        default : System.out.println("Invalid option");

        }

    }

            

    }    

 

    private static void addProduct() {

        Scanner scan = new Scanner(System.in);

 

        System.out.println("Enter Product Code: ");

        int code = scan.nextInt();

        System.out.println("Enter Product Name: ");

        String name = scan.next();

        System.out.println("Enter Product Price: ");

        double price = scan.nextDouble();

 

        Product p = new Product(code, name, price);

        dao.add(p);

        //scan.close();

    }

    

 

    private static void delProduct() {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter Product Code: ");

        int code = console.nextInt();

        dao.delete(code);

        //console.close();

    }

 

    private static void listProduct() {

        dao.list().forEach(System.out::println);

    }

 

    private static void findProduct() {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter Product Code: ");

        int code = console.nextInt();

        System.out.println(dao.find(code));

        //console.close();

    }

}