package Cliente;

class Cliente {
	    // Esses são os atributos da classe Cliente:
	    private String nome;
	    private int idade;
	    private String endereco;
	    private String email;
	    private String telefone;

	    // Construtor da classe Cliente com parâmetros
	    public Cliente(String nome, int idade, String endereco, String email, String telefone) {
	        this.nome = nome;
	        this.idade = idade;
	        this.endereco = endereco;
	        this.email = email;
	        this.telefone = telefone;
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

	    public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }

	    // Método para visualizar informações do cliente
	    public void visualizar() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("Endereço: " + endereco);
	        System.out.println("Email: " + email);
	        System.out.println("Telefone: " + telefone);
	    }
	}



