package modelo;


import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** Classe Fornecedor: possui os dados dos fornecedores. */
@Entity
public class Fornecedor {

		/** Código do fornecedor. */
		@Id
		@GeneratedValue
		private int codigoFornecedor;
		
		/** Status do fornecedor. 1 - Ativo 2 - Inativo */
		private int statusFornecedor; 
		
		/** Telefone do fornecedor. */
		private long telefoneFornecedor;
		
		/** Celular do fornecedor. */
		private long celularFornecedor;
		
		/** Nome do fornecedor. */
		private String nomeFornecedor;
		
		/** CNPJ do fornecedor. */
		private long cnpjFornecedor;
		
		/** Data de cadastro do fornecedor. */
		@Temporal(TemporalType.DATE)
		private Calendar dataCadastroFornecedor;

		/** Construtor da classe fornecedor. */
		public Fornecedor() {

			/** Inicializar código do fornecedor. */
			codigoFornecedor = 0;
			
			/** Inicializar status do fornecedor. */
			statusFornecedor = 0;
			
			/** Inicializar telefone do fornecedor. */
			telefoneFornecedor = 0;
			
			/** Inicializar nome do fornecedor. */
			nomeFornecedor = "";
			
			/** Inicializar CNPJ do fornecedor. */
			cnpjFornecedor = 0;
			
			/** Inicializar data de cadastro do fornecedor. */
			dataCadastroFornecedor = Calendar.getInstance();
			
			/** Inicializar celular do fornecedor. */
			celularFornecedor = 0;

		}

		/** Retorna código do fornecedor. */
		public int getCodigoFornecedor() {
			return codigoFornecedor;
		}

		/** Seta código do fornecedor. */
		public void setCodigoFornecedor(int codigoFornecedor) {
			this.codigoFornecedor = codigoFornecedor;
		}

		/** Retorna status do fornecedor. */
		public int getStatusFornecedor() {
			return statusFornecedor;
		}

		/** Seta status do fornecedor. */
		public void setStatusFornecedor(int statusFornecedor) {
			this.statusFornecedor = statusFornecedor;
		}

		/** Retorna telefone do fornecedor. */
		public long getTelefoneFornecedor() {
			return telefoneFornecedor;
		}

		/** Seta telefone do fornecedor. */
		public void setTelefoneFornecedor(long telefoneFornecedor) {
			this.telefoneFornecedor = telefoneFornecedor;
		}

		/** Retorna nome do fornecedor. */
		public String getNomeFornecedor() {
			return nomeFornecedor;
		}

		/** Seta nome do fornecedor. */
		public void setNomeFornecedor(String nomeFornecedor) {
			this.nomeFornecedor = nomeFornecedor;
		}

		/** Retorna cnpj do fornecedor. */
		public long getCnpjFornecedor() {
			return cnpjFornecedor;
		}

		/** Seta cnpj do fornecedor. */
		public void setCnpjFornecedor(long cnpjFornecedor) {
			this.cnpjFornecedor = cnpjFornecedor;
		}

		public Calendar getDataCadastroFornecedor() {
			return dataCadastroFornecedor;
		}

		public void setDataCadastroFornecedor(Calendar dataCadastroFornecedor) {
			this.dataCadastroFornecedor = dataCadastroFornecedor;
		}

		public long getCelularFornecedor() {
			return celularFornecedor;
		}

		public void setCelularFornecedor(long celularFornecedor) {
			this.celularFornecedor = celularFornecedor;
		}



}
