package outros;

public class Funcionario {

	private Integer codigo;
	private String nome;
	private Float salario;
	
	public Funcionario(Integer codigo, String nome, Float salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}
	
	public void incrementar(float porcentagem) {
		salario += salario * porcentagem / 100;
	}
	
	public String toString() {
		return "Código: " + codigo + ", " + nome + ", R$ " + String.format("%.3f", salario);
	}
}
