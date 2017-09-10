package br.org.catolicasc.rh.service;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.org.catolicasc.rh.dao.JobDAO;
import br.org.catolicasc.rh.model.Candidate;

@WebService
public class Server {

	@WebResult(name = "candidates")
	public List<Candidate> listaCandidates() {

		JobDAO JobDao = new JobDAO();
		

		return JobDao.listarCandidatos();
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8180/", new Server());
		System.out.print("ServiÃ§o inicializado!");
		
//		JobDAO JobDao = new JobDAO();
//		System.out.println(JobDao.listarCandidatos());
	}
}
