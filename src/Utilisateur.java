import java.util.ArrayList;
import java.util.Scanner;

  class User extends Personne{

        private String email , passWord;
        private Role role;

     User(int id , String name , int age , String email, String passWord, Role role) {
        super(id, age, name);
        this.email = email;
        this.passWord = passWord;
        this.role = role;
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







      /*public void deleteUser() {
          int idR;
          System.out.print("enter the id of the user you want to delete :");
          idR = sc.nextInt();


               // Users.removeIf(user->user.getId()==idR);
          for (int i =0 ; i< Users.size(); i++){
              if (personne.getId()==idR)
              {
                    Users.remove(i);
                  System.out.println("hhhhhhhh");
              }
          }
      }*/
  }



