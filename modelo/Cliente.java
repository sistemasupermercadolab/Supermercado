	package modelo;


import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**Classe cliente: possui os dados sobre os clientes.*/
@Entity
public class Cliente {
	
		/**Código do cliente.*/
		@Id
		@GeneratedValue
		private int codigoCliente;
		
		/**Telefone do cliente.*/
		private long telefoneCliente;
		
		/**Celular do cliente.*/
		private long celularCliente;
		
		/**Status do cliente: 1 - Ativo 2 - Inativo.*/
		private int statusCliente; 
		
		/**Sexo do cliente: 1 - Masculino 2 - Feminino.*/
		private int sexoCliente;
		
		/**Nome do cliente.*/
		private String nomeCliente;
		
		/**CPF do cliente.*/
		private long cpfCliente;
		
		/**Data de nascimento do cliente */
		@Temporal(TemporalType.DATE)
		private Calendar dataNascimentoCliente;
		
		/**Data de cadastro do cliente.*/
		@Temporal(TemporalType.DATE)
		private Calendar dataCadastroCliente;

		/**Endereço do cliente.*/
		@OneToOne
		private Endereco enderecoCliente; 
	
		
	
		/**Construtor da classe cliente.*/
		
		public Cliente() {

			/**Inicializar o código do cliente.*/
			codigoCliente = 0;
			
			/**Inicializar o telefone do cliente.*/
			telefoneCliente = 0;
			
			/**Inicializar o celular do cliente.*/
			celularCliente = 0;
			
			/**Inicializar o status do cliente.*/
			statusCliente = 0;
			
			/**Inicializar o sexo do cliente.*/
			sexoCliente = 0;
			
			/**Inicializar o nome do cliente.*/
			nomeCliente = "";
			
			/**Inicializar o cpf do cliente.*/
			cpfCliente = 0;
			
			/**Inicializar a data de cadastro do cliente.*/
			dataCadastroCliente =  Calendar.getInstance();
			
			/**Inicializar a data de nascimento do cliente.*/
			dataNascimentoCliente = Calendar.getInstance();
		
			/**Inicializar o endereço do cliente.*/
			enderecoCliente = new Endereco();
			
		}


		/**Retorna o código do cliente.*/
		public int getCodigoCliente() {
			return codigoCliente;
		}

		/**Seta o código do cliente.*/
		public void setCodigoCliente(int codigoCliente) {
			this.codigoCliente = codigoCliente;
		}

		/**Retorna o nome do cliente.*/
		public String getNomeCliente() {
			return nomeCliente;
		}

		/**Seta o nome do cliente.*/
		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		/**Seta o cpf do cliente.*/
		public void setCpfCliente(long cpfCliente) {
			this.cpfCliente = cpfCliente;
		}
		
		/**Retorna o cpf do cliente.*/
		public long getCpfCliente() {
			return cpfCliente;
		}
		
		/**Retorna o telefone do cliente.*/
		public long getTelefoneCliente() {
			return telefoneCliente;
		}


		/**Seta o telefone do cliente.*/
		public void setTelefoneCliente(long telefoneCliente) {
			this.telefoneCliente = telefoneCliente;
		}
		
		/**Retorna o celular do cliente.*/
		public long getCelularCliente() {
			return celularCliente;
		}

		/**Seta o celular do cliente.*/
		public void setCelularCliente(long celularCliente) {
			this.celularCliente = celularCliente;
		}


		/**Retorna o status do cliente.*/
		public int getStatusCliente() {
			return statusCliente;
		}


		/**Seta o status do cliente.*/
		public void setStatusCliente(int statusCliente) {
			this.statusCliente = statusCliente;
		}

		/**Retorna o sexo do cliente.*/
		public int getSexoCliente() {
			return sexoCliente;
		}

		/**Seta o sexo do cliente.*/
		public void setSexoCliente(int sexoCliente) {
			this.sexoCliente = sexoCliente;
		}

		/**Retorna o endereço do cliente.*/
		public Endereco getEnderecoCliente() {
			return enderecoCliente;
		}

		/**Seta o endereço do cliente.*/
		public void setEnderecoCliente(Endereco enderecoCliente) {
			this.enderecoCliente = enderecoCliente;
		}


		public Calendar getDataNascimentoCliente() {
			return dataNascimentoCliente;
		}


		public void setDataNascimentoCliente(Calendar dataNascimentoCliente) {
			this.dataNascimentoCliente = dataNascimentoCliente;
		}


		public Calendar getDataCadastroCliente() {
			return dataCadastroCliente;
		}


		public void setDataCadastroCliente(Calendar dataCadastroCliente) {
			this.dataCadastroCliente = dataCadastroCliente;
		}


}
