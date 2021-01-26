
import java.util.*; 
public class PlantShop {
    Scanner sc = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("\n1. Apple tree");
        System.out.println("2. Strawberry tree");
        System.out.println("3. Grape tree");
        System.out.println("4. Lemon tree");
        System.out.println("5. Cherry tree");
        System.out.println("6. Quit the program");
    }

    public void appleTree(){
        System.out.println("\nPls, choose a level of growth of apple tree");
        System.out.println("1. Small level (7$/tree)");
        System.out.println("2. Medium level (10$/tree)");
        System.out.println("3. Large level (12$/tree)");
        System.out.print("Enter your choice here: ");
        int choice = Integer.parseInt(sc.nextLine());

        if(choice==1){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 7;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n",prePrice );
            }
        }
        else if(choice==2){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 10;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n",prePrice );
            }
        }
        else if(choice==3){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 12;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n ",prePrice );
            }
        }
    }

    public void strawberryTree(){
        System.out.println("\nPls, choose a level of growth of strawberry tree");
        System.out.println("1. Small level (10$/tree)");
        System.out.println("2. Medium level (15$/tree)");
        System.out.println("3. Large level (20$/tree)");
        System.out.print("Enter your choice here: ");
        int choice = Integer.parseInt(sc.nextLine());

        if(choice==1){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 10;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==2){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 15;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==3){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 20;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n ",prePrice );
            }
        }
    }

    public void grapeTree(){
        System.out.println("\nPls, choose a level of growth of grape tree");
        System.out.println("1. Small level (5$/tree)");
        System.out.println("2. Medium level (7$/tree)");
        System.out.println("3. Large level (9$/tree)");
        System.out.print("Enter your choice here: ");
        int choice = Integer.parseInt(sc.nextLine());

        if(choice==1){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 5;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==2){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 7;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==3){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 9;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n ",prePrice );
            }
        }
    }

    public void lemonTree(){
        System.out.println("\nPls, choose a level of growth of lemon tree");
        System.out.println("1. Small level (3$/tree)");
        System.out.println("2. Medium level (4$/tree)");
        System.out.println("3. Large level (5$/tree)");
        System.out.print("Enter your choice here: ");
        int choice = Integer.parseInt(sc.nextLine());

        if(choice==1){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 3;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==2){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 4;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==3){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 5;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n ",prePrice );
            }
        }
    }

    public void cherryTree(){
        System.out.println("\nPls, choose a level of growth of cherry tree");
        System.out.println("1. Small level (12$/tree)");
        System.out.println("2. Medium level (15$/tree)");
        System.out.println("3. Large level (18$/tree)");
        System.out.print("Enter your choice here: ");
        int choice = Integer.parseInt(sc.nextLine());

        if(choice==1){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 12;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==2){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 15;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==3){
            System.out.print("How many trees do u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 18;
            int prePrice = price*amountOfTree; 
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n ",prePrice );
            }
        }
    }

}
class sale{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PlantShop p = new PlantShop();

        while(true){
            p.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if(choice==1){
                p.appleTree();
            }
            else if(choice==2){
                p.strawberryTree();
            }
            else if (choice==3){
                p.grapeTree();
            }
            else if(choice==4){
                p.lemonTree();
            }
            else if(choice==5){
                p.cherryTree();
            }
            else if(choice==6){
                break;
            }
        }
    }
}

