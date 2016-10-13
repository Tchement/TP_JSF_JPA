/**
 * 
 */
package fr.adaming.dao;

import java.util.List;

import fr.adaming.entities.Agent;

/**
 * @author inti0210
 *
 */
public interface IAgentDao {
	
	public List<Agent> isExistDao(String login, String mdp);

}
