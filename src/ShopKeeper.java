public class ShopKeeper {
private Mobile mobile;

public void displayMobile(String choice) {
        switch (choice.toLowerCase()) {
        case "iphone":
        mobile = new Iphone();
        break;
        case "samsung":
        mobile = new Samsung();
        break;
        case "nokia":
        mobile = new Nokia();
        break;
default:
        System.out.println("Sorry, we don't have this mobile in stock");
        return;
        }
        mobile.model();
        mobile.price();
        }
        }
