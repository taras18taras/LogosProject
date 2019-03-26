package logos.dao;

public interface CrudOperation<T> {

	T create(int id, T t);

	T read(int id);

	T update(int id, T t);

	void delete(int id);

	void readAll();

}
