package Cadastro;

public class Cadastrouser {
   private int id_user;
   private String name;
   private int age;
   private char cpf;
   private char tell; //new
   private String email;
   private String senha; //new
   


public Cadastrouser(String name, int idade, char cepefe, char fone, String meil, String pass){
    this.name = name;
    this.age = idade;
    this.cpf = cepefe;
    this.tell = fone;
    this.email = meil;
    this.senha = pass;

}


public void Login(){
    
}


   //////////////////////////////////////
   public char getTell() {
       return tell;
   }

   public void setTell(char tell) {
       this.tell = tell;
   }

//////////////////////////////////////////
   public String getName() {
       return name;
   }

   public void setName(String nome) {
       this.name = nome;
     
   }

//////////////////////////////////////////

public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}

//////////////////////////////////////////////

public char getCpf() {
    return cpf;
}
public void setCpf(char cpf) {
    this.cpf = cpf;
}
//////////////////////////////////////////////

public String getEmail() {
    return email;
}public void setEmail(String email) {
    this.email = email;
}
/////////////////////////////////////////////

public String getSenha() {
    return senha;
}
public void setSenha(String senha) {
    this.senha = senha;
}
///////////////////////////////////////

public void imprimirDados(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Email: " + email);

}


}