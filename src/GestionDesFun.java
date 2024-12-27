import java.util.ArrayList;
import java.util.Scanner;

public class GestionDesFun {
    Personne personne= new Personne();
     ArrayList<User> UsersArray = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

            public  void addUser(){
                System.out.print("enter user id :");
                int id = sc.nextInt();
                System.out.print("enter user name :");
                String name = sc.next();
                System.out.print("enter user age :");
                int age = sc.nextInt();
                System.out.print("enter user Email: ");
                String email = sc.next();
                System.out.print("enter user password: ");
                String password = sc.next();
                System.out.print("enter user role :");
                String role = sc.next();
                Role role1 =new Role(id,role);
                User utilisateur = new User(id,name,age,email,password,role1);
                UsersArray.add(utilisateur);
            }

                    void displayUser(){
                        for(int i=0;i<UsersArray.size();i++){
                            System.out.println(UsersArray.get(i));
                            System.out.println("--------------------------------");
                          }
                        System.out.println("there is no Users ");
                    }
                void modifyUser() {

                        System.out.print("enter the ID of the user you want to modify: ");
                        int id_modify = sc.nextInt();
                        for (int i = 0; i < UsersArray.size(); i++) {
                            User user = UsersArray.get(i);
                            if (user.getId() == id_modify) {
                                System.out.print("user found ");
                                System.out.print(" what do you want to modify:");
                                System.out.print("\n1. name: \n2. Age: \n3. Role: \n");
                                System.out.print("choose option: ");
                                int choice = sc.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.print("new name: ");
                                        String name = sc.next();
                                        sc.nextLine();

                                        user.setName(name);

                                        break;
                                    case 2:
                                        System.out.print("new Age: ");
                                        int age = sc.nextInt();
                                        user.setAge(age);
                                        break;
                                    case 3:
                                        System.out.print("new Role: ");
                                        String sRole = sc.next();
                                        sc.nextLine();
                                        Role role = new Role(id_modify, sRole);
                                        user.setRole(role);
                                        break;
                                    default:
                                        System.out.println("not found ");

                                }
                                System.out.println("Modified successfully ✅");
                            }
                        }
                    }

    void deleteUser(){
        System.out.print("enter the ID of the user you want to delete :");
        int id_Delete = sc.nextInt();

        for (int i = 0; i < UsersArray.size(); i++) {
            User user = UsersArray.get(i);
            if (user.getId() == id_Delete){
                UsersArray.remove(i);
                System.out.println("User has been successfully deleted ✅");
            }
        }
    }

    void searchUser(){
        System.out.print("enter the ID of user you want to search :");
        int id_search = sc.nextInt();
        for(int i=0;i<UsersArray.size();i++){
            User user = UsersArray.get(i);
            if (id_search == user.getId()){
                System.out.println(UsersArray.get(i));
            }
        }

    }
}