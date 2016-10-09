package fr.adaming.service;

import java.util.ArrayList;
import java.util.List;

import fr.adaming.dao.IUserDao;
import fr.adaming.dao.UserDaoImpl;
import fr.adaming.entities.Utilisateur;

public class UserServiceImpl implements IUserService {
	
	IUserDao userDao = new UserDaoImpl();

	/* (non-Javadoc)
	 * @see fr.adaming.service.IUserService#getAllUsers()
	 */
	@Override
	public List<Utilisateur> getAllUsersService() {
		return userDao.getAllUsersDao();
	}

	/* (non-Javadoc)
	 * @see fr.adaming.service.IUserService#getById()
	 */
	@Override
	public Utilisateur getByIdService(int id_user) {
		return userDao.getByIdDao(id_user);
	}

	/* (non-Javadoc)
	 * @see fr.adaming.service.IUserService#delete()
	 */
	@Override
	public void deleteService(int id) {
		userDao.deleteDao(id);
		
	}

	/* (non-Javadoc)
	 * @see fr.adaming.service.IUserService#add()
	 */
	@Override
	public void addService(Utilisateur u) {
		userDao.addDao(u);
		
	}

	/* (non-Javadoc)
	 * @see fr.adaming.service.IUserService#update()
	 */
	@Override
	public void updateService(Utilisateur utilisateur) {
		userDao.updateDao(utilisateur);
		
	}
	
	

}
