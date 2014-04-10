package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**Classe empresa: possui os dados da empresa.*/
@Entity
public class Empresa {
	
	/**Código da empresa.*/
	@Id
	@GeneratedValue
	private int codigoEmpresa;
	
	/**Nome fantasia da empresa.*/
	private String nomeFantasiaEmpresa;
	
	/**Razão social da empresa.*/
	private String razaoSocialEmpresa;
	
	/**Telefone da empresa*/
	private long telefoneEmpresa;
	
	/**CNPJ da empresa.*/
	private long cnpjEmpresa;
	
	/**Endereço da empresa.*/
	@OneToOne
	private Endereco endereco; 
	
	
	/**Construtor da classe empresa.*/
	public Empresa() {
		
		/**Inicializar o código da empresa.*/
		codigoEmpresa = 0;
		
		/**Inicializar o nome fantasia da empresa.*/
		nomeFantasiaEmpresa = "";
		
		/**Inicializar a razão social da empresa.*/
		razaoSocialEmpresa = "";
		
		/**Inicializar o telefone da empresa.*/
		telefoneEmpresa = 0;
		
		/**Inicializar o cnpj da empresa.*/
		cnpjEmpresa = 0;
		
		/**Inicializar o endereço da empresa.*/
		endereco = new Endereco();
	
	}

	/**Retorna o código da empresa.*/
	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/**Seta o código da empresa.*/
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

	/**Retorna a razão social da empresa.*/
	public String getRazaoSocialEmpresa() {
		return razaoSocialEmpresa;
	}

	/**Seta a razão social da empresa.*/
	public void setRazaoSocialEmpresa(String razaoSocialEmpresa) {
		this.razaoSocialEmpresa = razaoSocialEmpresa;
	}

	/**Retorna o endereço da empresa.*/
	public Endereco getEndereco() {
		return endereco;
	}

	/**Seta o endereço da empresa.*/
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
