package abm.springtest.springtest;

import java.util.Collection;

public interface IRepository <T> {
    public void save(T t);
    public Collection<T> getAll();

}
