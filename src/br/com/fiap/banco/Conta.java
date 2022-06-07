//1 passo o pacote
package br.com.fiap.banco;

//2 passo a classe conta
public class Conta {
	
//3 passo atributos da classe conta	
	protected int agencia;
	int numero;
	double saldo;

//4 passo vamos criar o construtor padr�o (xuxu) da classe conta, obs:xuxu p n tem nd
	public Conta () {
	}

/*5 passo al�m do construtor padr�o � importante que 
 a classe tenha um construtor de classe p popular tds as informa��es do possivel objeto. 
 OBS: construtor � importante pq vms passar a partir de outras classes*/
	public Conta (int agencia, int numero, double saldo) {

// vamos usar this pra referenciar que agencia do escopo da classe vai receber o valor da da agencia que vier como p�rametro 		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		
	}
//criar uns m�todos agora 	
	public void depositar (double valor) {
		
		this.saldo += valor;
	}
	
	
	public void retirar (double valor) {
		
		this.saldo -= valor;
	}

	public double verificarSaldo() {
		return this.saldo;
	}
}



