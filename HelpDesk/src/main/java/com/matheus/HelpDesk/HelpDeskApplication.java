package com.matheus.HelpDesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.matheus.HelpDesk.domain.Tecnico;
import com.matheus.HelpDesk.domain.enums.Perfil;
import com.matheus.HelpDesk.repository.TecnicoRepository;

@SpringBootApplication
public class HelpDeskApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HelpDeskApplication.class, args);
	}

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Override
	public void run(String... args) throws Exception {

		Tecnico tecnico = new Tecnico(null, "Matheus LIma", "45769669870", "matheus.lima@dellavolpe.com.br", "1234321");
		tecnico.addPerfil(Perfil.ADMIN);

		tecnicoRepository.saveAll(Arrays.asList(tecnico));
	}

}
