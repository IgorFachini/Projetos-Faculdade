/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.catolicasc.rh.dao;

import br.org.catolicasc.rh.model.Candidate;

import org.springframework.data.repository.CrudRepository;

import br.org.catolicasc.rh.model.Course;
import br.org.catolicasc.rh.model.Employee;
import br.org.catolicasc.rh.model.Job;
import br.org.catolicasc.rh.model.CourseType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class JobDAO {

	private static List<Candidate> candidates = new ArrayList<Candidate>();
	private static List<Job> jobs = new ArrayList<Job>();
	private static List<Course> courses = new ArrayList<Course>();
	private static Job job1 = new Job("Catolica", "Jaragua do Sul", new Date(), new Date(), "Fui mal com glauco");
	private static Job job2 = new Job("Menegotti", "Jaragua do sul", new Date(), new Date(), "Analista de dados");
	private static Course course1 = new Course( "Matematica ", "22:00", CourseType.LANGUAGE, true, "Catolicasc", "Jaragua do sul");
	private static Course course2 = new Course( "Matematica2 ", "22:00", CourseType.LANGUAGE, true, "Catolicasc", "Jaragua do sul");

	static {
		job1.setId(1L);
		job1.setId(2L);
		course1.setId(1L);
		course2.setId(2L);
		
		jobs.add(job1);
		jobs.add(job2);
		courses.add(course1);
		courses.add(course2);
		
		Candidate candidate = new Candidate(jobs,courses,"Igor",19,2200,"Ensino superior icompleto",Employee.NOT);
		candidate.setId(1L);
		candidates.add(candidate);
		
	}

	public List<Candidate> listarCandidatos() {
		return candidates;
	}

	public void criarCandidato(Candidate Candidate) {
		candidates.add(Candidate);
	}

}
