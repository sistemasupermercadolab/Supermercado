package modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**Classe funcionário: possui os dados do funcionário.*/
@Entity
public class Funcionario {
	
	/**Código do funcionário.*/
	@Id
	@GeneratedValue
	private int codigoFuncionario;
	
	/**Telefone do funcionário.*/
	private long telefoneFuncionario;
	
	/**Celular do funcionário.*/
	private long celularFuncionario;
	
	/**Status do funcionário. 1 - Ativo 2 - Inativo.*/
	private int statusFuncionario;
	
	/**Sexo do funcionário. 1 - Masculino 2 - Feminino.*/
	private int sexoFuncionario; 
	
	/**Nome do funcionário.*/
	private String nomeFuncionario;
	
	/**CPF do funcionário.*/
	private long cpfFuncionario;
	
	/**RG do funcionário.*/
	private long rgFuncionario;
	
	/**Data de nascimento do funcionário.*/
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimentoFuncionario;
	
	/**Data de cadastro do funcionário.*/
	@Temporal(TemporalType.DATE)
	private Calendar dataCadastroFuncionario;

	/**Cargo do funcionário.*/
	@OneToOne
	private Cargo cargo; 
	
	/**Endereço do funcionário.*/
	@OneToOne
	private Endereco endereco; 

	/**Construtor da classe funcionário.*/
	public Funcionario() {

		/**Inicializar código do funcionário.*/
		codigoFuncionario = 0;
		
		/**Inicializar status do funcionário.*/
		statusFuncionario = 0;
		
		/**Inicializar telefone do funcionário.*/
		telefoneFuncionario = 0;
		
		/**Inicializar celular do funcionário.*/
		celularFuncionario = 0;
		
		/**Inicializar sexo do funcionário.*/
		sexoFuncionario = 0;
		
		/**Inicializar nome funcionário.*/
		nomeFuncionario = "";
		
		/**Inicializar cpf do funcionário.*/
		cpfFuncionario = 0;
		
		/**Inicializar rgdo funcionário.*/
		rgFuncionario = 0;		
		
		/**Inicializar data de cadastro do funcionário.*/
		dataCadastroFuncionario = Calendar.getInstance();
		
		/**Inicializar data de nascimento do funcionário.*/
		dataNascimentoFuncionario = Calendar.getInstance();

		/**Inicializar cargo do funcionário.*/
		cargo = new Cargo();
		
		/**Inicializar endereço do funcionário.*/
		endereco = new Endereco();
	}

	/**Retorna o código do funcionário.*/
	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	/**Seta o código do funcionário.*/
	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	/**Retorna o telefone do funcionário.*/
	public long getTelefoneFuncionario() {
		return telefoneFuncionario;
	}

	/**Seta o telefone do funcionário.*/
	public void setTelefoneFuncionario(long telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}

	/**Retorna o celular do funcionário.*/
	public long getCelularFuncionario() {
		return celularFuncionario;
	}

	/**Seta o celular do funcionário.*/
	public void setCelularFuncionario(long celularFuncionario) {
		this.celularFuncionario = celularFuncionario;
	}

	/**Retorna o status do funcionário.*/
	public int getStatusFuncionario() {
		return statusFuncionario;
	}

	/**Seta o status do funcionário.*/
	public void setStatusFuncionario(int statusFuncionario) {
		this.statusFuncionario = statusFuncionario;
	}

	/**Retorna o nome do funcionário.*/
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	/**Seta o nome do funcionário.*/
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	/**Retorna o cpf do funcionário.*/
	public long getCpfFuncionario() {
		return cpfFuncionario;
	}

	/**Seta o cpf do funcionário.*/
	public void setCpfFuncionario(long cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	/**Retorna o rg do funcionário.*/
	public long getRgFuncionario() {
		return rgFuncionario;
	}

	/**Seta o rgdo funcionário.*/
	public void setRgFuncionario(long rgFuncionario) {
		this.rgFuncionario = rgFuncionario;
	}

	/**Retorna o sexo do funcionário.*/
	public int getSexoFuncionario() {
		return sexoFuncionario;
	}

	/**Seta o sexo do funcionário.*/
	public void setSexoFuncionario(int sexoFuncionario) {
		this.sexoFuncionario = sexoFuncionario;
	}


	/**Retorna o cargo do funcionário.*/
	public Cargo getCargo() {
		return cargo;
	}

	/**Seta o cargo do funcionário.*/
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	/**Retorna o endereço do funcionário.*/
	public Endereco getEndereco() {
		return endereco;
	}

	/**Seta o endereço do funcionário.*/
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Calendar getDataNascimentoFuncionario() {
		return dataNascimentoFuncionario;
	}

	public void setDataNascimentoFuncionario(Calendar dataNascimentoFuncionario) {
		this.dataNascimentoFuncionario = dataNascimentoFuncionario;
	}

	public Calendar getDataCadastroFuncionario() {
		return dataCadastroFuncionario;
	}

	public void setDataCadastroFuncionario(Calendar dataCadastroFuncionario) {
		this.dataCadastroFuncionario = dataCadastroFuncionario;
	}
	
	

}
