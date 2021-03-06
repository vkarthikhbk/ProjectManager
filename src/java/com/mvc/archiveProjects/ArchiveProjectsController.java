package com.mvc.archiveProjects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.archiveProjects.*;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;

/* 
 * Generated by Natileo - Velociraptor
 * on Fri Nov 05 01:16:12 CET 2010
 * hemca.com
 * by Strzelewicz Alexandre
 */

@Controller
@RequestMapping(value="/archiveProjects")
public class ArchiveProjectsController {
	@Autowired
	private ArchiveProjectsService archiveProjectsService;

	@RequestMapping(value="/read.action")
	public @ResponseBody Map<String,? extends Object> getArchiveProjects() throws Exception {
		try {
			List<ArchiveProjects> archiveProjects = archiveProjectsService.getArchiveProjectsList();
			return getMap(archiveProjects);
		}catch (Exception e){
			return getModelMapError("Failure");
		}
	}
	
	@RequestMapping(value="/read.action", params={"start", "limit"})
	public @ResponseBody Map<String,? extends Object> getArchiveProjects(@RequestParam int start,
									     @RequestParam int limit)
									     throws Exception {
		try {
			List<ArchiveProjects> archiveProjects = archiveProjectsService.getArchiveProjectsList(start, limit);
			return getMap(archiveProjects);
		}catch (Exception e){
			return getModelMapError("Failure");
		}
	}
	
	@RequestMapping(value = "/read.action", params = {"start","limit","filter[0][data][type]","filter[0][data][value]","filter[0][field]"})
	public @ResponseBody Map<String,? extends Object> getProj(@RequestParam int start,
								  @RequestParam int limit,
								  @RequestParam("filter[0][data][type]") String type,
								  @RequestParam("filter[0][data][value]") String value,
								  @RequestParam("filter[0][field]") String field)
								  throws Exception {
		try {
			List<ArchiveProjects> archiveProjects = archiveProjectsService.getArchiveProjectsList(start, limit, type, value, field);
			return getMap(archiveProjects);
		}catch (Exception e){
			return getModelMapError("Failure");
		}
	}
	@RequestMapping(value="/create.action")
	public @ResponseBody Map<String,? extends Object> createArchiveProjects(@RequestParam Object data) throws Exception{
		try{
			ArchiveProjects archiveProjects = archiveProjectsService.createNewArchiveProjects(data);
			return getMapSolo(archiveProjects);
		} catch (Exception e) {
			return getModelMapError("Error trying to update ArchiveProjects.");
		}
	}
	
	@RequestMapping(value="/update.action")
	public @ResponseBody Map<String,? extends Object> updateArchiveProjects(@RequestParam Object data) throws Exception{
		try{
			archiveProjectsService.createNewArchiveProjects(data);
			Map<String,Object> modelMap = new HashMap<String,Object>(3);
			modelMap.put("success", true);
			return modelMap;
		} catch (Exception e) {
			return getModelMapError("Error trying to update ArchiveProjects.");
		}
	}
	
	@RequestMapping(value="/delete.action")
	public @ResponseBody Map<String,? extends Object> delete(@RequestParam Object data) throws Exception {
		try{
			archiveProjectsService.deleteArchiveProjects(data);
			Map<String,Object> modelMap = new HashMap<String,Object>(3);
			modelMap.put("success", true);
			return modelMap;
		} catch (Exception e) {
			return getModelMapError("Error trying to delete ArchiveProjects.");
		}
	}
	
	private Map<String,Object> getMapSolo(ArchiveProjects object){
		Map<String,Object> modelMap = new HashMap<String,Object>(4);
		modelMap.put("data", object);
		modelMap.put("success", true);
		return modelMap;
	}
	
	private Map<String,Object> getMap(List<ArchiveProjects> object){
		Map<String,Object> modelMap = new HashMap<String,Object>(4);
		modelMap.put("total", object.size());
		modelMap.put("data", object);
		modelMap.put("success", true);
		return modelMap;
	}
	
	private Map<String,Object> getModelMapError(String msg){
		Map<String,Object> modelMap = new HashMap<String,Object>(2);
		modelMap.put("message", msg);
		modelMap.put("success", false);
		return modelMap;
	} 

}
