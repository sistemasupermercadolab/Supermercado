package modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**Classe MarcaProduto: possui os dados de marcas dos produtos.*/
@Entity
public class MarcaProduto {

	/**C�digo da marca do produto.*/
	@Id
	@GeneratedValue
	private int codigoMarcaProduto;
	
	/**Nome da marca do produto.*/
	private String nomeMarcaProduto;
	
	/**Descri��o da marca do produto.*/
	private String descricaoMarcaProduto;

	/**Fornecedor da marca do produto.*/
	@OneToOne
	private Fornecedor fornecedor; 

	/**Construtor da classe de marca do produto.*/
	public MarcaProduto() {

		/**Inicializar o c�digo da marca do produto.*/
		codigoMarcaProduto = 0;
		
		/**Inicializar o nome da marca do produto.*/
		nomeMarcaProduto = "";
		
		/**Inicializar a descri��o da marca do produto.*/
		descricaoMarcaProduto = "";

		/**Inicializar o fornecedor da marca do produto.*/
		fornecedor = new Fornecedor();

	}

	/**Retorna o c�digo da marca do produto.*/
	public int getCodigoMarcaProduto() {
		return codigoMarcaProduto;
	}
	
	/**Seta o c�digo da marca do produto.*/
	public void setCodigoMarcaProduto(int codigoMarcaProduto) {
		this.codigoMarcaProduto = codigoMarcaProduto;
	}

	/**Retorna o nome da marca do produto.*/
	public String getNomeMarcaProduto() {
		return nomeMarcaProduto;
	}
	
	/**Seta o c�digo da marca do produto.*/
	public void setNomeMarcaProduto(String nomeMarcaProduto) {
		this.nomeMarcaProduto = nomeMarcaProduto;
	}

	/**Retorna a descri��o da marca do produto.*/
	public String getDescricaoMarcaProduto() {
		return descricaoMarcaProduto;
	}

	/**Seta a descri��o da marca do produto.*/
	public void setDescricaoMarcaProduto(String descricaoMarcaProduto) {
		this.descricaoMarcaProduto = descricaoMarcaProduto;
	}

	/**Retorna o fornecedor da marca do produto.*/
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	/**Seta o fornecedor da marca do produto.*/
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
}
