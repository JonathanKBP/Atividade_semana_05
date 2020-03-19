
public class Garconete {

    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu lancheDaTardeMenu;
    //private Menu vegetariano;

    public Garconete(Menu pancakeHouseMenu, Menu dinerMenu, Menu lancheDaTardeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.lancheDaTardeMenu = lancheDaTardeMenu;
    }

    Garconete(PancakeHouseMenu pancakeHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    Garconete(DinerMenu dinerMenu) {
         this.dinerMenu = dinerMenu;
    }

    Garconete(LancheDaTardeMenu lancheDaTardeMenu) {
        this.lancheDaTardeMenu = lancheDaTardeMenu;
    }
    

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void printMenu() {
        printMenu(pancakeHouseMenu.createIterator());
        printMenu(dinerMenu.createIterator());
        printMenu(lancheDaTardeMenu.createIterator());
    }
    
    public void printMenuDiner() {
        printMenu(dinerMenu.createIterator());
    }
    
    public void printMenuPH() {
        printMenu(pancakeHouseMenu.createIterator());
    }
    
    public void printMenuTarde() {
        printMenu(lancheDaTardeMenu.createIterator());
    }
    public void printMenuVegetariano(){
        printMenu(pancakeHouseMenu.createIteratorVege());
        printMenu(dinerMenu.createIteratorVege());
        printMenu(lancheDaTardeMenu.createIteratorVege());
    }

    /*public void exibirMenuGeral() {
	System.out.println("=========Menu Completo=========");
	for (int i = 0; i < pancakeHouseMenu.getItems().size(); i++) {
            System.out.println(pancakeHouseMenu.getItems().get(i));
	}

	for (int i = 0; i < dinerMenu.getItems().length && dinerMenu.getItems()[i] != null; i++) {
            System.out.println(dinerMenu.getItems()[i]);
	}
    }*/
   /*public void exibirMenuVegetariano (){
        System.out.println("=========Menu Vegetariano=========");
        for (int i = 0; i < pancakeHouseMenu.getItems().size(); i++) {
        	if (pancakeHouseMenu.getItems().get(i).isVegetariano())
                    System.out.println(pancakeHouseMenu.getItems().get(i));
	}
		
        for (int i = 0; i < dinerMenu.getItems().length && dinerMenu.getItems()[i] != null; i++) {
            if (dinerMenu.getItems()[i].isVegetariano()){
                System.out.println(dinerMenu.getItems()[i]);
        	}
        }
    }*/
}
