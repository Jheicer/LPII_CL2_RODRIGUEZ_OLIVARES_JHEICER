package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.InterfaceProductoable;
import model.TblProductocl2;

public class ClassCrudProducto implements InterfaceProductoable{

	@Override
	public void RegistrarProducto(TblProductocl2 tblprod) {
		EntityManagerFactory pr=Persistence.createEntityManagerFactory("CL2_RODRIGUEZ");
		EntityManager em=pr.createEntityManager();
		em.getTransaction().begin();
		em.persist(tblprod);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public List<TblProductocl2> ListaProducto() {
		EntityManagerFactory pr=Persistence.createEntityManagerFactory("CL2_RODRIGUEZ");
		EntityManager eman=pr.createEntityManager();
		eman.getTransaction().begin();
		List<TblProductocl2> listado=eman.createQuery("select prod from TblProductocl2 prod",TblProductocl2.class).getResultList();
		return listado;
	}

}
