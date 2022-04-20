package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Team;

@Repository
public class TeamDAO {
	
	@Autowired
	private EntityManager entityManager;
	
//	@Autowired
//	public TeamDAO(EntityManager theEntityManager)
//	{
//		entityManager = theEntityManager;
//	}
	
	@Transactional
	public List<Team> findAll()
	{
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Team> theQuery = currentSession.createQuery("from Team where cprize > 30", Team.class);
		
		List<Team> teams = theQuery.getResultList();
		
		return teams;
	}
	
	@Transactional
	public Team getTeam(int theid)
	{
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Team> theQuery = currentSession.createQuery("from Team where cid = :thecid", Team.class);
		
		theQuery.setParameter("thecid", theid);
		
	    Team teams = theQuery.getSingleResult();
	     
	    return teams;
		
	}
	
	@Transactional
	public void saveTeam(Team team)
	{
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(team);
		
	}
	
	@Transactional
	public List<Team> getSkill(String theskill)
	{
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Team> theTeam = currentSession.createQuery("from Team where cskill = :skill1", Team.class);
		
		theTeam.setParameter("skill1", theskill);
		
		List<Team> teams = theTeam.getResultList();
		
		return teams;
	}

}
