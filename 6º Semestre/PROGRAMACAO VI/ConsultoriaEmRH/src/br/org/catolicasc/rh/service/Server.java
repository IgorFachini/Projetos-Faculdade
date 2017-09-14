package br.org.catolicasc.rh.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.org.catolicasc.rh.dao.CandidateDao;
import br.org.catolicasc.rh.dao.JobDAO;
import br.org.catolicasc.rh.model.Candidate;
import br.org.catolicasc.rh.model.Course;
import br.org.catolicasc.rh.model.CourseType;
import br.org.catolicasc.rh.model.Employee;
import br.org.catolicasc.rh.model.Job;
import br.org.catolicasc.rh.persistence.JpaUtil;

@WebService
public class Server {

	@WebResult(name = "candidates")
	public List<Candidate> findAllCandidates() {

		CandidateDao candidateDao = new CandidateDao();

		return candidateDao.findAll();
	}

	public static void main(String[] args) {
		CandidateDao candidateDao = new CandidateDao();
		
		JpaUtil.getEntityManager().getTransaction().begin();

		List<Candidate> candidates = new ArrayList<Candidate>();
		List<Job> jobs = new ArrayList<Job>();
		List<Course> courses = new ArrayList<Course>();
		Job job1 = new Job("Catolica", "Jaragua do Sul", new Date(), new Date(), "Fui mal com glauco");
		Job job2 = new Job("Menegotti", "Jaragua do sul", new Date(), new Date(), "Analista de dados");
		Course course1 = new Course("Matematica ", "22:00", CourseType.LANGUAGE, "Catolicasc", "Jaragua do sul");
		Course course2 = new Course("Matematica2 ", "22:00", CourseType.LANGUAGE, "Catolicasc", "Jaragua do sul");
	
		jobs.add(job1);
		jobs.add(job2);
		courses.add(course1);
		courses.add(course2);
		
		Candidate candidate = new Candidate(jobs, courses, "Igor", 19, 2200, "Ensino superior icompleto", Employee.NOT);
		candidates.add(candidate);
		candidateDao.save(candidate);

		JpaUtil.getEntityManager().getTransaction().commit();
		
		Endpoint.publish("http://localhost:8180/", new Server());
		System.out.print("ServiÃ§o inicializado!");

		// JobDAO JobDao = new JobDAO();
		// System.out.println(JobDao.listarCandidatos());
	}
}
