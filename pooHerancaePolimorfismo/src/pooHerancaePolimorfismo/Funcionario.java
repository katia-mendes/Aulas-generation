package pooHerancaePolimorfismo;
//Classe Funcionario
class Funcionario {
 private String nome;
 private int idade;
 private String cargo;
 private double salario;
 private String departamento;

 // Construtor da classe Funcionario
 public Funcionario(String nome, int idade, String cargo, double salario, String departamento) {
     this.nome = nome;
     this.idade = idade;
     this.cargo = cargo;
     this.salario = salario;
     this.departamento = departamento;
 }

 // Métodos getters e setters para todos os atributos
 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public int getIdade() {
     return idade;
 }

 public void setIdade(int idade) {
     this.idade = idade;
 }

 public String getCargo() {
     return cargo;
 }

 public void setCargo(String cargo) {
     this.cargo = cargo;
 }

 public double getSalario() {
     return salario;
 }

 public void setSalario(double salario) {
     this.salario = salario;
 }

 public String getDepartamento() {
     return departamento;
 }

 public void setDepartamento(String departamento) {
     this.departamento = departamento;
 }

 // Método para visualizar informações do funcionário
 public void visualizar() {
     System.out.println("Nome: " + nome);
     System.out.println("Idade: " + idade);
     System.out.println("Cargo: " + cargo);
     System.out.println("Salário: " + salario);
     System.out.println("Departamento: " + departamento);
 }
}

