package com.acme.lavatriciRest.interventi;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.lavatriciRest.interventi.riparazioni.InserisciRiparazioneConTecnicoRequest;
import com.acme.lavatriciRest.interventi.riparazioni.InserisciSoloRiparazioneRequeste;
import com.acme.lavatriciRest.interventi.riparazioni.Riparazione;
import com.acme.lavatriciRest.interventi.riparazioni.RiparazioneRepository;
import com.acme.lavatriciRest.interventi.sostituzioni.InserisciSoloSostituzioneRequeste;
import com.acme.lavatriciRest.interventi.sostituzioni.InserisciSostituzioneConTecnicoRequest;
import com.acme.lavatriciRest.interventi.sostituzioni.Sostituzione;
import com.acme.lavatriciRest.interventi.sostituzioni.SostituzioneRepository;
import com.acme.lavatriciRest.interventi.verifiche.InserisciSoloVerificaRequeste;
import com.acme.lavatriciRest.interventi.verifiche.InserisciVerificaConTecnicoRequest;
import com.acme.lavatriciRest.interventi.verifiche.Verifica;
import com.acme.lavatriciRest.interventi.verifiche.VerificaRepository;
import com.acme.lavatriciRest.persone.Tecnico.Tecnico;
import com.acme.lavatriciRest.persone.Tecnico.TecnicoRepository;

@Service
public class InterventoServiceImp implements InterventoService {

	@Autowired
	RiparazioneRepository riparazioneRepo;
	@Autowired
	SostituzioneRepository sostituzioneRepo;
	@Autowired
	VerificaRepository verificaRepo;
	
	@Autowired
	TecnicoRepository tecnicoRepo;
	
	@Override
	public InterventoImp inserisciIntervento(InserisciSoloRiparazioneRequeste dto) {
		Riparazione rip = new Riparazione();
		BeanUtils.copyProperties(dto, rip);
		riparazioneRepo.save(rip);
		
		
		return rip;
	}

	@Override
	public InterventoImp inserisciIntervento(InserisciSoloSostituzioneRequeste dto) {
		Sostituzione sos = new Sostituzione();
		BeanUtils.copyProperties(dto, sos);
		sostituzioneRepo.save(sos);		
		return sos;
	}

	@Override
	public InterventoImp inserisciIntervento(InserisciSoloVerificaRequeste dto) {
		Verifica ver = new Verifica();
		BeanUtils.copyProperties(dto, ver);
		verificaRepo.save(ver);		
		return ver;
	}

	@Override
	public InterventoImp inserisciIntervento(InserisciRiparazioneConTecnicoRequest dto) {
		Tecnico tc;
		if(tecnicoRepo.existsByMatricola(dto.getMatricola())) {
			tc=tecnicoRepo.findByMatricola(dto.getMatricola());
		}else {
			tc=new Tecnico();
			BeanUtils.copyProperties(dto, tc);
			tecnicoRepo.save(tc);
		}
		Riparazione rip= new Riparazione();
		BeanUtils.copyProperties(dto, rip);
		rip.setTecnico(tc);
		riparazioneRepo.save(rip);
		tc.getInterventi().add(rip);
		return rip;
	}

	@Override
	public InterventoImp inserisciIntervento(InserisciVerificaConTecnicoRequest dto) {
		Tecnico tc;
		if(tecnicoRepo.existsByMatricola(dto.getMatricola())) {
			tc=tecnicoRepo.findByMatricola(dto.getMatricola());
		}else {
			tc=new Tecnico();
			BeanUtils.copyProperties(dto, tc);
			tecnicoRepo.save(tc);
		}
		Verifica ver= new Verifica();
		BeanUtils.copyProperties(dto, ver);
		ver.setTecnico(tc);
		verificaRepo.save(ver);
		tc.getInterventi().add(ver);
		return ver;
	}

	@Override
	public InterventoImp inserisciIntervento(InserisciSostituzioneConTecnicoRequest dto) {
		Tecnico tc;
		if(tecnicoRepo.existsByMatricola(dto.getMatricola())) {
			tc=tecnicoRepo.findByMatricola(dto.getMatricola());
		}else {
			tc=new Tecnico();
			BeanUtils.copyProperties(dto, tc);
			tecnicoRepo.save(tc);
		}
		Sostituzione sos= new Sostituzione();
		BeanUtils.copyProperties(dto, sos);
		sos.setTecnico(tc);
		sostituzioneRepo.save(sos);
		tc.getInterventi().add(sos);
		return sos;
	}

	
	
	
	
}
