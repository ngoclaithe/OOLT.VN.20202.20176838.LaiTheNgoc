package aims;

import aims.disc.DigitalVideoDisc;
import aims.media.Book;
import aims.media.Media;
import aims.order.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args){
        showMenu();

    }
    public static void showMenu() {
        int chon;
        String id;
        ArrayList<Media> item = new ArrayList<Media>();
        Order anOrder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("spDVD1","The Lion King", "Animation", "Roger Allers", 11, 77.9f);
        Book bk1 = new Book("spBK1","Star Wars", "Science Fiction", 88.7f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("spDVD2","The Dark Knight", "Action Movie", "Christopher Nolan", 33, 99.4f);
        Book bk2 = new Book("spBK2","Terminator 2: Judgment Day", "Action Movie", 111.9f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("spDVD3","Die Hard", "Action Movie", "John McTiernan", 55, 222.3f);
        Book bk3 = new Book("spBK3","Inception", "Action Movie",33.2f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("spDVD4","Conan", "Action Movie", "Christopher Nolan", 80, 40.7f);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Order Management Application: ");
            System.out.println("--------------------------------");
            System.out.println("1.Create new order");
            System.out.println("2.Add item to the order");
            System.out.println("3.Delete item list of order");
            System.out.println("4.Display the items list of order");
            System.out.println("0.Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            chon = scanner.nextInt();
            switch (chon){
                case 1:
                    item.add(dvd1);
                    item.add(bk1);
                    item.add(dvd2);
                    item.add(bk2);
                    System.out.println("Order da duoc tao!");
                    break;
                case 2:
                    anOrder.addItem(dvd1);
                    anOrder.addItem(bk3,bk1);
                    anOrder.addItem(item);
                    break;
                case 3:
                    System.out.println("Moi ban nhap id can xoa: ");
                    Scanner sc = new Scanner(System.in);
                    id = sc.nextLine();
                    anOrder.removeItem(id);
                    break;
                case 4:
                    anOrder.printOrder();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yeu cau nhap lai!");
            }

        } while (chon != 0);
    }
}
