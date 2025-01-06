import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ZOMATO");
        System.out.println("Enter your Username");
        String username=sc.next();
        System.out.println("Enter your Password");
        String password=sc.next();
        boolean orderexists=true;
        while(orderexists) {
            System.out.println("Choose your food preference:");
            System.out.println("1.Veg\n2.Non-Veg\n3.Beverages\n4.Desserts\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Veg");
                    System.out.println("Choose the cuisine for your Veg food\n1.North Indian\n2.South Indian");
                    int option = sc.nextInt();
                    switch (option) {
                        case 1: {
                            System.out.println("1.Paneer tikka\n2.Dal Makhni");
                            int op = sc.nextInt();
                            switch (op) {
                                case 1: {
                                    System.out.println("Paneer tikka is choosen!");
                                    break;
                                }
                                case 2: {
                                    System.out.println("Dal Makhni is chosen");
                                    break;
                                }
                            }
                            break;

                        }
                        case 2: {
                            System.out.println("1.Dosa\n2.Idli");
                            int op = sc.nextInt();
                            switch (op) {
                                case 1: {
                                    System.out.println("Dosa is choosen!");
                                    break;
                                }
                                case 2: {
                                    System.out.println("Idli is chosen");
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;

                case 2: {
                    System.out.println("Non-Veg");
                    System.out.println("Choose the cuisine for your Veg food\n1.Punjabi\n2.Arabian");
                    int preference = sc.nextInt();
                    switch (preference) {
                        case 1: {
                            System.out.println("1.Butter Chicken\n2.Kheema Naan");
                            int opt = sc.nextInt();
                            switch (opt) {
                                case 1: {
                                    System.out.println("Butter Chicken is chosen!");
                                    break;
                                }
                                case 2: {
                                    System.out.println("Kheema Naan is chosen");
                                    break;
                                }
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("1.Chicken Shawarma\n2.Mutton Kebab");
                            int opt = sc.nextInt();
                            switch (opt) {
                                case 1: {
                                    System.out.println("Chicken Shawarma is chosen!");
                                    break;
                                }
                                case 2: {
                                    System.out.println("Mutton Kebab is chosen!");
                                    break;
                                }
                            }
                            break;
                        }

                    }
                    break;
                }
                case 3: {
                    System.out.println("3.Beverages");
                    System.out.println("1.Milkshake\n2.Mojito");
                    int opt = sc.nextInt();
                    switch (opt) {
                        case 1: {
                            System.out.println("Milkshake is chosen!");
                            break;
                        }
                        case 2: {
                            System.out.println("Mojito is chosen!");
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("4.Desserts");
                    System.out.println("1.Cakes\n2.Sweets");
                    int opt = sc.nextInt();
                    switch (opt) {
                        case 1: {
                            System.out.println("Cake is chosen!");
                            break;
                        }
                        case 2: {
                            System.out.println("Sweet is chosen!");
                            break;
                        }
                    }
                    break;
                }
            }
            System.out.println("Choose the restraunt:\n1.Food delight\n2.The Ashwins\n3.Annapoorna");
            int restraunt = sc.nextInt();
            if (restraunt==1){
                System.out.println("Food Delight-Fresh & Tasty");
                System.out.println("Enter the cost of one dish");
                double cost = sc.nextDouble();
                System.out.println("Choose the quantity");
                int quantity = sc.nextInt();
                double price = quantity * cost;
                if (price > 500) {
                    System.out.println("An exciting offer!");
                    System.out.println("The discount is 5% and you will get a cupcake free!");
                    System.out.println("The food price after discount is" + (price * 0.95));
                } else {
                    System.out.println("The food price is Rs" + price);
                }
                System.out.println("Do you want to place the order(Y/N)");
                String order = sc.next();
                if (order.equals("Y")) {
                    System.out.println("Order is successfully placed!");
                } else {
                    System.out.println("Unfortunately Order is not placed");
                }
            }
            else if (restraunt==2)
            {
                System.out.println("The Ashwin's-Family Restautant");
                System.out.println("Enter the cost of one dish");
                double cost = sc.nextDouble();
                System.out.println("Choose the quantity");
                int quantity = sc.nextInt();
                double price = quantity * cost;
                if (price > 500) {
                    System.out.println("The discount is 7%");
                    System.out.println("The food price after discount is Rs" + (price * 0.93));
                } else {
                    System.out.println("The food price is " + price);
                }
                System.out.println("Do you want to place the order(Y/N)");
                String order = sc.next();
                if (order.equals("Y")) {
                    System.out.println("Order is successfully placed!");
                } else {
                    System.out.println("Unfortunately Order is not placed");
                }
            }
            else if (restraunt==3) {
                System.out.println("Annapoorna-The Tradition of Coimbatore");
                System.out.println("Enter the cost of one dish");
                double cost = sc.nextDouble();
                System.out.println("Choose the quantity");
                int quantity = sc.nextInt();
                double price = quantity * cost;
                if (price > 700) {
                    System.out.println("The discount is 10%");
                    System.out.println("The food price after discount is Rs" + (price * 0.9));
                } else {
                    System.out.println("The food price is" + price);
                }
                System.out.println("Do you want to place the order(Y/N)");
                String order = sc.next();
                if (order.equals("Y")) {
                    System.out.println("Order is successfully placed!");
                } else {
                    System.out.println("Unfortunately Order is not placed");
                }
            }
            else {
                System.out.println("Sorry,Services not available at the moment,We'll update soon");
                break;
            }
            System.out.println("Do you want to continue ordering?");
            orderexists = sc.nextBoolean();
        }
        System.out.println("Do you want to rate our application's performance?");
        String wanttorate=sc.next();
        if(wanttorate.equals("Y")) {
            int ratings = sc.nextInt();
            if (ratings >= 1 && ratings <= 5) {
                System.out.println("Thank you for rating!,Give us your feedback");
                String feedback = sc.next();
            }
        }
        else{
            System.out.println("Exit");
        }
        System.out.println("Thank you,Visit Again");

    }
}

