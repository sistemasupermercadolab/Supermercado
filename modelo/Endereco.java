package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**Classe endereço: possui os dados de endereço. */
@Entity
public class Endereco {
	
		/** Código do endereço */
		@Id
		@GeneratedValue
		private int codigoEndereco;
		
		/** Número do endereço */
		private int numeroEndereco;
		
		/** CEP do endereço */
		private int cepEndereco;
		
		/** Bairro do endereço */
		private String bairroEndereco;
		
		/** Rua do endereço */
		private String RuaEndereco;

		
		/** Construtor da classe endereço */
		public Endereco() {

			/** Inicializar código do endereço */
			codigoEndereco = 0;
			
			/** Inicializar número do endereço */
			numeroEndereco = 0;
			
			/** Inicializar CEP do endereço */
			cepEndereco = 0;
			
			/** Inicializar bairro do endereço */
			bairroEndereco = "";
			
			/** Inicializar rua do endereço */
			RuaEndereco = "";
		}

		/** Retorna código do endereço */
		public int getCodigoEndereco() {
			return codigoEndereco;
		}

		/** Seta código do endereço */
		public void setCodigoEndereco(int codigoEndereco) {
			this.codigoEndereco = codigoEndereco;
		}

		/** Retorna CEP do endereço */
		public int getCepEndereco() {
			return cepEndereco;
		}
		
		/** Seta CEP do endereço */
		public void setCepEndereco(int cepEndereco) {
			this.cepEndereco = cepEndereco;
		}

		/** Retorna número do endereço */
		public int getNumeroEndereco() {
			return numeroEndereco;
		}

		/** Seta número do endereço */
		public void setNumeroEndereco(int numeroEndereco) {
			this.numeroEndereco = numeroEndereco;
		}

		/** Retorna bairro do endereço */
		public String getBairroEndereco() {
			return bairroEndereco;
		}

		/** Seta bairro do endereço */
		public void setBairroEndereco(String bairroEndereco) {
			this.bairroEndereco = bairroEndereco;
		}

		/** Retorna rua do endereço */
		public String getRuaEndereco() {
			return RuaEndereco;
		}

		/** Seta rua do endereço */
		public void setRuaEndereco(String ruaEndereco) {
			RuaEndereco = ruaEndereco;
		}

}
