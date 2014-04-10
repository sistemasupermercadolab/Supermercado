
/** Pacote modelo */
package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**Classe Cargo: possui informações sobre os cargos.*/

@Entity
public class Cargo {
	
		/**Código do cargo.*/
		@Id
		@GeneratedValue
		private int codigoCargo;
	
		/**Nome do cargo.*/
		private String nomeCargo;
		
		/**Salário mensal do cargo.*/
		private double salarioCargo;
		
		/**Descrição do cargo.*/
		private String descricaoCargo;

		/**Construtor da classe cargo.*/
		public Cargo() {

			/**Inicializar o código do cargo.*/
			codigoCargo = 0;
			
			/**Inicializar o nome do cargo.*/
			nomeCargo = "";
			
			/**Inicializar o salário do cargo.*/
			salarioCargo = 0.0;
			
			/**Inicializar a descrição do cargo.*/
			descricaoCargo = "";

		}

		/**Retorna o código do cargo.*/		
		public int getCodigoCargo() {
			return codigoCargo;
		}

		/**Seta o código do cargo.*/
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

		/** Retorna o salário do cargo. */
		public double getSalarioCargo() {
			return salarioCargo;
		}

		/**Seta o salário do cargo.*/
		public void setSalarioCargo(double salarioCargo) {
			this.salarioCargo = salarioCargo;
		}

		/**Retorna a descrição do cargo.*/
		public String getDescricaoCargo() {
			return descricaoCargo;
		}

		/**Seta a descrição do cargo.*/
		public void setDescricaoCargo(String descricaoCargo) {
			this.descricaoCargo = descricaoCargo;
		}

}
