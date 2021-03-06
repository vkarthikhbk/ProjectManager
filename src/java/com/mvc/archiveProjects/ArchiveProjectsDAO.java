package com.mvc.archiveProjects;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mvc.archiveProjects.*;
import java.util.ArrayList;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Repository
public class ArchiveProjectsDAO{
	private HibernateTemplate hibernateTemplate;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	public List<ArchiveProjects> getAll() {
		try {
		    ArchiveProjects archiveProjects = new ArchiveProjects();
			return hibernateTemplate.findByExample(archiveProjects, 0 , 10);
		}catch (Exception e){
			System.out.println(e);
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<ArchiveProjects> getAll(int start, int limit) {
		try {
		    ArchiveProjects archiveProjects = new ArchiveProjects();
		    return hibernateTemplate.findByExample(archiveProjects, start , limit);
		}catch (Exception e){
			System.out.println(e);
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<ArchiveProjects> getAll(int start, 
									int limit,
									String type,
									String value,
									String field) {
		try {
		    String query = new String();
		    hibernateTemplate.setMaxResults(limit);
		    query = "from ArchiveProjects archiveProjects where archiveProjects." + field + " like '%" + value + "%'"; 
			return hibernateTemplate.find(query);
		}catch (Exception e){
			System.out.println(e);
			return null;
		}
	}
	public ArchiveProjects create(ArchiveProjects ArchiveProjects) {
		try {
			hibernateTemplate.saveOrUpdate(ArchiveProjects);
			return ArchiveProjects;
		}catch (Exception e){
			System.out.println(e);
			return null;
		}
	}

	public void delete(int id) {
		try {
			Object record = hibernateTemplate.load(ArchiveProjects.class, id);
			hibernateTemplate.delete(record);
		}catch (Exception e){
			System.out.println(e);
		}
	}
}
