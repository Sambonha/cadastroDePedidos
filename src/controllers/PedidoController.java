package controllers;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

import entities.Pedido;
import repositories.PedidoRepositoryImpl;

public class PedidoController {

	private Scanner scanner = new Scanner(System.in);

	public void realizarCadastro() {

		var pedido = new Pedido();

		pedido.setId(UUID.randomUUID());
		pedido.setDataPedido(LocalDate.now());

		System.out.println(("\nCADASTRO DE PEDIDOS\n"));

		System.out.print("\nNome do cliente....:");
		pedido.setNomeCliente(scanner.nextLine());

		System.out.print("\nValor do pedido... :");
		pedido.setValor(Double.parseDouble(scanner.nextLine()));

		System.out.print("\nDescrição do pedido:");
		pedido.setDescricao(scanner.nextLine());

		var pedidoRepository = new PedidoRepositoryImpl();
		pedidoRepository.inserir(pedido);

	}

}
