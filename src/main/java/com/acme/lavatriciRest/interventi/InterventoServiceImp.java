package com.acme.lavatriciRest.interventi;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.lavatriciRest.interventi.riparazioni.InserisciRiparazioneConTecnicoRequest;
import com.acme.lavatriciRest.interventi.riparazioni.InserisciSoloRiparazioneRequest;
import com.acme.lavatriciRest.interventi.riparazioni.Riparazione;
import com.acme.lavatriciRest.interventi.riparazioni.RiparazioneRepository;
import com.acme.lavatriciRest.interventi.sostituzioni.InserisciSoloSostituzioneRequest;
import com.acme.lavatriciRest.interventi.sostituzioni.InserisciSostituzioneConTecnicoRequest;
import com.acme.lavatriciRest.interventi.sostituzioni.Sostituzione;
import com.acme.lavatriciRest.interventi.sostituzioni.SostituzioneRepository;
import com.acme.lavatriciRest.interventi.verifiche.InserisciSoloVerificaRequest;
import com.acme.lavatriciRest.interventi.verifiche.InserisciVerificaConTecnicoRequest;
import com.acme.lavatriciRest.interventi.verifiche.Verifica;
import com.acme.lavatriciRest.interventi.verifiche.VerificaRepository;
import com.acme.lavatriciRest.persone.Tecnico.InserisciTecnicoRequest;
import com.acme.lavatriciRest.persone.Tecnico.Tecnico;
import com.acme.lavatriciRest.persone.Tecnico.TecnicoService;

@Service
public class InterventoServiceImp implements InterventoService {

	@Autowired
	RiparazioneRepository riparazioneRepo;
	@Autowired
	SostituzioneRepository sostituzioneRepo;
	@Autowired
	VerificaRepository verificaRepo;
	
	@Autowired
	TecnicoService tecnicoService;
	
	@Override
	public InterventoImp inserisciIntervento(InserisciSoloRiparazioneRequest dto) {
		Riparazione rip = new Riparazione();
		BeanUtils.copyProperties(dto, rip);
		riparazioneRepo.save(rip);
		return rip;
	}

	@Override
	public InterventoImp inserisciIntervento(InserisciSoloSostituzioneRequest dto) {
		Sostituzione sos = new Sostituzione();
		BeanUtils.copyProperties(dto, sos);
		sostituzioneRepo.save(sos);		
		return sos;
	}

	@Override
	public InterventoImp inserisciIntervento(InserisciSoloVerificaRequest dto) {
		Verifica ver = new Verifica();
		BeanUtils.copyProperties(dto, ver);
		verificaRepo.save(ver);		
		return ver;
	}

	@Override
	public InterventoImp inserisciInterventoConTecnico(InserisciRiparazioneConTecnicoRequest dto) {
		InserisciTecnicoRequest tecDto = new InserisciTecnicoRequest();
		BeanUtils.copyProperties(dto, tecDto);
		Tecnico tc = tecnicoService.inserisciTecnico(tecDto);
		
		Riparazione rip= new Riparazione();
		BeanUtils.copyProperties(dto, rip);
		rip.setTecnico(tc);
		riparazioneRepo.save(rip);
		tc.getInterventi().add(rip);
		return rip;
	}

	@Override
	public InterventoImp inserisciInterventoConTecnico(InserisciVerificaConTecnicoRequest dto) {
		InserisciTecnicoRequest tecDto = new InserisciTecnicoRequest();
		BeanUtils.copyProperties(dto, tecDto);
		Tecnico tc = tecnicoService.inserisciTecnico(tecDto);
		
		Verifica ver= new Verifica();
		BeanUtils.copyProperties(dto, ver);
		ver.setTecnico(tc);
		verificaRepo.save(ver);
		tc.getInterventi().add(ver);
		return ver;
	}

	@Override
	public InterventoImp inserisciInterventoConTecnico(InserisciSostituzioneConTecnicoRequest dto) {
		InserisciTecnicoRequest tecDto = new InserisciTecnicoRequest();
		BeanUtils.copyProperties(dto, tecDto);
		Tecnico tc = tecnicoService.inserisciTecnico(tecDto);
		
		Sostituzione sos= new Sostituzione();
		BeanUtils.copyProperties(dto, sos);
		sos.setTecnico(tc);
		sostituzioneRepo.save(sos);
		tc.getInterventi().add(sos);
		return sos;
	}
	
	@Override
	public InterventoImp getInterventoRiparazione(String codiceIntervento) {
		InterventoImp inter = null;
		if(riparazioneRepo.existsByCodiceIntervento(codiceIntervento)) {
			inter = riparazioneRepo.findByCodiceIntervento(codiceIntervento);
		}
		return inter;
	}
	
	@Override
	public InterventoImp getInterventoSostituzione(String codiceIntervento) {
		InterventoImp inter = null;
		if(sostituzioneRepo.existsByCodiceIntervento(codiceIntervento)) {
			inter = sostituzioneRepo.findByCodiceIntervento(codiceIntervento);
		}
		return inter;
	}
	
	@Override
	public InterventoImp getInterventoVerifica(String codiceIntervento) {
		InterventoImp inter = null;
		if(verificaRepo.existsByCodiceIntervento(codiceIntervento)) {
			inter = verificaRepo.findByCodiceIntervento(codiceIntervento);
		}
		return inter;
	}
	
}
