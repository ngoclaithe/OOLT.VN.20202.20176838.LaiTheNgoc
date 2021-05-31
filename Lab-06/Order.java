package aims.order;
import aims.media.Media;

import java.util.ArrayList;
import java.util.Random;

public class Order {
    public static final int MAX_NUMBERS_ORDERD = 10;
    public static final int MAX_LIMITED_ORDERS = 5;
    public static int nbOrders = 0;
    private final ArrayList<Media> itemOrder = new ArrayList<Media>();
    public ArrayList<Media> getItemOrder(){
        return itemOrder;
    }
    public void testItemsOrdered(){
        int dem = itemOrder.size();
        if(dem < MAX_NUMBERS_ORDERD - 1 ){
            System.out.println("Them thanh cong!");
        }
        if (dem == MAX_NUMBERS_ORDERD -1){
            System.out.println("Them thanh cong! Order da day!");
        }
        if (dem > MAX_NUMBERS_ORDERD -1 ){
            System.out.println("Khong the them do Order da day!");
        }
    }

    public void addItem(Media media) {
        if (itemOrder.size() < MAX_NUMBERS_ORDERD - 1) {
            itemOrder.add(media);
            System.out.println("Them thanh cong");
        }
        else if (itemOrder.size() == MAX_NUMBERS_ORDERD - 1){
            itemOrder.add(media);
            System.out.println("Don hang da day!");
        }
        else {
            System.out.println("Loi! Khong the them do don hang da day!");
        }
    }
    public void addItem(Media media1, Media media2){
        addItem(media1);
        addItem(media2);
    }
    public void addItem(ArrayList<Media> media){
        for (Media value : media) {
            addItem(value);
        }
    }
    public void removeItem(String id) {
        int count = 0;
        for (int i=0; i < itemOrder.size(); i++){
            if (itemOrder.get(i).getId().equals(id)){
                itemOrder.remove(i);
                count++;
                break;
            }
        }
        if (count != 0){
            System.out.println(" Da xoa thanh cong!");
        }
        else {
            System.out.println("Khong tim thay ten!");
        }
    }
    public float totalCost(){
        float total = 0;
        for (Media media : itemOrder) {
            total = total + media.getCost();
        }
        return total;
    }
    public void getALuckyItem(ArrayList<Media> media){
        Random ran = new Random();
        int a;
        a = ran.nextInt(itemOrder.size());
        Media aLuckyItem = itemOrder.get(a);
        System.out.println("Don hang mien phi: " +aLuckyItem.getId());
        float totalCost = this.totalCost() - aLuckyItem.getCost();
        System.out.println("Gia cua don hang: " +totalCost);
    }
    public void printOrder(){
        ArrayList<Media> media = new ArrayList<Media>();
        System.out.println("------The items list of order------");
        for (int i=0; i < itemOrder.size(); i++){
            System.out.println(i + 1 + "." + itemOrder.get(i).getId() + "," + itemOrder.get(i).getTitle() + ","
            + itemOrder.get(i).getCategory() + "," + itemOrder.get(i).getCost());
        }
        System.out.println("Total cost: " +totalCost());
        System.out.println("Ban co 1 don hang mien phi!");
        getALuckyItem(media);
    }
}
