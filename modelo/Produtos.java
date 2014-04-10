package modelo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;



/**Classe Produtos: possui os dados sobre os produtos.*/
@Entity
public class Produtos {

	/**C�digo do produto.*/
	@Id
	@GeneratedValue
	private int codigoProduto;
	
	/**C�digo de barras do produto.*/
	private long codigoBarrasProduto;
	
	/**Valor de custo do produto.*/
	private double valorCustoProduto;
	
	/**Valor de venda do produto.*/
	private double valorVendaProduto;
	
	/**Nome do produto.*/
	private String nomeProduto;
	
	/**Descri��o do produto.*/
	private String descricaoProduto;

	/**Marca do produto.*/
	@OneToOne
	private MarcaProduto marcaProduto;
	
	/**Construtor da classe do produto.*/
	public Produtos() {
		
		/**Inicializar o c�digo do produto.*/
		codigoProduto = 0;
		
		/**Inicializar o c�digo de barra do produto.*/
		codigoBarrasProduto = 0;
		
		/**Inicializar o valor de custo do produto.*/
		valorCustoProduto = 0.0;
		
		/**Inicializar o valor de venda do produto.*/
		valorVendaProduto = 0.0;
		
		/**Inicializar o nome do produto.*/
		nomeProduto = "";
		
		/**Inicializar a descri��o do produto.*/
		descricaoProduto = "";
		
		/**Inicializar a marca do produto.*/
		marcaProduto = new MarcaProduto();
	
	}

	/**Retorna o c�digo do produto.*/
	public int getCodigoProduto() {
		return codigoProduto;
	}

	/**Seta o c�digo do produto.*/
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	/**Retorna o valor de custo do produto.*/
	public double getValorCustoProduto() {
		return valorCustoProduto;
	}
	
	/**Seta o valor de custo do produto.*/
	public void setValorCustoProduto(double valorCustoProduto) {
		this.valorCustoProduto = valorCustoProduto;
	}

	/**Retorna o valor de venda do produto.*/
	public double getValorVendaProduto() {
		return valorVendaProduto;
	}

	/**Seta o valor de venda do produto.*/
	public void setValorVendaProduto(double valorVendaProduto) {
		this.valorVendaProduto = valorVendaProduto;
	}

	/**Retorna o nome do produto.*/
	public String getNomeProduto() {
		return nomeProduto;
	}

	/**Seta o nome do produto.*/
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	/**Retorna a descri��o do produto.*/
	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	/**Seta a descri��o do produto.*/
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	

	/** Retorna a marca do produto.*/	
	public MarcaProduto getMarcaProduto() {
		return marcaProduto;
	}
	
	/**Seta a marca do produto.*/
	public void setMarcaProduto(MarcaProduto marcaProduto) {
		this.marcaProduto = marcaProduto;
	}



	/**Retorna o c�digo de barras do produto.*/
	public long getCodigoBarrasProduto() {
		return codigoBarrasProduto;
	}

	/**Seta o c�digo de barras do produto.*/
	public void setCodigoBarrasProduto(long codigoBarrasProduto) {
		this.codigoBarrasProduto = codigoBarrasProduto;
	}

	

}
