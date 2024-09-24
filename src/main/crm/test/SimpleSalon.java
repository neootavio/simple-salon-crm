package crm.test;

import crm.model.Agendamento;
import crm.model.Cliente;
import crm.model.Servico;

import java.time.chrono.ChronoLocalDateTime;

public class SimpleSalon {
    public static void main(String[] args) {
        System.out.println("Modulo Principal");

        Cliente cliente = new Cliente("Maria", "3199999-9999", "maria_teste@gmail.com");

        Servico servico = new Servico("Hidratação", 80.00);

        String data = "24-09-2024 15:30";

        Agendamento agendamento = new Agendamento(cliente, servico, data);

        System.out.println("Agendado: " + agendamento.mostraDataHora());

    }
}
