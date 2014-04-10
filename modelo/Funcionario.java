package modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**Classe funcion�rio: possui os dados do funcion�rio.*/
@Entity
public class Funcionario {
	
	/**C�digo do funcion�rio.*/
	@Id
	@GeneratedValue
	private int codigoFuncionario;
	
	/**Telefone do funcion�rio.*/
	private long telefoneFuncionario;
	
	/**Celular do funcion�rio.*/
	private long celularFuncionario;
	
	/**Status do funcion�rio. 1 - Ativo 2 - Inativo.*/
	private int statusFuncionario;
	
	/**Sexo do funcion�rio. 1 - Masculino 2 - Feminino.*/
	private int sexoFuncionario; 
	
	/**Nome do funcion�rio.*/
	private String nomeFuncionario;
	
	/**CPF do funcion�rio.*/
	private long cpfFuncionario;
	
	/**RG do funcion�rio.*/
	private long rgFuncionario;
	
	/**Data de nascimento do funcion�rio.*/
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimentoFuncionario;
	
	/**Data de cadastro do funcion�rio.*/
	@Temporal(TemporalType.DATE)
	private Calendar dataCadastroFuncionario;

	/**Cargo do funcion�rio.*/
	@OneToOne
	private Cargo cargo; 
	
	/**Endere�o do funcion�rio.*/
	@OneToOne
	private Endereco endereco; 

	/**Construtor da classe funcion�rio.*/
	public Funcionario() {

		/**Inicializar c�digo do funcion�rio.*/
		codigoFuncionario = 0;
		
		/**Inicializar status do funcion�rio.*/
		statusFuncionario = 0;
		
		/**Inicializar telefone do funcion�rio.*/
		telefoneFuncionario = 0;
		
		/**Inicializar celular do funcion�rio.*/
		celularFuncionario = 0;
		
		/**Inicializar sexo do funcion�rio.*/
		sexoFuncionario = 0;
		
		/**Inicializar nome funcion�rio.*/
		nomeFuncionario = "";
		
		/**Inicializar cpf do funcion�rio.*/
		cpfFuncionario = 0;
		
		/**Inicializar rgdo funcion�rio.*/
		rgFuncionario = 0;		
		
		/**Inicializar data de cadastro do funcion�rio.*/
		dataCadastroFuncionario = Calendar.getInstance();
		
		/**Inicializar data de nascimento do funcion�rio.*/
		dataNascimentoFuncionario = Calendar.getInstance();

		/**Inicializar cargo do funcion�rio.*/
		cargo = new Cargo();
		
		/**Inicializar endere�o do funcion�rio.*/
		endereco = new Endereco();
	}

	/**Retorna o c�digo do funcion�rio.*/
	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	/**Seta o c�digo do funcion�rio.*/
	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	/**Retorna o telefone do funcion�rio.*/
	public long getTelefoneFuncionario() {
		return telefoneFuncionario;
	}

	/**Seta o telefone do funcion�rio.*/
	public void setTelefoneFuncionario(long telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}

	/**Retorna o celular do funcion�rio.*/
	public long getCelularFuncionario() {
		return celularFuncionario;
	}

	/**Seta o celular do funcion�rio.*/
	public void setCelularFuncionario(long celularFuncionario) {
		this.celularFuncionario = celularFuncionario;
	}

	/**Retorna o status do funcion�rio.*/
	public int getStatusFuncionario() {
		return statusFuncionario;
	}

	/**Seta o status do funcion�rio.*/
	public void setStatusFuncionario(int statusFuncionario) {
		this.statusFuncionario = statusFuncionario;
	}

	/**Retorna o nome do funcion�rio.*/
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	/**Seta o nome do funcion�rio.*/
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	/**Retorna o cpf do funcion�rio.*/
	public long getCpfFuncionario() {
		return cpfFuncionario;
	}

	/**Seta o cpf do funcion�rio.*/
	public void setCpfFuncionario(long cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	/**Retorna o rg do funcion�rio.*/
	public long getRgFuncionario() {
		return rgFuncionario;
	}

	/**Seta o rgdo funcion�rio.*/
	public void setRgFuncionario(long rgFuncionario) {
		this.rgFuncionario = rgFuncionario;
	}

	/**Retorna o sexo do funcion�rio.*/
	public int getSexoFuncionario() {
		return sexoFuncionario;
	}

	/**Seta o sexo do funcion�rio.*/
	public void setSexoFuncionario(int sexoFuncionario) {
		this.sexoFuncionario = sexoFuncionario;
	}


	/**Retorna o cargo do funcion�rio.*/
	public Cargo getCargo() {
		return cargo;
	}

	/**Seta o cargo do funcion�rio.*/
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	/**Retorna o endere�o do funcion�rio.*/
	public Endereco getEndereco() {
		return endereco;
	}

	/**Seta o endere�o do funcion�rio.*/
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
