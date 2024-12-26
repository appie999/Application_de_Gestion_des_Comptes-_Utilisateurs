import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        GestionDesFun gestionDesFun = new GestionDesFun();

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
        System.out.print
                (" enter your choice :");
        choice= reader.next();
        switch (choice){

            case "1":
                    gestionDesFun.addUser();
                break;

            case "2":

                break;

            case "3":
                    gestionDesFun.modifyUser();
                break;

            case "4":
                gestionDesFun.deleteUser();
                break;

            case "5":
                gestionDesFun.displayUser();
                break;

            case "0":
                break;

        }
    }
    }
}