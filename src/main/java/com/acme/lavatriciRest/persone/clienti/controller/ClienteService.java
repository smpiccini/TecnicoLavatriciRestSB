package com.acme.lavatriciRest.persone.clienti.controller;

import com.acme.lavatriciRest.persone.clienti.ClienteImp;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteFisicoRequest;

public interface ClienteService {
	ClienteImp inserisciCliente(InserisciClienteFisicoRequest dto);
}
