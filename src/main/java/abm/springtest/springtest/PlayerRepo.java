package abm.springtest.springtest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PlayerRepo implements IRepository<Player> {

    private Map<Integer, Player> data;
    public PlayerRepo(){
        this.data=new HashMap<>();
    }
    
    @Override
    public void save(Player p) {
        this.data.put(p.getId(), p);
    }

    @Override
    public Collection<Player> getAll() {
        return this.data.values();
    }

    public Collection<Player> get(int id) {
        return this.data.values().stream().filter(f -> f.getId() == id ).collect(Collectors.toList());
        //return this.data.values().stream().filter(f -> f.getId() == id ).findFirst().orElse(null);
    }

    
}
