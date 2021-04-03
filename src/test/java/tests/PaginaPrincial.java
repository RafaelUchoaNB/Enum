package tests;

import menu.Menu;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static enums.MenuEnum.PRINCIPAL;

public class PaginaPrincial {

    Menu menu;

    @BeforeClass
    public void setUp() {
        open("file:///Users/uchoa/IdeaProjects/Enum/src/main/java/htmls/Menu%20e%20SubMenu/MenuSubMenu.html");
    }

    @Test
    public void acessarMenuPrincipal() {
        Menu.selecionarMenu(PRINCIPAL);
    }
}
