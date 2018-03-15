package jonamatoka.violet.store;

import jonamatoka.violet.product.Cart;

import jonamatoka.violet.product.Product;
import jonamatoka.violet.util.ITrackable;

import org.dizitart.no2.objects.Id;

public class Store implements ITrackable {

    @Id
    private String id;
    private String ownerId;
    private String name;
    private String type;
    private String address;

    private Cart inventory = new Cart();

    private int views;
    private int orders;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getOwnerId() { return ownerId; }

    public void setOwnerId(String ownerID) { this.ownerId = ownerID; }

    public String getName() { return name; }

    public Store setName(String name) { this.name = name; return this; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public void add(Product product) { this.inventory.add(product); }

    public void remove(Product product) { this.inventory.remove(product); }

    public Cart getInventory() { return inventory; }

    @Override
    public int views() { return views; }

    @Override
    public int orders() { return orders; }

    @Override
    public void view(int views) { this.views += views; }

    @Override
    public void order(int orders) { this.orders += orders; }

    @Override
    public String toString() {
        return "StorePages{" +
                "id='" + id + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}