
public interface ListInterface {
	public void add (T newEntry);
	public void add (int newposition, T newEntry);
	public T remove(int givenPosition);
	public void clear();
	public T replace(int givenPosition, T newEntry);
}
