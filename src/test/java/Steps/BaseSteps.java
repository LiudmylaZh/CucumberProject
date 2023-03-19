package Steps;

import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.SidebarPage;
import org.checkerframework.checker.units.qual.C;

public class BaseSteps {
    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();
    SidebarPage sidebarPage = new SidebarPage();
    CartPage cartPage = new CartPage();
}
