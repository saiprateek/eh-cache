@Repository
public class ClientDaoImpl extends GenericDaoImpl implements ClientDao {

	@SuppressWarnings("unchecked")
	@Cacheable("clientCache")
	@Override
	public List<Customer> getAllCustomer() {
		return entityManager.createNamedQuery("fetchAllCustomer").getResultList();
	}
}