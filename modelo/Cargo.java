
/** Pacote modelo */
package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**Classe Cargo: possui informa��es sobre os cargos.*/

@Entity
public class Cargo {
	
		/**C�digo do cargo.*/
		@Id
		@GeneratedValue
		private int codigoCargo;
	
		/**Nome do cargo.*/
		private String nomeCargo;
		
		/**Sal�rio mensal do cargo.*/
		private double salarioCargo;
		
		/**Descri��o do cargo.*/
		private String descricaoCargo;

		/**Construtor da classe cargo.*/
		public Cargo() {

			/**Inicializar o c�digo do cargo.*/
			codigoCargo = 0;
			
			/**Inicializar o nome do cargo.*/
			nomeCargo = "";
			
			/**Inicializar o sal�rio do cargo.*/
			salarioCargo = 0.0;
			
			/**Inicializar a descri��o do cargo.*/
			descricaoCargo = "";

		}

		/**Retorna o c�digo do cargo.*/		
		public int getCodigoCargo() {
			return codigoCargo;
		}

		/**Seta o c�digo do cargo.*/
		public void setCodigoCargo(int codigoCargo) {
			this.codigoCargo = codigoCargo;
		}

		/**Retorna o nome do cargo.*/
		public String getNomeCargo() {
			return nomeCargo;
		}

		/**Seta o nome do cargo.*/
		public void setNomeCargo(String nomeCargo) {
			this.nomeCargo = nomeCargo;
		}

		/** Retorna o sal�rio do cargo. */
		public double getSalarioCargo() {
			return salarioCargo;
		}

		/**Seta o sal�rio do cargo.*/
		public void setSalarioCargo(double salarioCargo) {
			this.salarioCargo = salarioCargo;
		}

		/**Retorna a descri��o do cargo.*/
		public String getDescricaoCargo() {
			return descricaoCargo;
		}

		/**Seta a descri��o do cargo.*/
		public void setDescricaoCargo(String descricaoCargo) {
			this.descricaoCargo = descricaoCargo;
		}

}
