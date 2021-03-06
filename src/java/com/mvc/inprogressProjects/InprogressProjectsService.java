package com.mvc.inprogressProjects;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.inprogressProjects.*;
import com.mvc.utils.UtilsDate;

@Service
public class InprogressProjectsService {
	@Autowired
	private InprogressProjectsDAO inprogressProjectsDAO;
	@Autowired
	private InprogressProjectsUtil inprogressProjectsUtil;
	@Autowired
        private UtilsDate utilsDate;

	@Transactional
	public List<InprogressProjects> getInprogressProjectsList(){
		return inprogressProjectsDAO.getAll();
	}
	
	@Transactional
	public List<InprogressProjects> getInprogressProjectsList(int start, int limit){
		return inprogressProjectsDAO.getAll(start, limit);
	}
	
	@Transactional
	public List<InprogressProjects> getInprogressProjectsList(int start, 
												int limit,
												String type,
												String value,
												String field){
		return inprogressProjectsDAO.getAll(start, limit, type, value, field);
	}
	
	@Transactional
	public InprogressProjects createNewInprogressProjects(Object data){
		InprogressProjects inprogressProjects = inprogressProjectsUtil.getInprogressProjectsFromRequest(data);
                inprogressProjects.setEndDate(utilsDate.getActualDate());
		return inprogressProjectsDAO.create(inprogressProjects);
	}
	
	@Transactional
	public void deleteInprogressProjects(Object data){
		Integer id = Integer.parseInt(data.toString());
		inprogressProjectsDAO.delete(id);
	}
}


