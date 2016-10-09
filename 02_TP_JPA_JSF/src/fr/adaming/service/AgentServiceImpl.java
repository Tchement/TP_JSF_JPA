package fr.adaming.service;

import fr.adaming.dao.AgentDaoImpl;
import fr.adaming.dao.IAgentDao;

public class AgentServiceImpl implements IAgentService {
	
	IAgentDao agentDao = new AgentDaoImpl();
	
	/* (non-Javadoc)
	 * @see fr.adaming.service.IAgentService#isExistService(java.lang.String, java.lang.String)
	 */
	@Override
	public int isExistService(String login, String mdp) {
		return agentDao.isExistDao(login, mdp);
	}}
