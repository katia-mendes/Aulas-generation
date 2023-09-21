package pooHerancaePolimorfismo;
//Classe Gerente que herda de Funcionario
class Gerente extends Funcionario {
private String areaResponsavel;

// Construtor da classe Gerente
public Gerente(String nome, int idade, String cargo, double salario, String departamento, String areaResponsavel) {
   super(nome, idade, cargo, salario, departamento);
   this.areaResponsavel = areaResponsavel;
}

// Método getter para o atributo areaResponsavel
public String getAreaResponsavel() {
   return areaResponsavel;
}

// Método setter para o atributo areaResponsavel
public void setAreaResponsavel(String areaResponsavel) {
   this.areaResponsavel = areaResponsavel;
}

// Método sobrescrito para visualizar informações do gerente
@Override
public void visualizar() {
   super.visualizar(); // Chama o método visualizar da classe pai (Funcionario)
   System.out.println("Área Responsável: " + areaResponsavel);
}
}


