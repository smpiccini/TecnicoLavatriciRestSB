package com.acme.lavatriciRest.interventi;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.lavatriciRest.interventi.riparazioni.InserisciRiparazioneRequeste;
import com.acme.lavatriciRest.interventi.riparazioni.Riparazione;
import com.acme.lavatriciRest.interventi.riparazioni.RiparazioneRepository;
import com.acme.lavatriciRest.interventi.sostituzioni.InserisciSostituzioneRequeste;
import com.acme.lavatriciRest.interventi.sostituzioni.Sostituzione;
import com.acme.lavatriciRest.interventi.sostituzioni.SostituzioneRepository;
import com.acme.lavatriciRest.interventi.verifiche.InserisciVerificaRequeste;
import com.acme.lavatriciRest.interventi.verifiche.Verifica;
import com.acme.lavatriciRest.interventi.verifiche.VerificaRepository;

@Service
public class InterventoServiceImp implements InterventoService {

	@Autowired
	RiparazioneRepository riparazioneRepo;
	@Autowired
	SostituzioneRepository sostituzioneRepo;
	@Autowired
	VerificaRepository verificaRepo;
	
	
	@Override
	public InterventoImp inserisciIntervento(InserisciRiparazioneRequeste dto) {
		Riparazione rip = new Riparazione();
		BeanUtils.copyProperties(dto, rip);
		riparazioneRepo.save(rip);
		
		
		return rip;
	}

	@Override
	public InterventoImp inserisciIntervento(InserisciSostituzioneRequeste dto) {
		Sostituzione sos = new Sostituzione();
		BeanUtils.copyProperties(dto, sos);
		sostituzioneRepo.save(sos);		
		return sos;
	}

	@Override
	public InterventoImp inserisciIntervento(InserisciVerificaRequeste dto) {
		Verifica ver = new Verifica();
		BeanUtils.copyProperties(dto, ver);
		verificaRepo.save(ver);		
		return ver;
	}

}
