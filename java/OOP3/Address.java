public class Address {
    String area;
    String city;
    int pincode;

    public Address() {
        area = new String("NA");
        city = new String("NA");
        pincode = 0;
    }

    public Address(String area, String city, int pincode) {
        this.area = area;
        this.city = city;
        this.pincode = pincode;
    }

    public void display() {
        System.out.println("The Address is:\nCity:" + city +
                "\nArea: " + area +
                "\nPincode: " + pincode);
    }

}
