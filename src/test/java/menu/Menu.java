package menu;

import com.codeborne.selenide.SelenideElement;
import enums.MenuEnum;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;

public class Menu  {

    private static SelenideElement getMenu(String menu) {
        return $x("//button[text()='"+menu+"']");
    }

    private static SelenideElement getSubMenu(String subMenu) {
        return $x("//a[text()='"+subMenu+"']");
    }

    public static void selecionarMenu(MenuEnum menuEnum) {
        MenuEnum menu = menuEnum;

        switch (menu) {
            case PRINCIPAL:
                getSubMenu(menu.getMenuEnum()).click();
                break;
            case MENU1SUBMENU1:
                actions().moveToElement(getMenu("Menu 1 "))
                        .click(getSubMenu(menu.getMenuEnum())).perform();
                break;
        }
    }



}
