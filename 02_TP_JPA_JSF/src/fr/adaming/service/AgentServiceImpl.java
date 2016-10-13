package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.AgentDaoImpl;
import fr.adaming.dao.IAgentDao;
import fr.adaming.entities.Agent;

public class AgentServiceImpl implements IAgentService {
	
	IAgentDao agentDao = new AgentDaoImpl();
	
	/* (non-Javadoc)
	 * @see fr.adaming.service.IAgentService#isExistService(java.lang.String, java.lang.String)
	 */
	@Override
	public List<Agent> isExistService(String login, String mdp) {
		return agentDao.isExistDao(login, mdp);
	}}
