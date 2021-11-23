package aplicacao;

import java.util.Date;

import entities.Pedido;
import entities.enums.OrderStatus;

public class Programa {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1080,new Date(),OrderStatus.AGUARDANDO_PAGAMENTO);
		System.out.println(pedido);
		

	}

}
