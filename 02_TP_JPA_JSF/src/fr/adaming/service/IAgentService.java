package fr.adaming.service;

import java.util.List;

import fr.adaming.entities.Agent;

public interface IAgentService {
	
	public List<Agent> isExistService(String login, String mdp);

}
