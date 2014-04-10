package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**Classe endere�o: possui os dados de endere�o. */
@Entity
public class Endereco {
	
		/** C�digo do endere�o */
		@Id
		@GeneratedValue
		private int codigoEndereco;
		
		/** N�mero do endere�o */
		private int numeroEndereco;
		
		/** CEP do endere�o */
		private int cepEndereco;
		
		/** Bairro do endere�o */
		private String bairroEndereco;
		
		/** Rua do endere�o */
		private String RuaEndereco;

		
		/** Construtor da classe endere�o */
		public Endereco() {

			/** Inicializar c�digo do endere�o */
			codigoEndereco = 0;
			
			/** Inicializar n�mero do endere�o */
			numeroEndereco = 0;
			
			/** Inicializar CEP do endere�o */
			cepEndereco = 0;
			
			/** Inicializar bairro do endere�o */
			bairroEndereco = "";
			
			/** Inicializar rua do endere�o */
			RuaEndereco = "";
		}

		/** Retorna c�digo do endere�o */
		public int getCodigoEndereco() {
			return codigoEndereco;
		}

		/** Seta c�digo do endere�o */
		public void setCodigoEndereco(int codigoEndereco) {
			this.codigoEndereco = codigoEndereco;
		}

		/** Retorna CEP do endere�o */
		public int getCepEndereco() {
			return cepEndereco;
		}
		
		/** Seta CEP do endere�o */
		public void setCepEndereco(int cepEndereco) {
			this.cepEndereco = cepEndereco;
		}

		/** Retorna n�mero do endere�o */
		public int getNumeroEndereco() {
			return numeroEndereco;
		}

		/** Seta n�mero do endere�o */
		public void setNumeroEndereco(int numeroEndereco) {
			this.numeroEndereco = numeroEndereco;
		}

		/** Retorna bairro do endere�o */
		public String getBairroEndereco() {
			return bairroEndereco;
		}

		/** Seta bairro do endere�o */
		public void setBairroEndereco(String bairroEndereco) {
			this.bairroEndereco = bairroEndereco;
		}

		/** Retorna rua do endere�o */
		public String getRuaEndereco() {
			return RuaEndereco;
		}

		/** Seta rua do endere�o */
		public void setRuaEndereco(String ruaEndereco) {
			RuaEndereco = ruaEndereco;
		}

}
