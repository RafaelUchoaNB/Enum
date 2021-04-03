package enums;

public enum MenuEnum {
    PRINCIPAL("Principal"),
    MENU1SUBMENU1("Menu 1 SubMenu 1");

    private String menuEnum;

    MenuEnum(String menuEnum) {
        this.menuEnum = menuEnum;
    }

    public String getMenuEnum() {
        return this.menuEnum;
    }
}


