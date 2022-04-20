package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TeamDAO;
import com.example.demo.entity.Team;

@RestController
@RequestMapping("/cricket")
public class TeamRestController {
	
	
	public TeamDAO teamDAO;
	
	@Autowired
	public TeamRestController(TeamDAO theteamDAO)
	{
		teamDAO = theteamDAO;
	}
	 	
	@GetMapping("/list")
	private List<Team> findAll() {
		return teamDAO.findAll();
	}
	
	@GetMapping("/list/{cid}")
	private Team getTeam(@PathVariable int cid) {
		Team team = teamDAO.getTeam(cid);
		
		if(team == null)
		{
			throw new TeamNotFoundException("team not found " +cid);
		}
		
		return team;	
	}
	
	@PostMapping("/list")
	private Team addTeam(@RequestBody Team theteam)
	{
		theteam.setId(0);
		
		teamDAO.saveTeam(theteam);
		
		return theteam;
	}
	
	@PutMapping("/list")
	private Team updateTeam(@RequestBody Team theteam)
	{
		teamDAO.saveTeam(theteam);
		
		return theteam;
	}
	
	@GetMapping("/cskill")
	private List<Team> find(@RequestParam String cskill)
	{
		List<Team> theteam = teamDAO.getSkill(cskill);
		return theteam;
	}
	
		

}
