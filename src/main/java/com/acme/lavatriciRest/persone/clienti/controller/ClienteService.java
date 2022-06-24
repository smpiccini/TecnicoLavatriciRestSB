package com.acme.lavatriciRest.persone.clienti.controller;

import com.acme.lavatriciRest.persone.clienti.ClienteImp;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteFisicoRequest;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteGiuridicoRequest;

public interface ClienteService {
	ClienteImp inserisciCliente(InserisciClienteFisicoRequest dto);
	ClienteImp inserisciCliente(InserisciClienteGiuridicoRequest dto);
	
	ClienteImp getClienteFisico(InserisciClienteFisicoRequest dto);
	ClienteImp getClienteGiuridico(InserisciClienteGiuridicoRequest dto);
}
