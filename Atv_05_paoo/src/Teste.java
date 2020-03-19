
import javax.swing.JOptionPane;


public class Teste {

   /* public static void main(String[] args) {
        PancakeHouseMenu phm = new PancakeHouseMenu();
        DinerMenu dm = new DinerMenu();
        LancheDaTardeMenu ltm = new LancheDaTardeMenu();
        Garconete garconete = new Garconete(phm, dm, ltm);
        garconete.printMenu();
    }*/
    
    public static void main(String[] args) {
        PancakeHouseMenu phm = new PancakeHouseMenu();
        DinerMenu dm = new DinerMenu();
        LancheDaTardeMenu ltm = new LancheDaTardeMenu();
        Garconete g = null;
        String menu = "1-Exibir menu geral\n2-Exibir menu de café da manhã\n3-Exibir menu de jantar\n4-Exibir menu de lanche da tarde\n5-Exibir menu vegetariano";
        
        int opcaoCardapio = Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch(opcaoCardapio){
            case 1: 
                g = new Garconete(phm, dm, ltm);
                g.printMenu();
                //System.out.println(g.printMenu());
                break;
            case 2:
                g = new Garconete(phm);
                g.printMenuPH();
                break;
            case 3:
                g = new Garconete(dm);
                g.printMenuDiner();
                break;
            case 4:
                g = new Garconete(ltm);
                g.printMenuTarde();
                break;
            case 5:
                g = new Garconete(phm, dm, ltm);
                g.printMenuVegetariano();
                
        }    
        //garconete.printMenu();
    }
    
}
