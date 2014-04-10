package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**Classe empresa: possui os dados da empresa.*/
@Entity
public class Empresa {
	
	/**C�digo da empresa.*/
	@Id
	@GeneratedValue
	private int codigoEmpresa;
	
	/**Nome fantasia da empresa.*/
	private String nomeFantasiaEmpresa;
	
	/**Raz�o social da empresa.*/
	private String razaoSocialEmpresa;
	
	/**Telefone da empresa*/
	private long telefoneEmpresa;
	
	/**CNPJ da empresa.*/
	private long cnpjEmpresa;
	
	/**Endere�o da empresa.*/
	@OneToOne
	private Endereco endereco; 
	
	
	/**Construtor da classe empresa.*/
	public Empresa() {
		
		/**Inicializar o c�digo da empresa.*/
		codigoEmpresa = 0;
		
		/**Inicializar o nome fantasia da empresa.*/
		nomeFantasiaEmpresa = "";
		
		/**Inicializar a raz�o social da empresa.*/
		razaoSocialEmpresa = "";
		
		/**Inicializar o telefone da empresa.*/
		telefoneEmpresa = 0;
		
		/**Inicializar o cnpj da empresa.*/
		cnpjEmpresa = 0;
		
		/**Inicializar o endere�o da empresa.*/
		endereco = new Endereco();
	
	}

	/**Retorna o c�digo da empresa.*/
	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/**Seta o c�digo da empresa.*/
	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	/**Retorna o nome fantasia da empresa.*/
	public String getNomeFantasiaEmpresa() {
		return nomeFantasiaEmpresa;
	}

	/**Seta o nome fantasia da empresa.*/
	public void setNomeFantasiaEmpresa(String nomeFantasiaEmpresa) {
		this.nomeFantasiaEmpresa = nomeFantasiaEmpresa;
	}

	/**Retorna a raz�o social da empresa.*/
	public String getRazaoSocialEmpresa() {
		return razaoSocialEmpresa;
	}

	/**Seta a raz�o social da empresa.*/
	public void setRazaoSocialEmpresa(String razaoSocialEmpresa) {
		this.razaoSocialEmpresa = razaoSocialEmpresa;
	}

	/**Retorna o endere�o da empresa.*/
	public Endereco getEndereco() {
		return endereco;
	}

	/**Seta o endere�o da empresa.*/
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**Retorna o telefone da empresa.*/
	public long getTelefoneEmpresa() {
		return telefoneEmpresa;
	}

	/**Seta o telefone da empresa.*/
	public void setTelefoneEmpresa(long telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}
	
	/**Retorna o cnpj da empresa.*/
	public long getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	/**Seta o cnpj da empresa*/
	public void setCnpjEmpresa(long cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	

}
