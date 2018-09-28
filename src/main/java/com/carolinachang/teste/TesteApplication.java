package com.carolinachang.teste;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carolinachang.teste.domain.App1;
import com.carolinachang.teste.domain.Contato;
import com.carolinachang.teste.domain.ContatoDTO;
import com.carolinachang.teste.domain.Profile;
import com.carolinachang.teste.enums.TipoProjeto;
import com.carolinachang.teste.repository.App1Repository;
import com.carolinachang.teste.repository.ContatoRepository;
import com.carolinachang.teste.repository.ProfileRepository;

@SpringBootApplication
public class TesteApplication implements CommandLineRunner{
	
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Autowired
	private App1Repository app1Repository;
	
	@Autowired
	private ProfileRepository profileRepository;

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		contatoRepository.deleteAll();
		app1Repository.deleteAll();
		profileRepository.deleteAll();
		
		App1 app1 = new App1();
		//app1.setProjeto(TipoProjeto.APP1);
		
		app1 = app1Repository.save(app1);
		
		
		Profile profile = new Profile();
		//profile.setProjeto(TipoProjeto.PROFILE);
		
		profile = profileRepository.save(profile);
		
		Contato<Profile> contato = new Contato<Profile>();
		contato.setData(new Date());
		contato.setEmail("carol@gmail.com");
		contato.setId(null);
		contato.setNome("Carol");
		contato.setMensagem("teste msg");
		contato.setTelefone("42353465463");
		contato.setProjeto(profile);
		
		Contato<App1> contato1 = new Contato<App1>();
		contato1.setData(new Date());
		contato1.setEmail("carol@gmail.com");
		contato1.setId(null);
		contato1.setNome("Carol");
		contato1.setMensagem("teste msg");
		contato1.setTelefone("42353465463");
		contato1.setProjeto(app1);
		
		
		contatoRepository.save(contato);
		contato1 = contatoRepository.save(contato1);
		
		
		app1.setContato(fromContatoDto(contato1));
		app1Repository.save(app1);
		
	}
	
	public ContatoDTO fromContatoDto(Contato<?> contato) {
		return new ContatoDTO(contato);
	}
	
}
