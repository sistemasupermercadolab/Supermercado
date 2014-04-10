package modelo;


import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**Classe Vendas: possui os dados sobre as vendas.*/
@Entity
public class Vendas {

		/**Código da venda.*/
		@Id
		@GeneratedValue
		private int codigoVenda;
		
		/**Valor da venda.*/
		private double valorTotalVenda;
		
		/**Data e Hora da venda.*/
		@Temporal(TemporalType.TIMESTAMP)
		private Calendar dataHoraVenda;

		/**Funcionário da venda.*/
		@OneToOne
		private Funcionario funcionario; 
		
		/**Cliente da venda.*/
		@OneToOne
		private Cliente cliente; 

		/**Construtor da classe Venda.*/
		public Vendas() {

			/**Inicializar o código da venda.*/
			codigoVenda = 0;
			
			/**Inicializar o valor total da venda.*/
			valorTotalVenda = 0.0;
			
			/**Inicializar a data e hora da venda.*/
			dataHoraVenda = Calendar.getInstance();

			/**Inicializar o funcionário da venda.*/
			funcionario = new Funcionario();
			
			/**Inicializar o cliente da venda.*/
			cliente = new Cliente();

		}
		
		/**Retorna o código da venda.*/
		public int getCodigoVenda() {
			return codigoVenda;
		}

		/**Seta o código da venda.*/
		public void setCodigoVenda(int codigoVenda) {
			this.codigoVenda = codigoVenda;
		}

		/**Retorna o valor total da venda.*/
		public double getValorTotalVenda() {
			return valorTotalVenda;
		}

		/**Seta o valor total da venda.*/
		public void setValorTotalVenda(double valorTotalVenda) {
			this.valorTotalVenda = valorTotalVenda;
		}
		
		/**Retorna o funcionário da venda.*/
		public Funcionario getFuncionario() {
			return funcionario;
		}

		/**Seta o funcionário da venda.*/
		public void setFuncionario(Funcionario funcionario) {
			this.funcionario = funcionario;
		}

		/**Retorna o cliente da venda.*/
		public Cliente getCliente() {
			return cliente;
		}

		/**Seta o cliente da venda.*/
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public Calendar getDataHoraVenda() {
			return dataHoraVenda;
		}

		public void setDataHoraVenda(Calendar dataHoraVenda) {
			this.dataHoraVenda = dataHoraVenda;
		}






}
