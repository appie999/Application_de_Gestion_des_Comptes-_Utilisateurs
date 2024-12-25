import java.util.ArrayList;
import java.util.Scanner;

  class User extends Personne{

        private String email , passWord;
        private Role role;

         static ArrayList<Personne> Users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

    public User(int id , String name , int age , String email, String passWord, Role role) {
        super(id, age, name);
        this.email = email;
        this.passWord = passWord;
        this.role = role;
    }

      public User() {

      }

      public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "~~ the user name is  :" + getName() + '\n'  +
               "~~ the user ID is :" + getId() + '\n'  +
               "~~ the user age is :" + getAge() + '\n' +
               "~~ the Email is :" + email + '\n'  +
               "~~ the password is :" + passWord + '\n'
             + "~~ the user role is :" + role.getrolnom()
                ;
    }
    //-------------------------------------------------------------------------------------------------------

    public  void addUser(){
        System.out.print("enter user id :");
        int id = Main.reader.nextInt();
        System.out.print("enter user name :");
        String name = Main.reader.next();
        System.out.print("enter user age :");
        int age = Main.reader.nextInt();
        System.out.print("enter user Email: ");
        String email = Main.reader.next();
        System.out.print("enter user password: ");
        String password = Main.reader.next();
        System.out.print("enter user role :");
        String role = Main.reader.next();
        Role role1 =new Role(id,role);
        User utilisateur = new User(id,name,age,email,password,role1);
        Users.add(utilisateur);
    }

    void displayUser(){
        for(int i=0;i<Users.size();i++){
            System.out.println(Users);
        }
    }

}



