import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);


    public static void main(String[] args) {
        User user = new User();


    String choice;

    while (true){
        System.out.println(" \n---Gestion des Compte Utilisateur---\n");
        System.out.println("1. Ajouter un utilisateur:");
        System.out.println("2. Rechercher un utilisateur:");
        System.out.println("3. Modifier un utilisateur:");
        System.out.println("4. Supprimer un utilisateur:");
        System.out.println("5. Afficher les utilisateurs:");
        System.out.println("0. Sortie");
        System.out.println(" _______________________________________\n");
        System.out.print("entrez votre choix: ");

        choice= reader.next();
        switch (choice){

            case "1":
                user.addUser();
                break;

            case "2":

                break;

            case "3":
                break;

            case "4":
                break;

            case "5":
                user.displayUser();
                break;

            case "0":
                break;

        }
    }
    }
}